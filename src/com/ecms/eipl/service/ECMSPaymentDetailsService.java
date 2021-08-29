package com.ecms.eipl.service;

import java.util.List;

import com.ecms.eipl.data.PaymentDetailsData;
import com.ecms.eipl.data.ProjectPaymentDetailsData;

public interface ECMSPaymentDetailsService {

	List<PaymentDetailsData> getAllClientPayments(int clientId);

	List<ProjectPaymentDetailsData> getProjectPayment(int projectId);

}
