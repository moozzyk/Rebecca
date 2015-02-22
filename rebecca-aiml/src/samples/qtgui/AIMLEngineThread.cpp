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

//qtgui includes
#include "AIMLEngineThread.h"
#include "CustomTextEdit.h"
#include "AIMLEngine.h"

namespace qtgui
{

void AIMLEngineThread::run()
{
	/*
	 * Create the aimlEngine in the
	 * thread on the local stack.  It'll
	 * be destroyed when the thread is.
	 */
	AIMLEngine aimlEngine;

	/*
	 * Make all the signal to signal and 
	 * signal to slot connections from the 
	 * AIMLEngineThread object to the AIMLEngine
	 * object.  This will be the only way to 
	 * communicate to the AIMLEngine object is 
	 * through signals and slots.
	 */
	bool b;
	b = connect(&aimlEngine, SIGNAL(addText(const QString &)),
		        this, SIGNAL(addText(const QString &)));

	b = connect(&aimlEngine, SIGNAL(addBotText(const QString &)),
		        this, SIGNAL(addBotText(const QString &)));

	b = connect(&aimlEngine, SIGNAL(addBotName(const QString &)),
		        this, SIGNAL(addBotName(const QString &)));

    b = connect(&aimlEngine, SIGNAL(loading()),
		        this, SIGNAL(loading()));

	b = connect(&aimlEngine, SIGNAL(doneLoading()),
		        this, SIGNAL(doneLoading()));

	b = connect(this, SIGNAL(userInput(const QString &)),
		        &aimlEngine, SLOT(userInput(const QString &)));

	b = connect(this, SIGNAL(clearAIML()),
		        &aimlEngine, SLOT(clearAIML()));

	b = connect(this, SIGNAL(addFile(const QString &)),
		        &aimlEngine, SLOT(addFile(const QString &)));

	b = connect(this, SIGNAL(addDirectory(const QString &)),
		        &aimlEngine, SLOT(addDirectory(const QString &)));

	/*
	 * Load the default annotated alice initially 
	 * so we don't have a GUI with nothing loaded 
	 * to start with.
	 */
	emit addDirectory("../../aiml/annotated_alice");

	/*
	 * Input into the bot the word, "connect" to 
	 * start it out with.
	 */
	emit userInput("connect"); 
	
	//start the QT event loop on this thread.
	exec();
}

} //end of qtgui namespace 
