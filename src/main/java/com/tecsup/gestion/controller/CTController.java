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
import com.tecsup.gestion.model.CT;
import com.tecsup.gestion.model.PFR;
import com.tecsup.gestion.services.CTService;

@Controller
public class CTController {
	
	private static final Logger logger = LoggerFactory.getLogger(CTController.class);
	
	@Autowired
	private CTService ctService;
	
	@Autowired
	private ApplicationContext context;
	
	////////////////////////
	//LIST CT
	////////////////////////
	
	@GetMapping("/admin/ct/listct")
	public String list(@ModelAttribute("SpringWeb") Admin admin, ModelMap model) {
	
	try {
		model.addAttribute("car_ct", ctService.findAllCT());
		} catch (Exception e) {
		logger.info(e.getMessage());
		model.addAttribute("message", e.getMessage());
		}
	
		return "admin/ct/listct";
	}
	
	@GetMapping("/{ct_id}")
	public ModelAndView home(@PathVariable int ct_id, ModelMap model) {

		ModelAndView modelAndView = null;
		CT ct = new CT();
		try {
			ct = ctService.findCT(ct_id);
			logger.info(ct.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		modelAndView = new ModelAndView("home", "command", ct);

		return modelAndView;
	}
	
	
	
	////////////////////////
	//EDIT - CT
	////////////////////////
	
	@GetMapping("/admin/ct/{action}/{ct_id}")
	public ModelAndView form(@PathVariable String action, @PathVariable int ct_id, ModelMap model) {
	
	// action = {"editform","deleteform"}
	logger.info("action = " + action);
	ModelAndView modelAndView = null;
	
	try {
	CT ct = ctService.findCT(ct_id);
	logger.info(ct.toString());
	modelAndView = new ModelAndView("admin/ct/" + action, "carreraCT", ct);
	} catch (Exception e) {
	model.addAttribute("message", e.getMessage());
	modelAndView = new ModelAndView("admin/ct/" + action, "carreraCT", new CT());
	}
	
	return modelAndView;
	}
	
	////////////////////////
	//EDIT 2 - CT
	////////////////////////
	
	@PostMapping("/admin/ct/editsave")
	public ModelAndView editsave(@ModelAttribute("carreraCT")@Valid CT ct, BindingResult result, ModelMap model) {
	
	ModelAndView modelAndView = null;
	
	if (result.hasErrors()) {
		modelAndView = new ModelAndView("admin/ct/editformct","carreraCT", ct);
	}else {
			try {
			/*employeeService.update(emp.getLogin(), emp.getPassword(), emp.getFirstname(), emp.getLastname(),
				emp.getSalary(), -1);*/
			
			ctService.update(ct.getNombre(), ct.getDescripcion(), ct.getAspectos(), ct.getTipo(), ct.getSede(), ct.getImg_malla(), ct.getImg_tecnica());
			
			modelAndView = new ModelAndView("redirect:/admin/ct/listct");
			} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("admin/ct/editformct","carreraCT", ct);
			}
		}
		return modelAndView;
	}
	
	////////////////////////
	//DELETE - PFR
	////////////////////////
	
	@PostMapping("/admin/ct/delete")
	public ModelAndView delete(@ModelAttribute("carreraCT")@Valid CT ct, BindingResult result , ModelMap model) {
	
	ModelAndView modelAndView = null;
	
	if(result.hasErrors()) {
	modelAndView = new ModelAndView("admin/ct/deleteformct/" + ct.getCt_id(), "carreraCT", ct);	
	}else {
		try {
		ctService.delete(ct.getNombre());
		modelAndView = new ModelAndView("redirect:/admin/ct/listct");
		}catch (Exception e) {
		model.addAttribute("message", e.getMessage());
		modelAndView = new ModelAndView("admin/ct/deleteformct", "carreraCT", ct );
		}
	}
	return modelAndView;	
	
	}
	
	////////////////////////
	//CREATE - PFR
	////////////////////////
	@GetMapping("/admin/ct/createformct")
	public ModelAndView createform() {
	
		CT ct = new CT();
	
		ModelAndView modelAndView = new ModelAndView("admin/ct/createformct", "carreraCT", ct);
	
		return modelAndView;
	}
	
	@PostMapping("/admin/ct/create")
	public ModelAndView create(@ModelAttribute("carreraCT") @Valid CT ct, BindingResult result, ModelMap model) {
	
	// String msg = context.getMessage("employee.salary.min", null, Locale.US);
	// logger.info("message = " + msg);
	
	ModelAndView modelAndView = null;
	
	if (result.hasErrors()) {
	
	logger.info("result.getAllErrors();= " + result.getAllErrors());
	
	for (ObjectError error : result.getAllErrors()) {
	String theMessage = context.getMessage(error.getCode(), error.getArguments(), Locale.US);
	logger.info(error.getCode() + " = " + theMessage);
	}
	
	modelAndView = new ModelAndView("admin/ct/createformct", "carreraCT", ct);
	
	} else {
		try {
		ctService.create(ct.getNombre(), ct.getDescripcion(), ct.getAspectos(), ct.getTipo(), ct.getSede(), ct.getImg_malla(), ct.getImg_tecnica());
		logger.info("new Carrera Name = " + ct.getNombre());
		modelAndView = new ModelAndView("redirect:/admin/ct/listct");
		
		} catch (DAOException e) {
		logger.error(e.getMessage());
		model.addAttribute("message", e.getMessage());
		modelAndView = new ModelAndView("admin/ct/createformct", "carreraCT", ct);
		}
	}
	//
	return modelAndView;
	}
}
