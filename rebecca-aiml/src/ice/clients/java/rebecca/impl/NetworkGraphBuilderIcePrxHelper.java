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

public final class NetworkGraphBuilderIcePrxHelper extends Ice.ObjectPrxHelperBase implements NetworkGraphBuilderIcePrx
{
    public void
    addCustomTagLibrary(String library)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        addCustomTagLibrary(library, null, false);
    }

    public void
    addCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        addCustomTagLibrary(library, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    addCustomTagLibrary(String library, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("addCustomTagLibrary");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.addCustomTagLibrary(library, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    addDirectory(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectory(directory, userId, botId, endUserId, null, false);
    }

    public void
    addDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectory(directory, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    addDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("addDirectory");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.addDirectory(directory, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, null, false);
    }

    public void
    addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    addDirectoryUnlessAlreadyAdded(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("addDirectoryUnlessAlreadyAdded");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, null, false);
    }

    public void
    addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("addDirectoryWithFilesEndingInRegularExpression");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, null, false);
    }

    public void
    addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    addFile(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        addFile(file, userId, botId, endUserId, null, false);
    }

    public void
    addFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        addFile(file, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    addFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("addFile");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.addFile(file, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        addFileUnlessAlreadyAdded(file, userId, botId, endUserId, null, false);
    }

    public void
    addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        addFileUnlessAlreadyAdded(file, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    addFileUnlessAlreadyAdded(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("addFileUnlessAlreadyAdded");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.addFileUnlessAlreadyAdded(file, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    addString(String stringContainingAIML, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        addString(stringContainingAIML, userId, botId, endUserId, null, false);
    }

    public void
    addString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        addString(stringContainingAIML, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    addString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("addString");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.addString(stringContainingAIML, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    callSystemCommand(String command)
        throws ExceptionIce
    {
        return callSystemCommand(command, null, false);
    }

    public String
    callSystemCommand(String command, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return callSystemCommand(command, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    callSystemCommand(String command, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("callSystemCommand");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.callSystemCommand(command, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    createGraph(String userId, String botId, String endUserId)
        throws ExceptionIce,
               XMLErrorExceptionIce
    {
        createGraph(userId, botId, endUserId, null, false);
    }

    public void
    createGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               XMLErrorExceptionIce
    {
        createGraph(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    createGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               XMLErrorExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("createGraph");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.createGraph(userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String[]
    getAIMLFileList(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getAIMLFileList(userId, botId, endUserId, null, false);
    }

    public String[]
    getAIMLFileList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getAIMLFileList(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String[]
    getAIMLFileList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getAIMLFileList");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getAIMLFileList(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public int
    getAIMLFileListSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getAIMLFileListSize(userId, botId, endUserId, null, false);
    }

    public int
    getAIMLFileListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getAIMLFileListSize(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private int
    getAIMLFileListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getAIMLFileListSize");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getAIMLFileListSize(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String[]
    getAIMLStringList(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getAIMLStringList(userId, botId, endUserId, null, false);
    }

    public String[]
    getAIMLStringList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getAIMLStringList(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String[]
    getAIMLStringList(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getAIMLStringList");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getAIMLStringList(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public int
    getAIMLStringListSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getAIMLStringListSize(userId, botId, endUserId, null, false);
    }

    public int
    getAIMLStringListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getAIMLStringListSize(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private int
    getAIMLStringListSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getAIMLStringListSize");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getAIMLStringListSize(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String[]
    getBotIds(String userId)
        throws ExceptionIce
    {
        return getBotIds(userId, null, false);
    }

    public String[]
    getBotIds(String userId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getBotIds(userId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String[]
    getBotIds(String userId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getBotIds");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getBotIds(userId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public int
    getBotIdsSize(String userId)
        throws ExceptionIce
    {
        return getBotIdsSize(userId, null, false);
    }

    public int
    getBotIdsSize(String userId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getBotIdsSize(userId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private int
    getBotIdsSize(String userId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getBotIdsSize");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getBotIdsSize(userId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    getBotPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getBotPredicate(name, userId, botId, endUserId, null, false);
    }

    public String
    getBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getBotPredicate(name, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getBotPredicate");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getBotPredicate(name, userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String[]
    getBotPredicates(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getBotPredicates(userId, botId, endUserId, null, false);
    }

    public String[]
    getBotPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getBotPredicates(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String[]
    getBotPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getBotPredicates");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getBotPredicates(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public int
    getBotPredicatesSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getBotPredicatesSize(userId, botId, endUserId, null, false);
    }

    public int
    getBotPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getBotPredicatesSize(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private int
    getBotPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getBotPredicatesSize");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getBotPredicatesSize(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String[]
    getEndUserIds(String userId, String botId)
        throws ExceptionIce
    {
        return getEndUserIds(userId, botId, null, false);
    }

    public String[]
    getEndUserIds(String userId, String botId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getEndUserIds(userId, botId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String[]
    getEndUserIds(String userId, String botId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getEndUserIds");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getEndUserIds(userId, botId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public int
    getEndUserIdsSize(String userId, String botId)
        throws ExceptionIce
    {
        return getEndUserIdsSize(userId, botId, null, false);
    }

    public int
    getEndUserIdsSize(String userId, String botId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getEndUserIdsSize(userId, botId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private int
    getEndUserIdsSize(String userId, String botId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getEndUserIdsSize");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getEndUserIdsSize(userId, botId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    getId()
        throws ExceptionIce
    {
        return getId(null, false);
    }

    public String
    getId(java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getId(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getId(java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getId");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getId(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    getPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getPredicate(name, userId, botId, endUserId, null, false);
    }

    public String
    getPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getPredicate(name, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getPredicate");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getPredicate(name, userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String[]
    getPredicates(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getPredicates(userId, botId, endUserId, null, false);
    }

    public String[]
    getPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getPredicates(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String[]
    getPredicates(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getPredicates");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getPredicates(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public int
    getPredicatesSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getPredicatesSize(userId, botId, endUserId, null, false);
    }

    public int
    getPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getPredicatesSize(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private int
    getPredicatesSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getPredicatesSize");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getPredicatesSize(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        return getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, null, false);
    }

    public String
    getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        return getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getPreviousBotResponse");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        return getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, null, false);
    }

    public String
    getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        return getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getPreviousUserInput");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    getResponse(String input, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getResponse(input, userId, botId, endUserId, null, false);
    }

    public String
    getResponse(String input, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getResponse(input, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getResponse(String input, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getResponse");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getResponse(input, userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public int
    getSize(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getSize(userId, botId, endUserId, null, false);
    }

    public int
    getSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getSize(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private int
    getSize(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getSize");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getSize(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    getThat(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getThat(userId, botId, endUserId, null, false);
    }

    public String
    getThat(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getThat(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getThat(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getThat");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getThat(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    getTopic(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return getTopic(userId, botId, endUserId, null, false);
    }

    public String
    getTopic(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getTopic(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getTopic(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getTopic");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getTopic(userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String[]
    getUserIds()
        throws ExceptionIce
    {
        return getUserIds(null, false);
    }

    public String[]
    getUserIds(java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getUserIds(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String[]
    getUserIds(java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getUserIds");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getUserIds(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public int
    getUserIdsSize()
        throws ExceptionIce
    {
        return getUserIdsSize(null, false);
    }

    public int
    getUserIdsSize(java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getUserIdsSize(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private int
    getUserIdsSize(java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getUserIdsSize");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getUserIdsSize(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public String
    getVersion()
        throws ExceptionIce
    {
        return getVersion(null, false);
    }

    public String
    getVersion(java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return getVersion(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getVersion(java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getVersion");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.getVersion(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    parsePropertiesFile(String fileName, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        parsePropertiesFile(fileName, userId, botId, endUserId, null, false);
    }

    public void
    parsePropertiesFile(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        parsePropertiesFile(fileName, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    parsePropertiesFile(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("parsePropertiesFile");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.parsePropertiesFile(fileName, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    parseSentenceSplitterFile(String fileName)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        parseSentenceSplitterFile(fileName, null, false);
    }

    public void
    parseSentenceSplitterFile(String fileName, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        parseSentenceSplitterFile(fileName, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    parseSentenceSplitterFile(String fileName, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("parseSentenceSplitterFile");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.parseSentenceSplitterFile(fileName, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    parseSubstitutionFile(String fileName)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        parseSubstitutionFile(fileName, null, false);
    }

    public void
    parseSubstitutionFile(String fileName, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        parseSubstitutionFile(fileName, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    parseSubstitutionFile(String fileName, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce,
               XMLErrorExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("parseSubstitutionFile");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.parseSubstitutionFile(fileName, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public boolean
    predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        return predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, null, false);
    }

    public boolean
    predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        return predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private boolean
    predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("predicateMatch");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                return __del.predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    printEntireDatabase()
        throws ExceptionIce
    {
        printEntireDatabase(null, false);
    }

    public void
    printEntireDatabase(java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        printEntireDatabase(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    printEntireDatabase(java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("printEntireDatabase");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.printEntireDatabase(__ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeBot(String userId, String botId)
        throws ExceptionIce
    {
        removeBot(userId, botId, null, false);
    }

    public void
    removeBot(String userId, String botId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        removeBot(userId, botId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeBot(String userId, String botId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeBot");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeBot(userId, botId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeBotPredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        removeBotPredicate(name, userId, botId, endUserId, null, false);
    }

    public void
    removeBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        removeBotPredicate(name, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeBotPredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeBotPredicate");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeBotPredicate(name, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeCustomTagLibrary(String library)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        removeCustomTagLibrary(library, null, false);
    }

    public void
    removeCustomTagLibrary(String library, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        removeCustomTagLibrary(library, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeCustomTagLibrary(String library, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeCustomTagLibrary");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeCustomTagLibrary(library, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeDirectory(String directory, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        removeDirectory(directory, userId, botId, endUserId, null, false);
    }

    public void
    removeDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        removeDirectory(directory, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeDirectory(String directory, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeDirectory");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeDirectory(directory, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, null, false);
    }

    public void
    removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws DirectoryNotFoundExceptionIce,
               ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeDirectoryWithFilesEndingInRegularExpression");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeEndUser(String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        removeEndUser(userId, botId, endUserId, null, false);
    }

    public void
    removeEndUser(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        removeEndUser(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeEndUser(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeEndUser");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeEndUser(userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeFile(String file, String userId, String botId, String endUserId)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        removeFile(file, userId, botId, endUserId, null, false);
    }

    public void
    removeFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        removeFile(file, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeFile(String file, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeFile");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeFile(file, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeGraph(String userId, String botId, String endUserId)
        throws ExceptionIce,
               XMLErrorExceptionIce
    {
        removeGraph(userId, botId, endUserId, null, false);
    }

    public void
    removeGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               XMLErrorExceptionIce
    {
        removeGraph(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeGraph(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               XMLErrorExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeGraph");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeGraph(userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removePredicate(String name, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        removePredicate(name, userId, botId, endUserId, null, false);
    }

    public void
    removePredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        removePredicate(name, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removePredicate(String name, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removePredicate");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removePredicate(name, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeString(String stringContainingAIML, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        removeString(stringContainingAIML, userId, botId, endUserId, null, false);
    }

    public void
    removeString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        removeString(stringContainingAIML, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeString(String stringContainingAIML, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeString");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeString(stringContainingAIML, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    removeUser(String userId)
        throws ExceptionIce
    {
        removeUser(userId, null, false);
    }

    public void
    removeUser(String userId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        removeUser(userId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    removeUser(String userId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("removeUser");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.removeUser(userId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setAIMLSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        setAIMLSchema(schema, null, false);
    }

    public void
    setAIMLSchema(String schema, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        setAIMLSchema(schema, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setAIMLSchema(String schema, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setAIMLSchema");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setAIMLSchema(schema, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setAIMLValidation(boolean trueOrFalse)
        throws ExceptionIce
    {
        setAIMLValidation(trueOrFalse, null, false);
    }

    public void
    setAIMLValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setAIMLValidation(trueOrFalse, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setAIMLValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setAIMLValidation");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setAIMLValidation(trueOrFalse, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setAddStringAIMLFooter(String aimlFooter)
        throws ExceptionIce
    {
        setAddStringAIMLFooter(aimlFooter, null, false);
    }

    public void
    setAddStringAIMLFooter(String aimlFooter, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setAddStringAIMLFooter(aimlFooter, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setAddStringAIMLFooter(String aimlFooter, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setAddStringAIMLFooter");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setAddStringAIMLFooter(aimlFooter, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setAddStringAIMLHeader(String aimlHeader)
        throws ExceptionIce
    {
        setAddStringAIMLHeader(aimlHeader, null, false);
    }

    public void
    setAddStringAIMLHeader(String aimlHeader, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setAddStringAIMLHeader(aimlHeader, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setAddStringAIMLHeader(String aimlHeader, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setAddStringAIMLHeader");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setAddStringAIMLHeader(aimlHeader, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setBotConfigurationSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        setBotConfigurationSchema(schema, null, false);
    }

    public void
    setBotConfigurationSchema(String schema, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        setBotConfigurationSchema(schema, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setBotConfigurationSchema(String schema, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setBotConfigurationSchema");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setBotConfigurationSchema(schema, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setBotConfigurationValidation(boolean trueOrFalse)
        throws ExceptionIce
    {
        setBotConfigurationValidation(trueOrFalse, null, false);
    }

    public void
    setBotConfigurationValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setBotConfigurationValidation(trueOrFalse, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setBotConfigurationValidation(boolean trueOrFalse, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setBotConfigurationValidation");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setBotConfigurationValidation(trueOrFalse, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setBotPredicate(String name, String value, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        setBotPredicate(name, value, userId, botId, endUserId, null, false);
    }

    public void
    setBotPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setBotPredicate(name, value, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setBotPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setBotPredicate");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setBotPredicate(name, value, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setCallBacks(String name, String category)
        throws ExceptionIce
    {
        setCallBacks(name, category, null, false);
    }

    public void
    setCallBacks(String name, String category, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setCallBacks(name, category, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setCallBacks(String name, String category, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setCallBacks");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setCallBacks(name, category, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setCommonTypesSchema(String schema)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        setCommonTypesSchema(schema, null, false);
    }

    public void
    setCommonTypesSchema(String schema, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        setCommonTypesSchema(schema, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setCommonTypesSchema(String schema, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               FileNotFoundExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setCommonTypesSchema");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setCommonTypesSchema(schema, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setGenderSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setGenderSubstitution(find, replace, null, false);
    }

    public void
    setGenderSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setGenderSubstitution(find, replace, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setGenderSubstitution(String find, String replace, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setGenderSubstitution");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setGenderSubstitution(find, replace, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setInputSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setInputSubstitution(find, replace, null, false);
    }

    public void
    setInputSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setInputSubstitution(find, replace, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setInputSubstitution(String find, String replace, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setInputSubstitution");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setInputSubstitution(find, replace, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setPerson2Substitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setPerson2Substitution(find, replace, null, false);
    }

    public void
    setPerson2Substitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setPerson2Substitution(find, replace, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setPerson2Substitution(String find, String replace, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setPerson2Substitution");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setPerson2Substitution(find, replace, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setPersonSubstitution(String find, String replace)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setPersonSubstitution(find, replace, null, false);
    }

    public void
    setPersonSubstitution(String find, String replace, java.util.Map<String, String> __ctx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        setPersonSubstitution(find, replace, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setPersonSubstitution(String find, String replace, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce,
               IllegalArgumentExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setPersonSubstitution");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setPersonSubstitution(find, replace, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setPredicate(String name, String value, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        setPredicate(name, value, userId, botId, endUserId, null, false);
    }

    public void
    setPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setPredicate(name, value, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setPredicate(String name, String value, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setPredicate");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setPredicate(name, value, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setSentenceSplitter(String splitter)
        throws ExceptionIce
    {
        setSentenceSplitter(splitter, null, false);
    }

    public void
    setSentenceSplitter(String splitter, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setSentenceSplitter(splitter, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setSentenceSplitter(String splitter, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setSentenceSplitter");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setSentenceSplitter(splitter, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setThat(String that, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        setThat(that, userId, botId, endUserId, null, false);
    }

    public void
    setThat(String that, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setThat(that, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setThat(String that, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setThat");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setThat(that, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    setTopic(String topic, String userId, String botId, String endUserId)
        throws ExceptionIce
    {
        setTopic(topic, userId, botId, endUserId, null, false);
    }

    public void
    setTopic(String topic, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        setTopic(topic, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setTopic(String topic, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setTopic");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.setTopic(topic, userId, botId, endUserId, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    storeGossip(String gossip)
        throws ExceptionIce
    {
        storeGossip(gossip, null, false);
    }

    public void
    storeGossip(String gossip, java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        storeGossip(gossip, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    storeGossip(String gossip, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("storeGossip");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.storeGossip(gossip, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public void
    synchronizeDatabase()
        throws ExceptionIce
    {
        synchronizeDatabase(null, false);
    }

    public void
    synchronizeDatabase(java.util.Map<String, String> __ctx)
        throws ExceptionIce
    {
        synchronizeDatabase(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    synchronizeDatabase(java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ExceptionIce
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("synchronizeDatabase");
                __delBase = __getDelegate();
                _NetworkGraphBuilderIceDel __del = (_NetworkGraphBuilderIceDel)__delBase;
                __del.synchronizeDatabase(__ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public static NetworkGraphBuilderIcePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        NetworkGraphBuilderIcePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (NetworkGraphBuilderIcePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::rebecca::impl::NetworkGraphBuilderIce"))
                {
                    NetworkGraphBuilderIcePrxHelper __h = new NetworkGraphBuilderIcePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static NetworkGraphBuilderIcePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        NetworkGraphBuilderIcePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (NetworkGraphBuilderIcePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::rebecca::impl::NetworkGraphBuilderIce", __ctx))
                {
                    NetworkGraphBuilderIcePrxHelper __h = new NetworkGraphBuilderIcePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static NetworkGraphBuilderIcePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        NetworkGraphBuilderIcePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::rebecca::impl::NetworkGraphBuilderIce"))
                {
                    NetworkGraphBuilderIcePrxHelper __h = new NetworkGraphBuilderIcePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static NetworkGraphBuilderIcePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        NetworkGraphBuilderIcePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::rebecca::impl::NetworkGraphBuilderIce", __ctx))
                {
                    NetworkGraphBuilderIcePrxHelper __h = new NetworkGraphBuilderIcePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static NetworkGraphBuilderIcePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        NetworkGraphBuilderIcePrx __d = null;
        if(__obj != null)
        {
            NetworkGraphBuilderIcePrxHelper __h = new NetworkGraphBuilderIcePrxHelper();
            __h.__copyFrom(__obj);
            __d = __h;
        }
        return __d;
    }

    public static NetworkGraphBuilderIcePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        NetworkGraphBuilderIcePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            NetworkGraphBuilderIcePrxHelper __h = new NetworkGraphBuilderIcePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _NetworkGraphBuilderIceDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _NetworkGraphBuilderIceDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, NetworkGraphBuilderIcePrx v)
    {
        __os.writeProxy(v);
    }

    public static NetworkGraphBuilderIcePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            NetworkGraphBuilderIcePrxHelper result = new NetworkGraphBuilderIcePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
