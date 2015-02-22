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

using rebecca;

namespace consoleCallBacks
{

/**
 * My Custom CallBacks class.
 *
 * This class inherits from Rebecca's
 * CallBacks class and implements the
 * callbacks for error reporting and
 * informational reporting purposes.
 *
 * Although, I pain stakenly reimplemnt
 * every single method, you don't have to.
 * Just pick and choose which ones you
 * want to implement, and ignore the rest.
 * All of the methods of CallBacks has a
 * default do nothing implementation.
 */
public class CustomCallBacks : CallBacks
{
   private int i = 0;

   /**
    * This is called for each AIML
    * "Gossip" tag.
    *
    * I am just printing out the gossip.
    * You can do other things like store it
    * in a file and then reload the file at
    * startup as a type of persistance.
    *
    * @param gossip The gossip sent to be
    * stored as you see fit
    */
    public override void StoreGossip(string gossip, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("[Gossip: " + gossip + "]");
    }

   /**
    * This is called for each AIML
    * category that is loaded into
    * memory.
    *
    * Loadtime occurs whenver the call
    * GraphBuilder::createGraph() is made.
    * For every 5000 categories loaded into
    * Rebecca's internal data structure
    * this prints a output message about it.
    */
    public override void CategoryLoaded(string userId, string botId, string endUserId) 
    {
        const int numberOfCategories = 5000;

           /*
            * Clever way to say if "i" is a multiple
            * of 5000 then print out the number of
            * categories loaded so far.
            */
        if(++i % numberOfCategories == 0)
        {
            System.Console.WriteLine("[" + i + " categories loaded]");
        }
    }

   /**
    * Before each AIML file is parsed this method is called.
    *
    * @param fileName The name of the file about to be parsed.
    */
    public override void FilePreLoad(string fileName, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("[Loading      " + fileName + "]");
    }

   /**
    * After each AIML file is parsed, this method is called.
    *
    * @param fileName The name of the file just parsed.
    */
    public override void FilePostLoad(string fileName, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("[Done loading " + fileName + "]");
    }

   /**
    * When the "srai" AIML tag is called, the text
    * is sent to this method.
    *
    * Usually refered to as symbolic reduction, you
    * can see what text is being re-fed back into the
    * AIML GraphBuilder::getResponse() by AIML its self.
    *
    * @param symbol The text which is being sent back
    * into GraphBuilder::getResponse().
    */
    public override void SymbolicReduction(string symbol, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("Symbolic reduction: " + symbol);
    }

   /**
    * A infinite symbolic reduction has occured and
    * has been terminated.
    *
    * This method is called when symbolic reduction ends
    * up in a infinite loop and has been terminated.  This
    * is just to alert you to the fact.
    */
    public override void InfiniteSymbolicReduction(string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("[Infinite Symbolic reduction detected]");
    }

   /**
    * Sends you a message about a XMLParseError.
    *
    * Either with AIML files or RebeccaAIML configuration
    * files.
    *
    * @param message The human readable message.
    */
    public override void XMLParseError(string message, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine(message);
    }

   /**
    * Sends you a message about a XMLParseWarning.
    *
    * Either with AIML files or RebeccaAIML configuration
    * files.
    *
    * @param message The human readable message.
    */
    public override void XMLParseWarning(string message, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine(message);
    }

   /**
    * Sends you a message about a XMLParseFatalError.
    *
    * Either with AIML files or RebeccaAIML configuration
    * files.
    *
    * @param message The human readable message.
    */
    public override void XMLParseFatalError(string message, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine(message);
    }

   /**
    * During runtime, the "thatStar" AIML tag's size is
    * exceeded.
    *
    * Runtime is during a call to GraphBuilder::getResponse()
    */
    public override void ThatStarTagSizeExceeded(string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("[Warning thatStar Tag Size Exceeded]");
    }

   /**
    * During runtime, the "topicStar" AIML tag's size is
    * exceeded.
    *
    * Runtime is during a call to GraphBuilder::getResponse()
    */
    public override void TopicStarTagSizeExceeded(string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("[Warning topicStar Tag Size Exceeded]");
    }

   /**
    * During runtime, the "star" AIML tag's size is
    * exceeded.
    *
    * Runtime is during a call to GraphBuilder::getResponse()
    */
    public override void StarTagSizeExceeded(string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("[Warning star Tag Size Exceeded]");
    }

   /**
    * A AIML "Input" tag has a non number in its index attribute.
    *
    * This method will only be called during loadtime, GraphBuilder::createGraph().
    *
    * @param message The human readable message.
    */
    public override void InputTagNumericConversionError(string message, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("inputTagNuermicConversionError:" + message);
    }

   /**
    * During runtime, the "input" AIML tag's size is
    * exceeded.
    *
    * Runtime is during a call to GraphBuilder::getResponse()
    */
    public override void InputTagSizeExceeded(string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("[Warning input Tag Size Exceeded]");
    }

   /**
    * A AIML "Star" tag has a non number in its index attribute.
    *
    * This method will only be called during loadtime, GraphBuilder::createGraph().
    *
    * @param message The human readable message.
    */
    public override void StarTagNumericConversionError(string message, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("starTagNuermicConversionError:" + message);
    }

   /**
    * During runtime, the "that" AIML tag's size is
    * exceeded.
    *
    * Runtime is during a call to GraphBuilder::getResponse()
    */
    public override void ThatTagSizeExceeded(string userId, string botId, string endUserId)
    {
         System.Console.WriteLine("[Warning that Tag Size Exceeded]");
    }

   /**
    * A AIML "That" tag has a non number in its index attribute.
    *
    * This method will only be called during loadtime, GraphBuilder::createGraph().
    *
    * @param message The human readable message.
    */
    public override void ThatTagNumericConversionError(string message, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("thatTagNumericConversionError:" + message);
    }

   /**
    * A AIML "TopicStar" tag has a non number in its index attribute.
    *
    * This method will only be called during loadtime, GraphBuilder::createGraph().
    *
    * @param message The human readable message.
    */
    public override void TopicStarTagNumericConversionError(string message, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("topicStarTagNumericConversionError:" + message);
    }

   /**
    * A AIML "thatStar" tag has a non number in its index attribute.
    *
    * This method will only be called during loadtime, GraphBuilder::createGraph().
    *
    * @param message The human readable message.
    */
    public override void ThatStarTagNumericConversionError(string message, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("thatStarTagNumericConversionError:" + message);
    }

    /**
    * When the AIML tag Learn points to a file that cannot
    * be found this method is called.
    *
    * This is useful to output when the AIML tag Learn
    * cannot find the file it was searching for to load.
    *
    * @param message A informative message of the error
    * for humans
    *
    * @exception Any can be thrown.
    */
    public override void LearnTagFileNotFound(string message, string userId, string botId, string endUserId)
    {
        System.Console.WriteLine("learnTagFileNotFound:" + message);
    }

}
} //end of ConsoleCallBacks namespace
