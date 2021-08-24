package com.ecms.eipl.converter;

import java.util.List;

import com.ecms.eipl.data.ProjectData;
import com.ecms.eipl.entity.Projects;

public interface ECMSProjectConverter {

	List<ProjectData> convertProject(List<Projects> projectList);

	ProjectData convertProjectDetails(Projects project);

	Projects convertProjectData(ProjectData projectData);

}
