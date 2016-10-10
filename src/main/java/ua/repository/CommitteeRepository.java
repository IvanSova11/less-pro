package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Committee;

public interface CommitteeRepository extends JpaRepository<Committee, Integer>{

}
