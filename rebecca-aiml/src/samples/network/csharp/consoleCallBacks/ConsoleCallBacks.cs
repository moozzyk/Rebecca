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

namespace consoleCallBacks
{
    class ConsoleCallBacks
    {
        static void Main(string[] args)
        {
            string directoryName = null;

            if(args.Length < 1)
            {
                System.Console.WriteLine("You need to at least give the directory");
                System.Console.WriteLine("of AIML files to load\n");
                System.Console.WriteLine("Example: ConsoleCallBacks-cs /rebecca/aiml/annotated_alice");
                System.Console.WriteLine("Example: ConsoleCallBacks-cs /rebecca/aiml/annotated_alice --Ice.Config=/rebecca/conf/clientconfig.properties");
                System.Environment.Exit(1);
            }
            else
            {
                directoryName = args[0];
            }

            NetworkAimlFacade aiml = null;
            int status = 0;
            try
            {
                aiml = new NetworkAimlFacade(args);
                GraphBuilder builder = aiml.GetNetworkGraphBuilder();
                CustomCallBacks callback = new CustomCallBacks();
                builder.SetCallBacks(callback);
                System.Console.WriteLine("[Rebecca loading]");
                builder.AddDirectory(directoryName);
                builder.CreateGraph();

                //Print out the number of categories loaded.
                System.Console.WriteLine("\n\n");
                System.Console.WriteLine("[Rebecca now fully loaded]");
                System.Console.WriteLine("[Number of categories loaded: " + builder.GetSize());
                System.Console.WriteLine("[Type /exit to exit]");
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
                        System.Console.WriteLine("Internal information:");
                        System.Console.WriteLine("=====================");
                        System.Console.WriteLine(input + ":" + builder.GetThat() + " : " +
                                           builder.GetTopic());
                        string response = builder.GetResponse(input);
                        System.Console.WriteLine("=====================");
                        //Print out what Rebecca says.
                        System.Console.WriteLine(botName + " says: " + response);
                    }
                }
            }
            catch (NetworkException e)
            {
                System.Console.WriteLine("[NetworkException Found Terminating]");
                System.Console.WriteLine("[" + e.Message + "]");
                Console.Write(e.StackTrace);
                status = 1;
            }
            catch (Exception e)
            {
                System.Console.WriteLine("[An uknown exception occured, Terminating program]");
                System.Console.WriteLine("[" + e.Message + "]");
                Console.Write(e.StackTrace);
                status = 1;
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
