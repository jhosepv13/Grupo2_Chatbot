package com.tecsup.gestion.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tecsup.gestion.dao.AdminDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class AdminDAOTest {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminDAOTest.class);

	@Autowired
	private AdminDAO adminDAO;
	
	@BeforeClass
	public static void beforeClass() {
		logger.info("Antes de todos los metodos");

	}
	
	@Before
	public  void before() {
		logger.info("Antes de cada metodo");
	}
	
	@Test
	public void testFindAdmin() {
		try {
			Admin adm = adminDAO.findAdmin(1);
			Assert.assertNotNull(adm);
			
			Assert.assertEquals("admin",adm.getAdmin_name());
			Assert.assertEquals("admin",adm.getAdmin_password());
			
			
		logger.info(adm.toString());

		} catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testFindAlladmins() {
		
		try {
			List<Admin> adms = adminDAO.findAllAdmins();
			
			logger.info(adms.toString());
			
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		}catch (DAOException e) {
			fail(e.getMessage());
		}
	}
	
	@After
	public void after() {
		logger.info("Despues de cada metodo");
	}
	
	@AfterClass
	public static void afterClass() {
		logger.info("Despues de todos los metodos");
	}
}
