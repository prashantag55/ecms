package com.ecms.eipl.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ecms.eipl.data.AssociatesData;
import com.ecms.eipl.data.ProjectAssociatePaymentData;
import com.ecms.eipl.data.ProjectServicesData;
import com.ecms.eipl.entity.Associates;
import com.ecms.eipl.entity.ProjectAssociatePayment;
import com.ecms.eipl.entity.ProjectServices;

public class ECMSAssociateConverterImpl implements ECMSAssociateConverter {

	private static final Logger logger = Logger.getLogger(ECMSAssociateConverterImpl.class);

	@Override
	public List<ProjectServicesData> convertAssociateServices(List<ProjectServices> associateServiceList) {
		List<ProjectServicesData> projectServicesDataList = new ArrayList<>();
		for (ProjectServices projectServices : associateServiceList) {
			projectServicesDataList.add(convertAssociateService(projectServices));
		}
		return projectServicesDataList;
	}

	private ProjectServicesData convertAssociateService(ProjectServices projectServices) {
		ProjectServicesData projectServicesData = new ProjectServicesData();
		projectServicesData.setAssociate(projectServices.getAssociate());
		projectServicesData.setFees(projectServices.getFees());
		projectServicesData.setId(projectServices.getId());
		projectServicesData.setProject(projectServices.getProject());
		projectServicesData.setService(projectServices.getService());

		return projectServicesData;
	}

	@Override
	public List<ProjectAssociatePaymentData> convertAssociatePaymentList(
			List<ProjectAssociatePayment> projectAssociatePaymentList) {
		List<ProjectAssociatePaymentData> projectAssociatePaymentDataList = new ArrayList<>();
		for (ProjectAssociatePayment projectAssociatePayment : projectAssociatePaymentList) {
			projectAssociatePaymentDataList.add(convertAssociatePayment(projectAssociatePayment));
		}
		return projectAssociatePaymentDataList;
	}

	private ProjectAssociatePaymentData convertAssociatePayment(ProjectAssociatePayment projectAssociatePayment) {
		ProjectAssociatePaymentData projectAssociatePaymentData = new ProjectAssociatePaymentData();
		projectAssociatePaymentData.setAssociate(projectAssociatePayment.getAssociate());
		projectAssociatePaymentData.setDate(projectAssociatePayment.getDate());
		projectAssociatePaymentData.setFees(projectAssociatePayment.getFees());
		projectAssociatePaymentData.setGst(projectAssociatePayment.getGst());
		projectAssociatePaymentData.setId(projectAssociatePayment.getId());
		projectAssociatePaymentData.setPaymentDetails(projectAssociatePayment.getPaymentDetails());
		projectAssociatePaymentData.setPaymentMode(projectAssociatePayment.getPaymentMode());
		projectAssociatePaymentData.setProject(projectAssociatePayment.getProject());
		projectAssociatePaymentData.setStatus(projectAssociatePayment.getStatus());
		projectAssociatePaymentData.setTds(projectAssociatePayment.getTds());
		return projectAssociatePaymentData;
	}

	@Override
	public List<AssociatesData> convertAllAssociates(List<Associates> associatesList) {
		List<AssociatesData> associatesDataList = new ArrayList<>();
		for (Associates Associates : associatesList) {
			associatesDataList.add(convertAssociate(Associates));
		}
		return associatesDataList;
	}

	private AssociatesData convertAssociate(Associates associates) {
		AssociatesData associatesData = new AssociatesData();
		associatesData.setAssociateId(associates.getAssociateId());
		associatesData.setAssociateName(associates.getAssociateName());
		associatesData.setEmail(associates.getEmail());
		associatesData.setMobileNumber(associates.getMobileNumber());

		return associatesData;
	}

}
