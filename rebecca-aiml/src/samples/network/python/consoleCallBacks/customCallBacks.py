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

from CallBacks import *

class CustomCallBacks(CallBacks):
    __i = 0
    __numberOfCategories = 5000

    def storeGossip(self, gossip, userId, botId, endUserId):
        print "[Gossip: " + gossip + "]"

    def categoryLoaded(self, userId, botId, endUserId): 
        self.__i = self.__i + 1
        if(self.__i % self.__numberOfCategories == 0):
            print "[" + str(self.__i) + " categories loaded]"

    def filePreLoad(self, fileName, userId, botId, endUserId):
        print "[Loading      " + fileName + "]"

    def filePostLoad(self, fileName, userId, botId, endUserId):
        print "[Done loading " + fileName + "]"

    def symbolicReduction(self, symbol, userId, botId, endUserId):
        print "Symbolic reduction: " + symbol

    def infiniteSymbolicReduction(self, userId, botId, endUserId):
        print "[Infinite Symbolic reduction detected]"

    def XMLParseError(self, message, userId, botId, endUserId):
        print message

    def XMLParseWarning(self, message, userId, botId, endUserId):
        print message

    def XMLParseFatalError(self, message, userId, botId, endUserId):
        print message

    def thatStarTagSizeExceeded(self, userId, botId, endUserId):
        print "[Warning thatStar Tag Size Exceeded]"

    def topicStarTagSizeExceeded(self, userId, botId, endUserId):
        print "[Warning topicStar Tag Size Exceeded]"

    def starTagSizeExceeded(self, userId, botId, endUserId):
        print "[Warning star Tag Size Exceeded]"

    def inputTagNumericConversionError(self, message, userId, botId, endUserId):
        print "inputTagNuermicConversionError:" + message

    def inputTagSizeExceeded(self, userId, botId, endUserId):
        print "[Warning input Tag Size Exceeded]"

    def starTagNumericConversionError(self, message, userId, botId, endUserId):
        print "starTagNuermicConversionError:" + message

    def thatTagSizeExceeded(self, userId, botId, endUserId):
         print "[Warning that Tag Size Exceeded]"

    def thatTagNumericConversionError(self, message, userId, botId, endUserId):
        print "thatTagNumericConversionError:" + message

    def topicStarTagNumericConversionError(self, message, userId, botId, endUserId):
        print "topicStarTagNumericConversionError:" + message

    def thatStarTagNumericConversionError(self, message, userId, botId, endUserId):
        print "thatStarTagNumericConversionError:" + message

    def learnTagFileNotFound(self, message, userId, botId, endUserId):
        print "learnTagFileNotFound:" + message

