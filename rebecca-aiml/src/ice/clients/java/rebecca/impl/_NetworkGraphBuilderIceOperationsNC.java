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

public interface _NetworkGraphBuilderIceOperationsNC
{
    void addFile(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void removeFile(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void addDirectory(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void removeDirectory(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addString(String stringContainingAIML, String userId, String botId, String endUserId)
        throws ExceptionIce;

    void removeString(String stringContainingAIML, String userId, String botId, String endUserId)
        throws ExceptionIce;

    void setAddStringAIMLHeader(String aimlHeader)
        throws ExceptionIce;

    void setAddStringAIMLFooter(String aimlFooter)
        throws ExceptionIce;

    void setAIMLSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void setCommonTypesSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void setAIMLValidation(boolean trueOrFalse)
        throws ExceptionIce;

    String getResponse(String input, String userId, String botId, String endUserId)
        throws ExceptionIce;

    void setThat(String that, String userId, String botId, String endUserId)
        throws ExceptionIce;

    void setTopic(String topic, String userId, String botId, String endUserId)
        throws ExceptionIce;

    String getThat(String userId, String botId, String endUserId)
        throws ExceptionIce;

    String getTopic(String userId, String botId, String endUserId)
        throws ExceptionIce;

    void createGraph(String userId, String botId, String endUserId)
        throws ExceptionIce,
               XMLErrorExceptionIce;

    void removeGraph(String userId, String botId, String endUserId)
        throws ExceptionIce,
               XMLErrorExceptionIce;

    boolean predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId)
        throws ExceptionIce;

    void setPredicate(String name, String value, String userId, String botId, String endUserId)
        throws ExceptionIce;

    String getPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce;

    String getBotPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce;

    void setBotPredicate(String name, String value, String userId, String botId, String endUserId)
        throws ExceptionIce;

    String getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    String getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    void setBotConfigurationSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void setBotConfigurationValidation(boolean trueOrFalse)
        throws ExceptionIce;

    void parseSubstitutionFile(String fileName)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    void parseSentenceSplitterFile(String fileName)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    void parsePropertiesFile(String fileName, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    void setSentenceSplitter(String splitter)
        throws ExceptionIce;

    void setInputSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    void setGenderSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    void setPersonSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    void setPerson2Substitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    String getVersion()
        throws ExceptionIce;

    int getSize(String userId, String botId, String endUserId)
        throws ExceptionIce;

    void setCallBacks(String name, String category)
        throws ExceptionIce;

    void storeGossip(String gossip)
        throws ExceptionIce;

    String getId()
        throws ExceptionIce;

    void addCustomTagLibrary(String library)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void removeCustomTagLibrary(String library)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    String callSystemCommand(String command)
        throws ExceptionIce;

    void synchronizeDatabase()
        throws ExceptionIce;

    String[] getAIMLFileList(String userId, String botId, String endUserId)
        throws ExceptionIce;

    int getAIMLFileListSize(String userId, String botId, String endUserId)
        throws ExceptionIce;

    String[] getAIMLStringList(String userId, String botId, String endUserId)
        throws ExceptionIce;

    int getAIMLStringListSize(String userId, String botId, String endUserId)
        throws ExceptionIce;

    String[] getUserIds()
        throws ExceptionIce;

    int getUserIdsSize()
        throws ExceptionIce;

    String[] getBotIds(String userId)
        throws ExceptionIce;

    int getBotIdsSize(String userId)
        throws ExceptionIce;

    String[] getEndUserIds(String userId, String botId)
        throws ExceptionIce;

    int getEndUserIdsSize(String userId, String botId)
        throws ExceptionIce;

    void printEntireDatabase()
        throws ExceptionIce;

    String[] getBotPredicates(String userId, String botId, String endUserId)
        throws ExceptionIce;

    String[] getPredicates(String userId, String botId, String endUserId)
        throws ExceptionIce;

    int getBotPredicatesSize(String userId, String botId, String endUserId)
        throws ExceptionIce;

    int getPredicatesSize(String userId, String botId, String endUserId)
        throws ExceptionIce;

    void removePredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce;

    void removeBotPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce;

    void removeEndUser(String userId, String botId, String endUserId)
        throws ExceptionIce;

    void removeBot(String userId, String botId)
        throws ExceptionIce;

    void removeUser(String userId)
        throws ExceptionIce;
}
