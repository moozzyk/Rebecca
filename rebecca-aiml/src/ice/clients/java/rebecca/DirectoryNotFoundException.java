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
 * When a directory is not found from a method, the method 
 * will throw this exception.  
 *
 * When the user indicates that indeed a directory does exist
 * at their specified location but it does not, this exception
 * will be thrown.
 */
public class DirectoryNotFoundException extends Exception {
	
	/**
	 * Default constructor which takes an exception
	 * @param exception Exception message
	 */
    public DirectoryNotFoundException(String exception) {
        super(exception);
    }

}
