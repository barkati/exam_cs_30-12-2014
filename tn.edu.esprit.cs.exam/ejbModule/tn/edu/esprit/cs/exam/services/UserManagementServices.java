package tn.edu.esprit.cs.exam.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.cs.exam.domain.User;

/**
 * Session Bean implementation class UserManagementServices
 */
@Stateless
public class UserManagementServices implements UserManagementServicesRemote {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean saveUser(User user) {
		boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
			System.err.println("failed");
		}
		return b;
	}

	@Override
	public boolean deleteUser(Integer id) {
		boolean b = false;
		try {
			entityManager.remove(findUserById(id));
			b = true;
		} catch (Exception e) {
			System.err.println("failed");
		}
		return b;
	}

	@Override
	public boolean updateUser(User user) {
		boolean b = false;
		try {
			entityManager.merge(user);
			b = true;
		} catch (Exception e) {
			System.err.println("failed");
		}
		return b;
	}

	@Override
	public User findUserById(Integer id) {

		return entityManager.find(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		String jpql = "select u from User u";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

}
