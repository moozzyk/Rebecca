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

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.swt.widgets.Text;

public class DocumentListener implements IDocumentListener {

	private String output = new String();
	private boolean currentlyEditing = false;
	private Text viewer;
	private Text viewer2;
	
	DocumentListener(Text viewer, Text viewer2) {
		this.viewer = viewer;
		this.viewer2 = viewer2;
	}
	
	@Override
	public void documentAboutToBeChanged(DocumentEvent arg0) {
	}

	@Override
	public void documentChanged(DocumentEvent arg0) {
		if(!currentlyEditing) {
			if(arg0.getText().contains("\n")) {
				currentlyEditing = true;
				String currentText = viewer2.getText();
				currentText += output;
				viewer2.setText(currentText);
				output = "";
			}
			output += arg0.getText();
		} else {
			currentlyEditing = false;
			output += arg0.getText();
		}
	}

}
