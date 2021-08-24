package com.ecms.eipl.dao;

import java.util.List;

import com.ecms.eipl.entity.PaymentDetails;

public interface ECMSPaymentDetailsDao {

	List<PaymentDetails> getAllPayments(int clientId);


}
