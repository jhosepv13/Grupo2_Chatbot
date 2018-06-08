package com.tecsup.gestion.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tecsup.gestion.dao.PFRDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.PFR;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class PFRDAOTest {
	
	private static final Logger logger = LoggerFactory.getLogger(PFRDAOTest.class);
	
	@Autowired
	private PFRDAO pfrDAO;
	
	@Test
	public void testFindAllCarreras() {
		
		try {
			List<PFR> pfrs = pfrDAO.findAllCarreras();
			
			logger.info(pfrs.toString());
			
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		}catch (DAOException e) {
			fail(e.getMessage());
		}
	}
}
