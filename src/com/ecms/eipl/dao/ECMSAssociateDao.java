package com.ecms.eipl.dao;

import java.util.List;

import com.ecms.eipl.entity.Associates;
import com.ecms.eipl.entity.ProjectAssociatePayment;
import com.ecms.eipl.entity.ProjectServices;

public interface ECMSAssociateDao {

	List<ProjectAssociatePayment> getAssociatePayment(int projectId);

	List<ProjectServices> getAssociateService(int projectId);

	List<Associates> getAllAssociates();
}
