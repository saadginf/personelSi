package com.sab.personelsi.service;

import java.util.List;

import com.sab.personelsi.dao.PersonnelRepo;
import com.sab.personelsi.entities.OccuperFonction;
import com.sab.personelsi.entities.Personnel;
import com.sab.personelsi.exceptions.LibbeleException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonnelSiImpl implements PersonelSiSvc{
    @Autowired
    PersonnelRepo pRepo;
    @Autowired
    OccuperFonctionSvc oSvc;
    
    @Override
    public Personnel getPersonnelById(Long id) {
        Personnel perso = pRepo.findById(id).get();
        List<OccuperFonction> ocf = oSvc.GetActiveFonctionByPersonnel(perso); 
     
        for (OccuperFonction occuperFonction : ocf) {
          
                perso.getFonctionSiActuelle().add(occuperFonction.getFonctionSi().getLabael());
        }
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
}
