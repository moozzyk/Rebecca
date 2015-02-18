#ifndef REBECCA_IMPL_GRAPHHANDLER_H
#define REBECCA_IMPL_GRAPHHANDLER_H

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

//Xerces includes
#include <xercesc/sax/HandlerBase.hpp>

//Rebecca includes
#include <rebecca/adt/String.h>
#include <rebecca/adt/Stack.h>
#include <rebecca/adt/Map.h>
#include <rebecca/impl/NodeMapper.h>
#include <rebecca/framework/Tag.h>

namespace rebecca
{
namespace impl
{

XERCES_CPP_NAMESPACE_USE
using namespace boost;
using namespace rebecca;
using namespace std;

//forward declarations
class Tag;

class GraphHandler : public HandlerBase
{
	public:

		//Call back's from the sax parser

		GraphHandler(NodeMapper &root, GraphBuilderInternal &builder);
		void characters(const XMLCh *const chars, const unsigned int length);
		void startElement(const XMLCh* const, AttributeList&);
		void endElement(const XMLCh *const name);
		void endDocument();

		//Regular additional public members.

		void setAIMLVersion(const String &version);
		String getAIMLVersion();



	private:


		std::shared_ptr<Tag> createTagClass(const String &className);

		SharedPtrStackTag m_tagStack;
		String m_aimlVersion;

		/**
		 * Reference to the root of the 
		 * NodeMapper tree. As the parser 
		 * encounters <category>
		 * tags, it will begin construction of a 
		 * new node and latter when it encounters a 
		 * </category> tag it will add it to the rootNode.
		 * This is just a reference.  It's location should
		 * reside within a GraphBuilderInternal instance.
		 */
		NodeMapper &m_rootNodeMapper;
		
		GraphBuilderInternal &m_builder;

		/**
		 * Current node being constructed.
		 *
		 */		
		std::shared_ptr<NodeMapper> m_currentNode;
		std::shared_ptr<Tag> m_currentStartElement;

		int m_size;

		bool m_templateSideThat;

/* Commented out.  Not fast enough to justify use
		std::shared_ptr<Tag> createTagClassFromMap(const String &className);
		typedef std::shared_ptr<Tag> (GraphHandler::*createTagMethod)();
		map<String, createTagMethod> m_tagLookup;
		void init();

		//All the function pointers
		std::shared_ptr<Tag> createCategoryTag(); //1
		std::shared_ptr<Tag> createPatternTag(); //2
		std::shared_ptr<Tag> createTemplateTag(); //3
		std::shared_ptr<Tag> createTopicTag(); //4
		std::shared_ptr<Tag> createSraiTag();//5
		std::shared_ptr<Tag> createThatTag();//6
		std::shared_ptr<Tag> createStarTag();//7
		std::shared_ptr<Tag> createSetTag();//8
		std::shared_ptr<Tag> createGetTag();//9
		std::shared_ptr<Tag> createThinkTag();//10
		std::shared_ptr<Tag> createPersonTag();//11
		std::shared_ptr<Tag> createBotTag();//12
		std::shared_ptr<Tag> createConditionTag();//13
		std::shared_ptr<Tag> createLiTag();//14
		std::shared_ptr<Tag> createRandomTag();//15
		std::shared_ptr<Tag> createSrTag();//16
		std::shared_ptr<Tag> createInputTag();//17
		std::shared_ptr<Tag> createThatStarTag();//18
		std::shared_ptr<Tag> createTopicStarTag();//19
		std::shared_ptr<Tag> createPerson2Tag();//20
		std::shared_ptr<Tag> createGenderTag();//21
		std::shared_ptr<Tag> createLowerCaseTag();//22
		std::shared_ptr<Tag> createUpperCaseTag();//23
		std::shared_ptr<Tag> createSentenceTag();//24
		std::shared_ptr<Tag> createFormalTag();//25
		std::shared_ptr<Tag> createDateTag();//26
		std::shared_ptr<Tag> createIdTag();//27
		std::shared_ptr<Tag> createSizeTag();//28
		std::shared_ptr<Tag> createVersionTag();//29
		std::shared_ptr<Tag> createSystemTag();//30
		std::shared_ptr<Tag> createGossipTag();//31
		std::shared_ptr<Tag> createAimlTag();//32
*/
};


} // end of impl namespace
} // end of rebecca namespace
#endif
