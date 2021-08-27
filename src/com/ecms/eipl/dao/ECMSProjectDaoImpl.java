package com.ecms.eipl.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecms.eipl.entity.Projects;

public class ECMSProjectDaoImpl implements ECMSProjectDao {

	private static final Logger logger = Logger.getLogger(ECMSProjectDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveorUpdateProject(Projects project) {
		sessionFactory.getCurrentSession().saveOrUpdate(project);

	}

	@Override
	public Projects getProject(int projectId) {
		return (Projects) sessionFactory.getCurrentSession().get(Projects.class, projectId);
	}

	@Override
	public List<Projects> getClientProject(int clientId) {
		TypedQuery<Projects> query = sessionFactory.getCurrentSession().createQuery("from Projects where client = :client");
		query.setParameter("client", clientId);
		return query.getResultList();
	}

	@Override
	public List<Projects> getAllProject() {
		TypedQuery<Projects> query = sessionFactory.getCurrentSession().createQuery("from Projects ");
		return query.getResultList();
	}

}
