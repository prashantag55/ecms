package com.ecms.eipl.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecms.eipl.entity.Bills;

public class ECMSBillDaoImpl implements ECMSBillDao {
	private static final Logger logger = Logger.getLogger(ECMSBillDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Bills> listBills() {
		TypedQuery<Bills> query = sessionFactory.getCurrentSession().createQuery("from Bills");
		return query.getResultList();
	}

	@Override
	public void saveorUpdateBill(Bills bills) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		tx.commit();

	}

	@Override
	public List<Bills> getClientBills(int clientId) {
		TypedQuery<Bills> query = sessionFactory.getCurrentSession().createQuery("from Bills where client = :client");
		query.setParameter("client", clientId);
		return query.getResultList();
	}

	@Override
	public List<Bills> getProjectBills(int projectId) {
		TypedQuery<Bills> query = sessionFactory.getCurrentSession().createQuery("from Bills where project = :project");
		query.setParameter("project", projectId);
		return query.getResultList();
	}

}
