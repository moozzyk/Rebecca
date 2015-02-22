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

package rebeccaaiml;


import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import rebeccaaiml.builder.RebeccaAIMLNature;

public class RebeccaWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage namePage;
	
	@Override
	public boolean performFinish() {
        try {
			getContainer().run(false,true,new WorkspaceModifyOperation()
			{
			   protected void execute(IProgressMonitor monitor)
			   {
			      createProject(monitor != null ? monitor : new NullProgressMonitor());
			   }
			});
		} catch (InvocationTargetException e) {
			reportError(e);
			e.printStackTrace();
		} catch (InterruptedException e) {
			reportError(e);
			e.printStackTrace();
		}
		
		return true;
	}
	
	
	public void init(IWorkbench workbench,
	                 IStructuredSelection selection)
	{
	   setNeedsProgressMonitor(true);
	}
	
	public void addPages()
	{
	 super.addPages();
	 namePage = new WizardNewProjectCreationPage("NewXMProjectWizard");
	 namePage.setTitle("RebeccaAIML");
	 namePage.setDescription("AIML Editing");
	 addPage(namePage);
	}
	
   /**
    * This is the actual implementation for project creation.
    * @param monitor reports progress on this object
    */
   protected void createProject(IProgressMonitor monitor)
   {
      monitor.beginTask("Creating project",50);
      try
      {
         IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
         monitor.subTask("Creating directories"); 
         IProject project = root.getProject(namePage.getProjectName());
         IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(project.getName());
         if(!Platform.getLocation().equals(namePage.getLocationPath()))
            description.setLocation(namePage.getLocationPath());
         project.create(description,monitor);
         monitor.worked(10);
         project.open(monitor);
         description = project.getDescription();
         //TODO should this be deleted now?
         //description.setNatureIds(new String[] { "RebeccaAIML" });
         project.setDescription(description,new SubProgressMonitor(monitor,10));
         monitor.worked(10);
         monitor.subTask("creatingfiles");
         toggleNature(project);         
      }
      catch(CoreException x)
      {
         reportError(x);
      }
      finally
      {
         monitor.done();
      }
   }	
   
	/**
	 * Toggles our nature on our project
	 * 
	 * @param project
	 *            to have RebeccaAIMLBuilder nature added or removed
	 */
	private void toggleNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();

			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = RebeccaAIMLNature.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
		}
	}
	
   private void reportError(Exception x)
   {
	   x.printStackTrace();
	   System.out.println(x.getMessage());
	   System.out.println("Error");
	   /*
      ErrorDialog.openError(getShell(),
                            "RebeccaAIML",
                            "ProjectError",
                            PluginTools.makeStatus(x));
      */
   }
   
   
   /**
    * Helper method: it recursively creates a folder path.
    * @param folder
    * @param monitor
    * @throws CoreException
    * @see java.io.File#mkdirs()
    */
   private void createFolderHelper(IFolder folder,IProgressMonitor monitor)
      throws CoreException
   {
      if(!folder.exists())
      {
         IContainer parent = folder.getParent();
         if(parent instanceof IFolder
            && (!((IFolder)parent).exists()))
            createFolderHelper((IFolder)parent,monitor);
         folder.create(false,true,monitor);
      }
   }
}
