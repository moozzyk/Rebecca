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

//c# using's
using System;

//rebecca using's
using rebecca;
using rebecca.impl;

///@todo document this entire file

namespace console
{
    class Console
    {
        static void Main(string[] args)
        {
            NetworkAimlFacade aiml = null;
            int status = 0;
            try
            {
                aiml = new NetworkAimlFacade(args);
                GraphBuilder builder = aiml.GetNetworkGraphBuilder();

                System.Console.WriteLine("Number of categories that are loaded in the brain:" + builder.GetSize());
                string botName = builder.GetBotPredicate("name");
                string initialResponse = builder.GetResponse("connect");
                System.Console.WriteLine(botName + " says: " + initialResponse);
                while (true)
                {
                    System.Console.Write("You say> ");
                    string input = System.Console.ReadLine();
                    if (input.Equals("/exit"))
                    {
                        break;
                    }
                    else
                    {
                        string response = builder.GetResponse(input);
                        //Print out what Rebecca says.
                        System.Console.WriteLine(botName + " says: " + response);
                    }
                }
            }
            catch (NetworkException e)
            {
                System.Console.WriteLine(e.ToString());
                System.Console.Write(Environment.StackTrace);
            }
            catch (Exception e)
            {
                System.Console.WriteLine(e.ToString());
                System.Console.Write(Environment.StackTrace);
            }
            finally
            {
                if (aiml != null)
                {
                    aiml.Destroy();
                }
            }

            System.Environment.Exit(status);
        }
    }
}
