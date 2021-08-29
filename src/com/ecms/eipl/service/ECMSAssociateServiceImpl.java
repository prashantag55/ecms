package com.ecms.eipl.service;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecms.eipl.converter.ECMSAssociateConverter;
import com.ecms.eipl.dao.ECMSAssociateDao;
import com.ecms.eipl.data.AssociatesData;
import com.ecms.eipl.data.ProjectAssociatePaymentData;
import com.ecms.eipl.data.ProjectServicesData;
import com.ecms.eipl.entity.Associates;
import com.ecms.eipl.entity.ProjectAssociatePayment;
import com.ecms.eipl.entity.ProjectServices;

public class ECMSAssociateServiceImpl implements ECMSAssociateService {

	private static final Logger logger = Logger.getLogger(ECMSAssociateServiceImpl.class);

	@Autowired
	private ECMSAssociateDao ecmsAssociateDao;

	@Autowired
	private ECMSAssociateConverter ecmsAssociateConverter;

	@Override
	public List<ProjectServicesData> getProjectAssociatesService(int projectId) {
		List<ProjectServices> projectServicesList = ecmsAssociateDao.getAssociateService(projectId);
		if (CollectionUtils.isNotEmpty(projectServicesList)) {
			List<ProjectServicesData> projectServicesDataList = ecmsAssociateConverter
					.convertAssociateServices(projectServicesList);
			return projectServicesDataList;
		}
		return null;
	}

	@Override
	public List<ProjectAssociatePaymentData> getAssociatePayment(int projectId) {
		List<ProjectAssociatePayment> projectAssociatePaymentList = ecmsAssociateDao.getAssociatePayment(projectId);
		if (CollectionUtils.isNotEmpty(projectAssociatePaymentList)) {
			List<ProjectAssociatePaymentData> projectAssociatePaymentDataList = ecmsAssociateConverter
					.convertAssociatePaymentList(projectAssociatePaymentList);
			return projectAssociatePaymentDataList;
		}
		return null;
	}

	@Override
	public List<AssociatesData> getAllAssociate() {
		List<Associates> associatesList = ecmsAssociateDao.getAllAssociates();
		if (CollectionUtils.isNotEmpty(associatesList)) {
			List<AssociatesData> associatesDataList = ecmsAssociateConverter.convertAllAssociates(associatesList);
			return associatesDataList;
		}
		return null;
	}

}
