package com.hxiloj.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hxiloj.model.User;
import com.hxiloj.test.service.UserService;

/**
 * @author Henry
 *
 */

@RestController
@RequestMapping("/ws")
public class TestController {

	 @Autowired
	 UserService userService;
	 
	 @RequestMapping("/create")
	 public User create(User user) {
		 
	  user.setName("Henry");
	  user.setEmail("abc@gmail.com");
	  user.setAge(31);
	
	 // user = userRepository.save(user);
	  user = userService.save(user);
	  return user;
	 }
	 
	 @GetMapping("/read")
	 public List<User> read() {
		 
		 User user1 = userService.findByEmailAddress("abc@gmail.com");
		 System.out.println("get obj "+user1.getName());
		 
		 List<User> listUser = userService.findByName();
		 
		 listUser.forEach(item -> {
			
			 System.out.println("user "+ item.getName());
		 });
		 List<User> user = userService.findAll();
		 return user;
	 }
	 
	 
	 @RequestMapping("/update")
	 public User update(@RequestParam Long userID) {
		
		 Optional<User> user = userService.findById(userID);
		 
		 user.get().setName("henry1");
		 User obj  = userService.save(user.get());
	     return obj;
	 }
	 
	 
	 @RequestMapping("/delete")
	 public String delete(@RequestParam Long userID) {
		 
		 User user = new User();
		 user.setId(userID);
		 
		 userService.delete(user);
	     return "user "+userID+" deleted successfully";
	 }
	 
}
