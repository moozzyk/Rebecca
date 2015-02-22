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

import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;

import rebecca.NetworkGraphBuilder;

public class EnterButtonListener extends MouseAdapter {
	Text output;
	Text input;
	NetworkGraphBuilder builder;
	
	EnterButtonListener(NetworkGraphBuilder builder, Text input, Text output) {
		this.input = input;
		this.output = output;
		this.builder = builder;
	}
	
	@Override
	public void mouseDown(MouseEvent e) {
		//do nothing without a aiml builder
		if(builder == null) {
			return;
		}
		try {
			String response = builder.getResponse(input.getText(), "eclipse", "eclipse", "eclipse");
			output.append("user> " + input.getText() + "\n" + "Bot response> " + response + "\n");
			input.setText("");
		} catch (Exception e1) {
			output.append("Internal error\n");
			input.setText("");
			e1.printStackTrace();
		}
	}
}
