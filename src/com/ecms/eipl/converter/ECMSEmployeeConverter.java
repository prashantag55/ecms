package com.ecms.eipl.converter;

import java.util.List;

import com.ecms.eipl.data.EmployeeData;
import com.ecms.eipl.entity.Employee;

public interface ECMSEmployeeConverter {

	List<EmployeeData> convertEmployee(List<Employee> employeeList);

	EmployeeData convertEmployeeDetails(Employee employee);

	Employee convertEmployeeData(EmployeeData employeeData);
}
