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

package rebeccaaiml.builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import rebecca.NetworkAimlFacade;
import rebecca.NetworkException;
import rebecca.NetworkGraphBuilder;

public class RebeccaAIMLBuilder extends IncrementalProjectBuilder {

	Map<String, String> oldContents = new HashMap<String, String>();
	private NetworkAimlFacade facade;
	private NetworkGraphBuilder builder;
	
	private void init() {
		try {
			String[] args = new String[1];
			args[0] = "RebeccaAIMLBuilder";
			facade = new NetworkAimlFacade(args);
			builder = facade.getNetworkGraphBuilder();
		} catch (NetworkException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	class SampleDeltaVisitor implements IResourceDeltaVisitor {
		
		IProgressMonitor monitor;
		boolean monitorSet = false;
		
		SampleDeltaVisitor(IProgressMonitor monitor) {
			this.monitor = monitor;
		}
		
		public boolean visit(IResourceDelta delta) throws CoreException {
			if(monitorSet == false) {
				monitorSet = true;
				monitor.beginTask("building", delta.getAffectedChildren().length);				
			}

			//user canceled the operation
			if(monitor.isCanceled()) {
				monitor.worked(1);
				return false;
			}
			
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				reloadAIMLResource(resource);
				break;
			case IResourceDelta.REMOVED:
				removeAIMLResource(resource);
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				reloadAIMLResource(resource);
				break;
			}
			monitor.worked(1);
			return true;
		}
	}

	class SampleResourceVisitor implements IResourceVisitor {
		
		IProgressMonitor monitor;
		SampleResourceVisitor(IProgressMonitor monitor) {
			try {
				monitor.beginTask("building", getProject().members().length);
				this.monitor = monitor;
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public boolean visit(IResource resource) {
			if(monitor.isCanceled()) {
				monitor.worked(1);
				return false;
			}
			reloadAIMLResource(resource);
			monitor.worked(1);
			return true;
		}
	}

	public static final String BUILDER_ID = "RebeccaAIMLBuilder.RebeccaAIMLBuilder";

	@SuppressWarnings("unchecked")
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		monitor.done();
		return null;
	}

	private void writeFileOut(IFile file, String location) {
		InputStream input = null;
		OutputStream outputStream = null;
		try {
			input = file.getContents();
			int data;
			outputStream = new FileOutputStream(location);
			while((data=input.read()) != -1) {
			   outputStream.write(data);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(outputStream != null) {
					outputStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}
	}
	
	void removeAIMLResource(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".aiml")) {
			IFile file = (IFile) resource;

			String tempDir = System.getProperty("java.io.tmpdir") + resource.getProject().getName() + File.separator;
			if(builder == null) {
				init();
				File tempDirFile = new File(tempDir);
				if(!tempDirFile.exists()) {
					tempDirFile.mkdir();
				}
			}
			
			if(builder != null) {
				try {
					builder.removeFile(tempDir + file.getName(), "eclipse", "eclipse", "eclipse");
					builder.removeGraph("eclipse", "eclipse", "eclipse");
				} catch(Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			//delete the file
			File delFile = new File(tempDir + file.getName());
			delFile.delete();
		}
	}
	
	void reloadAIMLResource(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".aiml")) {
			IFile file = (IFile) resource;
			try {
				
				String tempDir = System.getProperty("java.io.tmpdir") + resource.getProject().getName() + File.separator;
				if(builder == null) {
					init();
					File tempDirFile = new File(tempDir);
					if(!tempDirFile.exists()) {
						tempDirFile.mkdir();
					}
				}
			
				if(builder != null) {
					try {
						builder.removeFile(tempDir + file.getName(), "eclipse", "eclipse", "eclipse");
						builder.removeGraph("eclipse", "eclipse", "eclipse");
					} catch(Exception e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}
				}
				
				writeFileOut(file, tempDir + file.getName());
				if(builder != null) {
					builder.addFile(file.getLocation().toPortableString(), "eclipse", "eclipse", "eclipse");
					builder.createGraph("eclipse", "eclipse", "eclipse");
				}
				
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			getProject().accept(new SampleResourceVisitor(monitor));
		} catch (CoreException e) {
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new SampleDeltaVisitor(monitor));
	}
}
