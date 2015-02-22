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

from NetworkException import *
from NetworkAimlFacade import *
import sys
import traceback

status = 0
aiml = None
try:
    aiml = NetworkAimlFacade(sys.argv)
    builder = aiml.getNetworkGraphBuilder()
    size = builder.getSize()
    print '[Number of categories loaded:' + str(size) + ']'
    print '[Type /exit to exit]\n\n'
    botName = builder.getBotPredicate('name')
    response = builder.getResponse('connect')
    print botName + ' says: ' + response
    while 1:
        input = raw_input('You say> ')
        if input == '/exit':
            break
        else:
            response = builder.getResponse(input)
            print "=====================\n"
            print botName + " says: " + response
except NetworkException, e:
    print '[NetworkException Found Terminating]'
    print '[' + str(e.what()) + ']'
    traceback.print_exc()
    status = 1
except Exception, e:
    print '[An uknown exception occured, Terminating program]'
    print '[' + str(e.what()) + ']'
    traceback.print_exc()
    status = 1

if aiml:
    aiml.destroy()

sys.exit(status)

