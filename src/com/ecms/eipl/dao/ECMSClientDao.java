package com.ecms.eipl.dao;

import java.util.List;

import com.ecms.eipl.entity.Clients;

public interface ECMSClientDao {
	public List<Clients> listClient();

	public List<Clients> saveorUpdateClient(Clients clients);
	
	public Clients getClientDetails(int clientId);
}
