package com.abinbev.carina.demo.db.mappers;

import com.abinbev.carina.demo.db.models.User;

public interface UserMapper {

	void create(User user);

	User findById(long id);

	User findByUserName(String username);

	void update(User user);

	void delete(User user);

}
