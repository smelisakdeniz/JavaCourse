package day5Homework.business.abstracts;

import java.util.List;

import day5Homework.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	User getByEmail(String email);
	User getLoginInfos(String email,String password);
	List<User> getAll();
}
