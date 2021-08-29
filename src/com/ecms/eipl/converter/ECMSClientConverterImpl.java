package com.ecms.eipl.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ecms.eipl.data.ClientsData;
import com.ecms.eipl.data.ContactDetailsData;
import com.ecms.eipl.entity.Clients;
import com.ecms.eipl.entity.ContactPerson;

public class ECMSClientConverterImpl implements ECMSClientConverter {

	private static final Logger logger = Logger.getLogger(ECMSClientConverterImpl.class);

	@Override
	public List<ClientsData> convertClient(List<Clients> clients) {

		List<ClientsData> clientDataList = new ArrayList<>();
		for (Clients client : clients) {
			clientDataList.add(convertClientDetails(client));
		}
		return clientDataList;
	}

	@Override
	public Clients convertClientData(ClientsData clientsData) {
		Clients clients = new Clients();
		clients.setClientId(clientsData.getClientId());
		clients.setAddress(clientsData.getAddress());
		clients.setClientName(clientsData.getClientName());
		clients.setGstNumber(clientsData.getGstNumber());
		clients.setPrimaryEmailId(clientsData.getPrimaryEmailId());
		clients.setOtherEmailId(clientsData.getOtherEmailId());
		clients.setRemarks(clientsData.getRemarks());
		clients.setWebsiteLink(clientsData.getWebsiteLink());
		List<ContactDetailsData> contactDataList = clientsData.getContactDetailsDataList();
		List<ContactPerson> contactList = new ArrayList<>();
		for (ContactDetailsData contactDetailData : contactDataList) {
			ContactPerson ContactPerson = new ContactPerson();
			ContactPerson.setContactPerson(contactDetailData.getContactName());
			ContactPerson.setContactNumber(contactDetailData.getContactNumber());
			ContactPerson.setId(contactDetailData.getContactId());
			contactList.add(ContactPerson);
		}
		clients.setContactPerson(contactList);
		return clients;
	}

	@Override
	public ClientsData convertClientDetails(Clients clients) {

		ClientsData clientsData = new ClientsData();
		clientsData.setClientId(clients.getClientId());
		clientsData.setAddress(clients.getAddress());
		clientsData.setClientName(clients.getClientName());
		clientsData.setGstNumber(clients.getGstNumber());
		clientsData.setPrimaryEmailId(clients.getPrimaryEmailId());
		clientsData.setOtherEmailId(clients.getOtherEmailId());
		clientsData.setRemarks(clients.getRemarks());
		clientsData.setWebsiteLink(clients.getWebsiteLink());
		List<ContactPerson> contactList = clients.getContactPerson();

		List<ContactDetailsData> ContactDataList = new ArrayList<>();
		for (ContactPerson contactPerson : contactList) {
			ContactDetailsData contactDetailsData = new ContactDetailsData();
			contactDetailsData.setContactName(contactPerson.getContactPerson());
			contactDetailsData.setContactNumber(contactPerson.getContactNumber());
			contactDetailsData.setContactId(contactPerson.getId());
			ContactDataList.add(contactDetailsData);
		}
		clientsData.setContactDetailsDataList(ContactDataList);

		return clientsData;
	}

}
