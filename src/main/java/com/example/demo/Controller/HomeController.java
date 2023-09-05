package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Dao.UserRepository;
import com.example.demo.Entity.User;
@Controller
public class HomeController {
	@Autowired
	private UserRepository userRepo;
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user=new User();
		user.setName(" arifur rahmlan");
		user.setEmail("arif@gmail.com");
		userRepo.save(user);
		return "working";
	}
	

}
