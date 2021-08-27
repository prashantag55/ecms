package com.ecms.eipl.converter;

import java.util.List;

import com.ecms.eipl.data.BillsData;
import com.ecms.eipl.entity.Bills;

public interface ECMSBillConverter {

	List<BillsData> convertBills(List<Bills> billList);

	Bills convertBillData(BillsData billsData);

	BillsData convertBill(Bills bill);

}
