package com.ecms.eipl.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ecms.eipl.data.PaymentDetailsData;
import com.ecms.eipl.data.ProjectPaymentDetailsData;
import com.ecms.eipl.entity.PaymentDetails;
import com.ecms.eipl.entity.ProjectPaymentDetails;

public class ECMSPaymentDetailsConverterImpl implements ECMSPaymentDetailsConverter {

	private static final Logger logger = Logger.getLogger(ECMSPaymentDetailsConverterImpl.class);

	@Override
	public List<PaymentDetailsData> convertClientPaymentDetails(List<PaymentDetails> paymentList) {
		List<PaymentDetailsData> paymentDetailsDataList = new ArrayList<>();

		for (PaymentDetails paymentDetails : paymentList) {
			PaymentDetailsData paymentDetailsData = new PaymentDetailsData();
			paymentDetailsData.setAmount(paymentDetails.getAmount());
			paymentDetailsData.setClient(paymentDetails.getClient());
			paymentDetailsData.setDate(paymentDetails.getDate());
			paymentDetailsData.setId(paymentDetails.getId());
			paymentDetailsData.setPaymentDetails(paymentDetails.getPaymentDetails());
			paymentDetailsData.setPaymentMode(paymentDetails.getPaymentMode());

			paymentDetailsDataList.add(paymentDetailsData);

		}
		return paymentDetailsDataList;
	}

	@Override
	public List<ProjectPaymentDetailsData> convertProjectPaymentDetails(
			List<ProjectPaymentDetails> projectPaymentList) {
		List<ProjectPaymentDetailsData> projectPaymentDetailsDataList = new ArrayList<>();

		for (ProjectPaymentDetails projectPaymentDetails : projectPaymentList) {
			ProjectPaymentDetailsData projectPaymentDetailsData = new ProjectPaymentDetailsData();

			projectPaymentDetailsData.setAmount(projectPaymentDetails.getAmount());
			projectPaymentDetailsData.setBills(projectPaymentDetails.getBills());
			projectPaymentDetailsData.setClient(projectPaymentDetails.getClient());
			projectPaymentDetailsData.setDate(projectPaymentDetails.getDate());
			projectPaymentDetailsData.setId(projectPaymentDetails.getId());
			projectPaymentDetailsData.setPaymentDetails(projectPaymentDetails.getPaymentDetails());
			projectPaymentDetailsData.setPaymentMode(projectPaymentDetails.getPaymentMode());
			projectPaymentDetailsData.setProject(projectPaymentDetails.getProject());

			projectPaymentDetailsDataList.add(projectPaymentDetailsData);

		}
		return projectPaymentDetailsDataList;
	}

}
