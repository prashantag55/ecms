package com.ecms.eipl.service;

import java.util.List;

import com.ecms.eipl.data.EmployeeData;
import com.ecms.eipl.data.SalaryData;


public interface ECMSEmployeeService {


	public List<EmployeeData> listEmployeess();

	public EmployeeData getEmployee(int employeeId);

	public List<EmployeeData> saveorUpdateEmployeeData(EmployeeData employeeData);
	
	public List<EmployeeData> saveorUpdateEmployeeSalaryData( List<SalaryData> salaryDataList);
}
