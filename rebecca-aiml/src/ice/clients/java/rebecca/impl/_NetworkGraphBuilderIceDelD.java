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

public final class _NetworkGraphBuilderIceDelD extends Ice._ObjectDelD implements _NetworkGraphBuilderIceDel
{
    public void
    addCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "addCustomTagLibrary", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.addCustomTagLibrary(library, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    addDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "addDirectory", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.addDirectory(directory, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "addDirectoryUnlessAlreadyAdded", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "addDirectoryWithFilesEndingInRegularExpression", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    addFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "addFile", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.addFile(file, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "addFileUnlessAlreadyAdded", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.addFileUnlessAlreadyAdded(file, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    addString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "addString", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.addString(stringContainingAIML, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    callSystemCommand(String command, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "callSystemCommand", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.callSystemCommand(command, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    createGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               XMLErrorExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "createGraph", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.createGraph(userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String[]
    getAIMLFileList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getAIMLFileList", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getAIMLFileList(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public int
    getAIMLFileListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getAIMLFileListSize", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getAIMLFileListSize(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String[]
    getAIMLStringList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getAIMLStringList", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getAIMLStringList(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public int
    getAIMLStringListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getAIMLStringListSize", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getAIMLStringListSize(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String[]
    getBotIds(String userId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getBotIds", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getBotIds(userId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public int
    getBotIdsSize(String userId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getBotIdsSize", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getBotIdsSize(userId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    getBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getBotPredicate", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getBotPredicate(name, userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String[]
    getBotPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getBotPredicates", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getBotPredicates(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public int
    getBotPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getBotPredicatesSize", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getBotPredicatesSize(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String[]
    getEndUserIds(String userId, String botId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getEndUserIds", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getEndUserIds(userId, botId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public int
    getEndUserIdsSize(String userId, String botId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getEndUserIdsSize", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getEndUserIdsSize(userId, botId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    getId(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getId", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getId(__current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    getPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getPredicate", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getPredicate(name, userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String[]
    getPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getPredicates", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getPredicates(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public int
    getPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getPredicatesSize", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getPredicatesSize(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getPreviousBotResponse", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getPreviousUserInput", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    getResponse(String input, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getResponse", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getResponse(input, userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public int
    getSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getSize", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getSize(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    getThat(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getThat", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getThat(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    getTopic(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getTopic", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getTopic(userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String[]
    getUserIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getUserIds", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getUserIds(__current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public int
    getUserIdsSize(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getUserIdsSize", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getUserIdsSize(__current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public String
    getVersion(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "getVersion", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.getVersion(__current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    parsePropertiesFile(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "parsePropertiesFile", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.parsePropertiesFile(fileName, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    parseSentenceSplitterFile(String fileName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "parseSentenceSplitterFile", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.parseSentenceSplitterFile(fileName, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    parseSubstitutionFile(String fileName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "parseSubstitutionFile", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.parseSubstitutionFile(fileName, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public boolean
    predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "predicateMatch", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    printEntireDatabase(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "printEntireDatabase", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.printEntireDatabase(__current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeBot(String userId, String botId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeBot", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeBot(userId, botId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeBotPredicate", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeBotPredicate(name, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeCustomTagLibrary", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeCustomTagLibrary(library, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeDirectory", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeDirectory(directory, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeDirectoryWithFilesEndingInRegularExpression", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeEndUser(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeEndUser", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeEndUser(userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeFile", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeFile(file, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               XMLErrorExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeGraph", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeGraph(userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removePredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removePredicate", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removePredicate(name, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeString", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeString(stringContainingAIML, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    removeUser(String userId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "removeUser", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.removeUser(userId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setAIMLSchema(String schema, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setAIMLSchema", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setAIMLSchema(schema, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setAIMLValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setAIMLValidation", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setAIMLValidation(trueOrFalse, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setAddStringAIMLFooter(String aimlFooter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setAddStringAIMLFooter", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setAddStringAIMLFooter(aimlFooter, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setAddStringAIMLHeader(String aimlHeader, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setAddStringAIMLHeader", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setAddStringAIMLHeader(aimlHeader, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setBotConfigurationSchema(String schema, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setBotConfigurationSchema", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setBotConfigurationSchema(schema, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setBotConfigurationValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setBotConfigurationValidation", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setBotConfigurationValidation(trueOrFalse, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setBotPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setBotPredicate", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setBotPredicate(name, value, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setCallBacks(String name, String category, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setCallBacks", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setCallBacks(name, category, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setCommonTypesSchema(String schema, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               FileNotFoundExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setCommonTypesSchema", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setCommonTypesSchema(schema, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setGenderSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setGenderSubstitution", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setGenderSubstitution(find, replace, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setInputSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setInputSubstitution", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setInputSubstitution(find, replace, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setPerson2Substitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setPerson2Substitution", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setPerson2Substitution(find, replace, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setPersonSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setPersonSubstitution", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setPersonSubstitution(find, replace, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setPredicate", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setPredicate(name, value, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setSentenceSplitter(String splitter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setSentenceSplitter", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setSentenceSplitter(splitter, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setThat(String that, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setThat", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setThat(that, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    setTopic(String topic, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "setTopic", Ice.OperationMode.Idempotent, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.setTopic(topic, userId, botId, endUserId, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    storeGossip(String gossip, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "storeGossip", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.storeGossip(gossip, __current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }

    public void
    synchronizeDatabase(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ExceptionIce
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "synchronizeDatabase", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                NetworkGraphBuilderIce __servant = null;
                try
                {
                    __servant = (NetworkGraphBuilderIce)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    __servant.synchronizeDatabase(__current);
                    return;
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }
}
