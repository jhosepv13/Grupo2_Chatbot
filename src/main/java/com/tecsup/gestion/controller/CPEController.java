package com.tecsup.gestion.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.model.Admin;
import com.tecsup.gestion.model.CPE;
import com.tecsup.gestion.model.CT;
import com.tecsup.gestion.services.CPEService;

@Controller
public class CPEController {
	
	private static final Logger logger = LoggerFactory.getLogger(CPEController.class);
	
	@Autowired
	private CPEService cpeService;
	
	@Autowired
	private ApplicationContext context;
	
	////////////////////////
	//LIST CPE
	////////////////////////
	
	@GetMapping("/admin/cpe/list")
	public String list(@ModelAttribute("SpringWeb") Admin admin, ModelMap model) {
	
	try {
	model.addAttribute("car_cpe", cpeService.findAllCPE());
	} catch (Exception e) {
	logger.info(e.getMessage());
	model.addAttribute("message", e.getMessage());
	}
	
	return "admin/cpe/list";
	}
	
	@GetMapping("/{cpe_id}")
	public ModelAndView home(@PathVariable int cpe_id, ModelMap model) {
	
	ModelAndView modelAndView = null;
	CPE cpe = new CPE();
	try {
	cpe = cpeService.findCPE(cpe_id);
	logger.info(cpe.toString());
	} catch (Exception e) {
	e.printStackTrace();
	}
	
	modelAndView = new ModelAndView("home", "command", cpe);
	
	return modelAndView;
	}
	
	
	////////////////////////
	//EDIT - CPE
	////////////////////////
	
	@GetMapping("/admin/cpe/{action}/{cpe_id}")
	public ModelAndView form(@PathVariable String action, @PathVariable int cpe_id, ModelMap model) {
	
	// action = {"editform","deleteform"}
	logger.info("action = " + action);
	ModelAndView modelAndView = null;
	
	try {
	CPE cpe = cpeService.findCPE(cpe_id);
	logger.info(cpe.toString());
	modelAndView = new ModelAndView("admin/cpe/" + action, "carreraCPE", cpe);
	} catch (Exception e) {
	model.addAttribute("message", e.getMessage());
	modelAndView = new ModelAndView("admin/cpe/" + action, "carreraCPE", new CPE());
	}
	
	return modelAndView;
	}
	
	////////////////////////
	//EDIT 2 - CPE
	////////////////////////
	
	@PostMapping("/admin/cpe/editsave")
	public ModelAndView editsave(@ModelAttribute("carreraCPE")@Valid CPE cpe, BindingResult result, ModelMap model) {
	
	ModelAndView modelAndView = null;
	
	if (result.hasErrors()) {
	modelAndView = new ModelAndView("admin/cpe/editform","carreraCPE", cpe);
	}else {
	try {
	/*employeeService.update(emp.getLogin(), emp.getPassword(), emp.getFirstname(), emp.getLastname(),
	emp.getSalary(), -1);*/
	
	cpeService.update(cpe.getNombre(), cpe.getFecha_ini(), cpe.getSede(), cpe.getDescripcion(), cpe.getObjetivo()
			, cpe.getTemario(), cpe.getDuracion(), cpe.getArea(), cpe.getTipo(), cpe.getPrecio());
	
	modelAndView = new ModelAndView("redirect:/admin/cpe/list");
	} catch (Exception e) {
	model.addAttribute("message", e.getMessage());
	modelAndView = new ModelAndView("admin/cpe/editform","carreraCPE", cpe);
	}
	}
	return modelAndView;
	}
	
	////////////////////////
	//DELETE - CPE
	////////////////////////
	
	@PostMapping("/admin/cpe/delete")
	public ModelAndView delete(@ModelAttribute("carreraCPE")@Valid CPE cpe, BindingResult result , ModelMap model) {
	
	ModelAndView modelAndView = null;
	
	if(result.hasErrors()) {
	modelAndView = new ModelAndView("admin/cpe/deleteform/" + cpe.getCpd_id(), "carreraCPE", cpe);	
	}else {
		try {
		cpeService.delete(cpe.getNombre());
		modelAndView = new ModelAndView("redirect:/admin/cpe/list");
		}catch (Exception e) {
		model.addAttribute("message", e.getMessage());
		modelAndView = new ModelAndView("admin/cpe/deleteform", "carreraCPE", cpe );
		}
	}
	return modelAndView;	
	
	}
	
	////////////////////////
	//CREATE - CPE
	////////////////////////
	@GetMapping("/admin/cpe/createform")
	public ModelAndView createform() {
	
	CPE cpe = new CPE();
	
	ModelAndView modelAndView = new ModelAndView("admin/cpe/createform", "carreraCPE", cpe);
	
	return modelAndView;
	}
	
	@PostMapping("/admin/cpe/create")
	public ModelAndView create(@ModelAttribute("carreraCPE") @Valid CPE cpe, BindingResult result, ModelMap model) {
	
	// String msg = context.getMessage("employee.salary.min", null, Locale.US);
	// logger.info("message = " + msg);
	
	ModelAndView modelAndView = null;
	
	if (result.hasErrors()) {
	
	logger.info("result.getAllErrors();= " + result.getAllErrors());
	
	for (ObjectError error : result.getAllErrors()) {
	String theMessage = context.getMessage(error.getCode(), error.getArguments(), Locale.US);
	logger.info(error.getCode() + " = " + theMessage);
	}
	
	modelAndView = new ModelAndView("admin/cpe/createform", "carreraCPE", cpe);
	
	} else {
		try {
		cpeService.create(cpe.getNombre(), cpe.getFecha_ini(), cpe.getSede(), cpe.getDescripcion(), cpe.getObjetivo()
				, cpe.getTemario(), cpe.getDuracion(), cpe.getArea(), cpe.getTipo(), cpe.getPrecio());
		logger.info("new Carrera Name = " + cpe.getNombre());
		modelAndView = new ModelAndView("redirect:/admin/cpe/list");
		
		} catch (DAOException e) {
		logger.error(e.getMessage());
		model.addAttribute("message", e.getMessage());
		modelAndView = new ModelAndView("admin/cpe/createform", "carreraCPE", cpe);
		}
	}
	//
	return modelAndView;
	}
	
}
