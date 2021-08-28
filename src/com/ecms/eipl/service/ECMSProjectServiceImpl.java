package com.ecms.eipl.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecms.eipl.converter.ECMSAssociateConverter;
import com.ecms.eipl.converter.ECMSBillConverter;
import com.ecms.eipl.converter.ECMSProjectConverter;
import com.ecms.eipl.dao.ECMSBillDao;
import com.ecms.eipl.dao.ECMSProjectDao;
import com.ecms.eipl.data.BillsData;
import com.ecms.eipl.data.ProjectAssociatePaymentData;
import com.ecms.eipl.data.ProjectData;
import com.ecms.eipl.data.ProjectPaymentDetailsData;
import com.ecms.eipl.data.ProjectServicesData;
import com.ecms.eipl.entity.Bills;
import com.ecms.eipl.entity.ProjectAssociatePayment;
import com.ecms.eipl.entity.ProjectPaymentDetails;
import com.ecms.eipl.entity.ProjectServices;
import com.ecms.eipl.entity.Projects;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ECMSProjectServiceImpl implements ECMSProjectService {
	private static final Logger logger = Logger.getLogger(ECMSProjectServiceImpl.class);

	@Autowired
	private ECMSProjectDao ecmsProjectDao;

	@Autowired
	private ECMSAssociateService ecmsAssociateService;

	@Autowired
	private ECMSProjectConverter ecmsProjectConverter;

	@Autowired
	private ECMSAssociateConverter ecmsAssociateConverter;

	@Autowired
	private ECMSBillDao ecmsBillDao;

	@Autowired
	private ECMSBillConverter ecmsbillConverter;

	@Override
	public List<ProjectData> listProjects() {
		List<Projects> projectList = ecmsProjectDao.getAllProject();
		return ecmsProjectConverter.convertProject(projectList);
	}

	@Override
	public ProjectData getProjectDetails(int projectId) {
		Projects project = ecmsProjectDao.getProject(projectId);
		ProjectData projectdata = ecmsProjectConverter.convertProjectDetails(project);

		List<ProjectServices> associateServiceList = ecmsAssociateService.getProjectAssociatesService(projectId);
		List<ProjectServicesData> associateServiceDataList = ecmsAssociateConverter
				.convertAssociateServices(associateServiceList);
		projectdata.setProjectServicesDataList(associateServiceDataList);

		List<Bills> billList = ecmsBillDao.getProjectBills(projectId);
		List<BillsData> billDataList = ecmsbillConverter.convertBills(billList);
		projectdata.setBillsDataList(billDataList);

		List<ProjectPaymentDetails> projectPaymentList = ecmsBillDao.getProjectPayment(projectId);
		List<ProjectPaymentDetailsData> projectPaymentDataList = ecmsbillConverter
				.convertProjectPayment(projectPaymentList);
		projectdata.setProjectPaymentDetailsDataList(projectPaymentDataList);

		List<ProjectAssociatePayment> associatePaymentList = ecmsBillDao.getAssociatePayment(projectId);
		List<ProjectAssociatePaymentData> associatePaymentDataList = ecmsbillConverter
				.convertAsssociatePayment(associatePaymentList);
		projectdata.setProjectAssociatePaymentDataList(associatePaymentDataList);

		return projectdata;
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
