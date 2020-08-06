package com.kuldeep.Relocator;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserControler {

	@Autowired
	private UserRepository userRepo;
	
	
	@GetMapping("/All")
	@CrossOrigin
	public List<User> getUsers()
	{
		return userRepo.findAll();
	}
	
	@PostMapping("/user")
	@CrossOrigin
	public ResponseEntity<String> registerUser(@RequestBody User user)
	{
		String Email=user.getEmail();
		User u=userRepo.findByEmail(Email);
		if(u==null)
		{	userRepo.save(user);
		    return new ResponseEntity<String>("Success",HttpStatus.OK);
		}
		else
			
		   return new ResponseEntity<String>("Not Success",HttpStatus.FOUND);
		
	}
	@PostMapping("/verifyuser")
	@CrossOrigin
	public ResponseEntity<User> loginUser(@RequestBody User user)
	{
		String Email=user.getEmail();
		String pass=user.getPassword();
		User u=userRepo.findByEmail(Email);
		
		if(u==null)
		{
			 return new ResponseEntity<User>(u,HttpStatus.FOUND);	
		}
		if(u.getPassword().equals(pass))
		{	
		    return new ResponseEntity<User>(u,HttpStatus.OK);
		}
		else
		{
			User k=null;
		   return new ResponseEntity<User>(k,HttpStatus.FOUND);
		}
	}
	

}
