package tn.edu.esprit.cs.exam.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Absence
 * 
 */
@Entity
public class Absence implements Serializable {

	private AbsenceId absenceId;
	private boolean justification;
	private static final long serialVersionUID = 1L;

	private User user;
	private Module module;

	public Absence() {
		super();
	}

	public Absence(User user, Module module, Date dateOfAbsence) {
		super();
		this.user = user;
		this.module = module;
		this.absenceId = new AbsenceId(user.getId(), module.getId(),
				dateOfAbsence);
	}

	public boolean getJustification() {
		return this.justification;
	}

	public void setJustification(boolean justification) {
		this.justification = justification;
	}

	@EmbeddedId
	public AbsenceId getAbsenceId() {
		return absenceId;
	}

	public void setAbsenceId(AbsenceId absenceId) {
		this.absenceId = absenceId;
	}

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "id", insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "idModule", referencedColumnName = "id", insertable = false, updatable = false)
	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}
