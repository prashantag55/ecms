package com.ecms.eipl.service;

import java.util.List;

import com.ecms.eipl.data.AssociatesData;
import com.ecms.eipl.data.ProjectAssociatePaymentData;
import com.ecms.eipl.data.ProjectServicesData;

public interface ECMSAssociateService {

	List<ProjectServicesData> getProjectAssociatesService(int projectId);

	List<ProjectAssociatePaymentData> getAssociatePayment(int projectId);

	List<AssociatesData> getAllAssociate();

}
