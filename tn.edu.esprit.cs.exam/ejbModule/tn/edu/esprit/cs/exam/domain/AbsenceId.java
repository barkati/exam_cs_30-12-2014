package tn.edu.esprit.cs.exam.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class AbsenceId implements Serializable {
	private Integer idUser;
	private Integer idModule;
	private Date dateOfAbsence;

	public AbsenceId() {
	}

	public AbsenceId(Integer idUser, Integer idModule, Date dateOfAbsence) {
		super();
		this.idUser = idUser;
		this.idModule = idModule;
		this.dateOfAbsence = dateOfAbsence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateOfAbsence == null) ? 0 : dateOfAbsence.hashCode());
		result = prime * result
				+ ((idModule == null) ? 0 : idModule.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbsenceId other = (AbsenceId) obj;
		if (dateOfAbsence == null) {
			if (other.dateOfAbsence != null)
				return false;
		} else if (!dateOfAbsence.equals(other.dateOfAbsence))
			return false;
		if (idModule == null) {
			if (other.idModule != null)
				return false;
		} else if (!idModule.equals(other.idModule))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		return true;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdModule() {
		return idModule;
	}

	public void setIdModule(Integer idModule) {
		this.idModule = idModule;
	}

	public Date getDateOfAbsence() {
		return dateOfAbsence;
	}

	public void setDateOfAbsence(Date dateOfAbsence) {
		this.dateOfAbsence = dateOfAbsence;
	}

}
