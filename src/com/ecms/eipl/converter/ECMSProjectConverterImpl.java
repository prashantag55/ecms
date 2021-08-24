package com.ecms.eipl.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ecms.eipl.data.ProjectData;
import com.ecms.eipl.entity.Projects;

public class ECMSProjectConverterImpl implements ECMSProjectConverter {

	private static final Logger logger = Logger.getLogger(ECMSProjectConverterImpl.class);

	@Override
	public List<ProjectData> convertProject(List<Projects> projectList) {
		List<ProjectData> projectDataList = new ArrayList<>();
		for (Projects projects : projectList) {
			projectDataList.add(convertProjectDetails(projects));
		}

		return projectDataList;
	}

	@Override
	public ProjectData convertProjectDetails(Projects project) {

		ProjectData projectsData = new ProjectData();
		projectsData.setAgreedFees(project.getAgreedFees());
		projectsData.setClient(project.getClient());
		projectsData.setConstructionType(project.getConstructionType());
		projectsData.setProjectDate(project.getProjectDate());
		projectsData.setProjectId(project.getProjectId());
		projectsData.setProjectLocation(project.getProjectLocation());
		projectsData.setProjectName(project.getProjectLocation());
		projectsData.setProjectSize(project.getProjectSize());
		projectsData.setProjectStatus(project.getProjectStatus());
		projectsData.setScope(project.getScope());
		projectsData.setTenderValue(project.getTenderValue());
		projectsData.setWorkOrderStatus(project.getWorkOrderStatus());

		return projectsData;
	}

	@Override
	public Projects convertProjectData(ProjectData projectData) {
		Projects projects = new Projects();
		projects.setAgreedFees(projectData.getAgreedFees());
		projects.setClient(projectData.getClient());
		projects.setConstructionType(projectData.getConstructionType());
		projects.setProjectDate(projectData.getProjectDate());
		projects.setProjectId(projectData.getProjectId());
		projects.setProjectLocation(projectData.getProjectLocation());
		projects.setProjectName(projectData.getProjectLocation());
		projects.setProjectSize(projectData.getProjectSize());
		projects.setProjectStatus(projectData.getProjectStatus());
		projects.setScope(projectData.getScope());
		projects.setTenderValue(projectData.getTenderValue());
		projects.setWorkOrderStatus(projectData.getWorkOrderStatus());
		return projects;
	}

}
