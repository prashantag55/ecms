package com.ecms.eipl.converter;

import java.util.List;

import com.ecms.eipl.data.ClientsData;
import com.ecms.eipl.entity.Clients;

public interface ECMSClientConverter {

	List<ClientsData> convertClient(List<Clients> clients);

	Clients convertClientData(ClientsData clientsData);

	ClientsData convertClientDetails(Clients clients);

}
