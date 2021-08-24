package com.sab.personelsi.dao;

import com.sab.personelsi.entities.Organe;

import org.springframework.data.jpa.repository.JpaRepository;



public interface OrganeRepo extends  JpaRepository<Organe,Long>{
    
}
