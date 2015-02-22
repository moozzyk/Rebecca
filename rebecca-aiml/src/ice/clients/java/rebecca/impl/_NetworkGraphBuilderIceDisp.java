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

public abstract class _NetworkGraphBuilderIceDisp extends Ice.ObjectImpl implements NetworkGraphBuilderIce
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::rebecca::impl::NetworkGraphBuilderIce"
    };

    public boolean
    ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean
    ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[]
    ice_ids()
    {
        return __ids;
    }

    public String[]
    ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String
    ice_id()
    {
        return __ids[1];
    }

    public String
    ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String
    ice_staticId()
    {
        return __ids[1];
    }

    public final void
    addCustomTagLibrary(String library)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        addCustomTagLibrary(library, null);
    }

    public final void
    addDirectory(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectory(directory, userId, botId, endUserId, null);
    }

    public final void
    addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, null);
    }

    public final void
    addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, null);
    }

    public final void
    addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, null);
    }

    public final void
    addFile(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        addFile(file, userId, botId, endUserId, null);
    }

    public final void
    addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        addFileUnlessAlreadyAdded(file, userId, botId, endUserId, null);
    }

    public final void
    addString(String stringContainingAIML, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        addString(stringContainingAIML, userId, botId, endUserId, null);
    }

    public final String
    callSystemCommand(String command)
        throws ExceptionIce
    {
        return callSystemCommand(command, null);
    }

    public final void
    createGraph(String userId, String botId, String endUserId)
        throws ExceptionIce,
               XMLErrorExceptionIce
    {
        createGraph(userId, botId, endUserId, null);
    }

    public final String[]
    getAIMLFileList(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getAIMLFileList(userId, botId, endUserId, null);
    }

    public final int
    getAIMLFileListSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getAIMLFileListSize(userId, botId, endUserId, null);
    }

    public final String[]
    getAIMLStringList(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getAIMLStringList(userId, botId, endUserId, null);
    }

    public final int
    getAIMLStringListSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getAIMLStringListSize(userId, botId, endUserId, null);
    }

    public final String[]
    getBotIds(String userId)
        throws ExceptionIce
    {
        return getBotIds(userId, null);
    }

    public final int
    getBotIdsSize(String userId)
        throws ExceptionIce
    {
        return getBotIdsSize(userId, null);
    }

    public final String
    getBotPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getBotPredicate(name, userId, botId, endUserId, null);
    }

    public final String[]
    getBotPredicates(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getBotPredicates(userId, botId, endUserId, null);
    }

    public final int
    getBotPredicatesSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getBotPredicatesSize(userId, botId, endUserId, null);
    }

    public final String[]
    getEndUserIds(String userId, String botId)
        throws ExceptionIce
    {
        return getEndUserIds(userId, botId, null);
    }

    public final int
    getEndUserIdsSize(String userId, String botId)
        throws ExceptionIce
    {
        return getEndUserIdsSize(userId, botId, null);
    }

    public final String
    getId()
        throws ExceptionIce
    {
        return getId(null);
    }

    public final String
    getPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getPredicate(name, userId, botId, endUserId, null);
    }

    public final String[]
    getPredicates(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getPredicates(userId, botId, endUserId, null);
    }

    public final int
    getPredicatesSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getPredicatesSize(userId, botId, endUserId, null);
    }

    public final String
    getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        return getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, null);
    }

    public final String
    getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        return getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, null);
    }

    public final String
    getResponse(String input, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getResponse(input, userId, botId, endUserId, null);
    }

    public final int
    getSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getSize(userId, botId, endUserId, null);
    }

    public final String
    getThat(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getThat(userId, botId, endUserId, null);
    }

    public final String
    getTopic(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getTopic(userId, botId, endUserId, null);
    }

    public final String[]
    getUserIds()
        throws ExceptionIce
    {
        return getUserIds(null);
    }

    public final int
    getUserIdsSize()
        throws ExceptionIce
    {
        return getUserIdsSize(null);
    }

    public final String
    getVersion()
        throws ExceptionIce
    {
        return getVersion(null);
    }

    public final void
    parsePropertiesFile(String fileName, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        parsePropertiesFile(fileName, userId, botId, endUserId, null);
    }

    public final void
    parseSentenceSplitterFile(String fileName)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        parseSentenceSplitterFile(fileName, null);
    }

    public final void
    parseSubstitutionFile(String fileName)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        parseSubstitutionFile(fileName, null);
    }

    public final boolean
    predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, null);
    }

    public final void
    printEntireDatabase()
        throws ExceptionIce
    {
        printEntireDatabase(null);
    }

    public final void
    removeBot(String userId, String botId)
        throws ExceptionIce
    {
        removeBot(userId, botId, null);
    }

    public final void
    removeBotPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        removeBotPredicate(name, userId, botId, endUserId, null);
    }

    public final void
    removeCustomTagLibrary(String library)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        removeCustomTagLibrary(library, null);
    }

    public final void
    removeDirectory(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        removeDirectory(directory, userId, botId, endUserId, null);
    }

    public final void
    removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, null);
    }

    public final void
    removeEndUser(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        removeEndUser(userId, botId, endUserId, null);
    }

    public final void
    removeFile(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        removeFile(file, userId, botId, endUserId, null);
    }

    public final void
    removeGraph(String userId, String botId, String endUserId)
        throws ExceptionIce,
               XMLErrorExceptionIce
    {
        removeGraph(userId, botId, endUserId, null);
    }

    public final void
    removePredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        removePredicate(name, userId, botId, endUserId, null);
    }

    public final void
    removeString(String stringContainingAIML, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        removeString(stringContainingAIML, userId, botId, endUserId, null);
    }

    public final void
    removeUser(String userId)
        throws ExceptionIce
    {
        removeUser(userId, null);
    }

    public final void
    setAIMLSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        setAIMLSchema(schema, null);
    }

    public final void
    setAIMLValidation(boolean trueOrFalse)
        throws ExceptionIce
    {
        setAIMLValidation(trueOrFalse, null);
    }

    public final void
    setAddStringAIMLFooter(String aimlFooter)
        throws ExceptionIce
    {
        setAddStringAIMLFooter(aimlFooter, null);
    }

    public final void
    setAddStringAIMLHeader(String aimlHeader)
        throws ExceptionIce
    {
        setAddStringAIMLHeader(aimlHeader, null);
    }

    public final void
    setBotConfigurationSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        setBotConfigurationSchema(schema, null);
    }

    public final void
    setBotConfigurationValidation(boolean trueOrFalse)
        throws ExceptionIce
    {
        setBotConfigurationValidation(trueOrFalse, null);
    }

    public final void
    setBotPredicate(String name, String value, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        setBotPredicate(name, value, userId, botId, endUserId, null);
    }

    public final void
    setCallBacks(String name, String category)
        throws ExceptionIce
    {
        setCallBacks(name, category, null);
    }

    public final void
    setCommonTypesSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        setCommonTypesSchema(schema, null);
    }

    public final void
    setGenderSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setGenderSubstitution(find, replace, null);
    }

    public final void
    setInputSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setInputSubstitution(find, replace, null);
    }

    public final void
    setPerson2Substitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setPerson2Substitution(find, replace, null);
    }

    public final void
    setPersonSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setPersonSubstitution(find, replace, null);
    }

    public final void
    setPredicate(String name, String value, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        setPredicate(name, value, userId, botId, endUserId, null);
    }

    public final void
    setSentenceSplitter(String splitter)
        throws ExceptionIce
    {
        setSentenceSplitter(splitter, null);
    }

    public final void
    setThat(String that, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        setThat(that, userId, botId, endUserId, null);
    }

    public final void
    setTopic(String topic, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        setTopic(topic, userId, botId, endUserId, null);
    }

    public final void
    storeGossip(String gossip)
        throws ExceptionIce
    {
        storeGossip(gossip, null);
    }

    public final void
    synchronizeDatabase()
        throws ExceptionIce
    {
        synchronizeDatabase(null);
    }

    public static IceInternal.DispatchStatus
    ___addFile(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String file;
        file = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.addFile(file, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___addFileUnlessAlreadyAdded(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String file;
        file = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.addFileUnlessAlreadyAdded(file, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeFile(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String file;
        file = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.removeFile(file, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___addDirectory(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String directory;
        directory = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.addDirectory(directory, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(DirectoryNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___addDirectoryWithFilesEndingInRegularExpression(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String directory;
        directory = __is.readString();
        String regularExpression;
        regularExpression = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(DirectoryNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___addDirectoryUnlessAlreadyAdded(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String directory;
        directory = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(DirectoryNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String directory;
        directory = __is.readString();
        String regularExpression;
        regularExpression = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(DirectoryNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeDirectory(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String directory;
        directory = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.removeDirectory(directory, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(DirectoryNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeDirectoryWithFilesEndingInRegularExpression(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String directory;
        directory = __is.readString();
        String regularExpression;
        regularExpression = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(DirectoryNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___addString(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String stringContainingAIML;
        stringContainingAIML = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.addString(stringContainingAIML, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeString(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String stringContainingAIML;
        stringContainingAIML = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.removeString(stringContainingAIML, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setAddStringAIMLHeader(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String aimlHeader;
        aimlHeader = __is.readString();
        try
        {
            __obj.setAddStringAIMLHeader(aimlHeader, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setAddStringAIMLFooter(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String aimlFooter;
        aimlFooter = __is.readString();
        try
        {
            __obj.setAddStringAIMLFooter(aimlFooter, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setAIMLSchema(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String schema;
        schema = __is.readString();
        try
        {
            __obj.setAIMLSchema(schema, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setCommonTypesSchema(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String schema;
        schema = __is.readString();
        try
        {
            __obj.setCommonTypesSchema(schema, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setAIMLValidation(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        boolean trueOrFalse;
        trueOrFalse = __is.readBool();
        try
        {
            __obj.setAIMLValidation(trueOrFalse, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getResponse(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String input;
        input = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String __ret = __obj.getResponse(input, userId, botId, endUserId, __current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setThat(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String that;
        that = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.setThat(that, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setTopic(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String topic;
        topic = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.setTopic(topic, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getThat(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String __ret = __obj.getThat(userId, botId, endUserId, __current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getTopic(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String __ret = __obj.getTopic(userId, botId, endUserId, __current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___createGraph(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.createGraph(userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(XMLErrorExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeGraph(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.removeGraph(userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(XMLErrorExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___predicateMatch(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String predicateName;
        predicateName = __is.readString();
        String aimlPattern;
        aimlPattern = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            boolean __ret = __obj.predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, __current);
            __os.writeBool(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setPredicate(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String name;
        name = __is.readString();
        String value;
        value = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.setPredicate(name, value, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getPredicate(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String name;
        name = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String __ret = __obj.getPredicate(name, userId, botId, endUserId, __current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getBotPredicate(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String name;
        name = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String __ret = __obj.getBotPredicate(name, userId, botId, endUserId, __current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setBotPredicate(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String name;
        name = __is.readString();
        String value;
        value = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.setBotPredicate(name, value, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getPreviousBotResponse(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        int previousBotResponse;
        previousBotResponse = __is.readInt();
        int sentence;
        sentence = __is.readInt();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String __ret = __obj.getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, __current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getPreviousUserInput(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        int previousUserInput;
        previousUserInput = __is.readInt();
        int sentence;
        sentence = __is.readInt();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String __ret = __obj.getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, __current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setBotConfigurationSchema(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String schema;
        schema = __is.readString();
        try
        {
            __obj.setBotConfigurationSchema(schema, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setBotConfigurationValidation(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        boolean trueOrFalse;
        trueOrFalse = __is.readBool();
        try
        {
            __obj.setBotConfigurationValidation(trueOrFalse, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___parseSubstitutionFile(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String fileName;
        fileName = __is.readString();
        try
        {
            __obj.parseSubstitutionFile(fileName, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(XMLErrorExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___parseSentenceSplitterFile(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String fileName;
        fileName = __is.readString();
        try
        {
            __obj.parseSentenceSplitterFile(fileName, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(XMLErrorExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___parsePropertiesFile(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String fileName;
        fileName = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.parsePropertiesFile(fileName, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(XMLErrorExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setSentenceSplitter(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String splitter;
        splitter = __is.readString();
        try
        {
            __obj.setSentenceSplitter(splitter, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setInputSubstitution(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String find;
        find = __is.readString();
        String replace;
        replace = __is.readString();
        try
        {
            __obj.setInputSubstitution(find, replace, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setGenderSubstitution(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String find;
        find = __is.readString();
        String replace;
        replace = __is.readString();
        try
        {
            __obj.setGenderSubstitution(find, replace, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setPersonSubstitution(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String find;
        find = __is.readString();
        String replace;
        replace = __is.readString();
        try
        {
            __obj.setPersonSubstitution(find, replace, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setPerson2Substitution(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String find;
        find = __is.readString();
        String replace;
        replace = __is.readString();
        try
        {
            __obj.setPerson2Substitution(find, replace, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(IllegalArgumentExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getVersion(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getVersion(__current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getSize(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            int __ret = __obj.getSize(userId, botId, endUserId, __current);
            __os.writeInt(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___setCallBacks(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String name;
        name = __is.readString();
        String category;
        category = __is.readString();
        try
        {
            __obj.setCallBacks(name, category, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___storeGossip(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String gossip;
        gossip = __is.readString();
        try
        {
            __obj.storeGossip(gossip, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getId(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getId(__current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___addCustomTagLibrary(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String library;
        library = __is.readString();
        try
        {
            __obj.addCustomTagLibrary(library, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeCustomTagLibrary(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String library;
        library = __is.readString();
        try
        {
            __obj.removeCustomTagLibrary(library, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(FileNotFoundExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___callSystemCommand(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String command;
        command = __is.readString();
        try
        {
            String __ret = __obj.callSystemCommand(command, __current);
            __os.writeString(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___synchronizeDatabase(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.synchronizeDatabase(__current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getAIMLFileList(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String[] __ret = __obj.getAIMLFileList(userId, botId, endUserId, __current);
            StringSeqHelper.write(__os, __ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getAIMLFileListSize(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            int __ret = __obj.getAIMLFileListSize(userId, botId, endUserId, __current);
            __os.writeInt(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getAIMLStringList(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String[] __ret = __obj.getAIMLStringList(userId, botId, endUserId, __current);
            StringSeqHelper.write(__os, __ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getAIMLStringListSize(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            int __ret = __obj.getAIMLStringListSize(userId, botId, endUserId, __current);
            __os.writeInt(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getUserIds(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String[] __ret = __obj.getUserIds(__current);
            StringSeqHelper.write(__os, __ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getUserIdsSize(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getUserIdsSize(__current);
            __os.writeInt(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getBotIds(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        try
        {
            String[] __ret = __obj.getBotIds(userId, __current);
            StringSeqHelper.write(__os, __ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getBotIdsSize(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        try
        {
            int __ret = __obj.getBotIdsSize(userId, __current);
            __os.writeInt(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getEndUserIds(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        try
        {
            String[] __ret = __obj.getEndUserIds(userId, botId, __current);
            StringSeqHelper.write(__os, __ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getEndUserIdsSize(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        try
        {
            int __ret = __obj.getEndUserIdsSize(userId, botId, __current);
            __os.writeInt(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___printEntireDatabase(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.printEntireDatabase(__current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getBotPredicates(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String[] __ret = __obj.getBotPredicates(userId, botId, endUserId, __current);
            StringSeqHelper.write(__os, __ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getPredicates(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            String[] __ret = __obj.getPredicates(userId, botId, endUserId, __current);
            StringSeqHelper.write(__os, __ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getBotPredicatesSize(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            int __ret = __obj.getBotPredicatesSize(userId, botId, endUserId, __current);
            __os.writeInt(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___getPredicatesSize(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            int __ret = __obj.getPredicatesSize(userId, botId, endUserId, __current);
            __os.writeInt(__ret);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removePredicate(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String name;
        name = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.removePredicate(name, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeBotPredicate(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String name;
        name = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.removeBotPredicate(name, userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeEndUser(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        try
        {
            __obj.removeEndUser(userId, botId, endUserId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeBot(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        try
        {
            __obj.removeBot(userId, botId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    public static IceInternal.DispatchStatus
    ___removeUser(NetworkGraphBuilderIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        IceInternal.BasicStream __os = __inS.os();
        String userId;
        userId = __is.readString();
        try
        {
            __obj.removeUser(userId, __current);
            return IceInternal.DispatchStatus.DispatchOK;
        }
        catch(ExceptionIce ex)
        {
            __os.writeUserException(ex);
            return IceInternal.DispatchStatus.DispatchUserException;
        }
    }

    private final static String[] __all =
    {
        "addCustomTagLibrary",
        "addDirectory",
        "addDirectoryUnlessAlreadyAdded",
        "addDirectoryWithFilesEndingInRegularExpression",
        "addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded",
        "addFile",
        "addFileUnlessAlreadyAdded",
        "addString",
        "callSystemCommand",
        "createGraph",
        "getAIMLFileList",
        "getAIMLFileListSize",
        "getAIMLStringList",
        "getAIMLStringListSize",
        "getBotIds",
        "getBotIdsSize",
        "getBotPredicate",
        "getBotPredicates",
        "getBotPredicatesSize",
        "getEndUserIds",
        "getEndUserIdsSize",
        "getId",
        "getPredicate",
        "getPredicates",
        "getPredicatesSize",
        "getPreviousBotResponse",
        "getPreviousUserInput",
        "getResponse",
        "getSize",
        "getThat",
        "getTopic",
        "getUserIds",
        "getUserIdsSize",
        "getVersion",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "parsePropertiesFile",
        "parseSentenceSplitterFile",
        "parseSubstitutionFile",
        "predicateMatch",
        "printEntireDatabase",
        "removeBot",
        "removeBotPredicate",
        "removeCustomTagLibrary",
        "removeDirectory",
        "removeDirectoryWithFilesEndingInRegularExpression",
        "removeEndUser",
        "removeFile",
        "removeGraph",
        "removePredicate",
        "removeString",
        "removeUser",
        "setAIMLSchema",
        "setAIMLValidation",
        "setAddStringAIMLFooter",
        "setAddStringAIMLHeader",
        "setBotConfigurationSchema",
        "setBotConfigurationValidation",
        "setBotPredicate",
        "setCallBacks",
        "setCommonTypesSchema",
        "setGenderSubstitution",
        "setInputSubstitution",
        "setPerson2Substitution",
        "setPersonSubstitution",
        "setPredicate",
        "setSentenceSplitter",
        "setThat",
        "setTopic",
        "storeGossip",
        "synchronizeDatabase"
    };

    public IceInternal.DispatchStatus
    __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            return IceInternal.DispatchStatus.DispatchOperationNotExist;
        }

        switch(pos)
        {
            case 0:
            {
                return ___addCustomTagLibrary(this, in, __current);
            }
            case 1:
            {
                return ___addDirectory(this, in, __current);
            }
            case 2:
            {
                return ___addDirectoryUnlessAlreadyAdded(this, in, __current);
            }
            case 3:
            {
                return ___addDirectoryWithFilesEndingInRegularExpression(this, in, __current);
            }
            case 4:
            {
                return ___addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(this, in, __current);
            }
            case 5:
            {
                return ___addFile(this, in, __current);
            }
            case 6:
            {
                return ___addFileUnlessAlreadyAdded(this, in, __current);
            }
            case 7:
            {
                return ___addString(this, in, __current);
            }
            case 8:
            {
                return ___callSystemCommand(this, in, __current);
            }
            case 9:
            {
                return ___createGraph(this, in, __current);
            }
            case 10:
            {
                return ___getAIMLFileList(this, in, __current);
            }
            case 11:
            {
                return ___getAIMLFileListSize(this, in, __current);
            }
            case 12:
            {
                return ___getAIMLStringList(this, in, __current);
            }
            case 13:
            {
                return ___getAIMLStringListSize(this, in, __current);
            }
            case 14:
            {
                return ___getBotIds(this, in, __current);
            }
            case 15:
            {
                return ___getBotIdsSize(this, in, __current);
            }
            case 16:
            {
                return ___getBotPredicate(this, in, __current);
            }
            case 17:
            {
                return ___getBotPredicates(this, in, __current);
            }
            case 18:
            {
                return ___getBotPredicatesSize(this, in, __current);
            }
            case 19:
            {
                return ___getEndUserIds(this, in, __current);
            }
            case 20:
            {
                return ___getEndUserIdsSize(this, in, __current);
            }
            case 21:
            {
                return ___getId(this, in, __current);
            }
            case 22:
            {
                return ___getPredicate(this, in, __current);
            }
            case 23:
            {
                return ___getPredicates(this, in, __current);
            }
            case 24:
            {
                return ___getPredicatesSize(this, in, __current);
            }
            case 25:
            {
                return ___getPreviousBotResponse(this, in, __current);
            }
            case 26:
            {
                return ___getPreviousUserInput(this, in, __current);
            }
            case 27:
            {
                return ___getResponse(this, in, __current);
            }
            case 28:
            {
                return ___getSize(this, in, __current);
            }
            case 29:
            {
                return ___getThat(this, in, __current);
            }
            case 30:
            {
                return ___getTopic(this, in, __current);
            }
            case 31:
            {
                return ___getUserIds(this, in, __current);
            }
            case 32:
            {
                return ___getUserIdsSize(this, in, __current);
            }
            case 33:
            {
                return ___getVersion(this, in, __current);
            }
            case 34:
            {
                return ___ice_id(this, in, __current);
            }
            case 35:
            {
                return ___ice_ids(this, in, __current);
            }
            case 36:
            {
                return ___ice_isA(this, in, __current);
            }
            case 37:
            {
                return ___ice_ping(this, in, __current);
            }
            case 38:
            {
                return ___parsePropertiesFile(this, in, __current);
            }
            case 39:
            {
                return ___parseSentenceSplitterFile(this, in, __current);
            }
            case 40:
            {
                return ___parseSubstitutionFile(this, in, __current);
            }
            case 41:
            {
                return ___predicateMatch(this, in, __current);
            }
            case 42:
            {
                return ___printEntireDatabase(this, in, __current);
            }
            case 43:
            {
                return ___removeBot(this, in, __current);
            }
            case 44:
            {
                return ___removeBotPredicate(this, in, __current);
            }
            case 45:
            {
                return ___removeCustomTagLibrary(this, in, __current);
            }
            case 46:
            {
                return ___removeDirectory(this, in, __current);
            }
            case 47:
            {
                return ___removeDirectoryWithFilesEndingInRegularExpression(this, in, __current);
            }
            case 48:
            {
                return ___removeEndUser(this, in, __current);
            }
            case 49:
            {
                return ___removeFile(this, in, __current);
            }
            case 50:
            {
                return ___removeGraph(this, in, __current);
            }
            case 51:
            {
                return ___removePredicate(this, in, __current);
            }
            case 52:
            {
                return ___removeString(this, in, __current);
            }
            case 53:
            {
                return ___removeUser(this, in, __current);
            }
            case 54:
            {
                return ___setAIMLSchema(this, in, __current);
            }
            case 55:
            {
                return ___setAIMLValidation(this, in, __current);
            }
            case 56:
            {
                return ___setAddStringAIMLFooter(this, in, __current);
            }
            case 57:
            {
                return ___setAddStringAIMLHeader(this, in, __current);
            }
            case 58:
            {
                return ___setBotConfigurationSchema(this, in, __current);
            }
            case 59:
            {
                return ___setBotConfigurationValidation(this, in, __current);
            }
            case 60:
            {
                return ___setBotPredicate(this, in, __current);
            }
            case 61:
            {
                return ___setCallBacks(this, in, __current);
            }
            case 62:
            {
                return ___setCommonTypesSchema(this, in, __current);
            }
            case 63:
            {
                return ___setGenderSubstitution(this, in, __current);
            }
            case 64:
            {
                return ___setInputSubstitution(this, in, __current);
            }
            case 65:
            {
                return ___setPerson2Substitution(this, in, __current);
            }
            case 66:
            {
                return ___setPersonSubstitution(this, in, __current);
            }
            case 67:
            {
                return ___setPredicate(this, in, __current);
            }
            case 68:
            {
                return ___setSentenceSplitter(this, in, __current);
            }
            case 69:
            {
                return ___setThat(this, in, __current);
            }
            case 70:
            {
                return ___setTopic(this, in, __current);
            }
            case 71:
            {
                return ___storeGossip(this, in, __current);
            }
            case 72:
            {
                return ___synchronizeDatabase(this, in, __current);
            }
        }

        assert(false);
        return IceInternal.DispatchStatus.DispatchOperationNotExist;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeTypeId(ice_staticId());
        __os.startWriteSlice();
        __os.endWriteSlice();
        super.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readTypeId();
        }
        __is.startReadSlice();
        __is.endReadSlice();
        super.__read(__is, true);
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type rebecca::impl::NetworkGraphBuilderIce was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type rebecca::impl::NetworkGraphBuilderIce was not generated with stream support";
        throw ex;
    }
}
