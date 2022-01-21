package com.project.Inventory.InventoryService;

import java.util.List;

import com.project.Inventory.pojo.UserPojo;

public interface UserService {
	
	UserPojo add(UserPojo userPojo);
	List<UserPojo> getAllUserPojos();
	UserPojo update(UserPojo userPojo,long UserId);
	void delete(long userId);

}
