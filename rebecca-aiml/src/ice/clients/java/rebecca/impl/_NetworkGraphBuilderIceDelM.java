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

public final class _NetworkGraphBuilderIceDelM extends Ice._ObjectDelM implements _NetworkGraphBuilderIceDel
{
    public void
    addCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "addCustomTagLibrary", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(library);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    addDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "addDirectory", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(directory);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(DirectoryNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "addDirectoryUnlessAlreadyAdded", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(directory);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(DirectoryNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "addDirectoryWithFilesEndingInRegularExpression", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(directory);
                __os.writeString(regularExpression);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(DirectoryNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(directory);
                __os.writeString(regularExpression);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(DirectoryNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    addFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "addFile", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(file);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "addFileUnlessAlreadyAdded", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(file);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    addString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "addString", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(stringContainingAIML);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    callSystemCommand(String command, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "callSystemCommand", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(command);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    createGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               XMLErrorExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "createGraph", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(XMLErrorExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String[]
    getAIMLFileList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getAIMLFileList", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String[] __ret;
                __ret = StringSeqHelper.read(__is);
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public int
    getAIMLFileListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getAIMLFileListSize", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                int __ret;
                __ret = __is.readInt();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String[]
    getAIMLStringList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getAIMLStringList", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String[] __ret;
                __ret = StringSeqHelper.read(__is);
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public int
    getAIMLStringListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getAIMLStringListSize", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                int __ret;
                __ret = __is.readInt();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String[]
    getBotIds(String userId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getBotIds", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String[] __ret;
                __ret = StringSeqHelper.read(__is);
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public int
    getBotIdsSize(String userId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getBotIdsSize", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                int __ret;
                __ret = __is.readInt();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    getBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getBotPredicate", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(name);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String[]
    getBotPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getBotPredicates", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String[] __ret;
                __ret = StringSeqHelper.read(__is);
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public int
    getBotPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getBotPredicatesSize", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                int __ret;
                __ret = __is.readInt();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String[]
    getEndUserIds(String userId, String botId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getEndUserIds", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String[] __ret;
                __ret = StringSeqHelper.read(__is);
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public int
    getEndUserIdsSize(String userId, String botId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getEndUserIdsSize", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                int __ret;
                __ret = __is.readInt();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    getId(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getId", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    getPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getPredicate", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(name);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String[]
    getPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getPredicates", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String[] __ret;
                __ret = StringSeqHelper.read(__is);
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public int
    getPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getPredicatesSize", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                int __ret;
                __ret = __is.readInt();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getPreviousBotResponse", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeInt(previousBotResponse);
                __os.writeInt(sentence);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getPreviousUserInput", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeInt(previousUserInput);
                __os.writeInt(sentence);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    getResponse(String input, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getResponse", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(input);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public int
    getSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getSize", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                int __ret;
                __ret = __is.readInt();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    getThat(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getThat", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    getTopic(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getTopic", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String[]
    getUserIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getUserIds", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String[] __ret;
                __ret = StringSeqHelper.read(__is);
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public int
    getUserIdsSize(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getUserIdsSize", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                int __ret;
                __ret = __is.readInt();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public String
    getVersion(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "getVersion", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                String __ret;
                __ret = __is.readString();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    parsePropertiesFile(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "parsePropertiesFile", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(fileName);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(XMLErrorExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    parseSentenceSplitterFile(String fileName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "parseSentenceSplitterFile", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(fileName);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(XMLErrorExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    parseSubstitutionFile(String fileName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "parseSubstitutionFile", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(fileName);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(XMLErrorExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public boolean
    predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "predicateMatch", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(predicateName);
                __os.writeString(aimlPattern);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
                boolean __ret;
                __ret = __is.readBool();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    printEntireDatabase(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "printEntireDatabase", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeBot(String userId, String botId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeBot", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeBotPredicate", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(name);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeCustomTagLibrary", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(library);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeDirectory", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(directory);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(DirectoryNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeDirectoryWithFilesEndingInRegularExpression", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(directory);
                __os.writeString(regularExpression);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(DirectoryNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeEndUser(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeEndUser", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeFile", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(file);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               XMLErrorExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeGraph", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(XMLErrorExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removePredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removePredicate", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(name);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeString", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(stringContainingAIML);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    removeUser(String userId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "removeUser", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(userId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setAIMLSchema(String schema, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setAIMLSchema", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(schema);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setAIMLValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setAIMLValidation", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeBool(trueOrFalse);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setAddStringAIMLFooter(String aimlFooter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setAddStringAIMLFooter", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(aimlFooter);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setAddStringAIMLHeader(String aimlHeader, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setAddStringAIMLHeader", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(aimlHeader);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setBotConfigurationSchema(String schema, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setBotConfigurationSchema", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(schema);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setBotConfigurationValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setBotConfigurationValidation", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeBool(trueOrFalse);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setBotPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setBotPredicate", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(name);
                __os.writeString(value);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setCallBacks(String name, String category, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setCallBacks", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(name);
                __os.writeString(category);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setCommonTypesSchema(String schema, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               FileNotFoundExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setCommonTypesSchema", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(schema);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(FileNotFoundExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setGenderSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setGenderSubstitution", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(find);
                __os.writeString(replace);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setInputSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setInputSubstitution", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(find);
                __os.writeString(replace);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setPerson2Substitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setPerson2Substitution", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(find);
                __os.writeString(replace);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setPersonSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               IllegalArgumentExceptionIce,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setPersonSubstitution", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(find);
                __os.writeString(replace);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(IllegalArgumentExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setPredicate", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(name);
                __os.writeString(value);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setSentenceSplitter(String splitter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setSentenceSplitter", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(splitter);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setThat(String that, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setThat", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(that);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    setTopic(String topic, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "setTopic", Ice.OperationMode.Idempotent, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(topic);
                __os.writeString(userId);
                __os.writeString(botId);
                __os.writeString(endUserId);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    storeGossip(String gossip, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "storeGossip", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.os();
                __os.writeString(gossip);
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }

    public void
    synchronizeDatabase(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        IceInternal.Outgoing __og = __connection.getOutgoing(__reference, "synchronizeDatabase", Ice.OperationMode.Normal, __ctx, __compress);
        try
        {
            boolean __ok = __og.invoke();
            try
            {
                IceInternal.BasicStream __is = __og.is();
                if(!__ok)
                {
                    try
                    {
                        __is.throwException();
                    }
                    catch(ExceptionIce __ex)
                    {
                        throw __ex;
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name());
                    }
                }
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __connection.reclaimOutgoing(__og);
        }
    }
}
