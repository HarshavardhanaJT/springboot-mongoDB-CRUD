package com.harsha.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsha.model.User;
import com.harsha.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Map<String, Object> create(Map<String, Object> reqBody) {
		Map<String, Object> returnMap = new HashMap<>();
		returnMap.put("status", false);
		try {
			User user = new User();
			user.setCreatedDate(new Date());
			user.setIsActive(true);
			user.setMobileNumber(reqBody.get("mobile").toString());
			user.setUserName(reqBody.get("name").toString());
			User savedUser = userRepository.save(user);
			returnMap.put("status", true);
			returnMap.put("userDetails", savedUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnMap;
	}

	@Override
	public Map<String, Object> update(Map<String, Object> reqBody) {
		Map<String, Object> returnMap = new HashMap<>();
		returnMap.put("status", false);
		try {
			User user = userRepository.findUserById(reqBody.get("userId").toString());
			user.setUserName(reqBody.get("userName").toString());
			user.setMobileNumber(reqBody.get("mobile").toString());
			User updatedUser = userRepository.save(user);
			returnMap.put("userDetails", updatedUser);
			returnMap.put("status", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnMap;
	}

	@Override
	public Map<String, Object> getAll() {
		Map<String, Object> returnMap = new HashMap<>();
		returnMap.put("status", false);
		try {
			List<User> userList = userRepository.findAll();
			returnMap.put("status", true);
			returnMap.put("userDetails", userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnMap;
	}

	@Override
	public Map<String, Object> detete(String userId) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("status", false);
		try {
			userRepository.deleteById(userId);
			returnMap.put("status", true);
			returnMap.put("message", "User deleted successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnMap;
	}

}
