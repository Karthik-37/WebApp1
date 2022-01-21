package com.project.Inventory.InventoryServiceImplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Inventory.InventoryEntity.UserEntity;
import com.project.Inventory.InventoryRepository.UserRepository;
import com.project.Inventory.InventoryService.UserService;
import com.project.Inventory.pojo.UserPojo;

@Service
public class UserServiceImplement implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserPojo add(UserPojo userPojo) {
		UserEntity user = new UserEntity();
		user.setUserId(userPojo.getUserId());
		user.setEmailId(userPojo.getEmailId());
		user.setPassword(userPojo.getPassword());
		user.setRole(userPojo.getRole());
		
		userRepository.save(user);

		return userPojo;
	}
	
	

	@Override
	public List<UserPojo> getAllUserPojos() {
		
		List<UserPojo> user = new ArrayList<UserPojo>();
		List<UserEntity> repo = userRepository.findAll();
		for(UserEntity userEntity:repo) {
			UserPojo pojo = new UserPojo();
			
			pojo.setUserId(userEntity.getUserId());
			pojo.setEmailId(userEntity.getEmailId());
			pojo.setPassword(userEntity.getPassword());
			pojo.setRole(userEntity.getRole());
			
			user.add(pojo);
		}
		
		return user;
	}
	
	



	@Override
	public UserPojo update(UserPojo userPojo, long UserId) {
		UserEntity user=userRepository.getById(UserId);
		user.setUserName(userPojo.getUserName());
		user.setPassword(userPojo.getPassword());
		user.setEmailId(userPojo.getEmailId());
		user.setRole(userPojo.getRole());
		
		userRepository.save(user);
		return userPojo;
	}



	@Override
	public void delete(long userId) {
		
		userRepository.deleteById(userId);
		
	}
	
	

}
