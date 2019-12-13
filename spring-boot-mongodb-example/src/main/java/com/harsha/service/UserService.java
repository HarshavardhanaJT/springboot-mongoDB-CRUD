package com.harsha.service;

import java.util.Map;

public interface UserService {
	Map<String, Object> create(Map<String, Object> reqBody);
	Map<String, Object> update(Map<String, Object> reqBody);
	Map<String, Object> getAll();
	Map<String, Object> detete(String userId);
}
