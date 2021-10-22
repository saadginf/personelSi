package com.sab.personelsi.dao;

import java.util.List;

import com.sab.personelsi.entities.Organe;
import com.sab.personelsi.entities.Personnel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface PersonnelRepo extends JpaRepository<Personnel,Long>{
    List<Personnel> findByOrgane(Organe organe);
}
