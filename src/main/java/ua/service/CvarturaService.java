package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.Cvartura;
import ua.form.filter.CvarturaFilterForm;

public interface CvarturaService {

	void save(Cvartura country);
	
	Cvartura findByName(String name);
	
	void delete(String name);
	
	List<Cvartura> findAll();
	
	Page<Cvartura> findAll(Pageable pageable);

	void delete(int id);

	List<Cvartura> findWithRecipes();
	
	Cvartura findOne(int id);

	Page<Cvartura> findAll(Pageable pageable, CvarturaFilterForm form);

}
