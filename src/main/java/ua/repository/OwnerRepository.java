package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import ua.entity.Cvartura;
import ua.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer>{
	
	@Query("SELECT r FROM Recipe r LEFT JOIN FETCH r.cvartura WHERE r.id=:id")
	Owner findOneCvarturaInited(@Param("id")int id);

	Owner findByName(String name);
//	@Query(value = "SELECT r FROM Recipe r LEFT JOIN FETCH r.country",
//			countQuery="SELECT count(r.id) FROM Recipe r LEFT JOIN r.country")
//	Page<Recipe> findAll(Pageable pageable);
	@Modifying
	@Query("UPDATE Recipe r SET r.country = :country WHERE r.name = :name")
	void changeCvartura(@Param("name")String name, @Param("cvartura")Cvartura cvartura);
	
}
