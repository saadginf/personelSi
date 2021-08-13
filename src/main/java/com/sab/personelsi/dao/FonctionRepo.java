package com.sab.personelsi.dao;

import com.sab.personelsi.entities.FonctionSi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface FonctionRepo extends JpaRepository<FonctionSi,Long>{
    
}
