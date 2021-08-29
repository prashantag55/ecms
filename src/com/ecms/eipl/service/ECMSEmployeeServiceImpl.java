package com.ecms.eipl.service;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecms.eipl.converter.ECMSEmployeeConverter;
import com.ecms.eipl.dao.ECMSEmployeeDao;
import com.ecms.eipl.data.EmployeeData;
import com.ecms.eipl.data.SalaryData;
import com.ecms.eipl.entity.Employee;
import com.ecms.eipl.entity.Salary;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ECMSEmployeeServiceImpl implements ECMSEmployeeService {

	private static final Logger logger = Logger.getLogger(ECMSEmployeeServiceImpl.class);
	@Autowired
	private ECMSEmployeeDao ecmsEmployeeDao;

	@Autowired
	private ECMSEmployeeConverter ecmsEmployeeConverter;

	@Override
	public List<EmployeeData> listEmployeess() {
		List<Employee> employeeList = ecmsEmployeeDao.listEmployeess();
		return ecmsEmployeeConverter.convertEmployee(employeeList);
	}

	@Override
	public EmployeeData getEmployee(int employeeId) {
		Employee employee = ecmsEmployeeDao.getEmployee(employeeId);
		EmployeeData employeeData = ecmsEmployeeConverter.convertEmployeeDetails(employee);

		List<Salary> salaryList = ecmsEmployeeDao.getEmployeeSalaryList(employeeId);
		if (CollectionUtils.isNotEmpty(salaryList)) {
			List<SalaryData> salaryDataList = ecmsEmployeeConverter.convertSalaryList(salaryList);
			employeeData.setSalaryDataList(salaryDataList);
		}
		return employeeData;
	}

	@Override
	public List<EmployeeData> saveorUpdateEmployeeData(EmployeeData employeeData) {

		Employee employee = ecmsEmployeeConverter.convertEmployeeData(employeeData);
		ecmsEmployeeDao.saveorUpdateEmployee(employee);
		return null;
	}

	@Override
	public List<EmployeeData> saveorUpdateEmployeeSalaryData(List<SalaryData> salaryDataList) {

		for (SalaryData salaryData : salaryDataList) {
			Employee empData = ecmsEmployeeDao.getEmployee(salaryData.getEmpId());

			double totalAmount = calculateMonthlySalary(empData.getMonthlySalary(), salaryData.getOtDays(),
					salaryData.getOtHour(), salaryData.getOtMin());
			salaryData.setAmountTotal(totalAmount);

			Salary salary = ecmsEmployeeConverter.convertSalaryData(salaryData);
			ecmsEmployeeDao.createSalary(salary);
		}
		return null;
	}

	private double calculateMonthlySalary(double monthlySalary, int otDays, int otHour, int otMin) {
		double oneDaySalary = monthlySalary * 12 / 365;

		if (otDays != 0) {
			double otDaysSalary = oneDaySalary * otDays;
			monthlySalary = monthlySalary + otDaysSalary;
		}

		if (otHour != 0) {
			double otHourSalary = (oneDaySalary / 24) * otHour;
			monthlySalary = monthlySalary + otHourSalary;
		}

		if (otDays != 0) {
			double otMinSalary = (oneDaySalary / 24 * 60) * otMin;
			monthlySalary = monthlySalary + otMinSalary;
		}

		double salary = Math.round(monthlySalary);
		return salary;
	}

}
