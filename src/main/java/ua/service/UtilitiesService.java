package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.Utilities;
import ua.form.filter.UtilitiesFilterForm;

public interface UtilitiesService {

	List<Utilities> findAll();

	void save(Utilities utilities);

	void delete(int id);
	
	Utilities findOne(int id);
	
	Page<Utilities> findAll(Pageable pageable);

	Page<Utilities> findAll(Pageable pageable, UtilitiesFilterForm form);

}
