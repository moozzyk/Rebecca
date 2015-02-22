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

public interface _NetworkGraphBuilderIceOperations
{
    void addFile(String file, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void removeFile(String file, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void addDirectory(String directory, String userId, String botId, String endUserId, Ice.Current __current)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, Ice.Current __current)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId, Ice.Current __current)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId, Ice.Current __current)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void removeDirectory(String directory, String userId, String botId, String endUserId, Ice.Current __current)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, Ice.Current __current)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addString(String stringContainingAIML, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void removeString(String stringContainingAIML, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void setAddStringAIMLHeader(String aimlHeader, Ice.Current __current)
        throws ExceptionIce;

    void setAddStringAIMLFooter(String aimlFooter, Ice.Current __current)
        throws ExceptionIce;

    void setAIMLSchema(String schema, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void setCommonTypesSchema(String schema, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void setAIMLValidation(boolean trueOrFalse, Ice.Current __current)
        throws ExceptionIce;

    String getResponse(String input, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void setThat(String that, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void setTopic(String topic, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    String getThat(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    String getTopic(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void createGraph(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce,
               XMLErrorExceptionIce;

    void removeGraph(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce,
               XMLErrorExceptionIce;

    boolean predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void setPredicate(String name, String value, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    String getPredicate(String name, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    String getBotPredicate(String name, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void setBotPredicate(String name, String value, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    String getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    String getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    void setBotConfigurationSchema(String schema, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void setBotConfigurationValidation(boolean trueOrFalse, Ice.Current __current)
        throws ExceptionIce;

    void parseSubstitutionFile(String fileName, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    void parseSentenceSplitterFile(String fileName, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    void parsePropertiesFile(String fileName, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    void setSentenceSplitter(String splitter, Ice.Current __current)
        throws ExceptionIce;

    void setInputSubstitution(String find, String replace, Ice.Current __current)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    void setGenderSubstitution(String find, String replace, Ice.Current __current)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    void setPersonSubstitution(String find, String replace, Ice.Current __current)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    void setPerson2Substitution(String find, String replace, Ice.Current __current)
        throws ExceptionIce,
               IllegalArgumentExceptionIce;

    String getVersion(Ice.Current __current)
        throws ExceptionIce;

    int getSize(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void setCallBacks(String name, String category, Ice.Current __current)
        throws ExceptionIce;

    void storeGossip(String gossip, Ice.Current __current)
        throws ExceptionIce;

    String getId(Ice.Current __current)
        throws ExceptionIce;

    void addCustomTagLibrary(String library, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    void removeCustomTagLibrary(String library, Ice.Current __current)
        throws ExceptionIce,
               FileNotFoundExceptionIce;

    String callSystemCommand(String command, Ice.Current __current)
        throws ExceptionIce;

    void synchronizeDatabase(Ice.Current __current)
        throws ExceptionIce;

    String[] getAIMLFileList(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    int getAIMLFileListSize(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    String[] getAIMLStringList(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    int getAIMLStringListSize(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    String[] getUserIds(Ice.Current __current)
        throws ExceptionIce;

    int getUserIdsSize(Ice.Current __current)
        throws ExceptionIce;

    String[] getBotIds(String userId, Ice.Current __current)
        throws ExceptionIce;

    int getBotIdsSize(String userId, Ice.Current __current)
        throws ExceptionIce;

    String[] getEndUserIds(String userId, String botId, Ice.Current __current)
        throws ExceptionIce;

    int getEndUserIdsSize(String userId, String botId, Ice.Current __current)
        throws ExceptionIce;

    void printEntireDatabase(Ice.Current __current)
        throws ExceptionIce;

    String[] getBotPredicates(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    String[] getPredicates(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    int getBotPredicatesSize(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    int getPredicatesSize(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void removePredicate(String name, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void removeBotPredicate(String name, String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void removeEndUser(String userId, String botId, String endUserId, Ice.Current __current)
        throws ExceptionIce;

    void removeBot(String userId, String botId, Ice.Current __current)
        throws ExceptionIce;

    void removeUser(String userId, Ice.Current __current)
        throws ExceptionIce;
}
