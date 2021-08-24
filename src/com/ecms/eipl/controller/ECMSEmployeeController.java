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

import com.ecms.eipl.data.EmployeeData;
import com.ecms.eipl.service.ECMSEmployeeService;

@Controller
@RequestMapping(value = { "/employee", "/employee/{id}" })
public class ECMSEmployeeController {
	@Autowired
	private ECMSEmployeeService ecmsEmployeeService;

	private static final Logger logger = Logger.getLogger(ECMSEmployeeController.class);

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listEmployee(@PathVariable(required = false) Integer employeeId) {

		Map<String, Object> model = new HashMap<String, Object>();
		if (employeeId != null) {
			model.put("employee", ecmsEmployeeService.getEmployee(employeeId));
			return new ModelAndView("employeeList", model);
		} else {
			model.put("employee", ecmsEmployeeService.listEmployeess());
			return new ModelAndView("employeeList", model);
		}
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addClient(@ModelAttribute("command") EmployeeData employeeData, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("clients", ecmsEmployeeService.listEmployeess());
		return new ModelAndView("ClientsList", model);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveClient(@ModelAttribute("command") EmployeeData employeeData, BindingResult result) {
		List<EmployeeData> clients = ecmsEmployeeService.saveorUpdateEmployeeData(employeeData);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("clients", clients);
		return new ModelAndView("ClientsList", model);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editClient(@ModelAttribute("command") EmployeeData employeeData, BindingResult result) {
		List<EmployeeData> clients = ecmsEmployeeService.saveorUpdateEmployeeData(employeeData);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("clients", clients);
		return new ModelAndView("ClientsList", model);
	}

}
