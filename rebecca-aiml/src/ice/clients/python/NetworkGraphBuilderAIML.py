"""
   RebeccaAIML, Artificial Intelligence Markup Language 
   C++ api and engine.
  
   Copyright (C) 2005,2006,2007 Frank Hassanabad
  
   This file is part of RebeccaAIML.
  
   RebeccaAIML is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.
  
   RebeccaAIML is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
  
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.
"""

from NetworkGraphBuilder import *
from rebecca import *
from DirectoryNotFoundException import *
from FileNotFoundException import *
from NetworkException import *
from XMLErrorException import *
from IllegalArgumentException import *

class NetworkGraphBuilderAIML(NetworkGraphBuilder):
    # Private variables
    __iceCommunicator = None
    __networkGraphBuilderIce = None
    __properties = None
    __adapter = None
    __callBacks = NetworkCallBacks()
    __ident = Ice.Identity() 
    __callBacksActivated = 0
    __userId = "default"
    __botId = "default"
    __endUserId = "default"
    
    # Constructor
    def __init__(self,args):
        try:
            self.__iceCommunicator = Ice.initialize(args)
            self.__properties = self.__iceCommunicator.getProperties()
            name = self.__properties.getPropertyWithDefault("Rebecca.Client.Config.Name", "rebecca-server")
            endPoint = self.__properties.getPropertyWithDefault("Rebecca.Client.Config.EndPoint", "default -p 58767")
            proxy = name + ":" + endPoint
            base = self.__iceCommunicator.stringToProxy(proxy)
            self.__networkGraphBuilderIce = impl.NetworkGraphBuilderIcePrx.checkedCast(base)
            if not self.__networkGraphBuilderIce:
                raise NetworkException('The network could not be contacted.  Do you have the server running?')		
            self.__adapter = self.__iceCommunicator.createObjectAdapter("")
        except Ice.Exception, e:
            raise NetworkException('Generic Ice.Exception recieved')
        
    #
    #Methods
    #

    def destroy(self):
        self.__iceCommunicator.destroy()

    def getProperty(self,key):
        return self.__properties.getProperty(key)

    def getPropertyWithDefault(self,key,value):
        return self.__properties.getPropertyWithDefault(key, value)

    def getPropertyAsInt(self,key):
        return self.__properties.getPropertyAsInt(key)

    def getPropertyAsIntWithDefault(self,key,value):
        return self.__properties.getPropertyAsIntWithDefault(key, value);

    def addFile(self,file,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.addFile(file,self.__userId,self.__botId,self.__endUserId)
            else:
                self.__networkGraphBuilderIce.addFile(file,userId,botId,endUserId)
        except impl.FileNotFoundExceptionIce, e:
            raise FileNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
   
    def addFileUnlessAlreadyAdded(self,file,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.addFileUnlessAlreadyAdded(file,self.__userId,self.__botId,self.__endUserId)
            else:
                self.__networkGraphBuilderIce.addFileUnlessAlreadyAdded(file,userId,botId,endUserId)
        except impl.FileNotFoundExceptionIce, e:
            raise FileNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def removeFile(self,file,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.removeFile(file, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.removeFile(file, userId, botId, endUserId)
        except impl.FileNotFoundExceptionIce, e:
            raise FileNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def addDirectory(self,directory,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.addDirectory(directory, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.addDirectory(directory, userId, botId, endUserId)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.DirectoryNotFoundExceptionIce, e:
            raise DirectoryNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def addDirectoryWithFilesEndingInRegularExpression(self,directory, regularExpression,userId=None, botId=None, endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.DirectoryNotFoundExceptionIce, e:
            raise DirectoryNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def addDirectoryUnlessAlreadyAdded(self,directory,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.addDirectoryUnlessAlreadyAdded(directory, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.DirectoryNotFoundExceptionIce, e:
            raise DirectoryNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(self,directory, regularExpression,userId=None, botId=None, endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.DirectoryNotFoundExceptionIce, e:
            raise DirectoryNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def removeDirectory(self,directory,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.removeDirectory(directory, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.removeDirectory(directory, userId, botId, endUserId)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.DirectoryNotFoundExceptionIce, e:
            raise DirectoryNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def addString(self,stringContainingAIML,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.addString(stringContainingAIML, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.addString(stringContainingAIML, userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def removeString(self,stringContainingAIML,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.removeString(stringContainingAIML, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.removeString(stringContainingAIML, userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def setAddStringAIMLHeader(self,aimlHeader):
        try:
            self.__networkGraphBuilderIce.setAddStringAIMLHeader(aimlHeader)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setAddStringAIMLFooter(self,aimlFooter):
        try:
            self.__networkGraphBuilderIce.setAddStringAIMLFooter(aimlFooter)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setAIMLSchema(self,schema):
        try:
            self.__networkGraphBuilderIce.setAIMLSchema(schema)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setCommonTypesSchema(self,schema):
        try:
            self.__networkGraphBuilderIce.setCommonTypesSchema(schema)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setAIMLValidation(self,trueOrFalse):
        try:
            self.__networkGraphBuilderIce.setAIMLValidation(trueOrFalse)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getResponse(self,input,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getResponse(input, self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getResponse(input, userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setThat(self,that,userId=None, botId=None, endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.setThat(that, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.setThat(that, userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setTopic(self,topic,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.setTopic(topic, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.setTopic(topic, userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getThat(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getThat(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getThat(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getTopic(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getTopic(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getTopic(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def createGraph(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.createGraph(self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.createGraph(userId,botId,endUserId)
        except impl.XMLErrorExceptionIce, e:
            raise XMLErrorException(e.what)	
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def removeGraph(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.removeGraph(self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.removeGraph(userId,botId,endUserId)
        except impl.XMLErrorExceptionIce, e:
            raise XMLErrorException(e.what)	
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def predicateMatch(self,predicateName,aimlPattern,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.predicateMatch(predicateName,aimlPattern,self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.predicateMatch(predicateName,aimlPattern,userId,botId,endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setPredicate(self,predicateName,aimlPattern,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.setPredicate(predicateName,aimlPattern,self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.setPredicate(predicateName,aimlPattern,userId,botId,endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getPredicate(self,name,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getPredicate(name,self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getPredicate(name,userId,botId,endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getBotPredicate(self,name,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getBotPredicate(name,self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getBotPredicate(name,userId,botId,endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setBotPredicate(self,name,value,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.setBotPredicate(name,value,self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.setBotPredicate(name,value,userId,botId,endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getPreviousBotResponse(self,name,value,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getPreviousBotResponse(name,value,self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getPreviousBotResponse(name,value,userId,botId,endUserId)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getPreviousUserInput(self,name,value,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getPreviousUserInput(name,value,self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getPreviousUserInput(name,value,userId,botId,endUserId)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setBotConfigurationSchema(self,schema):
        try:
            self.__networkGraphBuilderIce.setBotConfigurationSchema(schema)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setBotConfigurationValidation(self,trueOrFalse):
        try:
            self.__networkGraphBuilderIce.setBotConfigurationValidation(trueOrFalse)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def parseSubstitutionFile(self,fileName):
        try:
            self.__networkGraphBuilderIce.parseSubstitutionFile(fileName)
        except impl.XMLErrorExceptionIce, e:
            raise XMLErrorException(e.what)	
        except impl.FileNotFoundExceptionIce, e:
            raise FileNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def parseSentenceSplitterFile(self,fileName):
        try:
            self.__networkGraphBuilderIce.parseSentenceSplitterFile(fileName)
        except impl.XMLErrorExceptionIce, e:
            raise XMLErrorException(e.what)	
        except impl.FileNotFoundExceptionIce, e:
            raise FileNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def parsePropertiesFile(self,fileName,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                self.__networkGraphBuilderIce.parsePropertiesFile(fileName, self.__userId, self.__botId, self.__endUserId)
            else:
                self.__networkGraphBuilderIce.parsePropertiesFile(fileName,userId,botId,endUserId)
        except impl.XMLErrorExceptionIce, e:
            raise XMLErrorException(e.what)	
        except impl.FileNotFoundExceptionIce, e:
            raise FileNotFoundException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setSentenceSplitter(self,splitter):
        try:
            self.__networkGraphBuilderIce.setSentenceSplitter(splitter)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setInputSubstitution(self,find,replace):
        try:
            return self.__networkGraphBuilderIce.setInputSubstitution(find,replace)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setGenderSubstitution(self,find,replace):
        try:
            return self.__networkGraphBuilderIce.setGenderSubstitution(find,replace)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setPersonSubstitution(self,find,replace):
        try:
            return self.__networkGraphBuilderIce.setPersonSubstitution(find,replace)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setPerson2Substitution(self,find,replace):
        try:
            return self.__networkGraphBuilderIce.setPerson2Substitution(find,replace)
        except impl.IllegalArgumentExceptionIce, e:
            raise IllegalArgumentException(e.what)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getVersion(self):
        try:
            return self.__networkGraphBuilderIce.getVersion()
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getSize(self, userId=None, botId=None, endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getSize(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getSize(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def storeGossip(self, gossip):
        try:
            self.__networkGraphBuilderIce.storeGossip(gossip)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
           
    def getId(self):
        try:
            return self.__networkGraphBuilderIce.getId()
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setUserIdBotIdEndUserId(self, userId, botId, endUserId):
        try:
            self.__userId = userId
            self.__botId = botId
            self.__endUserId = endUserId
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def addCustomTagLibrary(self,library):
        try:
            self.__networkGraphBuilderIce.addCustomTagLibrary(library)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def removeCustomTagLibrary(self,library):
        try:
            self.__networkGraphBuilderIce.removeCustomTagLibrary(library)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def callSystemCommand(self,command):
        try:
            return self.__networkGraphBuilderIce.callSystemCommand(command)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def setCallBacks(self, callbacks):
        if(self.__callBacksActivated):
            self.__callBacksActivated = 0
            self.__adapter.remove(self.__ident)

        if(callbacks == None):
            return
        else:
            self.__ident.name = Ice.generateUUID()
            self.__ident.category = ""
            self.__callBacks = NetworkCallBacks()
            self.__adapter.add(self.__callBacks, self.__ident)
            self.__adapter.activate()
            self.__networkGraphBuilderIce.ice_getConnection().setAdapter(self.__adapter)
            self.__networkGraphBuilderIce.setCallBacks(self.__ident.name, self.__ident.category)
            self.__callBacks.setCallBacks(callbacks)
            self.__callBacksActivated = 1

    def synchronizeDatabase(self):
        try:
            self.__networkGraphBuilderIce.synchronizeDatabase()
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def getAIMLFileList(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getAIMLFileList(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getAIMLFileList(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def getAIMLFileListSize(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getAIMLFileListSize(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getAIMLFileListSize(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getAIMLStringList(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getAIMLStringList(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getAIMLStringList(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def getAIMLStringListSize(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getAIMLStringListSize(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getAIMLStringListSize(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getUserIds(self):
        try:
            return self.__networkGraphBuilderIce.getUserIds()
        except impl.ExceptionIce, e:
            raise Exception(e.what)
           
    def getUserIdsSize(self):
        try:
            return self.__networkGraphBuilderIce.getUserIdsSize()
        except impl.ExceptionIce, e:
            raise Exception(e.what)
           
    def getBotIds(self,userId):
        try:
            return self.__networkGraphBuilderIce.getBotIds(userId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getBotIdsSize(self, userId):
        try:
            return self.__networkGraphBuilderIce.getBotIdsSize(userId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def getEndUserIds(self,userId,botId):
        try:
            return self.__networkGraphBuilderIce.getEndUserIds(userId,botId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getEndUserIdsSize(self,userId,botId):
        try:
            return self.__networkGraphBuilderIce.getEndUserIdsSize(userId,botId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def printEntireDatabase(self):
        try:
            self.__networkGraphBuilderIce.printEntireDatabase()
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def getBotPredicates(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getBotPredicates(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getBotPredicates(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def getPredicates(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getPredicates(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getPredicates(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def getPredicatesSize(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getPredicatesSize(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getPredicatesSize(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def getBotPredicatesSize(self,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.getBotPredicatesSize(self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.getBotPredicatesSize(userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def removePredicate(self,name,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.removePredicate(name, self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.removePredicate(name, userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def removeBotPredicate(self,name,userId=None,botId=None,endUserId=None):
        try:
            if not userId or not botId or not endUserId:
                return self.__networkGraphBuilderIce.removeBotPredicate(name, self.__userId, self.__botId, self.__endUserId)
            else:
                return self.__networkGraphBuilderIce.removeBotPredicate(name, userId, botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def removeEndUser(self,userId,botId,endUserId):
        try:
            return self.__networkGraphBuilderIce.removeEndUser(userId,botId, endUserId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            
    def removeBot(self,userId,botId):
        try:
            return self.__networkGraphBuilderIce.removeBot(userId,botId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)

    def removeUser(self,userId):
        try:
            return self.__networkGraphBuilderIce.removeUser(userId)
        except impl.ExceptionIce, e:
            raise Exception(e.what)
            