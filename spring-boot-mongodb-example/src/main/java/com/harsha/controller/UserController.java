package com.harsha.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harsha.service.UserServiceImpl;

@CrossOrigin
@RestController
@RequestMapping(value="user")
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping(value="create")
	public Map<String, Object> create(@RequestBody Map<String, Object> reqBody){
		return userService.create(reqBody);
	}
	
	@PostMapping(value="update")
	public Map<String, Object> update(@RequestBody Map<String, Object> reqBody){
		return userService.update(reqBody);
	}
	
	@GetMapping(value="getAll")
	public Map<String, Object> getAll(){
		return userService.getAll();
	}
	
	@DeleteMapping(value="delete")
	public Map<String, Object> delete(@RequestParam String userId){
		return userService.detete(userId);
	}
}
