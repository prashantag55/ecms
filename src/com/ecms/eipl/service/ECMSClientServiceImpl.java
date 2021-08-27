package com.ecms.eipl.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecms.eipl.converter.ECMSClientConverter;
import com.ecms.eipl.converter.ECMSPaymentDetailsConverter;
import com.ecms.eipl.converter.ECMSProjectConverter;
import com.ecms.eipl.dao.ECMSClientDao;
import com.ecms.eipl.dao.ECMSPaymentDetailsDao;
import com.ecms.eipl.dao.ECMSProjectDao;
import com.ecms.eipl.data.ClientsData;
import com.ecms.eipl.data.PaymentDetailsData;
import com.ecms.eipl.data.ProjectData;
import com.ecms.eipl.entity.Clients;
import com.ecms.eipl.entity.PaymentDetails;
import com.ecms.eipl.entity.Projects;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ECMSClientServiceImpl implements ECMSClientService {

	private static final Logger logger = Logger.getLogger(ECMSClientServiceImpl.class);

	@Autowired
	private ECMSClientDao ecmsClientDao;

	@Autowired
	private ECMSClientConverter ecmsClientConverter;

	@Autowired
	private ECMSProjectDao ecmsProjectDao;

	@Autowired
	private ECMSProjectConverter ecmsProjectConverter;

	@Autowired
	private ECMSPaymentDetailsDao ecmsPaymentDetailsDao;

	@Autowired
	private ECMSPaymentDetailsConverter ecmsPaymentDetailsConverter;

	@Override
	public List<ClientsData> listClients() {
		List<Clients> clients = ecmsClientDao.listClient();
		logger.info("All client List Size : " + clients.size());
		return ecmsClientConverter.convertClient(clients);

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
		List<PaymentDetails> paymentList = ecmsPaymentDetailsDao.getAllPayments(clientId);
		List<PaymentDetailsData> paymentDetailsDataList = ecmsPaymentDetailsConverter
				.convertPaymentDetails(paymentList);
		clientsData.setPaymentDetailsDataList(paymentDetailsDataList);
		List<Projects> projectList = ecmsProjectDao.getClientProject(clientId);
		List<ProjectData> projectDataList = ecmsProjectConverter.convertProject(projectList);
		clientsData.setProjectDataList(projectDataList);
		return clientsData;
	}
}
