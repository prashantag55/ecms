package com.ecms.eipl.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecms.eipl.entity.Employee;
import com.ecms.eipl.entity.Salary;

public class ECMSEmployeeDaoImpl implements ECMSEmployeeDao {

	private static final Logger logger = Logger.getLogger(ECMSEmployeeDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	public void saveorUpdateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> listEmployeess() {
		return (List<Employee>) sessionFactory.getCurrentSession().createQuery("from Employee ", Employee.class);
	}

	public Employee getEmployee(int empid) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, empid);
	}

	@Override
	public void createSalary(Salary salary) {
		sessionFactory.getCurrentSession().saveOrUpdate(salary);

	}

	@Override
	public List<Salary> getEmployeeSalaryList(int employeeId) {
		TypedQuery<Salary> query = sessionFactory.getCurrentSession()
				.createQuery("from Salary where employee = :employee", Salary.class);
		query.setParameter("employee", employeeId);
		return query.getResultList();
	}

}
