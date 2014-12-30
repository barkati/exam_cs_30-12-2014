package tn.edu.esprit.cs.exam.services;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.cs.exam.domain.User;

@Remote
public interface UserManagementServicesRemote {
	boolean saveUser(User user);

	boolean deleteUser(Integer id);

	boolean updateUser(User user);

	User findUserById(Integer id);

	List<User> findAllUsers();

}
