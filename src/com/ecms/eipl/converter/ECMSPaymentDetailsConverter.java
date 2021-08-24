package com.ecms.eipl.converter;

import java.util.List;

import com.ecms.eipl.data.PaymentDetailsData;
import com.ecms.eipl.entity.PaymentDetails;

public interface ECMSPaymentDetailsConverter {

	List<PaymentDetailsData> convertPaymentDetails(List<PaymentDetails> paymentList);

}
