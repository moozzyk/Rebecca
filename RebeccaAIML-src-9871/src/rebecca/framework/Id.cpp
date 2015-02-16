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
#include <rebecca/framework/Id.h>
#include <rebecca/framework/GraphBuilderFramework.h>
#include <rebecca/impl/utils/Logging.h>

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

class IdImpl
{
	public:
		IdImpl(GraphBuilderFramework &builder)
			: m_builder(builder) { } 
		
		GraphBuilderFramework &m_builder;
};

Id::Id(GraphBuilderFramework &builder) throw(InternalProgrammerErrorException &)
	: m_pimpl(new IdImpl(builder))
{ 
	LOG_BOT_METHOD("Id::Id()");
	addInstanceOf("Id");
}


StringPimpl Id::getString() const
	throw(InternalProgrammerErrorException &)
{
	LOG_BOT_METHOD("StringPimpl Id::getString() const");
	return m_pimpl->m_builder.getId();
}

Id::~Id()
{
	LOG_BOT_METHOD("Id::~Id()");
}

} //end of namespace impl
} //end of namespace framework
} //end of namespace rebecca
