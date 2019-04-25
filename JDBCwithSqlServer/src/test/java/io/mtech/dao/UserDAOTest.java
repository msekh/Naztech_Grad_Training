package io.mtech.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.mtech.model.User;
import io.mtech.service.UserDAOImpl;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class UserDAOTest {

	private UserDAO userDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		userDAO = new UserDAOImpl();
		new User();
	}

	@Test
	public void testAddUser() {
//		User u1=new User();
//		u1.setUid(101);
//		u1.setName("Sekh");
//		u1.setEmail("m@gmail.com");
//		u1.setPass("1234");
//		assertEquals("insert successfully.", true, userDAO.addUser(u1));
//		
//		User u2 = new User();
//		u2.setUid(107);
//		u2.setName("ariba");
//		u2.setEmail("ariba@gmail.com");
//		u2.setPass("1111");
//		assertEquals("insert successfully.", true, userDAO.addUser(u2));

		User u3 = new User();
		u3.setName("jana");
		u3.setEmail("jana@gamil.com");
		u3.setUName("jana");
		u3.setPass("12345");

		assertEquals("insert successfully.", true, userDAO.addUser(u3));

	}

//	@Test
//	public void testUpdateUser() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testDeleteUser() {
		assertEquals("delete successfully..", true, userDAO.deleteUser(6));
	}

	@Test
	public void testUserFindById() {

	}

	@Test
	public void testUserUpdate(){
		User user=new User();
		user = userDAO.userFindById(108);
		log.info("User: " + user);
		user.setName("mahadi");
		user.setEmail("msekh@gmail.com");
		user.setPass("8765");
		assertEquals("Something went wrong while updating the existing record!", true, userDAO.updateUser(user));
	}
}
