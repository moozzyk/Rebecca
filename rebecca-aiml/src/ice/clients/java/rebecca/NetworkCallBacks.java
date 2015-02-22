/*
 * RebeccaAIML, Artificial Intelligence Markup Language 
 * C++ api and engine.
 *
 * Copyright (C) 2005,2006,2007 Frank Hassanabad
 *
 * This file is part of RebeccaAIML.
 *
 * RebeccaAIML is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * RebeccaAIML is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package rebecca;

import rebecca.impl._CallBacksIceDisp;
import Ice.Current;

class NetworkCallBacks extends _CallBacksIceDisp {

    private CallBacks callBacks = null;

    void setCallBacks(CallBacks callBacks)
    {
        this.callBacks = callBacks;
    }

    @Override
    public void storeGossip(String gossip, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.storeGossip(gossip, userId, botId, endUserId);
    }

    @Override
    public void categoryLoaded(String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.categoryLoaded(userId, botId, endUserId);
    }

    @Override
    public void filePreLoad(String fileName, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.filePreLoad(fileName, userId, botId, endUserId);
    }

    @Override
    public void filePostLoad(String fileName, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.filePostLoad(fileName, userId, botId, endUserId);
    }

    @Override
    public void symbolicReduction(String symbol, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.symbolicReduction(symbol, userId, botId, endUserId);
    }

    @Override
    public void infiniteSymbolicReduction(String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.infiniteSymbolicReduction(userId, botId, endUserId);
    }

    @Override
    public void XMLParseError(String message, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.XMLParseError(message, userId, botId, endUserId);
    }

    @Override
    public void XMLParseWarning(String message, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.XMLParseWarning(message, userId, botId, endUserId);
    }

    @Override
    public void XMLParseFatalError(String message, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.XMLParseFatalError(message, userId, botId, endUserId);
    }

    @Override
    public void thatStarTagSizeExceeded(String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.thatStarTagSizeExceeded(userId, botId, endUserId);
    }

    @Override
    public void topicStarTagSizeExceeded(String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.topicStarTagSizeExceeded(userId, botId, endUserId);
    }

    @Override
    public void starTagSizeExceeded(String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.starTagSizeExceeded(userId, botId, endUserId);
    }

    @Override
    public void inputTagNumericConversionError(String userId, String botId, String endUserId, String message, Current __current) {
        if(callBacks != null)
            callBacks.inputTagNumericConversionError(message, userId, botId, endUserId);
    }

    @Override
    public void inputTagSizeExceeded(String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.inputTagSizeExceeded(userId, botId, endUserId);
    }

    @Override
    public void starTagNumericConversionError(String userId, String botId, String endUserId, String message, Current __current) {
        if(callBacks != null)
            callBacks.starTagNumericConversionError(message, userId, botId, endUserId);
    }

    @Override
    public void thatTagSizeExceeded(String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.thatTagSizeExceeded(userId, botId, endUserId);
    }

    @Override
    public void thatTagNumericConversionError(String message, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.thatTagNumericConversionError(message, userId, botId, endUserId);
    }

    @Override
    public void topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.topicStarTagNumericConversionError(message, userId, botId, endUserId);
    }

    @Override
    public void thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.thatStarTagNumericConversionError(message, userId, botId, endUserId);
    }

    @Override
    public void learnTagFileNotFound(String message, String userId, String botId, String endUserId, Current __current) {
        if(callBacks != null)
            callBacks.learnTagFileNotFound(message, userId, botId, endUserId);
    }
}