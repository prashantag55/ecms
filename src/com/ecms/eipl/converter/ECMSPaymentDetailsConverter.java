package com.ecms.eipl.converter;

import java.util.List;

import com.ecms.eipl.data.PaymentDetailsData;
import com.ecms.eipl.data.ProjectPaymentDetailsData;
import com.ecms.eipl.entity.PaymentDetails;
import com.ecms.eipl.entity.ProjectPaymentDetails;

public interface ECMSPaymentDetailsConverter {

	List<PaymentDetailsData> convertClientPaymentDetails(List<PaymentDetails> paymentList);

	List<ProjectPaymentDetailsData> convertProjectPaymentDetails(List<ProjectPaymentDetails> projectPaymentList);

}
