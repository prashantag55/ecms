package com.ecms.eipl.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecms.eipl.entity.PaymentDetails;
import com.ecms.eipl.entity.ProjectPaymentDetails;

public class ECMSPaymentDetailsDaoImpl implements ECMSPaymentDetailsDao {

	private static final Logger logger = Logger.getLogger(ECMSPaymentDetailsDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<PaymentDetails> getAllClientPayments(int clientId) {
		TypedQuery<PaymentDetails> query = sessionFactory.getCurrentSession()
				.createQuery("from PaymentDetails where client = :client", PaymentDetails.class);
		query.setParameter("client", clientId);
		return query.getResultList();
	}

	@Override
	public List<ProjectPaymentDetails> getAllProjectPayments(int projectId) {
		TypedQuery<ProjectPaymentDetails> query = sessionFactory.getCurrentSession()
				.createQuery("from ProjectPaymentDetails where project = :project", ProjectPaymentDetails.class);
		query.setParameter("project", projectId);
		return query.getResultList();
	}

}
