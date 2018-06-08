package com.tecsup.gestion.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import com.tecsup.gestion.services.PFRService;
   
/**
 * Handles requests for the application home page.
 */
@Controller
public class PFRController {
	
	private static final Logger logger = LoggerFactory.getLogger(PFRController.class);
	
	@Autowired
	private PFRService pfrService;
	
	@Autowired
	private ApplicationContext context;
	
	@GetMapping("/admin/menu")
	public String menu() {

		return "/admin/menu";
	}
		
	////////////////////////
	//PFR - PAGE
	////////////////////////
	
	@GetMapping("/admin/web/pagina")
	public String pagina() {
		
		return "admin/web/pagina";
	}
	
	@GetMapping("/admin/web/cursos/pfr")
	public String pfr(@ModelAttribute("SpringWeb") Admin admin, ModelMap model) {
		try {
			model.addAttribute("carreras", pfrService.findAll());
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}

		return "admin/web/cursos/pfr";
	}
	
	
	////////////////////////
	//LIST PFR
	////////////////////////
	
	@GetMapping("/admin/emp/list")
	public String list(@ModelAttribute("SpringWeb") Admin admin, ModelMap model) {

		try {
			model.addAttribute("carreras", pfrService.findAll());
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}

		return "admin/emp/list";
	}
	
	

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping("/{pfr_id}")
	public ModelAndView home(@PathVariable int pfr_id, ModelMap model) {

		ModelAndView modelAndView = null;
		PFR pfr = new PFR();
		try {
			pfr = pfrService.find(pfr_id);
			logger.info(pfr.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		modelAndView = new ModelAndView("home", "command", pfr);

		return modelAndView;
	}
	
	////////////////////////
	//VIEW - PFR
	////////////////////////
	
	@GetMapping("/admin/emp/viewform")
	public ModelAndView view(@ModelAttribute("carrera")@Valid PFR pfr, BindingResult result, ModelMap model) {

		ModelAndView modelAndView = null;
		
		if (result.hasErrors()) {
			modelAndView = new ModelAndView("admin/emp/editform","carrera", pfr);
		}else {
		try {
			
			pfrService.update(pfr.getName(), pfr.getDescripcion(), pfr.getDuracion(), pfr.getSede(), pfr.getObjetivo(), pfr.getImg_malla(), pfr.getImg_carrera());

			modelAndView = new ModelAndView("redirect:/admin/emp/list");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("admin/emp/editform","carrera", pfr);
		}
	  }
		return modelAndView;
	}
	
	
	////////////////////////
	//EDIT - PFR
	////////////////////////
	
	@GetMapping("/admin/emp/{action}/{pfr_id}")
		public ModelAndView form(@PathVariable String action, @PathVariable int pfr_id, ModelMap model) {
	
		// action = {"editform","deleteform"}
		logger.info("action = " + action);
		ModelAndView modelAndView = null;
	
		try {
			PFR pfr = pfrService.find(pfr_id);
			logger.info(pfr.toString());
			modelAndView = new ModelAndView("admin/emp/" + action, "carrera", pfr);
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("admin/emp/" + action, "carrera", new PFR());
		}
	
		return modelAndView;
	}
	
	////////////////////////
	//EDIT 2 - PFR
	////////////////////////
	
	@PostMapping("/admin/emp/editsave")
	public ModelAndView editsave(@ModelAttribute("carrera")@Valid PFR pfr, BindingResult result, ModelMap model) {

		
		// logger.info("pfr = " + pfr);
		
		ModelAndView modelAndView = null;
		
		if (result.hasErrors()) {
			modelAndView = new ModelAndView("admin/emp/editform","carrera", pfr);
		}else {
		try {
			/*employeeService.update(emp.getLogin(), emp.getPassword(), emp.getFirstname(), emp.getLastname(),
					emp.getSalary(), -1);*/
			
			pfrService.update(pfr.getName(), pfr.getDescripcion(), pfr.getDuracion(), pfr.getSede(), pfr.getObjetivo(), pfr.getImg_malla(), pfr.getImg_carrera());

			modelAndView = new ModelAndView("redirect:/admin/emp/list");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("admin/emp/editform","carrera", pfr);
		}
	  }
		return modelAndView;
	}
	
	////////////////////////
	//DELETE - PFR
	////////////////////////
	
	@PostMapping("/admin/emp/delete")
	public ModelAndView delete(@ModelAttribute("carrera")@Valid PFR pfr, BindingResult result , ModelMap model) {
		
		ModelAndView modelAndView = null;
		
		if(result.hasErrors()) {
			modelAndView = new ModelAndView("admin/emp/deleteform/" + pfr.getPfr_id(), "carrera", pfr);	
		}else {
			try {
				pfrService.delete(pfr.getName());
				modelAndView = new ModelAndView("redirect:/admin/emp/list");
			}catch (Exception e) {
				model.addAttribute("message", e.getMessage());
				modelAndView = new ModelAndView("admin/emp/deleteform", "carrera", pfr );
			}
		}
		return modelAndView;	
		
	}
	
	////////////////////////
	//CREATE - PFR
	////////////////////////
	@GetMapping("/admin/emp/createform")
	public ModelAndView createform() {

		PFR pfr = new PFR();

		ModelAndView modelAndView = new ModelAndView("admin/emp/createform", "carrera", pfr);

		return modelAndView;
	}

	@PostMapping("/admin/emp/create")
	public ModelAndView create(@ModelAttribute("carrera") @Valid PFR pfr, BindingResult result, ModelMap model) {

		// String msg = context.getMessage("employee.salary.min", null, Locale.US);
		// logger.info("message = " + msg);

		ModelAndView modelAndView = null;

		if (result.hasErrors()) {

			logger.info("result.getAllErrors();= " + result.getAllErrors());

			for (ObjectError error : result.getAllErrors()) {
				String theMessage = context.getMessage(error.getCode(), error.getArguments(), Locale.US);
				logger.info(error.getCode() + " = " + theMessage);
			}

			modelAndView = new ModelAndView("admin/emp/createform", "carrera", pfr);

		} else {
			try {
				pfrService.create(pfr.getName(), pfr.getDescripcion(), pfr.getDuracion(), pfr.getSede(), pfr.getObjetivo(), pfr.getImg_malla(), pfr.getImg_carrera());
				logger.info("new Carrera Name = " + pfr.getName());
				modelAndView = new ModelAndView("redirect:/admin/emp/list");

			} catch (DAOException e) {
				logger.error(e.getMessage());
				model.addAttribute("message", e.getMessage());
				modelAndView = new ModelAndView("admin/emp/createform", "carrera", pfr);
			}
		}
		//
		return modelAndView;
	}
} 
