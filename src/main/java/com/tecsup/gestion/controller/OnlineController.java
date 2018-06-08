package com.tecsup.gestion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.tecsup.gestion.services.OnlineService;

@Controller
public class OnlineController {
	
	private static final Logger logger = LoggerFactory.getLogger(OnlineController.class);
	
	@Autowired
	private OnlineService onlineService;
	
	@Autowired
	private ApplicationContext context;

}
