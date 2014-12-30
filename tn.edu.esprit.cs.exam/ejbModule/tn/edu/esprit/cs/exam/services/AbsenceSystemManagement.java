package tn.edu.esprit.cs.exam.services;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.cs.exam.domain.Absence;
import tn.edu.esprit.cs.exam.domain.Module;
import tn.edu.esprit.cs.exam.domain.User;

/**
 * Session Bean implementation class AbsenceSystemManagement
 */
@Stateless
public class AbsenceSystemManagement implements AbsenceSystemManagementRemote {
	@PersistenceContext
	private EntityManager entityManager;
	@EJB
	private UserManagementServicesRemote userManagementServicesRemote;

	/**
	 * Default constructor.
	 */
	public AbsenceSystemManagement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addAbsence(User user, Module module, Date dateOfAbsence) {
		boolean b = false;
		try {
			User userFound = userManagementServicesRemote.findUserById(user
					.getId());
			Absence absence = new Absence(userFound, module, dateOfAbsence);
			entityManager.persist(absence);

			b = true;
		} catch (Exception e) {
			System.err.println("failed");
		}
		return b;
	}

}
