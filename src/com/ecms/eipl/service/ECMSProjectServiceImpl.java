package com.ecms.eipl.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecms.eipl.converter.ECMSProjectConverter;
import com.ecms.eipl.dao.ECMSProjectDao;
import com.ecms.eipl.data.ProjectData;
import com.ecms.eipl.entity.Projects;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ECMSProjectServiceImpl implements ECMSProjectService {
	private static final Logger logger = Logger.getLogger(ECMSProjectServiceImpl.class);

	@Autowired
	private ECMSProjectDao ecmsProjectDao;

	@Autowired
	private ECMSProjectConverter ecmsProjectConverter;

	@Override
	public List<ProjectData> listProjects() {
		List<Projects> projectList = ecmsProjectDao.getAllProject();
		return ecmsProjectConverter.convertProject(projectList);
	}

	@Override
	public ProjectData getProjectDetails(int projectId) {
		Projects project = ecmsProjectDao.getProject(projectId);
		return ecmsProjectConverter.convertProjectDetails(project);
	}

	@Override
	public List<ProjectData> saveorUpdateProjectData(ProjectData projectData) {
		Projects project = ecmsProjectConverter.convertProjectData(projectData);
		ecmsProjectDao.saveorUpdateProject(project);
		return null;
	}

	@Override
	public List<ProjectData> getClientProjectList(int clientId) {
		List<Projects> projectList = ecmsProjectDao.getClientProject(clientId);
		return ecmsProjectConverter.convertProject(projectList);
	}

}
