package com.ecms.eipl.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ecms.eipl.data.EmployeeData;
import com.ecms.eipl.entity.Employee;

public class ECMSEmployeeConverterImpl implements ECMSEmployeeConverter {

	private static final Logger logger = Logger.getLogger(ECMSEmployeeConverterImpl.class);

	@Override
	public List<EmployeeData> convertEmployee(List<Employee> employeeList) {
		List<EmployeeData> employeeDataList = new ArrayList<>();
		for (Employee employee : employeeList) {
			employeeDataList.add(convertEmployeeDetails(employee));
		}
		return null;
	}

	@Override
	public EmployeeData convertEmployeeDetails(Employee employee) {

		EmployeeData employeeData = new EmployeeData();
		employeeData.setCurrentAddress(employee.getCurrentAddress());
		employeeData.setDesignation(employee.getDesignation());
		employeeData.setEmail(employee.getEmail());
		employeeData.setEmMobileNumber(employee.getEmMobileNumber());
		employeeData.setEmpId(employee.getEmpId());
		employeeData.setJoiningDate(employee.getJoiningDate());
		employeeData.setLastDate(employee.getLastDate());
		employeeData.setMobileNumber(employee.getMobileNumber());
		employeeData.setMonthlySalary(employee.getMonthlySalary());
		employeeData.setName(employee.getName());
		employeeData.setPermanentAddress(employee.getPermanentAddress());

		return employeeData;
	}

	@Override
	public Employee convertEmployeeData(EmployeeData employeeData) {
		
		Employee employee = new Employee();
		employee.setCurrentAddress(employeeData.getCurrentAddress());
		employee.setDesignation(employeeData.getDesignation());
		employee.setEmail(employeeData.getEmail());
		employee.setEmMobileNumber(employeeData.getEmMobileNumber());
		employee.setEmpId(employeeData.getEmpId());
		employee.setJoiningDate(employeeData.getJoiningDate());
		employee.setLastDate(employeeData.getLastDate());
		employee.setMobileNumber(employeeData.getMobileNumber());
		employee.setMonthlySalary(employeeData.getMonthlySalary());
		employee.setName(employeeData.getName());
		employee.setPermanentAddress(employeeData.getPermanentAddress());

		return employee;
	}

}
