package com.ecms.eipl.service;

import java.util.List;

import com.ecms.eipl.data.ProjectData;

public interface ECMSProjectService {

	List<ProjectData> listProjects();

	ProjectData getProjectDetails(int projectId);
	
	List<ProjectData> getClientProjectList(int clientId);
	
	public List<ProjectData> saveorUpdateProjectData(ProjectData projectData);

}
