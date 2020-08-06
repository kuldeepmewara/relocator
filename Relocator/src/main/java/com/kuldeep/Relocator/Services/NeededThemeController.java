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
@RequestMapping("/neededTheme")
public class NeededThemeController {
	
	@Autowired
	private NeededThemeRepository themeRepo;
	
	@GetMapping("/all")
	@CrossOrigin
	public List<NeededTheme> getheme()
	{
		return themeRepo.findAll();
	}
	
	@PostMapping("/suggestion")
	@CrossOrigin
	public ResponseEntity<String> postTheme(@RequestBody String theme)
	{
		
		  
		    NeededTheme stheme = new NeededTheme();
		    int l=theme.length();
		    theme=theme.substring(0,l-1);
		    stheme.setTheme(theme);
		    System.out.println("555555555555555555555555555555555555555"+theme);
		    themeRepo.save(stheme);
		    return new ResponseEntity<String>("Success",HttpStatus.OK);
		
	}
	
	

}
