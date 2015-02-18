/*
 * RebeccaAIML, Artificial Intelligence Markup Language 
 * C++ api and engine.
 *
 * Copyright (C) 2005 Frank Hassanabad
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

//rebecca includes
#include <rebecca/framework/Person.h>
#include <rebecca/framework/PlainWord.h>
#include <rebecca/framework/Star.h>
#include <rebecca/framework/GraphBuilderFramework.h>
#include <rebecca/impl/utils/Logging.h>
using namespace rebecca::impl;

/* Disable Windows VC 7.x warning about 
 * it ignoring the throw specification
 */
#ifdef _WIN32
#    pragma warning( disable : 4290 )
#endif

namespace rebecca
{
namespace framework
{
namespace impl
{

class PersonImpl
{
	public:
		PersonImpl(GraphBuilderFramework &builder) 
			: m_builder(builder), 
		      m_atomic(true) { }

		GraphBuilderFramework &m_builder;
		bool m_atomic;

		~PersonImpl() { } 
};

Person::Person(GraphBuilderFramework &builder) 
	throw(InternalProgrammerErrorException &)
	: m_pimpl(new PersonImpl(builder))
{
	LOG_BOT_METHOD("Person::Person()");
	addInstanceOf("Person");
}

void Person::addCharacters(const StringPimpl &characters) throw(InternalProgrammerErrorException &)
{
	LOG_BOT_METHOD("void Person::addCharacters(const StringPimpl &characters)");
	logging("<Input> characters:" + String(characters.c_str()));

	m_pimpl->m_atomic = false;	
	InnerTemplateListImpl::addCharacters(characters);
}

StringPimpl Person::getString() const
	throw(InternalProgrammerErrorException &)
{
	LOG_BOT_METHOD("StringPimpl Person::getString() const");
	try
	{
		if(m_pimpl->m_atomic)
		{
			logging("This is an atomic element shortcut");
			Star star(m_pimpl->m_builder);
			StringPimpl returnString = star.getString();
			return m_pimpl->m_builder.personSubstitute(returnString);
		}
		else
		{
			return m_pimpl->m_builder.personSubstitute(InnerTemplateListImpl::getString());
		}
	}
	catch(std::exception &e)
	{
		logging(String("Fatal exception occured:") + e.what());
		return StringPimpl();
	}
}
Person::~Person()
{
	LOG_BOT_METHOD("Person::~Person()");
}

} //end of namespace impl
} //end of namespace framework
} //end of namespace rebecca
