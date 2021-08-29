package com.ecms.eipl.dao;

import java.util.List;

import com.ecms.eipl.entity.Projects;

public interface ECMSProjectDao {

	List<Projects> getClientProject(int clientId);

	public void saveorUpdateProject(Projects project);

	public Projects getProject(int projectId);

	List<Projects> getAllProject();

}
