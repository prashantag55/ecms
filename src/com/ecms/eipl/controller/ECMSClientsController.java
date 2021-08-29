package com.ecms.eipl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecms.eipl.data.ClientsData;
import com.ecms.eipl.service.ECMSClientService;

@Controller
@RequestMapping(value = { "/clients", "/clients/{clientId}" })
public class ECMSClientsController {

	private static final Logger logger = Logger.getLogger(ECMSClientsController.class);

	@Autowired
	private ECMSClientService ecmsClientService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getClients(@PathVariable(required = false) Integer clientId) {

		Map<String, Object> model = new HashMap<String, Object>();
		if (clientId != null) {
			logger.info("Get client Details for client : " + clientId);
			model.put("clients", ecmsClientService.getClientDetails(clientId));
			return new ModelAndView("clientDetails", model);
		} else {
			model.put("clients", ecmsClientService.listClients());
			return new ModelAndView("clientsList", model);
		}
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addClient(@ModelAttribute("command") ClientsData clientsData, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("clients", ecmsClientService.listClients());
		return new ModelAndView("clientDetails", model);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveClient(@ModelAttribute("command") ClientsData clientsData, BindingResult result) {
		List<ClientsData> clients = ecmsClientService.saveorUpdateClient(clientsData);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("clients", clients);
		return new ModelAndView("clientsList", model);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editClient(@ModelAttribute("command") ClientsData clientsData, BindingResult result) {
		List<ClientsData> clients = ecmsClientService.saveorUpdateClient(clientsData);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("clients", clients);
		return new ModelAndView("clientDetails", model);
	}

}
