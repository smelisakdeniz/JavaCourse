package day5Homework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5Homework.dataAccess.abstracts.UserDao;
import day5Homework.entities.concretes.User;

public abstract class HibernateUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi : " + user.getFirstName());
		
	}

	@Override
	public User get(int id) {
			for(User user : users) {
				if(user.getId()== id) {
					return user;
				}
			}
		return null;
	}


	@Override
	public User getLoginInfos(String email, String password) {
		for(User user : users) {
			if (user.getPassword() == password && user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}
	
	@Override
	public User getByEmail(String email) {
		for(User user : users) {
			if (user.getEmail() == email) {
				return user;
			}
			
		}
		return null;
	}
	@Override
	public List<User> getAll() {
		System.out.println("Kullanýcý kayýtlarý:");

		for (User user : users) {
			System.out.println("Id: " + user.getId());
			System.out.println("Ad-Soyad: " + user.getFirstName()+ " " + user.getLastName());
			System.out.println("E-Posta: " + user.getEmail());
					
		}
		return null;
	}
	
	
	
}
