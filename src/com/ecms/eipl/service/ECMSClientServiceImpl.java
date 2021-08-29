package com.ecms.eipl.service;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecms.eipl.converter.ECMSClientConverter;
import com.ecms.eipl.dao.ECMSClientDao;
import com.ecms.eipl.data.BillsData;
import com.ecms.eipl.data.ClientsData;
import com.ecms.eipl.data.PaymentDetailsData;
import com.ecms.eipl.data.ProjectData;
import com.ecms.eipl.entity.Clients;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ECMSClientServiceImpl implements ECMSClientService {

	private static final Logger logger = Logger.getLogger(ECMSClientServiceImpl.class);

	@Autowired
	private ECMSClientDao ecmsClientDao;

	@Autowired
	private ECMSClientConverter ecmsClientConverter;

	@Autowired
	private ECMSProjectService ecmsProjectService;

	@Autowired
	private ECMSBillsService ecmsBillsService;

	@Autowired
	private ECMSPaymentDetailsService ecmsPaymentDetailsService;

	@Override
	public List<ClientsData> listClients() {
		List<Clients> clients = ecmsClientDao.listClient();
		logger.info("All client List Size : " + clients.size());
		if (CollectionUtils.isNotEmpty(clients)) {
			return ecmsClientConverter.convertClient(clients);
		}
		return null;
	}

	@Override
	public List<ClientsData> saveorUpdateClient(ClientsData clientData) {
		Clients client = ecmsClientConverter.convertClientData(clientData);
		List<Clients> clients = ecmsClientDao.saveorUpdateClient(client);
		return ecmsClientConverter.convertClient(clients);
	}

	@Override
	public ClientsData getClientDetails(int clientId) {

		Clients clients = ecmsClientDao.getClientDetails(clientId);
		ClientsData clientsData = ecmsClientConverter.convertClientDetails(clients);

		List<ProjectData> projectDataList = ecmsProjectService.getClientProjectList(clientId);
		if (CollectionUtils.isNotEmpty(projectDataList)) {
			clientsData.setProjectDataList(projectDataList);

			List<PaymentDetailsData> paymentDetailsDataList = ecmsPaymentDetailsService.getAllClientPayments(clientId);
			if (CollectionUtils.isNotEmpty(paymentDetailsDataList)) {
				clientsData.setPaymentDetailsDataList(paymentDetailsDataList);
			}

			List<BillsData> billDataList = ecmsBillsService.getClientBillsList(clientId);
			if (CollectionUtils.isNotEmpty(billDataList)) {
				clientsData.setBillsDataList(billDataList);
			}
		}
		return clientsData;
	}
}
