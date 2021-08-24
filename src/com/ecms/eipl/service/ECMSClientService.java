package com.ecms.eipl.service;

import java.util.List;

import com.ecms.eipl.data.ClientsData;

public interface ECMSClientService {

	public List<ClientsData> listClients();

	public List<ClientsData> saveorUpdateClient(ClientsData clientData);

	public ClientsData getClientDetails(int clientId);

}
