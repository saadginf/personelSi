package com.sab.personelsi.service;

import java.util.List;

import com.sab.personelsi.dao.OccuperFonctionRepo;
import com.sab.personelsi.entities.OccuperFonction;
import com.sab.personelsi.entities.Personnel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OccuperFonctionSvcImpl implements OccuperFonctionSvc{
    @Autowired
    OccuperFonctionRepo oRepo;
    @Override
    public List<OccuperFonction> GetActiveFonctionByPersonnel(Personnel personnel) {
        
        return oRepo.findByActiveTrueAndPersonnel(personnel);
    }
    
}
