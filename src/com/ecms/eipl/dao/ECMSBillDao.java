package com.ecms.eipl.dao;

import java.util.List;

import com.ecms.eipl.entity.Bills;

public interface ECMSBillDao {

	List<Bills> listBills();

	void saveorUpdateBill(Bills bills);

	List<Bills> getClientBills(int clientId);

	List<Bills> getProjectBills(int projectId);

}
