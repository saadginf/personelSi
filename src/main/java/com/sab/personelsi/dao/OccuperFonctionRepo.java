package com.sab.personelsi.dao;

import com.sab.personelsi.entities.OccuperFonction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface OccuperFonctionRepo extends JpaRepository<OccuperFonction,OccuperFonction>{
    
}
