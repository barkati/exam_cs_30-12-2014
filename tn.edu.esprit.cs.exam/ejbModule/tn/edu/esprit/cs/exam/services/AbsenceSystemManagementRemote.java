package tn.edu.esprit.cs.exam.services;

import java.util.Date;

import javax.ejb.Remote;

import tn.edu.esprit.cs.exam.domain.Module;
import tn.edu.esprit.cs.exam.domain.User;

@Remote
public interface AbsenceSystemManagementRemote {
	boolean addAbsence(User user, Module module, Date dateOfAbsence);
}
