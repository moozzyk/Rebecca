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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.*;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;

import rebecca.NetworkAimlFacade;
import rebecca.NetworkException;
import rebecca.NetworkGraphBuilder;

public class RebeccaAIMLConsoleView extends ViewPart {
	//private TableViewer viewer;
	private Text viewer;
	private Label label;
	private Text input;
	private Button pushButton;
	private NetworkAimlFacade facade;
	private NetworkGraphBuilder builder;
	
	/**
	 * Construct our AIML connection builder
	 */
	private void constructAIML() {
		try {
			String[] args = new String[1];
			args[0] = "RebeccaAIMLConsoleView";
			facade = new NetworkAimlFacade(args);
			builder = facade.getNetworkGraphBuilder();
		} catch (NetworkException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The constructor.
	 */
	public RebeccaAIMLConsoleView() {
		constructAIML();
	}

	//create top panel to hold the input label,
	//the input box, and the enter key
	private Composite createTopPanel(Composite parent) {
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		Composite topPanel = new Composite(parent, SWT.BORDER);
		topPanel.setLayout(gridLayout);
		topPanel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
		
		//label
		label = new Label(topPanel, SWT.NONE);
		label.setText("Input:");
		//label.setBackground(new Color(label.getDisplay(), 255, 255, 255));
		//input
		input = new Text(topPanel, SWT.BORDER);
		input.setEditable(true);
		input.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
		input.setBackground(new Color(input.getDisplay(), 255, 255, 255));
		
		//Enter button
		pushButton = new Button(topPanel, SWT.PUSH);
		pushButton.setText("Enter");
		return topPanel;
	}
	
	private void addListeners() {
		input.addKeyListener(new InputKeyListener(builder, viewer));
		pushButton.addMouseListener(new EnterButtonListener(builder ,input, viewer));
	}
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		//set parent to grid bag layout
		GridLayout gridLayout = new GridLayout();		
		parent.setLayout(gridLayout);
		parent.setBackground(new Color(parent.getDisplay(), 255, 255, 255));
		createTopPanel(parent);
		viewer = new Text(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setEditable(false);
		viewer.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));
		viewer.setBackground(new Color(viewer.getDisplay(), 255, 255, 255));
		
		if(builder == null) {
			viewer.setText("AIML engine not able to load");
		}
		addListeners();
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getShell().setFocus();
		//viewer.getControl().setFocus();
	}
}