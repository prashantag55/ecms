package com.ecms.eipl.controller;

import java.util.HashMap;
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
import com.ecms.eipl.service.ECMSProjectService;

@Controller
@RequestMapping(value = { "/projects", "/projects/{id}" })
public class ECMSProjectsController {

	private static final Logger logger = Logger.getLogger(ECMSProjectsController.class);

	@Autowired
	private ECMSProjectService ecmsProjectService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listProjects(@PathVariable(required = false) Integer projectId) {
		Map<String, Object> model = new HashMap<String, Object>();
		if (projectId != null) {
			model.put("clients", ecmsProjectService.getProjectDetails(projectId));
			return new ModelAndView("projectDetails", model);
		} else {
			model.put("clients", ecmsProjectService.listProjects());
			return new ModelAndView("ProjectsList", model);
		}
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addProject(@ModelAttribute("command") ClientsData clientsData, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		// model.put("clients", ecmsClientService.listClients());
		return new ModelAndView("ClientsList", model);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveProject(@ModelAttribute("command") ClientsData clientsData, BindingResult result) {
//		List<ClientsData> clients= 	ecmsClientService.saveorUpdateClientData(clientsData);
		Map<String, Object> model = new HashMap<String, Object>();
		// model.put("clients", clients);
		return new ModelAndView("ClientsList", model);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editProject(@ModelAttribute("command") ClientsData clientsData, BindingResult result) {
		// List<ClientsData> clients=
		// ecmsClientService.saveorUpdateClientData(clientsData);
		Map<String, Object> model = new HashMap<String, Object>();
		// model.put("clients", clients);
		return new ModelAndView("ClientsList", model);
	}

}
