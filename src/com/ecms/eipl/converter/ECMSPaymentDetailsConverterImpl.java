package com.ecms.eipl.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ecms.eipl.data.PaymentDetailsData;
import com.ecms.eipl.entity.PaymentDetails;

public class ECMSPaymentDetailsConverterImpl implements ECMSPaymentDetailsConverter {

	private static final Logger logger = Logger.getLogger(ECMSPaymentDetailsConverterImpl.class);

	@Override
	public List<PaymentDetailsData> convertPaymentDetails(List<PaymentDetails> paymentList) {
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
		return null;
	}

}
