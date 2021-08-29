package com.ecms.eipl.service;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecms.eipl.converter.ECMSProjectConverter;
import com.ecms.eipl.dao.ECMSProjectDao;
import com.ecms.eipl.data.BillsData;
import com.ecms.eipl.data.ProjectAssociatePaymentData;
import com.ecms.eipl.data.ProjectData;
import com.ecms.eipl.data.ProjectPaymentDetailsData;
import com.ecms.eipl.data.ProjectServicesData;
import com.ecms.eipl.entity.Projects;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ECMSProjectServiceImpl implements ECMSProjectService {

	private static final Logger logger = Logger.getLogger(ECMSProjectServiceImpl.class);

	@Autowired
	private ECMSProjectDao ecmsProjectDao;

	@Autowired
	private ECMSProjectConverter ecmsProjectConverter;

	@Autowired
	private ECMSAssociateService ecmsAssociateService;

	@Autowired
	private ECMSBillsService ecmsBillsService;

	@Autowired
	private ECMSPaymentDetailsService ecmsPaymentDetailsService;

	@Override
	public List<ProjectData> listProjects() {
		List<Projects> projectList = ecmsProjectDao.getAllProject();
		if (CollectionUtils.isNotEmpty(projectList)) {
			return ecmsProjectConverter.convertProject(projectList);
		}
		return null;
	}

	@Override
	public ProjectData getProjectDetails(int projectId) {
		Projects project = ecmsProjectDao.getProject(projectId);
		ProjectData projectdata = ecmsProjectConverter.convertProjectDetails(project);

		List<BillsData> billDataList = ecmsBillsService.getProjectBillsList(projectId);
		if (CollectionUtils.isNotEmpty(billDataList)) {
			projectdata.setBillsDataList(billDataList);
		}

		List<ProjectPaymentDetailsData> projectPaymentDataList = ecmsPaymentDetailsService.getProjectPayment(projectId);
		if (CollectionUtils.isNotEmpty(projectPaymentDataList)) {
			projectdata.setProjectPaymentDetailsDataList(projectPaymentDataList);
		}
		List<ProjectServicesData> associateServiceDataList = ecmsAssociateService
				.getProjectAssociatesService(projectId);
		if (CollectionUtils.isNotEmpty(projectPaymentDataList)) {
			projectdata.setProjectServicesDataList(associateServiceDataList);

			List<ProjectAssociatePaymentData> associatePaymentDataList = ecmsAssociateService
					.getAssociatePayment(projectId);
			if (CollectionUtils.isNotEmpty(associatePaymentDataList)) {
				projectdata.setProjectAssociatePaymentDataList(associatePaymentDataList);
			}
		}
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
		if (CollectionUtils.isNotEmpty(projectList)) {
			return ecmsProjectConverter.convertProject(projectList);
		}
		return null;
	}
}
