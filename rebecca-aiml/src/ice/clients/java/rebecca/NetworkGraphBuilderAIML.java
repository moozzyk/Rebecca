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

import rebecca.impl.*;
import java.io.FileNotFoundException;

class NetworkGraphBuilderAIML implements NetworkGraphBuilder {

    private Ice.Communicator iceCommunicator;
    private NetworkGraphBuilderIcePrx networkGraphBuilderIce;
    private Ice.Properties properties;
    private Ice.ObjectAdapter adapter;
    private NetworkCallBacks callBacks;
    private Ice.Identity ident = new Ice.Identity();
    boolean callBacksActivated = false;
    private String mUserId = "default";
    private String mBotId = "default";
    private String mEndUserId = "default";
    public NetworkGraphBuilderAIML(String args[]) throws NetworkException, Exception {
        try {
            iceCommunicator = Ice.Util.initialize(args);
            properties = iceCommunicator.getProperties();

            String name = properties.getPropertyWithDefault("Rebecca.Client.Config.Name",
                    "rebecca-server");
            String endPoint = properties.getPropertyWithDefault("Rebecca.Client.Config.EndPoint",
                    "default -p 58767");
            String proxy = name + ":" + endPoint;
            Ice.ObjectPrx base = iceCommunicator.stringToProxy(proxy);
            networkGraphBuilderIce = NetworkGraphBuilderIcePrxHelper.checkedCast(base);
            if (networkGraphBuilderIce == null) {
                throw(new NetworkException("The network could not be contacted. " +
                        "Do you have the server running?"));
            }

            adapter =
                iceCommunicator.createObjectAdapter("");
        } catch (Ice.LocalException e) {
            throw new NetworkException(e.toString());
        }
    }

    public void destroy() throws Exception {
        try {
            iceCommunicator.destroy();
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override    
    public String getProperty(String key) throws Exception {
        try {
            return properties.getProperty(key);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override    
    public String getPropertyWithDefault(String key, String value) throws Exception {
        try {
            return properties.getPropertyWithDefault(key, value);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override    
    public int getPropertyAsInt(String key) throws Exception {
        try {
            return properties.getPropertyAsInt(key);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public int getPropertyAsIntWithDefault(String key, int value) throws Exception {
        try {
            return properties.getPropertyAsIntWithDefault(key, value);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void addFile(String file, String userId, String botId, String endUserId) 
    	throws FileNotFoundException, Exception {
        try {
            networkGraphBuilderIce.addFile(file, userId, botId, endUserId);
        } catch(FileNotFoundExceptionIce e) {
            throw new FileNotFoundException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public void addDirectory(String directory, String userId, String botId, String endUserId) 
    	throws IllegalArgumentException, DirectoryNotFoundException, Exception {
        try {
            networkGraphBuilderIce.addDirectory(directory, userId, botId, endUserId);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(DirectoryNotFoundExceptionIce e) {
            throw new DirectoryNotFoundException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression, String userId, String botId, String endUserId) 
    	throws IllegalArgumentException, DirectoryNotFoundException, Exception {
        try {
            networkGraphBuilderIce.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(DirectoryNotFoundExceptionIce e) {
            throw new DirectoryNotFoundException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void addString(String stringContainingAIML, String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            networkGraphBuilderIce.addString(stringContainingAIML, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setAddStringAIMLHeader(String aimlHeader) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setAddStringAIMLHeader(aimlHeader);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public void setAddStringAIMLFooter(String aimlFooter) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setAddStringAIMLFooter(aimlFooter);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setAIMLSchema(String schema) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setAIMLSchema(schema);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setCommonTypesSchema(String schema) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setCommonTypesSchema(schema);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public void setAIMLValidation(boolean trueOrFalse) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setAIMLValidation(trueOrFalse);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public String getResponse(String input, String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            return networkGraphBuilderIce.getResponse(input, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public void setThat(String that, String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setThat(that, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setTopic(String topic, String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setTopic(topic, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public String getThat(String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            return networkGraphBuilderIce.getThat(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public String getTopic(String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            return networkGraphBuilderIce.getTopic(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public void createGraph(String userId, String botId, String endUserId) 
    	throws XMLErrorException, Exception {
        try {
            networkGraphBuilderIce.createGraph(userId, botId, endUserId);
        } catch(XMLErrorExceptionIce e) {
            throw new XMLErrorException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public boolean predicateMatch(String predicateName, String aimlPattern, String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            return networkGraphBuilderIce.predicateMatch(predicateName, aimlPattern, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public void setPredicate(String name, String value, String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setPredicate(name, value, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public String getPredicate(String name, String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            return networkGraphBuilderIce.getPredicate(name, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public String getBotPredicate(String name, String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            return networkGraphBuilderIce.getBotPredicate(name, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public void setBotPredicate(String name, String value, String userId, String botId, String endUserId) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setBotPredicate(name, value, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public String getPreviousBotResponse(int previousBotResponse, int sentence, String userId, String botId, String endUserId) 
    	throws IllegalArgumentException, Exception {
        try {
            return networkGraphBuilderIce.getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public String getPreviousUserInput(int previousUserInput, int sentence, String userId, String botId, String endUserId) 
    	throws IllegalArgumentException, Exception {
        try {
            return networkGraphBuilderIce.getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setBotConfigurationSchema(String schema) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setBotConfigurationSchema(schema);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setBotConfigurationValidation(boolean trueOrFalse) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setBotConfigurationValidation(trueOrFalse);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void parseSubstitutionFile(String fileName) 
    	throws XMLErrorException, FileNotFoundException, Exception {
        try {
            networkGraphBuilderIce.parseSubstitutionFile(fileName);
        } catch(XMLErrorExceptionIce e) {
            throw new XMLErrorException(e.what);
        } catch(FileNotFoundExceptionIce e) {
            throw new FileNotFoundException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void parseSentenceSplitterFile(String fileName) 
    	throws XMLErrorException, FileNotFoundException, Exception {
        try {
            networkGraphBuilderIce.parseSentenceSplitterFile(fileName);
        } catch(XMLErrorExceptionIce e) {
            throw new XMLErrorException(e.what);
        } catch(FileNotFoundExceptionIce e) {
            throw new FileNotFoundException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void parsePropertiesFile(String fileName, String userId, String botId, String endUserId) 
    	throws XMLErrorException, FileNotFoundException, Exception {
        try {
            networkGraphBuilderIce.parsePropertiesFile(fileName, userId, botId, endUserId);
        } catch(XMLErrorExceptionIce e) {
            throw new XMLErrorException(e.what);
        } catch(FileNotFoundExceptionIce e) {
            throw new FileNotFoundException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setSentenceSplitter(String splitter) 
    	throws Exception {
        try {
            networkGraphBuilderIce.setSentenceSplitter(splitter);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setInputSubstitution(String find, String replace) 
    	throws IllegalArgumentException, Exception {
        try {
            networkGraphBuilderIce.setInputSubstitution(find, replace);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setGenderSubstitution(String find, String replace) 
    	throws IllegalArgumentException, Exception {
        try {
            networkGraphBuilderIce.setGenderSubstitution(find, replace);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public void setPersonSubstitution(String find, String replace) 
    	throws IllegalArgumentException, Exception {
        try {
            networkGraphBuilderIce.setPersonSubstitution(find, replace);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setPerson2Substitution(String find, String replace) 
    	throws IllegalArgumentException, Exception {
        try {
            networkGraphBuilderIce.setPerson2Substitution(find, replace);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public String getVersion() 
    	throws Exception {
        try {
            return networkGraphBuilderIce.getVersion();
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public int getSize(String userId, String botId, String endUserId) 
    	throws Exception {
        try {
           return networkGraphBuilderIce.getSize(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void setCallBacks(CallBacks callbacks) throws Exception {
        if(callBacksActivated) {
            callBacksActivated = false;
            adapter.remove(ident);
        }

        if(callbacks == null) {
            return;
        } else {
            ident.name = Ice.Util.generateUUID();
            ident.category = "";
            this.callBacks = new NetworkCallBacks();
            adapter.add(this.callBacks, ident);
            adapter.activate();
            networkGraphBuilderIce.ice_getConnection().setAdapter(adapter);
            networkGraphBuilderIce.setCallBacks(ident.name, ident.category);
            this.callBacks.setCallBacks(callbacks);
            callBacksActivated = true;
        }
    }

    @Override
    public void storeGossip(String gossip) throws Exception {
        try {
            networkGraphBuilderIce.storeGossip(gossip);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public String getId() throws Exception {
        try {
           return networkGraphBuilderIce.getId();
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void addCustomTagLibrary(String library) throws FileNotFoundException, Exception {
        try {
            networkGraphBuilderIce.addCustomTagLibrary(library);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void removeCustomTagLibrary(String library) throws FileNotFoundException, Exception {
        try {
            networkGraphBuilderIce.removeCustomTagLibrary(library);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }
    
    @Override
    public String callSystemCommand(String command) throws Exception {
        try {
            return networkGraphBuilderIce.callSystemCommand(command);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
    }

	@Override
	public void addDirectory(String directory) 
		throws IllegalArgumentException, DirectoryNotFoundException, Exception {
		this.addDirectory(directory, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void addDirectoryWithFilesEndingInRegularExpression(String directory, String regularExpression)
		throws IllegalArgumentException, DirectoryNotFoundException, Exception {
		this.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void addFile(String file) throws FileNotFoundException, Exception {
		this.addFile(file, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void addString(String stringContainingAIML) throws Exception {
		this.addString(stringContainingAIML, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void createGraph() throws XMLErrorException, Exception {
		this.createGraph(mUserId, mBotId, mEndUserId);
	}

	@Override
	public String getBotPredicate(String name) throws Exception {
		return this.getBotPredicate(name, mUserId, mBotId, mEndUserId);
	}

	@Override
	public String getPredicate(String name) throws Exception {
		return this.getPredicate(name, mUserId, mBotId, mEndUserId);
	}

	@Override
	public String getPreviousBotResponse(int previousBotResponse, int sentence)
			throws IllegalArgumentException, Exception {
		return this.getPreviousBotResponse(previousBotResponse, sentence, mUserId, mBotId, mEndUserId);
	}

	@Override
	public String getPreviousUserInput(int previousUserInput, int sentence)
			throws IllegalArgumentException, Exception {
		return this.getPreviousUserInput(previousUserInput, sentence, mUserId, mBotId, mEndUserId);
	}

	@Override
	public String getResponse(String input) throws Exception {
		return this.getResponse(input, mUserId, mBotId, mEndUserId);
	}

	@Override
	public int getSize() throws Exception {
		return this.getSize(mUserId, mBotId, mEndUserId);
	}

	@Override
	public String getThat() throws Exception {
		return this.getThat(mUserId, mBotId, mEndUserId);
	}

	@Override
	public String getTopic() throws Exception {
		return this.getTopic(mUserId, mBotId, mEndUserId);
	}

	@Override
	public void parsePropertiesFile(String fileName) throws XMLErrorException, FileNotFoundException, Exception {
		this.parsePropertiesFile(fileName, mUserId, mBotId, mEndUserId);
	}

	@Override
	public boolean predicateMatch(String predicateName, String aimlPattern) throws Exception {
		return this.predicateMatch(predicateName, aimlPattern, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void setBotPredicate(String name, String value) throws Exception {
		this.setBotPredicate(name, value, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void setPredicate(String name, String value) throws Exception {
		this.setPredicate(name, value, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void setThat(String that) throws Exception {
		this.setThat(that, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void setTopic(String topic) throws Exception {
		this.setTopic(topic, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void addDirectoryUnlessAlreadyAdded(String directory)
			throws IllegalArgumentException, DirectoryNotFoundException,
			Exception {
            this.addDirectoryUnlessAlreadyAdded(directory, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void addDirectoryUnlessAlreadyAdded(String directory, String userId,
			String botId, String endUserId) throws IllegalArgumentException,
			DirectoryNotFoundException, Exception {
        try {
            networkGraphBuilderIce.addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(DirectoryNotFoundExceptionIce e) {
            throw new DirectoryNotFoundException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(
			String directory, String regularExpression)
			throws IllegalArgumentException, DirectoryNotFoundException,
			Exception {
		this.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(
			String directory, String regularExpression, String userId,
			String botId, String endUserId) throws IllegalArgumentException,
			DirectoryNotFoundException, Exception {
        try {                      
            networkGraphBuilderIce.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId);
        } catch(IllegalArgumentExceptionIce e) {
            throw new IllegalArgumentException(e.what);
        } catch(DirectoryNotFoundExceptionIce e) {
            throw new DirectoryNotFoundException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void addFileUnlessAlreadyAdded(String file)
			throws FileNotFoundException, Exception {
		this.addFileUnlessAlreadyAdded(file, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void addFileUnlessAlreadyAdded(String file, String userId,
			String botId, String endUserId) throws FileNotFoundException,
			Exception {
        try {                      
            networkGraphBuilderIce.addFileUnlessAlreadyAdded(file, userId, botId, endUserId);
        } catch(FileNotFoundExceptionIce e) {
            throw new FileNotFoundException(e.what);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public String[] getAIMLFileList() throws Exception {
            return this.getAIMLFileList(mUserId, mBotId, mEndUserId);
	}

	@Override
	public String[] getAIMLFileList(String userId, String botId,
			String endUserId) throws Exception {
        try {                      
            return networkGraphBuilderIce.getAIMLFileList(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public String[] getAIMLStringList() throws Exception {
		return this.getAIMLStringList(mUserId, mBotId, mEndUserId);
	}

	@Override
	public String[] getAIMLStringList(String userId, String botId,
			String endUserId) throws Exception {
        try {                      
            return networkGraphBuilderIce.getAIMLStringList(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public int getAIMLStringListSize() throws Exception {
		return this.getAIMLStringListSize(mUserId, mBotId, mEndUserId);
	}

	@Override
	public int getAIMLStringListSize(String userId, String botId,
			String endUserId) throws Exception {
        try {                      
            return networkGraphBuilderIce.getAIMLStringListSize(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public int getEndUserIdsSize(String userId, String botId)
			throws Exception {
        try {                      
            return networkGraphBuilderIce.getEndUserIdsSize(userId, botId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public String[] getBotIds(String userId) throws Exception {
        try {                      
            return networkGraphBuilderIce.getBotIds(userId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public int getBotIdsSize(String userId) throws Exception {
        try {                      
            return networkGraphBuilderIce.getBotIdsSize(userId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public String[] getBotPredicates() throws Exception {
		return this.getBotPredicates(mUserId, mBotId, mEndUserId);
	}

	@Override
	public String[] getBotPredicates(String userId, String botId,
			String endUserId) throws Exception {
        try {                      
            return networkGraphBuilderIce.getBotPredicates(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public int getBotPredicatesSize() throws Exception {
		return this.getBotPredicatesSize(mUserId, mBotId, mEndUserId);
	}

	@Override
	public int getBotPredicatesSize(String userId, String botId,
			String endUserId) throws Exception {
        try {                      
            return networkGraphBuilderIce.getBotPredicatesSize(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public String[] getEndUserIds(String userId, String botId)
			throws Exception {
        try {                      
            return networkGraphBuilderIce.getEndUserIds(userId, botId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public String[] getPredicates() throws Exception {
		return this.getPredicates(mUserId, mBotId, mEndUserId);
	}

	@Override
	public String[] getPredicates(String userId, String botId,
			String endUserId) throws Exception {
        try {                      
            return networkGraphBuilderIce.getPredicates(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public int getPredicatesSize() throws Exception {
		return this.getPredicatesSize(mUserId, mBotId, mEndUserId);
	}

	@Override
	public int getPredicatesSize(String userId, String botId, String endUserId)
			throws Exception {
        try {                      
            return networkGraphBuilderIce.getPredicatesSize(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public String[] getUserIds() throws Exception {
        try {                      
            return networkGraphBuilderIce.getUserIds();
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public int getUserIdsSize() throws Exception {
        try {                      
            return networkGraphBuilderIce.getUserIdsSize();
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void printEntireDatabase() throws Exception {
        try {                      
            networkGraphBuilderIce.printEntireDatabase();
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeBot(String userId, String botId) throws Exception {
        try {                      
            networkGraphBuilderIce.removeBot(userId, botId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeBotPredicate(String name) throws Exception {
		this.removeBotPredicate(name, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void removeBotPredicate(String name, String userId, String botId,
			String endUserId) throws Exception {
        try {                      
            networkGraphBuilderIce.removeBotPredicate(name, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeDirectory(String directory)
			throws IllegalArgumentException, DirectoryNotFoundException,
			Exception {
        try {                      
            this.removeDirectory(directory, mUserId, mBotId, mEndUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeDirectory(String directory, String userId, String botId,
			String endUserId) throws IllegalArgumentException,
			DirectoryNotFoundException, Exception {
        try {                      
        	networkGraphBuilderIce.removeDirectory(directory, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeDirectoryWithFilesEndingInRegularExpression(
			String directory, String regularExpression)
			throws IllegalArgumentException, DirectoryNotFoundException,
			Exception {
        this.removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void removeDirectoryWithFilesEndingInRegularExpression(
			String directory, String regularExpression, String userId,
			String botId, String endUserId) throws IllegalArgumentException,
			DirectoryNotFoundException, Exception {
        try {                      
        	networkGraphBuilderIce.removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeEndUser(String userId, String botId, String endUserId)
			throws Exception {
        try {                      
        	networkGraphBuilderIce.removeEndUser(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeFile(String file) throws FileNotFoundException, Exception {
		this.removeFile(file, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void removeFile(String file, String userId, String botId,
			String endUserId) throws FileNotFoundException, Exception {
        try {                      
        	networkGraphBuilderIce.removeFile(file, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeGraph() throws XMLErrorException, Exception {
		this.removeGraph(mUserId, mBotId, mEndUserId);
	}

	@Override
	public void removeGraph(String userId, String botId, String endUserId)
			throws XMLErrorException, Exception {
        try {                      
        	networkGraphBuilderIce.removeGraph(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removePredicate(String name) throws Exception {
    	this.removePredicate(name, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void removePredicate(String name, String userId, String botId,
			String endUserId) throws Exception {
        try {                      
        	networkGraphBuilderIce.removePredicate(name, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeString(String stringContainingAIML) throws Exception {
    	this.removeString(stringContainingAIML, mUserId, mBotId, mEndUserId);
	}

	@Override
	public void removeString(String stringContainingAIML, String userId,
			String botId, String endUserId) throws Exception {
        try {                      
        	networkGraphBuilderIce.removeString(stringContainingAIML, userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void removeUser(String userId) throws Exception {
        try {                      
        	networkGraphBuilderIce.removeUser(userId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void synchronizeDatabase() throws Exception {
        try {                      
        	networkGraphBuilderIce.synchronizeDatabase();
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}

	@Override
	public void setUserIdBotIdEndUserId(String userId, String botId,
			String endUserId) throws Exception {
		this.mUserId = userId;
		this.mBotId = botId;
		this.mEndUserId = endUserId;
	}

	@Override
	public int getAIMLFileListSize() throws Exception {
		return this.getAIMLFileListSize(mUserId, mBotId, mEndUserId);
	}

	@Override
	public int getAIMLFileListSize(String userId, String botId,
			String endUserId) throws Exception {
        try {                      
            return networkGraphBuilderIce.getAIMLFileListSize(userId, botId, endUserId);
        } catch(ExceptionIce e) {
            throw new Exception(e.what);
        } catch(Ice.LocalException e) {
            throw new Exception(e.toString());
        }
	}
}
