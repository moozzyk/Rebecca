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

package rebeccaaimlconsole.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Text;

import rebecca.NetworkGraphBuilder;

public class InputKeyListener extends KeyAdapter {
	
	Text output;
	NetworkGraphBuilder builder;
	
	InputKeyListener(NetworkGraphBuilder builder, Text output) {
		this.output = output;
		this.builder = builder;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		//do nothing without a aiml builder
		if(builder == null) {
			return;
		}
		switch(e.character) {
			case SWT.CR: {
				Object o = e.getSource();
				if(o instanceof Text) {
					Text text = (Text) o;
					try {
						String response = builder.getResponse(text.getText(), "eclipse", "eclipse", "eclipse");
						output.append("user> " + text.getText() + "\n" + "Bot response> " + response + "\n");
						text.setText("");
					} catch (Exception e1) {
						output.append("Internal error\n");
						text.setText("");
						e1.printStackTrace();
					}
				}
				break;
			}
		}
	}
}
