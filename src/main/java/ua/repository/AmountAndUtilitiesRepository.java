package ua.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.AmauntAndUtilities;

public interface AmountAndUtilitiesRepository extends JpaRepository<AmountAndUtilities, Integer>, JpaSpecificationExecutor<AmountAndUtilities>{

	@Query("SELECT ai FROM AmountAndIngredient ai LEFT JOIN FETCH "
			+ "ai.measuringSystem LEFT JOIN FETCH ai.ingredient")
	List<AmauntAndUtilities> findAll();
	
	@Query(value="SELECT ai FROM AmountAndIngredient ai LEFT JOIN FETCH "
			+ "ai.measuringSystem LEFT JOIN FETCH ai.ingredient",
			countQuery="SELECT count(ai.id) FROM AmountAndIngredient ai")
	Page<AmountAndUtilities> findAll(Pageable pageable);
	
	@Query("SELECT ai FROM AmountAndIngredient ai LEFT JOIN FETCH "
			+ "ai.measuringSystem ms LEFT JOIN FETCH ai.ingredient i "
			+ "WHERE ai.id=:id")
	AmountAndUtilities findForForm(@Param("id")int id);
}
