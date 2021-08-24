package com.sab.personelsi.dao;

import java.util.List;

import com.sab.personelsi.entities.OccuperFonction;
import com.sab.personelsi.entities.Personnel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface OccuperFonctionRepo extends JpaRepository<OccuperFonction,Long>{
    List<OccuperFonction> findByActiveTrueAndPersonnel(Personnel personnel);
}
