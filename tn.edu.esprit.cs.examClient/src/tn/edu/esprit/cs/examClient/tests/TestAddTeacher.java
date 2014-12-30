package tn.edu.esprit.cs.examClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.exam.domain.Teacher;
import tn.edu.esprit.cs.exam.domain.User;
import tn.edu.esprit.cs.exam.services.UserManagementServicesRemote;

public class TestAddTeacher {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserManagementServicesRemote proxy = (UserManagementServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.cs.exam/UserManagementServices!tn.edu.esprit.cs.exam.services.UserManagementServicesRemote");

			Teacher teacher=new Teacher();
			teacher.setId(1);
			teacher.setName("foulen");
			teacher.setLevel("professor");
			
			proxy.saveUser(teacher);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
