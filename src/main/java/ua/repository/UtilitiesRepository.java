package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.Utilities;

public interface UtilitiesRepository extends JpaRepository<Utilities, Integer>, JpaSpecificationExecutor<Utilities>{

}
