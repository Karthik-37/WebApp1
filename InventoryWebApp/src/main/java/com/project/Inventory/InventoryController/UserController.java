package com.project.Inventory.InventoryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Inventory.InventoryService.UserService;
import com.project.Inventory.pojo.UserPojo;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public UserPojo add(@RequestBody UserPojo userPojo) {
		userPojo=userService.add(userPojo);
		return userPojo;
	}
	
	@GetMapping("/user/getAll")
	public List<UserPojo> getAllUserPojos(){
		
		List<UserPojo> r = userService.getAllUserPojos();
		return r;
	}
	
	@DeleteMapping(value="/delete/{userId}")
	public void deleteUser(@PathVariable("userId") long userId) {
		userService.delete(userId);
}


}
