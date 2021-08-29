package com.ecms.eipl.service;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecms.eipl.converter.ECMSPaymentDetailsConverter;
import com.ecms.eipl.dao.ECMSPaymentDetailsDao;
import com.ecms.eipl.data.PaymentDetailsData;
import com.ecms.eipl.data.ProjectPaymentDetailsData;
import com.ecms.eipl.entity.PaymentDetails;
import com.ecms.eipl.entity.ProjectPaymentDetails;

public class ECMSPaymentDetailsServiceImpl implements ECMSPaymentDetailsService {

	private static final Logger logger = Logger.getLogger(ECMSPaymentDetailsServiceImpl.class);

	@Autowired
	ECMSPaymentDetailsDao ECMSPaymentDetailsDao;

	@Autowired
	ECMSPaymentDetailsConverter ecmsPaymentDetailsConverter;

	@Override
	public List<PaymentDetailsData> getAllClientPayments(int clientId) {
		List<PaymentDetails> paymentList = ECMSPaymentDetailsDao.getAllClientPayments(clientId);
		if (CollectionUtils.isNotEmpty(paymentList)) {
			return ecmsPaymentDetailsConverter.convertClientPaymentDetails(paymentList);
		}
		return null;
	}

	@Override
	public List<ProjectPaymentDetailsData> getProjectPayment(int projectId) {
		List<ProjectPaymentDetails> projectPaymentList = ECMSPaymentDetailsDao.getAllProjectPayments(projectId);
		if (CollectionUtils.isNotEmpty(projectPaymentList)) {
			return ecmsPaymentDetailsConverter.convertProjectPaymentDetails(projectPaymentList);
		}
		return null;
	}

}
