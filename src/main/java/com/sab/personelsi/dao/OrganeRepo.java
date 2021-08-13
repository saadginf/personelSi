package com.sab.personelsi.dao;

import com.sab.personelsi.entities.Organe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrganeRepo extends  JpaRepository<Organe,Long>{
    
}
