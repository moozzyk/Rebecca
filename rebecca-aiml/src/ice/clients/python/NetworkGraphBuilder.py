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

from GraphBuilder import *

class NetworkGraphBuilder(GraphBuilder):
    """
           Gives GraphBuilder a few extra methods 
           that would be needed for network communications.
    """
    
    def getProperty(self, key):
        """
    	  
    	   Retrieves the string value of a given key.
    	  
    	   @param key The key to get the string value of.
    	  
    	   @return The string value of the given key.
    	  
    	   @exception Exception If an underlying method throws an exception, 
    	   it will be wrapped and thrown as a Exception.
    	   
        """        
        "getProperty"

    def getPropertyWithDefault(self, key, value):
        """
    	  
    	   Retrieves the value of a given key but will
    	   return a default if that key doesn't exist.
    	  
    	   @param key The key to get the value of
    	  
    	   @param value The default value to return if the 
    	   key doesn't exist
    	   
    	   @return The string value of the given key or 
    	   the default value if the key doesn't exist
    	   
    	   @exception Exception If an underlying method throws an exception, 
    	   it will be wrapped and thrown as a Exception.
    	   
        """        
        "getPropertyWithDefault"

    def getPropertyAsInt(self, key):
        """
    	  
    	   Retrieves the integer value of a given key.
    	  
    	   @param key The key to get the integer value of.
    	  
    	   @return The integer value of the given key.
    	  
    	   @exception Exception If an underlying method throws an exception, 
    	   it will be wrapped and thrown as a Exception.
    	   
        """        
        "getPropertyAsInt"

    def getPropertyAsIntWithDefault(self, key, value):
        """
    	  
    	   Retrieves the integer of a given key but will
    	   return a default integer if that key doesn't exist.
    	  
    	   @param key The key to get the integer value of
    	  
    	   @param value The default integer value to return if the 
    	   key doesn't exist
    	   
    	   @return The integer value of the given key or 
    	   the default integer value if the key doesn't exist
    	   
    	   @exception Exception If an underlying method throws an exception, 
    	   it will be wrapped and thrown as a Exception.
    	   
        """        
        "getPropertyAsIntWithDefault"
