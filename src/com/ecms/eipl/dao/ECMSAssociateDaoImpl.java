package com.ecms.eipl.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecms.eipl.entity.Associates;
import com.ecms.eipl.entity.ProjectAssociatePayment;
import com.ecms.eipl.entity.ProjectServices;

public class ECMSAssociateDaoImpl implements ECMSAssociateDao {

	private static final Logger logger = Logger.getLogger(ECMSAssociateDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ProjectAssociatePayment> getAssociatePayment(int projectId) {
		TypedQuery<ProjectAssociatePayment> query = sessionFactory.getCurrentSession()
				.createQuery("from ProjectAssociatePayment where project = :project", ProjectAssociatePayment.class);
		query.setParameter("project", projectId);
		return query.getResultList();
	}

	@Override
	public List<ProjectServices> getAssociateService(int projectId) {
		TypedQuery<ProjectServices> query = sessionFactory.getCurrentSession()
				.createQuery("from ProjectServices  where project = :project", ProjectServices.class);
		query.setParameter("project", projectId);
		return query.getResultList();
	}

	@Override
	public List<Associates> getAllAssociates() {
		TypedQuery<Associates> query = sessionFactory.getCurrentSession().createQuery("from Associates",
				Associates.class);
		return query.getResultList();
	}

}
