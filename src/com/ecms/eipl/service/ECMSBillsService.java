package com.ecms.eipl.service;

import java.util.List;

import com.ecms.eipl.data.BillsData;

public interface ECMSBillsService {
	
	List<BillsData> listBills();
	
	List<BillsData> getClientBillsList(int clientId);
	
	List<BillsData> getProjectBillsList(int projectId);
	
	public List<BillsData> saveorUpdateBill(BillsData billsData);

}
