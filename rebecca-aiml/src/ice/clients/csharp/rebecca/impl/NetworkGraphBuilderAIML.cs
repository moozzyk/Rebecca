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

using System;
using System.IO;

namespace rebecca
{
namespace impl
{
    internal class NetworkGraphBuilderAIML : NetworkGraphBuilder
    {
        private Ice.Communicator iceCommunicator;
        private NetworkGraphBuilderIcePrx networkGraphBuilderIce;
        private Ice.Properties properties;
        private Ice.ObjectAdapter adapter;
        private NetworkCallBacks callBacks;
        private Ice.Identity ident = new Ice.Identity();
        bool callBacksActivated = false;
        private string mUserId = "default";
        private string mBotId = "default";
        private string mEndUserId = "default";
        public NetworkGraphBuilderAIML(string[] args) 
        {
            try {
                iceCommunicator = Ice.Util.initialize(ref args);
                properties = iceCommunicator.getProperties();

                string name = properties.getPropertyWithDefault("Rebecca.Client.Config.Name",
                        "rebecca-server");
                string endPoint = properties.getPropertyWithDefault("Rebecca.Client.Config.EndPoint",
                        "default -p 58767");
                string proxy = name + ":" + endPoint;
                Ice.ObjectPrx theBase = iceCommunicator.stringToProxy(proxy);
                networkGraphBuilderIce = NetworkGraphBuilderIcePrxHelper.checkedCast(theBase);
                if (networkGraphBuilderIce == null) {
                    throw(new NetworkException("The network could not be contacted. " +
                            "Do you have the server running?"));
                }

                adapter =
                    iceCommunicator.createObjectAdapter("");
            } catch (Ice.Exception e) {
                throw new NetworkException(e.ToString());
            }
        }

        public void destroy()
        {
            try
            {
                iceCommunicator.destroy();
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetProperty(string key)
        {
            try
            {
                return properties.getProperty(key);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetPropertyWithDefault(string key, string value)
        {
            try
            {
                return properties.getPropertyWithDefault(key, value);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetPropertyAsInt(string key)
        {
            try
            {
                return properties.getPropertyAsInt(key);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetPropertyAsIntWithDefault(string key, int value)
        {
            try
            {
                return properties.getPropertyAsIntWithDefault(key, value);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void AddFile(string file)
        {
            this.AddFile(file, mUserId, mBotId, mEndUserId);
        }

        public void AddDirectory(string directory) 
        {
            this.AddDirectory(directory, mUserId, mBotId, mEndUserId);
        }

        public void AddDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression) 
        {
            this.AddDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, mUserId, mBotId, mEndUserId);
        }

        public void AddString(string stringContainingAIML) 
        {
            this.AddString(stringContainingAIML, mUserId, mBotId, mEndUserId);
        }

        public void SetAddStringAIMLHeader(string aimlHeader) 
        {
            try
            {
                networkGraphBuilderIce.setAddStringAIMLHeader(aimlHeader);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetAddStringAIMLFooter(string aimlFooter) 
        {
            try
            {
                networkGraphBuilderIce.setAddStringAIMLFooter(aimlFooter);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetAIMLSchema(string schema) 
        {
            try
            {
                networkGraphBuilderIce.setAIMLSchema(schema);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetCommonTypesSchema(string schema) 
        {
            try
            {
                networkGraphBuilderIce.setCommonTypesSchema(schema);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetAIMLValidation(bool trueOrFalse) 
        {
            try
            {
                networkGraphBuilderIce.setAIMLValidation(trueOrFalse);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetResponse(string input) 
        {
            return this.GetResponse(input, mUserId, mBotId, mEndUserId);
        }

        public void SetThat(string that) 
        {
            this.SetThat(that, mUserId, mBotId, mEndUserId);
        }

        public void SetTopic(string topic) 
        {
            this.SetTopic(topic, mUserId, mBotId, mEndUserId);
        }

        public string GetThat() 
        {
            return this.GetThat(mUserId, mBotId, mEndUserId);
        }

        public string GetTopic() 
        {
            return this.GetTopic(mUserId, mBotId, mEndUserId);
        }

        public void CreateGraph() 
        {
            this.CreateGraph(mUserId, mBotId, mEndUserId);
        }

        public bool PredicateMatch(string predicateName, string aimlPattern) 
        {
            return this.PredicateMatch(predicateName, aimlPattern, mUserId, mBotId, mEndUserId);
        }

        public void SetPredicate(string name, string value) 
        {
            this.SetPredicate(name, value, mUserId, mBotId, mEndUserId);
        }

        public string GetPredicate(string name) 
        {
            return this.GetPredicate(name, mUserId, mBotId, mEndUserId);
        }

        public string GetBotPredicate(string name) 
        {
            return this.GetBotPredicate(name, mUserId, mBotId, mEndUserId);
        }

        public void SetBotPredicate(string name, string value) 
        {
            this.SetBotPredicate(name, value, mUserId, mBotId, mEndUserId);
        }

        public string GetPreviousBotResponse(int previousBotResponse, int sentence) 
        {
            return this.GetPreviousBotResponse(previousBotResponse, sentence, mUserId, mBotId, mEndUserId);
        }

        public string GetPreviousUserInput(int previousUserInput, int sentence) 
        {
            return this.GetPreviousUserInput(previousUserInput, sentence, mUserId, mBotId, mEndUserId);
        }

        public void SetBotConfigurationSchema(string schema) 
        {
            try
            {
                networkGraphBuilderIce.setBotConfigurationSchema(schema);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetBotConfigurationValidation(bool trueOrFalse) 
        {
            try
            {
                networkGraphBuilderIce.setBotConfigurationValidation(trueOrFalse);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void ParseSubstitutionFile(string fileName) 
        {
            try
            {
                networkGraphBuilderIce.parseSubstitutionFile(fileName);
            }
            catch (XMLErrorExceptionIce e)
            {
                throw new XMLErrorException(e.what);
            }
            catch (FileNotFoundExceptionIce e)
            {
                throw new FileNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void ParseSentenceSplitterFile(string fileName) 
        {
            try
            {
                networkGraphBuilderIce.parseSentenceSplitterFile(fileName);
            }
            catch (XMLErrorExceptionIce e)
            {
                throw new XMLErrorException(e.what);
            }
            catch (FileNotFoundExceptionIce e)
            {
                throw new FileNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void ParsePropertiesFile(string fileName) 
        {
            this.ParsePropertiesFile(fileName, mUserId, mBotId, mEndUserId);
        }

        public void SetSentenceSplitter(string splitter) 
        {
            try
            {
                networkGraphBuilderIce.setSentenceSplitter(splitter);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetInputSubstitution(string find, string replace) 
        {
            try
            {
                networkGraphBuilderIce.setInputSubstitution(find, replace);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetGenderSubstitution(string find, string replace) 
        {
            try
            {
                networkGraphBuilderIce.setGenderSubstitution(find, replace);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetPersonSubstitution(string find, string replace) 
        {
            try
            {
                networkGraphBuilderIce.setPersonSubstitution(find, replace);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetPerson2Substitution(string find, string replace) 
        {
            try
            {
                networkGraphBuilderIce.setPerson2Substitution(find, replace);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetVersion() 
        {
            try
            {
                return networkGraphBuilderIce.getVersion();
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetSize() 
        {
            return this.GetSize(mUserId, mBotId, mEndUserId);
        }
        
        public void SetCallBacks(CallBacks callbacks) 
        {

            if(callBacksActivated)
		    {
			    callBacksActivated = false;
			    adapter.remove(ident);
		    }
            
		    if(callbacks == null)
		    {
                return;
		    }
		    else 
		    {           
			    ident.name = Ice.Util.generateUUID();
			    ident.category = "";
			    this.callBacks = new NetworkCallBacks();
			    adapter.add(this.callBacks, ident);
			    adapter.activate();
			    networkGraphBuilderIce.ice_getConnection().setAdapter(adapter);
			    networkGraphBuilderIce.setCallBacks(ident.name, ident.category);
                this.callBacks.setCallBacks(callbacks);
			    callBacksActivated = true;
		    }
        }

        public void StoreGossip(string gossip) 
        {
            try
            {
                networkGraphBuilderIce.storeGossip(gossip);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetId() 
        {
            try
            {
                return networkGraphBuilderIce.getId();
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void AddCustomTagLibrary(string library) 
        {
            try
            {
                networkGraphBuilderIce.addCustomTagLibrary(library);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemoveCustomTagLibrary(string library) 
        {
            try
            {
                networkGraphBuilderIce.removeCustomTagLibrary(library);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string CallSystemCommand(string command) 
        {
            try
            {
                return networkGraphBuilderIce.callSystemCommand(command);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        #region GraphBuilder Members


        public void AddFile(string file, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.addFile(file, userId, botId, endUserId);
            }
            catch (FileNotFoundExceptionIce e)
            {
                throw new FileNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void AddFileUnlessAlreadyAdded(string file)
        {
            this.AddFileUnlessAlreadyAdded(file, mUserId, mBotId, mEndUserId);
        }

        public void AddFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.addFile(file, userId, botId, endUserId);
            }
            catch (FileNotFoundExceptionIce e)
            {
                throw new FileNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemoveFile(string file)
        {
            this.RemoveFile(file, mUserId, mBotId, mEndUserId);
        }

        public void RemoveFile(string file, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.removeFile(file, userId, botId, endUserId);
            }
            catch (FileNotFoundExceptionIce e)
            {
                throw new FileNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void AddDirectory(string directory, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.addDirectory(directory, userId, botId, endUserId);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (DirectoryNotFoundExceptionIce e)
            {
                throw new DirectoryNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void AddDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (DirectoryNotFoundExceptionIce e)
            {
                throw new DirectoryNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void AddDirectoryUnlessAlreadyAdded(string directory)
        {
            this.AddDirectoryUnlessAlreadyAdded(directory, mUserId, mBotId, mEndUserId);
        }

        public void AddDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (DirectoryNotFoundExceptionIce e)
            {
                throw new DirectoryNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void AddDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression)
        {
            this.AddDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, mUserId, mBotId, mEndUserId);
        }

        public void AddDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (DirectoryNotFoundExceptionIce e)
            {
                throw new DirectoryNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemoveDirectory(string directory)
        {
            this.RemoveDirectory(directory, mUserId, mBotId, mEndUserId);
        }

        public void RemoveDirectory(string directory, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.removeDirectory(directory, userId, botId, endUserId);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (DirectoryNotFoundExceptionIce e)
            {
                throw new DirectoryNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void AddString(string stringContainingAIML, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.addString(stringContainingAIML, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemoveString(string stringContainingAIML)
        {
            this.RemoveString(stringContainingAIML, mUserId, mBotId, mEndUserId);
        }

        public void RemoveString(string stringContainingAIML, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.removeString(stringContainingAIML, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetResponse(string input, string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getResponse(input, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetThat(string that, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.setThat(that, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetTopic(string topic, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.setTopic(topic, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetThat(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getThat(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetTopic(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getTopic(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void CreateGraph(string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.createGraph(userId, botId, endUserId);
            }
            catch (XMLErrorExceptionIce e)
            {
                throw new XMLErrorException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemoveGraph()
        {
            this.RemoveGraph(mUserId, mBotId, mEndUserId);
        }

        public void RemoveGraph(string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.removeGraph(userId, botId, endUserId);
            }
            catch (XMLErrorExceptionIce e)
            {
                throw new XMLErrorException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public bool PredicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.predicateMatch(predicateName, aimlPattern, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetPredicate(string name, string value, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.setPredicate(name, value, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetPredicate(string name, string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getPredicate(name, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetBotPredicate(string name, string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getBotPredicate(name, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetBotPredicate(string name, string value, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.setBotPredicate(name, value, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string GetPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId);
            }
            catch (IllegalArgumentExceptionIce e)
            {
                throw new IllegalArgumentException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void ParsePropertiesFile(string fileName, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.parsePropertiesFile(fileName, userId, botId, endUserId);
            }
            catch (XMLErrorExceptionIce e)
            {
                throw new XMLErrorException(e.what);
            }
            catch (FileNotFoundExceptionIce e)
            {
                throw new FileNotFoundException(e.what);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetSize(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getSize(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void SetUserIdBotIdEndUserId(string userId, string botId, string endUserId)
        {
            this.mUserId = userId;
            this.mBotId = botId;
            this.mEndUserId = endUserId;
        }

        public void SynchronizeDatabase()
        {
            try
            {
                networkGraphBuilderIce.synchronizeDatabase();
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string[] GetAIMLFileList()
        {
            return this.GetAIMLFileList(mUserId, mBotId, mEndUserId);
        }

        public string[] GetAIMLFileList(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getAIMLFileList(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetAIMLFileListSize()
        {
            return this.GetAIMLFileListSize(mUserId, mBotId, mEndUserId);
        }

        public int GetAIMLFileListSize(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getAIMLFileListSize(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string[] GetAIMLStringList()
        {
            return this.GetAIMLStringList();
        }

        public string[] GetAIMLStringList(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getAIMLStringList(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetAIMLStringListSize()
        {
            return this.GetAIMLStringListSize(mUserId, mBotId, mEndUserId);
        }

        public int GetAIMLStringListSize(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getAIMLStringListSize(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string[] GetUserIds()
        {
            try
            {
                return networkGraphBuilderIce.getUserIds();
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetUserIdsSize()
        {
            try
            {
                return networkGraphBuilderIce.getUserIdsSize();
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string[] GetBotIds(string userId)
        {
            try
            {
                return networkGraphBuilderIce.getBotIds(userId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetBotIdsSize(string userId)
        {
            try
            {
                return networkGraphBuilderIce.getBotIdsSize(userId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string[] GetEndUserIds(string userId, string botId)
        {
            try
            {
                return networkGraphBuilderIce.getEndUserIds(userId, botId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetEndUserIdsSize(string userId, string botId)
        {
            try
            {
                return networkGraphBuilderIce.getEndUserIdsSize(userId, botId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void PrintEntireDatabase()
        {
            try
            {
                networkGraphBuilderIce.printEntireDatabase();
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string[] GetBotPredicates()
        {
            return this.GetBotPredicates(mUserId, mBotId, mEndUserId);
        }

        public string[] GetBotPredicates(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getBotPredicates(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public string[] GetPredicates()
        {
            return this.GetPredicates(mUserId, mBotId, mEndUserId); 
        }

        public string[] GetPredicates(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getPredicates(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetPredicatesSize()
        {
            return this.GetPredicatesSize(mUserId, mBotId, mEndUserId);
        }

        public int GetPredicatesSize(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getPredicatesSize(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public int GetBotPredicatesSize()
        {
            return GetBotPredicatesSize(mUserId, mBotId, mEndUserId);
        }

        public int GetBotPredicatesSize(string userId, string botId, string endUserId)
        {
            try
            {
                return networkGraphBuilderIce.getBotPredicatesSize(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemovePredicate(string name)
        {
            this.RemovePredicate(name, mUserId, mBotId, mEndUserId);
        }

        public void RemovePredicate(string name, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.removePredicate(name, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemoveBotPredicate(string name)
        {
            this.RemoveBotPredicate(name, mUserId, mBotId, mEndUserId);
        }

        public void RemoveBotPredicate(string name, string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.removeBotPredicate(name, userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemoveEndUser(string userId, string botId, string endUserId)
        {
            try
            {
                networkGraphBuilderIce.removeEndUser(userId, botId, endUserId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemoveBot(string userId, string botId)
        {
            try
            {
                networkGraphBuilderIce.removeBot(userId, botId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        public void RemoveUser(string userId)
        {
            try
            {
                networkGraphBuilderIce.removeUser(userId);
            }
            catch (ExceptionIce e)
            {
                throw new Exception(e.what);
            }
            catch (Ice.Exception e)
            {
                throw new Exception(e.ToString());
            }
        }

        #endregion
    }
} //end of impl namespace 
} //end of rebecca namespace 

