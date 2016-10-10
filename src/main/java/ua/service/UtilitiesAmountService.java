package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.form.UtilitiesAmountForm;
import ua.form.filter.UtilitiesAmountFilterForm;

public interface UtilitiesAmountService {

	List<AmountAndUtilities> findAll();

	void delete(int id);

	void save(UtilitiesAmountForm form);
	
	Page<AmountAndUtilities> findAll(Pageable pageable);
	
	Page<AmountAndUtilities> findAll(Pageable pageable, UtilitiesAmountFilterForm form);

	UtilitiesAmountForm findOneForForm(int id);
}
