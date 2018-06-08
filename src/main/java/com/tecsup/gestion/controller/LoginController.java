package com.tecsup.gestion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Admin;
import com.tecsup.gestion.services.SecurityService;


/**
 *  Handles requests for the application home page.
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private SecurityService securityService;

/*	
	@GetMapping("/")
	public String menu() {

		return "/login";
	}
*/
	
	//@GetMapping("/login")
	@GetMapping(value={"/", "login"})
	public ModelAndView preLogin() {
		Admin adm = new Admin();
		return new ModelAndView("login", "command", adm);
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute("SpringWeb") Admin admin, ModelMap model) {

		
		logger.info("login()");
		logger.info(admin.toString());

		ModelAndView modelAndView = null;

		try {
			Admin adm = securityService.validate1(admin.getAdmin_name(), admin.getAdmin_password());
			logger.info(adm.toString());
			modelAndView = new ModelAndView("redirect:/admin/menu", "command", adm);
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			model.addAttribute("message", "Usuario y/o clave incorrectos");
			modelAndView = new ModelAndView("login", "command", new Admin());
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("login", "command", new Admin());
		}

		return modelAndView;
	}
	
	

}
