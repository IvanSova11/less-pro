package ua.service;

import java.util.List;

import ua.entity.Committee;

public interface CommitteeService {
void save(String name);
	
	Committee findByName(String name);
	
	void delete(String name);
	
	List<Committee> findAll();

}
