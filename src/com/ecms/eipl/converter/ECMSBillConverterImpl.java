package com.ecms.eipl.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ecms.eipl.data.BillsData;
import com.ecms.eipl.data.ProjectAssociatePaymentData;
import com.ecms.eipl.data.ProjectPaymentDetailsData;
import com.ecms.eipl.entity.Bills;
import com.ecms.eipl.entity.ProjectAssociatePayment;
import com.ecms.eipl.entity.ProjectPaymentDetails;

public class ECMSBillConverterImpl implements ECMSBillConverter {

	private static final Logger logger = Logger.getLogger(ECMSBillConverterImpl.class);

	@Override
	public List<BillsData> convertBills(List<Bills> billList) {

		List<BillsData> billsDataList = new ArrayList<>();
		for (Bills bills : billList) {
			billsDataList.add(convertBill(bills));
		}
		return billsDataList;
	}

	@Override
	public Bills convertBillData(BillsData billsData) {
		Bills bills = new Bills();
		bills.setBillPath(billsData.getBillPath());
		bills.setBillType(billsData.getBillType());
		bills.setCgst(billsData.getCgst());
		bills.setClient(billsData.getClient());
		bills.setDate(billsData.getDate());
		bills.setFees(billsData.getFees());
		bills.setIgst(billsData.getIgst());
		bills.setInvoiceNumber(billsData.getInvoiceNumber());
		bills.setPaymentDetails(billsData.getPaymentDetails());
		bills.setPaymentMode(billsData.getPaymentMode());
		bills.setProject(billsData.getProject());
		bills.setSgst(billsData.getSgst());
		bills.setStatus(billsData.getStatus());
		bills.setTds(billsData.getTds());
		bills.setTdsPaid(billsData.isTdsPaid());
		return bills;
	}

	@Override
	public BillsData convertBill(Bills bill) {
		BillsData billsData = new BillsData();
		billsData.setBillPath(bill.getBillPath());
		billsData.setBillType(bill.getBillType());
		billsData.setCgst(bill.getCgst());
		billsData.setClient(bill.getClient());
		billsData.setDate(bill.getDate());
		billsData.setFees(bill.getFees());
		billsData.setIgst(bill.getIgst());
		billsData.setInvoiceNumber(bill.getInvoiceNumber());
		billsData.setPaymentDetails(bill.getPaymentDetails());
		billsData.setPaymentMode(bill.getPaymentMode());
		billsData.setProject(bill.getProject());
		billsData.setSgst(bill.getSgst());
		billsData.setStatus(bill.getStatus());
		billsData.setTds(bill.getTds());
		billsData.setTdsPaid(bill.isTdsPaid());
		return billsData;
	}

	@Override
	public List<ProjectPaymentDetailsData> convertProjectPayment(List<ProjectPaymentDetails> projectPaymentList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectAssociatePaymentData> convertAsssociatePayment(
			List<ProjectAssociatePayment> associatePaymentList) {
		// TODO Auto-generated method stub
		return null;
	}
}
