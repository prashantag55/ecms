package com.ecms.eipl.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecms.eipl.service.ECMSBillsService;

@Controller
@RequestMapping(value = { "/bills", "/bills/{clientId}" })
public class ECMSBillsController {

	private static final Logger logger = Logger.getLogger(ECMSBillsController.class);

	@Autowired
	private ECMSBillsService ecmsBillsService;

	/**
	 * Handle request to download a PDF document
	 */
	@RequestMapping(value = "/getPdfBill", method = RequestMethod.GET)
	public ModelAndView downloadExcel() {

		return new ModelAndView("pdfView", "billData", null);
	}
}
