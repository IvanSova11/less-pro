package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Cvartura;
import ua.form.filter.CvarturaFilterForm;
import ua.repository.CvarturaRepository;
import ua.service.CvarturaService;

@Service
@Transactional
public abstract class CvarturaServiceImpl implements CvarturaService{

	@Autowired
	private CvarturaRepository cvarturaRepository;
	
	@Override
	public void save(Cvartura cvartura) {
		cvarturaRepository.save(cvartura);
	}

	@Override
	public Cvartura findByName(String name) {
		return cvarturaRepository.findByName(name);
	}

	@Override
	public void delete(String name) {
		cvarturaRepository.delete(name);
	}

	@Override
	public List<Cvartura> findAll() {
		return cvarturaRepository.findAll();
	}

	@Override
	public void delete(int id) {
		cvarturaRepository.delete(id);
	}

	@Override
	public List<Cvartura> findWithRecipes() {
		return cvarturaRepository.findWithRecipes();
	}

	@Override
	public Cvartura findOne(int id) {
		return cvarturaRepository.findOne(id);
	}

	@Override
	public Page<Cvartura> findAll(Pageable pageable) {
		return cvarturaRepository.findAll(pageable);
	}

	@Override
	public Page<Cvartura> findAll(Pageable pageable, CvarturaFilterForm form) {
		return cvarturaRepository.findAll(new Specification<Cvartura>(form), pageable);
	}
}
