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

import rebecca.NetworkAimlFacade;
import rebecca.GraphBuilder;
import rebecca.NetworkException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {
    public static void main(String args[]) {
        NetworkAimlFacade aiml = null;
        int status = 0;
        try {
            aiml = new NetworkAimlFacade(args);
            GraphBuilder builder = aiml.getNetworkGraphBuilder();
            System.out.println("Number of categories that are loaded in the brain:" + builder.getSize());
            String botName = builder.getBotPredicate("name");
            String initialResponse = builder.getResponse("connect");
            System.out.println(botName + " says: " + initialResponse);
            while(true) {
                System.out.print("You say> ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String input = br.readLine();
                if(input.equals("/exit")) {
                    break;
                } else {
                    String response = builder.getResponse(input);
                    System.out.println("=====================");
                    //Print out what Rebecca says.
                    System.out.println(botName + " says: " + response);
                }
            }
            aiml.destroy();
        } catch(NetworkException e) {
            e.printStackTrace();
            status = 1;
        } catch (Exception e) {
            e.printStackTrace();
            status = 1;
        }
        System.exit(status);
    }
}
