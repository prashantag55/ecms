package com.ecms.eipl.service;

import java.util.List;

import com.ecms.eipl.entity.ProjectServices;

public interface ECMSAssociateService {

	List<ProjectServices> getProjectAssociatesService(int projectId);

}
