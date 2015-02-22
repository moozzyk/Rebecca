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

public interface _CallBacksIceOperationsNC
{
    void storeGossip(String gossip, String userId, String botId, String endUserId);

    void categoryLoaded(String userId, String botId, String endUserId);

    void filePreLoad(String fileName, String userId, String botId, String endUserId);

    void filePostLoad(String fileName, String userId, String botId, String endUserId);

    void symbolicReduction(String symbol, String userId, String botId, String endUserId);

    void infiniteSymbolicReduction(String userId, String botId, String endUserId);

    void XMLParseError(String message, String userId, String botId, String endUserId);

    void XMLParseWarning(String message, String userId, String botId, String endUserId);

    void XMLParseFatalError(String message, String userId, String botId, String endUserId);

    void thatStarTagSizeExceeded(String userId, String botId, String endUserId);

    void topicStarTagSizeExceeded(String userId, String botId, String endUserId);

    void starTagSizeExceeded(String userId, String botId, String endUserId);

    void inputTagNumericConversionError(String message, String userId, String botId, String endUserId);

    void inputTagSizeExceeded(String userId, String botId, String endUserId);

    void starTagNumericConversionError(String message, String userId, String botId, String endUserId);

    void thatTagSizeExceeded(String userId, String botId, String endUserId);

    void thatTagNumericConversionError(String message, String userId, String botId, String endUserId);

    void topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId);

    void thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId);

    void learnTagFileNotFound(String message, String userId, String botId, String endUserId);
}
