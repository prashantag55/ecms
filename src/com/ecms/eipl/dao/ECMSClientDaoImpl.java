package com.ecms.eipl.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecms.eipl.entity.Clients;
import com.ecms.eipl.entity.ContactPerson;

public class ECMSClientDaoImpl implements ECMSClientDao {

	private static final Logger logger = Logger.getLogger(ECMSClientDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Clients> listClient() {
		TypedQuery<Clients> query = sessionFactory.getCurrentSession().createQuery("from Clients");
		return query.getResultList();

	}

	@Override
	public List<Clients> saveorUpdateClient(Clients clients) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(clients);
		for (ContactPerson contactPerson : clients.getContactPerson()) {
			session.saveOrUpdate(contactPerson);
		}
		tx.commit();
		TypedQuery<Clients> query = session.createQuery("from Clients");
		return query.getResultList();
	}

	@Override
	public Clients getClientDetails(int clientId) {

		TypedQuery<Clients> query = sessionFactory.getCurrentSession()
				.createQuery("from Clients where clientId= :clientId");
		query.setParameter("clientId", clientId);
		logger.info("Check client details size :" + query.getResultList().size());
		return query.getResultList().get(0);
	}

}
