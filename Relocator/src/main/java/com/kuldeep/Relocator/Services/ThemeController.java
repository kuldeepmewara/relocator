package com.kuldeep.Relocator.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kuldeep.Relocator.User;

@RestController()
@RequestMapping("/theme")
public class ThemeController {
	
	@Autowired
	private ThemeRepository themeRepo;
	
	@GetMapping("/all")
	@CrossOrigin
	public List<ServiceTheme> getUsers()
	{
		return themeRepo.findAll();
	}
	
	@PostMapping("/theme")
	@CrossOrigin
	public ResponseEntity<String> postTheme(@RequestBody String theme)
	{
		    ServiceTheme stheme=new ServiceTheme(theme);
		    themeRepo.save(stheme);
		    return new ResponseEntity<String>("Success",HttpStatus.OK);
		
	}
	
	

}
