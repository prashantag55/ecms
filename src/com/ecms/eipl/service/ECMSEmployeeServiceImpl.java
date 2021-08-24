package com.ecms.eipl.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecms.eipl.converter.ECMSEmployeeConverter;
import com.ecms.eipl.dao.ECMSEmployeeDao;
import com.ecms.eipl.data.EmployeeData;
import com.ecms.eipl.entity.Employee;

@Service("employeeService")

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
		return ecmsEmployeeConverter.convertEmployeeDetails(employee);
	}

	@Override
	public List<EmployeeData> saveorUpdateEmployeeData(EmployeeData employeeData) {

		Employee employee = ecmsEmployeeConverter.convertEmployeeData(employeeData);
		ecmsEmployeeDao.saveorUpdateEmployee(employee);
		return null;
	}

}
