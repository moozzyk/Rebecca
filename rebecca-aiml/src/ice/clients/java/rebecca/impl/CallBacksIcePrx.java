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

public interface CallBacksIcePrx extends Ice.ObjectPrx
{
    public void storeGossip(String gossip, String userId, String botId, String endUserId);
    public void storeGossip(String gossip, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void categoryLoaded(String userId, String botId, String endUserId);
    public void categoryLoaded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void filePreLoad(String fileName, String userId, String botId, String endUserId);
    public void filePreLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void filePostLoad(String fileName, String userId, String botId, String endUserId);
    public void filePostLoad(String fileName, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void symbolicReduction(String symbol, String userId, String botId, String endUserId);
    public void symbolicReduction(String symbol, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void infiniteSymbolicReduction(String userId, String botId, String endUserId);
    public void infiniteSymbolicReduction(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void XMLParseError(String message, String userId, String botId, String endUserId);
    public void XMLParseError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void XMLParseWarning(String message, String userId, String botId, String endUserId);
    public void XMLParseWarning(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void XMLParseFatalError(String message, String userId, String botId, String endUserId);
    public void XMLParseFatalError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void thatStarTagSizeExceeded(String userId, String botId, String endUserId);
    public void thatStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void topicStarTagSizeExceeded(String userId, String botId, String endUserId);
    public void topicStarTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void starTagSizeExceeded(String userId, String botId, String endUserId);
    public void starTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void inputTagNumericConversionError(String message, String userId, String botId, String endUserId);
    public void inputTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void inputTagSizeExceeded(String userId, String botId, String endUserId);
    public void inputTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void starTagNumericConversionError(String message, String userId, String botId, String endUserId);
    public void starTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void thatTagSizeExceeded(String userId, String botId, String endUserId);
    public void thatTagSizeExceeded(String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void thatTagNumericConversionError(String message, String userId, String botId, String endUserId);
    public void thatTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId);
    public void topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId);
    public void thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);

    public void learnTagFileNotFound(String message, String userId, String botId, String endUserId);
    public void learnTagFileNotFound(String message, String userId, String botId, String endUserId, java.util.Map<String, String> __ctx);
}
