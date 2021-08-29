package com.ecms.eipl.dao;

import java.util.List;

import com.ecms.eipl.entity.PaymentDetails;
import com.ecms.eipl.entity.ProjectPaymentDetails;

public interface ECMSPaymentDetailsDao {

	List<PaymentDetails> getAllClientPayments(int clientId);

	List<ProjectPaymentDetails> getAllProjectPayments(int projectId);

}
