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

public interface _CallBacksIceOperations
{
    void storeGossip(String gossip, String userId, String botId, String endUserId, Ice.Current __current);

    void categoryLoaded(String userId, String botId, String endUserId, Ice.Current __current);

    void filePreLoad(String fileName, String userId, String botId, String endUserId, Ice.Current __current);

    void filePostLoad(String fileName, String userId, String botId, String endUserId, Ice.Current __current);

    void symbolicReduction(String symbol, String userId, String botId, String endUserId, Ice.Current __current);

    void infiniteSymbolicReduction(String userId, String botId, String endUserId, Ice.Current __current);

    void XMLParseError(String message, String userId, String botId, String endUserId, Ice.Current __current);

    void XMLParseWarning(String message, String userId, String botId, String endUserId, Ice.Current __current);

    void XMLParseFatalError(String message, String userId, String botId, String endUserId, Ice.Current __current);

    void thatStarTagSizeExceeded(String userId, String botId, String endUserId, Ice.Current __current);

    void topicStarTagSizeExceeded(String userId, String botId, String endUserId, Ice.Current __current);

    void starTagSizeExceeded(String userId, String botId, String endUserId, Ice.Current __current);

    void inputTagNumericConversionError(String message, String userId, String botId, String endUserId, Ice.Current __current);

    void inputTagSizeExceeded(String userId, String botId, String endUserId, Ice.Current __current);

    void starTagNumericConversionError(String message, String userId, String botId, String endUserId, Ice.Current __current);

    void thatTagSizeExceeded(String userId, String botId, String endUserId, Ice.Current __current);

    void thatTagNumericConversionError(String message, String userId, String botId, String endUserId, Ice.Current __current);

    void topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId, Ice.Current __current);

    void thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId, Ice.Current __current);

    void learnTagFileNotFound(String message, String userId, String botId, String endUserId, Ice.Current __current);
}
