// **********************************************************************
//
// Copyright (c) 2003-2007 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.2.1

package rebecca.impl;

public interface NetworkGraphBuilderIcePrx extends Ice.ObjectPrx
{
    public void addFile(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce;
    public void addFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    public void addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce;
    public void addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    public void removeFile(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce;
    public void removeFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    public void addDirectory(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;
    public void addDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    public void addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;
    public void addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    public void addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;
    public void addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    public void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;
    public void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    public void removeDirectory(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;
    public void removeDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    public void removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;
    public void removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    public void addString(String stringContainingAIML, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public void addString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void removeString(String stringContainingAIML, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public void removeString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void setAddStringAIMLHeader(String aimlHeader)
        throws ExceptionIce;
    public void setAddStringAIMLHeader(String aimlHeader, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void setAddStringAIMLFooter(String aimlFooter)
        throws ExceptionIce;
    public void setAddStringAIMLFooter(String aimlFooter, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void setAIMLSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce;
    public void setAIMLSchema(String schema, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    public void setCommonTypesSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce;
    public void setCommonTypesSchema(String schema, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    public void setAIMLValidation(boolean trueOrFalse)
        throws ExceptionIce;
    public void setAIMLValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String getResponse(String input, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public String getResponse(String input, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void setThat(String that, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public void setThat(String that, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void setTopic(String topic, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public void setTopic(String topic, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String getThat(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public String getThat(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String getTopic(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public String getTopic(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void createGraph(String userId, String botId, String endUserId)
        throws ExceptionIce,
               XMLErrorExceptionIce;
    public void createGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               XMLErrorExceptionIce;

    public void removeGraph(String userId, String botId, String endUserId)
        throws ExceptionIce,
               XMLErrorExceptionIce;
    public void removeGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               XMLErrorExceptionIce;

    public boolean predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public boolean predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void setPredicate(String name, String value, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public void setPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String getPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public String getPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String getBotPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public String getBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void setBotPredicate(String name, String value, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public void setBotPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;
    public String getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    public String getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;
    public String getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    public void setBotConfigurationSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce;
    public void setBotConfigurationSchema(String schema, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    public void setBotConfigurationValidation(boolean trueOrFalse)
        throws ExceptionIce;
    public void setBotConfigurationValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void parseSubstitutionFile(String fileName)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;
    public void parseSubstitutionFile(String fileName, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    public void parseSentenceSplitterFile(String fileName)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;
    public void parseSentenceSplitterFile(String fileName, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    public void parsePropertiesFile(String fileName, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;
    public void parsePropertiesFile(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    public void setSentenceSplitter(String splitter)
        throws ExceptionIce;
    public void setSentenceSplitter(String splitter, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void setInputSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;
    public void setInputSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    public void setGenderSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;
    public void setGenderSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    public void setPersonSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;
    public void setPersonSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    public void setPerson2Substitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;
    public void setPerson2Substitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    public String getVersion()
        throws ExceptionIce;
    public String getVersion(java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public int getSize(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public int getSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void setCallBacks(String name, String category)
        throws ExceptionIce;
    public void setCallBacks(String name, String category, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void storeGossip(String gossip)
        throws ExceptionIce;
    public void storeGossip(String gossip, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String getId()
        throws ExceptionIce;
    public String getId(java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void addCustomTagLibrary(String library)
        throws ExceptionIce,
               FileNotFoundExceptionIce;
    public void addCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    public void removeCustomTagLibrary(String library)
        throws ExceptionIce,
               FileNotFoundExceptionIce;
    public void removeCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    public String callSystemCommand(String command)
        throws ExceptionIce;
    public String callSystemCommand(String command, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void synchronizeDatabase()
        throws ExceptionIce;
    public void synchronizeDatabase(java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String[] getAIMLFileList(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public String[] getAIMLFileList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public int getAIMLFileListSize(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public int getAIMLFileListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String[] getAIMLStringList(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public String[] getAIMLStringList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public int getAIMLStringListSize(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public int getAIMLStringListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String[] getUserIds()
        throws ExceptionIce;
    public String[] getUserIds(java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public int getUserIdsSize()
        throws ExceptionIce;
    public int getUserIdsSize(java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String[] getBotIds(String userId)
        throws ExceptionIce;
    public String[] getBotIds(String userId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public int getBotIdsSize(String userId)
        throws ExceptionIce;
    public int getBotIdsSize(String userId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String[] getEndUserIds(String userId, String botId)
        throws ExceptionIce;
    public String[] getEndUserIds(String userId, String botId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public int getEndUserIdsSize(String userId, String botId)
        throws ExceptionIce;
    public int getEndUserIdsSize(String userId, String botId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void printEntireDatabase()
        throws ExceptionIce;
    public void printEntireDatabase(java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String[] getBotPredicates(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public String[] getBotPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public String[] getPredicates(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public String[] getPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public int getBotPredicatesSize(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public int getBotPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public int getPredicatesSize(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public int getPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void removePredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public void removePredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void removeBotPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce;
    public void removeBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void removeEndUser(String userId, String botId, String endUserId)
        throws ExceptionIce;
    public void removeEndUser(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void removeBot(String userId, String botId)
        throws ExceptionIce;
    public void removeBot(String userId, String botId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;

    public void removeUser(String userId)
        throws ExceptionIce;
    public void removeUser(String userId, java.util.Map<String, String> __ctx)
        throws ExceptionIce;
}
