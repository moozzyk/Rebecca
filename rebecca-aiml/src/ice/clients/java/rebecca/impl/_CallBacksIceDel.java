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

public interface _CallBacksIceDel extends Ice._ObjectDel
{
    void storeGossip(String gossip, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void categoryLoaded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void filePreLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void filePostLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void symbolicReduction(String symbol, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void infiniteSymbolicReduction(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void XMLParseError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void XMLParseWarning(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void XMLParseFatalError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void thatStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void topicStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void starTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void inputTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void inputTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void starTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void thatTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void thatTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void learnTagFileNotFound(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
