#ifndef REBECCA_IMPL_TEMPLATEPARSER_H
#define REBECCA_IMPL_TEMPLATEPARSER_H

/*
 * RebeccaAIML, Artificial Intelligence Markup Language 
 * C++ api and engine.
 *
 * Copyright (C) 2005,2006,2007 Frank Hassanabad
 *
 * This file is part of RebeccaAIML.
 *
 * RebeccaAIML is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * RebeccaAIML is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

//Xerces includes
#include <xercesc/sax/HandlerBase.hpp>

//Rebecca includes
#include <rebecca/impl/NodeMapper.h>
#include <rebecca/framework/Tag.h>

//std includes
#include <stack>

namespace rebecca
{
namespace impl
{

XERCES_CPP_NAMESPACE_USE
using namespace rebecca;
using namespace std;

class TemplateParser : public HandlerBase
{
	public:

		//Call back's from the sax parser

		TemplateParser();
		void characters(const XMLCh *const chars, const unsigned int length);
		void startElement(const XMLCh* const, AttributeList&);
		void endElement(const XMLCh *const name);
		void endDocument();
		StringPimpl getTemplateString();

	private:
		vector<Tag *> m_tagsToDelete;
		StringPimpl m_templateString;		
		Tag *createTagClass(const StringPimpl &className);

		stack<Tag *> m_tagStack;

		Template *m_currentTemplate;

		/**
		 * Current node being constructed.
		 *
		 */		
        std::shared_ptr<NodeMapper> m_currentNode;
		Tag *m_currentStartElement;
};


} // end of impl namespace
} // end of rebecca namespace
#endif
