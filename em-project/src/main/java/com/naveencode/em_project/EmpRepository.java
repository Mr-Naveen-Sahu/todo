package com.naveencode.em_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepository extends JpaRepository<EmpEntiry,Long>{
    
}
