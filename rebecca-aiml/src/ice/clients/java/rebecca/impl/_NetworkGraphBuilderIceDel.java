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

public interface _NetworkGraphBuilderIceDel extends Ice._ObjectDel
{
    void addFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce;

    void addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce;

    void removeFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce;

    void addDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void removeDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void addString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void removeString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void setAddStringAIMLHeader(String aimlHeader, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void setAddStringAIMLFooter(String aimlFooter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void setAIMLSchema(String schema, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce;

    void setCommonTypesSchema(String schema, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce;

    void setAIMLValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String getResponse(String input, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void setThat(String that, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void setTopic(String topic, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String getThat(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String getTopic(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void createGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               XMLErrorExceptionIce;

    void removeGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               XMLErrorExceptionIce;

    boolean predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void setPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String getPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String getBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void setBotPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    String getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void setBotConfigurationSchema(String schema, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce;

    void setBotConfigurationValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void parseSubstitutionFile(String fileName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    void parseSentenceSplitterFile(String fileName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    void parsePropertiesFile(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce;

    void setSentenceSplitter(String splitter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void setInputSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void setGenderSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void setPersonSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    void setPerson2Substitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce;

    String getVersion(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    int getSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void setCallBacks(String name, String category, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void storeGossip(String gossip, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String getId(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void addCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce;

    void removeCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce;

    String callSystemCommand(String command, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void synchronizeDatabase(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String[] getAIMLFileList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    int getAIMLFileListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String[] getAIMLStringList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    int getAIMLStringListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String[] getUserIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    int getUserIdsSize(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String[] getBotIds(String userId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    int getBotIdsSize(String userId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String[] getEndUserIds(String userId, String botId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    int getEndUserIdsSize(String userId, String botId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void printEntireDatabase(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String[] getBotPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    String[] getPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    int getBotPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    int getPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void removePredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void removeBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void removeEndUser(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void removeBot(String userId, String botId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;

    void removeUser(String userId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce;
}
