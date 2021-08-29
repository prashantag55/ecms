package com.ecms.eipl.converter;

import java.util.List;

import com.ecms.eipl.data.EmployeeData;
import com.ecms.eipl.data.SalaryData;
import com.ecms.eipl.entity.Employee;
import com.ecms.eipl.entity.Salary;

public interface ECMSEmployeeConverter {

	List<EmployeeData> convertEmployee(List<Employee> employeeList);

	EmployeeData convertEmployeeDetails(Employee employee);

	Employee convertEmployeeData(EmployeeData employeeData);

	Salary convertSalaryData(SalaryData salaryData);

	SalaryData convertSalary(Salary salary);

	List<SalaryData> convertSalaryList(List<Salary> salaryList);
}
