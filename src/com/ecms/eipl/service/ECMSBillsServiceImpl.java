package com.ecms.eipl.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecms.eipl.converter.ECMSBillConverter;
import com.ecms.eipl.dao.ECMSBillDao;
import com.ecms.eipl.data.BillsData;
import com.ecms.eipl.entity.Bills;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ECMSBillsServiceImpl implements ECMSBillsService{

	private static final Logger logger = Logger.getLogger(ECMSBillsServiceImpl.class);
	@Autowired
	private ECMSBillDao ecmsBillDao;

	@Autowired
	private ECMSBillConverter ecmsBillConverter;

	@Override
	public List<BillsData> listBills() {
		List<Bills> billsList = ecmsBillDao.listBills();
		return ecmsBillConverter.convertBills(billsList);
	}

	@Override
	public List<BillsData> getClientBillsList(int clientId) {
		List<Bills> billsList = ecmsBillDao.getClientBills(clientId);
		return ecmsBillConverter.convertBills(billsList);
	}

	@Override
	public List<BillsData> getProjectBillsList(int projectId) {
		List<Bills> billsList = ecmsBillDao.getProjectBills(projectId);
		return ecmsBillConverter.convertBills(billsList);
	}

	@Override
	public List<BillsData> saveorUpdateBill(BillsData billsData) {
		Bills bills = ecmsBillConverter.convertBillData(billsData);
		ecmsBillDao.saveorUpdateBill(bills);
		return null;
	}

}
