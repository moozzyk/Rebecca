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

public abstract class _CallBacksIceDisp extends Ice.ObjectImpl implements CallBacksIce
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
        "::rebecca::impl::CallBacksIce"
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
    XMLParseError(String message, String userId, String botId, String endUserId)
    {
        XMLParseError(message, userId, botId, endUserId, null);
    }

    public final void
    XMLParseFatalError(String message, String userId, String botId, String endUserId)
    {
        XMLParseFatalError(message, userId, botId, endUserId, null);
    }

    public final void
    XMLParseWarning(String message, String userId, String botId, String endUserId)
    {
        XMLParseWarning(message, userId, botId, endUserId, null);
    }

    public final void
    categoryLoaded(String userId, String botId, String endUserId)
    {
        categoryLoaded(userId, botId, endUserId, null);
    }

    public final void
    filePostLoad(String fileName, String userId, String botId, String endUserId)
    {
        filePostLoad(fileName, userId, botId, endUserId, null);
    }

    public final void
    filePreLoad(String fileName, String userId, String botId, String endUserId)
    {
        filePreLoad(fileName, userId, botId, endUserId, null);
    }

    public final void
    infiniteSymbolicReduction(String userId, String botId, String endUserId)
    {
        infiniteSymbolicReduction(userId, botId, endUserId, null);
    }

    public final void
    inputTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        inputTagNumericConversionError(message, userId, botId, endUserId, null);
    }

    public final void
    inputTagSizeExceeded(String userId, String botId, String endUserId)
    {
        inputTagSizeExceeded(userId, botId, endUserId, null);
    }

    public final void
    learnTagFileNotFound(String message, String userId, String botId, String endUserId)
    {
        learnTagFileNotFound(message, userId, botId, endUserId, null);
    }

    public final void
    starTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        starTagNumericConversionError(message, userId, botId, endUserId, null);
    }

    public final void
    starTagSizeExceeded(String userId, String botId, String endUserId)
    {
        starTagSizeExceeded(userId, botId, endUserId, null);
    }

    public final void
    storeGossip(String gossip, String userId, String botId, String endUserId)
    {
        storeGossip(gossip, userId, botId, endUserId, null);
    }

    public final void
    symbolicReduction(String symbol, String userId, String botId, String endUserId)
    {
        symbolicReduction(symbol, userId, botId, endUserId, null);
    }

    public final void
    thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        thatStarTagNumericConversionError(message, userId, botId, endUserId, null);
    }

    public final void
    thatStarTagSizeExceeded(String userId, String botId, String endUserId)
    {
        thatStarTagSizeExceeded(userId, botId, endUserId, null);
    }

    public final void
    thatTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        thatTagNumericConversionError(message, userId, botId, endUserId, null);
    }

    public final void
    thatTagSizeExceeded(String userId, String botId, String endUserId)
    {
        thatTagSizeExceeded(userId, botId, endUserId, null);
    }

    public final void
    topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        topicStarTagNumericConversionError(message, userId, botId, endUserId, null);
    }

    public final void
    topicStarTagSizeExceeded(String userId, String botId, String endUserId)
    {
        topicStarTagSizeExceeded(userId, botId, endUserId, null);
    }

    public static IceInternal.DispatchStatus
    ___storeGossip(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String gossip;
        gossip = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.storeGossip(gossip, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___categoryLoaded(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.categoryLoaded(userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___filePreLoad(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String fileName;
        fileName = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.filePreLoad(fileName, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___filePostLoad(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String fileName;
        fileName = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.filePostLoad(fileName, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___symbolicReduction(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String symbol;
        symbol = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.symbolicReduction(symbol, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___infiniteSymbolicReduction(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.infiniteSymbolicReduction(userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___XMLParseError(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String message;
        message = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.XMLParseError(message, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___XMLParseWarning(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String message;
        message = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.XMLParseWarning(message, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___XMLParseFatalError(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String message;
        message = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.XMLParseFatalError(message, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___thatStarTagSizeExceeded(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.thatStarTagSizeExceeded(userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___topicStarTagSizeExceeded(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.topicStarTagSizeExceeded(userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___starTagSizeExceeded(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.starTagSizeExceeded(userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___inputTagNumericConversionError(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String message;
        message = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.inputTagNumericConversionError(message, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___inputTagSizeExceeded(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.inputTagSizeExceeded(userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___starTagNumericConversionError(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String message;
        message = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.starTagNumericConversionError(message, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___thatTagSizeExceeded(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.thatTagSizeExceeded(userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___thatTagNumericConversionError(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String message;
        message = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.thatTagNumericConversionError(message, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___topicStarTagNumericConversionError(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String message;
        message = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.topicStarTagNumericConversionError(message, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___thatStarTagNumericConversionError(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String message;
        message = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.thatStarTagNumericConversionError(message, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    public static IceInternal.DispatchStatus
    ___learnTagFileNotFound(CallBacksIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        String message;
        message = __is.readString();
        String userId;
        userId = __is.readString();
        String botId;
        botId = __is.readString();
        String endUserId;
        endUserId = __is.readString();
        __obj.learnTagFileNotFound(message, userId, botId, endUserId, __current);
        return IceInternal.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "XMLParseError",
        "XMLParseFatalError",
        "XMLParseWarning",
        "categoryLoaded",
        "filePostLoad",
        "filePreLoad",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "infiniteSymbolicReduction",
        "inputTagNumericConversionError",
        "inputTagSizeExceeded",
        "learnTagFileNotFound",
        "starTagNumericConversionError",
        "starTagSizeExceeded",
        "storeGossip",
        "symbolicReduction",
        "thatStarTagNumericConversionError",
        "thatStarTagSizeExceeded",
        "thatTagNumericConversionError",
        "thatTagSizeExceeded",
        "topicStarTagNumericConversionError",
        "topicStarTagSizeExceeded"
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
                return ___XMLParseError(this, in, __current);
            }
            case 1:
            {
                return ___XMLParseFatalError(this, in, __current);
            }
            case 2:
            {
                return ___XMLParseWarning(this, in, __current);
            }
            case 3:
            {
                return ___categoryLoaded(this, in, __current);
            }
            case 4:
            {
                return ___filePostLoad(this, in, __current);
            }
            case 5:
            {
                return ___filePreLoad(this, in, __current);
            }
            case 6:
            {
                return ___ice_id(this, in, __current);
            }
            case 7:
            {
                return ___ice_ids(this, in, __current);
            }
            case 8:
            {
                return ___ice_isA(this, in, __current);
            }
            case 9:
            {
                return ___ice_ping(this, in, __current);
            }
            case 10:
            {
                return ___infiniteSymbolicReduction(this, in, __current);
            }
            case 11:
            {
                return ___inputTagNumericConversionError(this, in, __current);
            }
            case 12:
            {
                return ___inputTagSizeExceeded(this, in, __current);
            }
            case 13:
            {
                return ___learnTagFileNotFound(this, in, __current);
            }
            case 14:
            {
                return ___starTagNumericConversionError(this, in, __current);
            }
            case 15:
            {
                return ___starTagSizeExceeded(this, in, __current);
            }
            case 16:
            {
                return ___storeGossip(this, in, __current);
            }
            case 17:
            {
                return ___symbolicReduction(this, in, __current);
            }
            case 18:
            {
                return ___thatStarTagNumericConversionError(this, in, __current);
            }
            case 19:
            {
                return ___thatStarTagSizeExceeded(this, in, __current);
            }
            case 20:
            {
                return ___thatTagNumericConversionError(this, in, __current);
            }
            case 21:
            {
                return ___thatTagSizeExceeded(this, in, __current);
            }
            case 22:
            {
                return ___topicStarTagNumericConversionError(this, in, __current);
            }
            case 23:
            {
                return ___topicStarTagSizeExceeded(this, in, __current);
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
        ex.reason = "type rebecca::impl::CallBacksIce was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type rebecca::impl::CallBacksIce was not generated with stream support";
        throw ex;
    }
}
