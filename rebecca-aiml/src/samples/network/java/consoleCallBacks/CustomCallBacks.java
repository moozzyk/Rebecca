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

import rebecca.CallBacks;

public class CustomCallBacks extends CallBacks
{
   private int i = 0;

   @Override
    public void storeGossip(String gossip, String userId, String botId, String endUserId)
    {
        System.out.println("[Gossip: " + gossip + "]");
    }

   @Override
    public void categoryLoaded(String userId, String botId, String endUserId)
    {
        final int numberOfCategories = 5000;
       /*
        * Clever way to say if "i" is a multiple
        * of 5000 then print out the number of
        * categories loaded so far.
        */
        if(++i % numberOfCategories == 0)
        {
            System.out.println("[" + i + " categories loaded]");
        }
    }

   @Override
    public void filePreLoad(String fileName, String userId, String botId, String endUserId)
    {
        System.out.println("[Loading      " + fileName + "]");
    }

   @Override
    public void filePostLoad(String fileName, String userId, String botId, String endUserId)
    {
        System.out.println("[Done loading " + fileName + "]");
    }

   @Override
    public void symbolicReduction(String symbol, String userId, String botId, String endUserId)
    {
        System.out.println("Symbolic reduction: " + symbol);
    }

   @Override
    public void infiniteSymbolicReduction(String userId, String botId, String endUserId)
    {
        System.out.println("[Infinite Symbolic reduction detected]");
    }

   @Override
    public void XMLParseError(String message, String userId, String botId, String endUserId)
    {
        System.out.println(message);
    }

   @Override
    public void XMLParseWarning(String message, String userId, String botId, String endUserId)
    {
        System.out.println(message);
    }

   @Override
    public void XMLParseFatalError(String message, String userId, String botId, String endUserId)
    {
        System.out.println(message);
    }

   @Override
    public void thatStarTagSizeExceeded(String userId, String botId, String endUserId)
    {
        System.out.println("[Warning thatStar Tag Size Exceeded]");
    }

   @Override
    public void topicStarTagSizeExceeded(String userId, String botId, String endUserId)
    {
        System.out.println("[Warning topicStar Tag Size Exceeded]");
    }

   @Override
    public void starTagSizeExceeded(String userId, String botId, String endUserId)
    {
        System.out.println("[Warning star Tag Size Exceeded]");
    }

   @Override
    public void inputTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        System.out.println("inputTagNuermicConversionError:" + message);
    }

   @Override
    public void inputTagSizeExceeded(String userId, String botId, String endUserId)
    {
        System.out.println("[Warning input Tag Size Exceeded]");
    }

   @Override
    public void starTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        System.out.println("starTagNuermicConversionError:" + message);
    }

   @Override
    public void thatTagSizeExceeded(String userId, String botId, String endUserId)
    {
         System.out.println("[Warning that Tag Size Exceeded]");
    }

   @Override
    public void thatTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        System.out.println("thatTagNumericConversionError:" + message);
    }

   @Override
    public void topicStarTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        System.out.println("topicStarTagNumericConversionError:" + message);
    }

   @Override
    public void thatStarTagNumericConversionError(String message, String userId, String botId, String endUserId)
    {
        System.out.println("thatStarTagNumericConversionError:" + message);
    }

   @Override
    public void learnTagFileNotFound(String message, String userId, String botId, String endUserId) {
        System.out.println("learnTagFileNotFound:" + message);
    }
}
