"""
   RebeccaAIML, Artificial Intelligence Markup Language 
   C++ api and engine.
  
   Copyright (C) 2005,2006,2007 Frank Hassanabad
  
   This file is part of RebeccaAIML.
  
   RebeccaAIML is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.
  
   RebeccaAIML is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
  
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.
"""

from Ice import *
from network_ice import *

class NetworkCallBacks(impl.CallBacksIce):
    __callBacks = None

    def setCallBacks(self, callBacks):
        self.__callBacks = callBacks

    def storeGossip(self, gossip, userId, botId, endUserId, current=None):
        if(self.__callBacks):        
            self.__callBacks.gossip(gossip, userId, botId, endUserId)

    def categoryLoaded(self, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.categoryLoaded(userId, botId, endUserId)

    def filePreLoad(self, fileName, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.filePreLoad(fileName, userId, botId, endUserId)

    def filePostLoad(self, fileName, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.filePostLoad(fileName, userId, botId, endUserId)

    def symbolicReduction(self, symbol, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.symbolicReduction(symbol, userId, botId, endUserId)

    def infiniteSymbolicReduction(self, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.infiniteSymbolicReduction(userId, botId, endUserId)

    def XMLParseError(self, message, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.XMLParseError(message, userId, botId, endUserId)

    def XMLParseWarning(self, message, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.XMLParseWarning(message, userId, botId, endUserId)

    def XMLParseFatalError(self, message, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.XMLParseFatalError(message, userId, botId, endUserId)

    def thatStarTagSizeExceeded(self, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.thatStarTagSizeExceeded(userId, botId, endUserId)

    def topicStarTagSizeExceeded(self, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.topicStarTagSizeExceeded(userId, botId, endUserId)

    def starTagSizeExceeded(self, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.starTagSizeExceeded(userId, botId, endUserId)

    def inputTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.inputTagNumericConversionError(message,userId, botId, endUserId)

    def inputTagSizeExceeded(self, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.inputTagSizeExceeded(userId, botId, endUserId)

    def starTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.starTagNumericConversionError(message,userId, botId, endUserId)

    def thatTagSizeExceeded(self, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.thatTagSizeExceeded(userId, botId, endUserId)

    def thatTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.thatTagNumericConversionError(message, userId, botId, endUserId)

    def topicStarTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.topicStarTagNumericConversionError(message,userId, botId, endUserId)

    def thatStarTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.thatStarTagNumericConversionError(message,userId, botId, endUserId)

    def learnTagFileNotFound(self, message, userId, botId, endUserId, current=None):
        if(self.__callBacks):
            self.__callBacks.learnTagFileNotFound(message,userId, botId, endUserId)


