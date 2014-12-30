package tn.edu.esprit.cs.examClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.exam.domain.User;
import tn.edu.esprit.cs.exam.services.UserManagementServicesRemote;

public class TestAddUser {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserManagementServicesRemote proxy = (UserManagementServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.cs.exam/UserManagementServices!tn.edu.esprit.cs.exam.services.UserManagementServicesRemote");

			User user = new User();
			user.setId(1);
			user.setName("foulen");

			proxy.saveUser(user);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
