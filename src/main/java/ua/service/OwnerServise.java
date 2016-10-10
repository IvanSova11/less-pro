package ua.service;

import java.security.acl.Owner;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.form.OwnerForm;
import ua.form.filter.OwnerFilterForm;

public interface OwnerServise {
	List<Owner> findAll();

	void delete(int id);
	
	void save(OwnerForm form);

	OwnerForm findForForm(int id);

	Owner findByName(String name);

	Page<Owner> findAll(OwnerFilterForm form, Pageable pageable);

}
