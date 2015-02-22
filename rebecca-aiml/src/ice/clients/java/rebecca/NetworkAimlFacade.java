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

/**
 * Facade to manage the memory allocation and
 * deallocation of concrete objects that have 
 * publicly exposed interfaces as well as 
 * provide get'ers to the concrete objects 
 * using their exposed interfaces.
 *
 * NetworkAimlFacade manages the memory for the 
 * GraphBuilder object.  When NetworkAimlFacade is 
 * instantiated it creates the GraphBuilder concrete 
 * implementation with a "new" and stores it inside of its 
 * reference to the GraphBuilder interface, graphBuilder.  
 * When NetworkAimlFacade is destroyed it in turn destroys the 
 * GraphBuilder object through this same reference.
 * 
 * This indirection is needed since GraphBuilder 
 * is an interface and users cannot directly 
 * instantiate it without access to a concrete 
 * implementation.
 */
public class NetworkAimlFacade {

	/**
	 * Constructs the facade and all the concrete objects to the 
	 * interfaces that have get'ers.
	 * 
	 * Underneath the covers the constructor creates a factory
	 * and from that factor creates the GraphBuilder concrete 
	 * representation and stores it in the graphBuilder reference.
	 * Pass in your args from your main() to this constructor
	 * so it can parse any commands it might want.  If you don't have
	 * access to your arguments from main() you can "fake" it by passing
	 * in a string with the name of your program to args.
	 *
	 * @param args Pass this from your main()
	 *
	 * @exception NetworkException If it cannot contact the server upon
	 * construction to make the initial connection it will throw a 
	 * network exception with the message of why it cannot contact the 
	 * server.
	 *  
	 * @exception Exception If an underlying method throws an exception, 
	 * it will be wrapped and thrown as a Exception.
	 */
    public NetworkAimlFacade(String[] args) throws NetworkException, Exception {
        graphBuilder = new NetworkGraphBuilderAIML(args);
    }

	/**
	 * Returns the constructed GraphBuilder object from 
	 * NetworkAimlFacade's constructor.  
	 *
	 * @return The GraphBuilder constructed in the 
	 * NetworkAimlFacade constructor.
     * 
	 * @exception No exceptions will be thrown.
	 */
    public NetworkGraphBuilder getNetworkGraphBuilder() {
        return graphBuilder;
    }

	/**
	 * Destroys the facade and all the concrete objects to the 
	 * interfaces that have get'ers.  Underneath the covers it 
	 * removes the GraphBuilder and its respective factory
	 * which created it.
	 */
    public void destroy() throws Exception {
        graphBuilder.destroy();
    }


	/**
	 * The GraphBuilder reference.  Use 
	 * NetworkAimlFacade.getGraphBuilder to obtain a reference 
	 * to this.  The GraphBuilder object is constructed 
	 * in the constructor of NetworkAimlFacade 
	 */
    private NetworkGraphBuilderAIML graphBuilder;
}
