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

public final class CallBacksIcePrxHelper extends Ice.ObjectPrxHelperBase implements CallBacksIcePrx
{
    public void
    XMLParseError(String message, String userId, String botId, String endUserId)
    {
        XMLParseError(message, userId, botId, endUserId, null, false);
    }

    public void
    XMLParseError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        XMLParseError(message, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    XMLParseError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.XMLParseError(message, userId, botId, endUserId, __ctx);
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
    XMLParseFatalError(String message, String userId, String botId, String endUserId)
    {
        XMLParseFatalError(message, userId, botId, endUserId, null, false);
    }

    public void
    XMLParseFatalError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        XMLParseFatalError(message, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    XMLParseFatalError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.XMLParseFatalError(message, userId, botId, endUserId, __ctx);
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
    XMLParseWarning(String message, String userId, String botId, String endUserId)
    {
        XMLParseWarning(message, userId, botId, endUserId, null, false);
    }

    public void
    XMLParseWarning(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        XMLParseWarning(message, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    XMLParseWarning(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.XMLParseWarning(message, userId, botId, endUserId, __ctx);
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
    categoryLoaded(String userId, String botId, String endUserId)
    {
        categoryLoaded(userId, botId, endUserId, null, false);
    }

    public void
    categoryLoaded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        categoryLoaded(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    categoryLoaded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.categoryLoaded(userId, botId, endUserId, __ctx);
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
    filePostLoad(String fileName, String userId, String botId, String endUserId)
    {
        filePostLoad(fileName, userId, botId, endUserId, null, false);
    }

    public void
    filePostLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        filePostLoad(fileName, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    filePostLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.filePostLoad(fileName, userId, botId, endUserId, __ctx);
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
    filePreLoad(String fileName, String userId, String botId, String endUserId)
    {
        filePreLoad(fileName, userId, botId, endUserId, null, false);
    }

    public void
    filePreLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        filePreLoad(fileName, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    filePreLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.filePreLoad(fileName, userId, botId, endUserId, __ctx);
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
    infiniteSymbolicReduction(String userId, String botId, String endUserId)
    {
        infiniteSymbolicReduction(userId, botId, endUserId, null, false);
    }

    public void
    infiniteSymbolicReduction(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        infiniteSymbolicReduction(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    infiniteSymbolicReduction(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.infiniteSymbolicReduction(userId, botId, endUserId, __ctx);
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
    inputTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        inputTagNumericConversionError(message, userId, botId, endUserId, null, false);
    }

    public void
    inputTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        inputTagNumericConversionError(message, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    inputTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.inputTagNumericConversionError(message, userId, botId, endUserId, __ctx);
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
    inputTagSizeExceeded(String userId, String botId, String endUserId)
    {
        inputTagSizeExceeded(userId, botId, endUserId, null, false);
    }

    public void
    inputTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        inputTagSizeExceeded(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    inputTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.inputTagSizeExceeded(userId, botId, endUserId, __ctx);
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
    learnTagFileNotFound(String message, String userId, String botId, String endUserId)
    {
        learnTagFileNotFound(message, userId, botId, endUserId, null, false);
    }

    public void
    learnTagFileNotFound(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        learnTagFileNotFound(message, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    learnTagFileNotFound(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.learnTagFileNotFound(message, userId, botId, endUserId, __ctx);
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
    starTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        starTagNumericConversionError(message, userId, botId, endUserId, null, false);
    }

    public void
    starTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        starTagNumericConversionError(message, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    starTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.starTagNumericConversionError(message, userId, botId, endUserId, __ctx);
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
    starTagSizeExceeded(String userId, String botId, String endUserId)
    {
        starTagSizeExceeded(userId, botId, endUserId, null, false);
    }

    public void
    starTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        starTagSizeExceeded(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    starTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.starTagSizeExceeded(userId, botId, endUserId, __ctx);
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
    storeGossip(String gossip, String userId, String botId, String endUserId)
    {
        storeGossip(gossip, userId, botId, endUserId, null, false);
    }

    public void
    storeGossip(String gossip, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        storeGossip(gossip, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    storeGossip(String gossip, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.storeGossip(gossip, userId, botId, endUserId, __ctx);
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
    symbolicReduction(String symbol, String userId, String botId, String endUserId)
    {
        symbolicReduction(symbol, userId, botId, endUserId, null, false);
    }

    public void
    symbolicReduction(String symbol, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        symbolicReduction(symbol, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    symbolicReduction(String symbol, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.symbolicReduction(symbol, userId, botId, endUserId, __ctx);
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
    thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        thatStarTagNumericConversionError(message, userId, botId, endUserId, null, false);
    }

    public void
    thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        thatStarTagNumericConversionError(message, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.thatStarTagNumericConversionError(message, userId, botId, endUserId, __ctx);
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
    thatStarTagSizeExceeded(String userId, String botId, String endUserId)
    {
        thatStarTagSizeExceeded(userId, botId, endUserId, null, false);
    }

    public void
    thatStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        thatStarTagSizeExceeded(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    thatStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.thatStarTagSizeExceeded(userId, botId, endUserId, __ctx);
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
    thatTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        thatTagNumericConversionError(message, userId, botId, endUserId, null, false);
    }

    public void
    thatTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        thatTagNumericConversionError(message, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    thatTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.thatTagNumericConversionError(message, userId, botId, endUserId, __ctx);
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
    thatTagSizeExceeded(String userId, String botId, String endUserId)
    {
        thatTagSizeExceeded(userId, botId, endUserId, null, false);
    }

    public void
    thatTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        thatTagSizeExceeded(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    thatTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.thatTagSizeExceeded(userId, botId, endUserId, __ctx);
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
    topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        topicStarTagNumericConversionError(message, userId, botId, endUserId, null, false);
    }

    public void
    topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        topicStarTagNumericConversionError(message, userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.topicStarTagNumericConversionError(message, userId, botId, endUserId, __ctx);
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
    topicStarTagSizeExceeded(String userId, String botId, String endUserId)
    {
        topicStarTagSizeExceeded(userId, botId, endUserId, null, false);
    }

    public void
    topicStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
    {
        topicStarTagSizeExceeded(userId, botId, endUserId, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    topicStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __delBase = __getDelegate();
                _CallBacksIceDel __del = (_CallBacksIceDel)__delBase;
                __del.topicStarTagSizeExceeded(userId, botId, endUserId, __ctx);
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

    public static CallBacksIcePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        CallBacksIcePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (CallBacksIcePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::rebecca::impl::CallBacksIce"))
                {
                    CallBacksIcePrxHelper __h = new CallBacksIcePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static CallBacksIcePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        CallBacksIcePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (CallBacksIcePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::rebecca::impl::CallBacksIce", __ctx))
                {
                    CallBacksIcePrxHelper __h = new CallBacksIcePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static CallBacksIcePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        CallBacksIcePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::rebecca::impl::CallBacksIce"))
                {
                    CallBacksIcePrxHelper __h = new CallBacksIcePrxHelper();
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

    public static CallBacksIcePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        CallBacksIcePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::rebecca::impl::CallBacksIce", __ctx))
                {
                    CallBacksIcePrxHelper __h = new CallBacksIcePrxHelper();
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

    public static CallBacksIcePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        CallBacksIcePrx __d = null;
        if(__obj != null)
        {
            CallBacksIcePrxHelper __h = new CallBacksIcePrxHelper();
            __h.__copyFrom(__obj);
            __d = __h;
        }
        return __d;
    }

    public static CallBacksIcePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        CallBacksIcePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            CallBacksIcePrxHelper __h = new CallBacksIcePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _CallBacksIceDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _CallBacksIceDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, CallBacksIcePrx v)
    {
        __os.writeProxy(v);
    }

    public static CallBacksIcePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            CallBacksIcePrxHelper result = new CallBacksIcePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
