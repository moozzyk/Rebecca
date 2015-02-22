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

namespace rebecca
{
namespace impl
{

internal class NetworkCallBacks : CallBacksIceDisp_ {

    private CallBacks callBacks = null;

    public void setCallBacks(CallBacks callBacks)
    {
        this.callBacks = callBacks;
    }

    public override void storeGossip(string gossip, string userId, string botId, string endUserId, Ice.Current current__) 
    {
        if(callBacks != null)
            callBacks.StoreGossip(gossip, userId, botId, endUserId);
    }

    public override void categoryLoaded(string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.CategoryLoaded(userId, botId, endUserId);
    }

    public override void filePreLoad(string fileName, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.FilePreLoad(fileName, userId, botId, endUserId);
    }

    public override void filePostLoad(string fileName, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.FilePostLoad(fileName, userId, botId, endUserId);
    }

    public override void symbolicReduction(string symbol, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.SymbolicReduction(symbol, userId, botId, endUserId);
    }

    public override void infiniteSymbolicReduction(string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.InfiniteSymbolicReduction(userId, botId, endUserId);
    }

    public override void XMLParseError(string message, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.XMLParseError(message, userId, botId, endUserId);
    }

    public override void XMLParseWarning(string message, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.XMLParseWarning(message, userId, botId, endUserId);
    }

    public override void XMLParseFatalError(string message, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.XMLParseFatalError(message, userId, botId, endUserId);
    }

    public override void thatStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.ThatStarTagSizeExceeded(userId, botId, endUserId);
    }

    public override void topicStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.TopicStarTagSizeExceeded(userId, botId, endUserId);
    }

    public override void starTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.StarTagSizeExceeded(userId, botId, endUserId);
    }

    public override void inputTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.InputTagNumericConversionError(message, userId, botId, endUserId);
    }

    public override void inputTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.InputTagSizeExceeded(userId, botId, endUserId);
    }

    public override void starTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.StarTagNumericConversionError(message, userId, botId, endUserId);
    }

    public override void thatTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.ThatTagSizeExceeded(userId, botId, endUserId);
    }

    public override void thatTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.ThatTagNumericConversionError(message, userId, botId, endUserId);
    }

    public override void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.TopicStarTagNumericConversionError(message, userId, botId, endUserId);
    }

    public override void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.ThatStarTagNumericConversionError(message, userId, botId, endUserId);
    }

    public override void learnTagFileNotFound(string message, string userId, string botId, string endUserId, Ice.Current current__)
    {
        if (callBacks != null)
            callBacks.LearnTagFileNotFound(message, userId, botId, endUserId);
    }
}


} //end of namespace impl
} //end of namespace rebecca