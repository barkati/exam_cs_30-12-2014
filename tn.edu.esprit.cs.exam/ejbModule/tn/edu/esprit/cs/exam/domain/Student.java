package tn.edu.esprit.cs.exam.domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Student
 * 
 */
@Entity
public class Student extends User implements Serializable {

	private String groupLevel;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}

	public String getGroupLevel() {
		return this.groupLevel;
	}

	public void setGroupLevel(String groupLevel) {
		this.groupLevel = groupLevel;
	}

}
