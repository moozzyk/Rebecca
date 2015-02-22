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

public final class _CallBacksIceDelD extends Ice._ObjectDelD implements _CallBacksIceDel
{
    public void
    XMLParseError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "XMLParseError", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.XMLParseError(message, userId, botId, endUserId, __current);
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
    XMLParseFatalError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "XMLParseFatalError", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.XMLParseFatalError(message, userId, botId, endUserId, __current);
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
    XMLParseWarning(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "XMLParseWarning", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.XMLParseWarning(message, userId, botId, endUserId, __current);
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
    categoryLoaded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "categoryLoaded", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.categoryLoaded(userId, botId, endUserId, __current);
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
    filePostLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "filePostLoad", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.filePostLoad(fileName, userId, botId, endUserId, __current);
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
    filePreLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "filePreLoad", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.filePreLoad(fileName, userId, botId, endUserId, __current);
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
    infiniteSymbolicReduction(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "infiniteSymbolicReduction", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.infiniteSymbolicReduction(userId, botId, endUserId, __current);
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
    inputTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "inputTagNumericConversionError", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.inputTagNumericConversionError(message, userId, botId, endUserId, __current);
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
    inputTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "inputTagSizeExceeded", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.inputTagSizeExceeded(userId, botId, endUserId, __current);
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
    learnTagFileNotFound(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "learnTagFileNotFound", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.learnTagFileNotFound(message, userId, botId, endUserId, __current);
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
    starTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "starTagNumericConversionError", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.starTagNumericConversionError(message, userId, botId, endUserId, __current);
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
    starTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "starTagSizeExceeded", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.starTagSizeExceeded(userId, botId, endUserId, __current);
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
    storeGossip(String gossip, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "storeGossip", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.storeGossip(gossip, userId, botId, endUserId, __current);
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
    symbolicReduction(String symbol, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "symbolicReduction", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.symbolicReduction(symbol, userId, botId, endUserId, __current);
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
    thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "thatStarTagNumericConversionError", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.thatStarTagNumericConversionError(message, userId, botId, endUserId, __current);
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
    thatStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "thatStarTagSizeExceeded", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.thatStarTagSizeExceeded(userId, botId, endUserId, __current);
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
    thatTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "thatTagNumericConversionError", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.thatTagNumericConversionError(message, userId, botId, endUserId, __current);
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
    thatTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "thatTagSizeExceeded", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.thatTagSizeExceeded(userId, botId, endUserId, __current);
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
    topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "topicStarTagNumericConversionError", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.topicStarTagNumericConversionError(message, userId, botId, endUserId, __current);
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
    topicStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "topicStarTagSizeExceeded", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                CallBacksIce __servant = null;
                try
                {
                    __servant = (CallBacksIce)__direct.servant();
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
                    __servant.topicStarTagSizeExceeded(userId, botId, endUserId, __current);
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
