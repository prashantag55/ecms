package com.ecms.eipl.dao;

import java.util.List;

import com.ecms.eipl.entity.Employee;

public interface ECMSEmployeeDao {

	public void saveorUpdateEmployee(Employee employee);

	public List<Employee> listEmployeess();

	public Employee getEmployee(int empid);

}
