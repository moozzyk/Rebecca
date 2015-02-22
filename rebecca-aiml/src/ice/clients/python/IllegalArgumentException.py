"""
/ 
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
class IllegalArgumentException(Exception):
    """
      
       When Illegal Arguments are given to a AIML method, the 
       method will throw this exception.
      
       Illegal Arguments are usually invalid text given 
       to AIML methods.  Examples of invalid text are invalid 
       constructed regular expressions or locations of files with 
       invalid text such as invalid path seperators.
       
    """
    __what = ''
    def __init__(self, what):
        """
          
           Default constructor which takes an exception
           @param what Exception message
           
        """        
        self.__what = what
        
    def what(self):
        return self.__what
    
    def __str__(self):
        return self.__what
    
    def __repr__(self):
        return self.__what
