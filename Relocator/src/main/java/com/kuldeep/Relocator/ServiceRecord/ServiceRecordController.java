package com.kuldeep.Relocator.ServiceRecord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kuldeep.Relocator.Services.ServiceTheme;
import com.kuldeep.Relocator.Services.ThemeRepository;

@RestController()
@RequestMapping("/Service")
public class ServiceRecordController {
	
	
	@Autowired
	private ServiceRecordRepository serviceRepo;
	
	
	@PostMapping("/post")
	@CrossOrigin
	public ResponseEntity<String> saveService(@RequestBody  ServiceRecord service)
	{
		    serviceRepo.save(service);
		    return new ResponseEntity<String>("Success",HttpStatus.OK);
		
	}
	
	
	@GetMapping("/get")
	@CrossOrigin
	public List<ServiceRecord> getService()
	{
		    List<ServiceRecord> l=serviceRepo.findAll();
		    return l;
		    //return new ResponseEntity<String>("Success",HttpStatus.OK);
		
	}
	
	@GetMapping("/user")
	@CrossOrigin
	public List<ServiceRecord> getUser(@RequestParam  String id)
	{
		    List<ServiceRecord> l=serviceRepo.findAllByUserId(Long.parseLong(id));
		    return l;
		
	}
	
	@DeleteMapping("/del/{id}")
	@CrossOrigin
	public void  deleteUserService(@PathVariable  String id)
	{
		    serviceRepo.deleteById(Long.parseLong(id));
		    
		
	}
	

}
