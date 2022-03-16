package com.abinbev.carina.demo.db.mappers;

import com.abinbev.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);

}
