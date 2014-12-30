package tn.edu.esprit.cs.examClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.exam.domain.Student;
import tn.edu.esprit.cs.exam.services.UserManagementServicesRemote;

public class TestAddStudent {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserManagementServicesRemote proxy = (UserManagementServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.cs.exam/UserManagementServices!tn.edu.esprit.cs.exam.services.UserManagementServicesRemote");

			Student student = new Student();
			student.setId(2);
			student.setName("telmidh");
			student.setGroupLevel("farachette");

			proxy.saveUser(student);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
