package com.sab.personelsi.service;

import java.util.List;

import com.sab.personelsi.dao.PersonnelRepo;
import com.sab.personelsi.entities.Organe;
import com.sab.personelsi.entities.Personnel;
import com.sab.personelsi.exceptions.LibbeleException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonnelSiImpl implements PersonelSiSvc{
    @Autowired
    PersonnelRepo pRepo;
 
    
    @Override
    public Personnel getPersonnelById(Long id) {
        Personnel perso = pRepo.findById(id).get();
     
        return perso;
    }

    @Override
    public List<Personnel> getAllPersonnels() {
        return pRepo.findAll();
    }

    @Override
    public Personnel savePersonnel(Personnel Personnel) {
        try {
            return pRepo.save(Personnel);
        } catch (Exception ex)

        {
            throw new LibbeleException("Erreur Fatale");
        }
    }

    @Override
    public List<Personnel> findAllPersonnelsByOrgane(Organe org) {
        // TODO Auto-generated method stub
        return pRepo.findByOrgane(org);
    }
}
