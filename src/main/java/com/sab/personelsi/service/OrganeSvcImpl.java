package com.sab.personelsi.service;

import java.util.List;

import com.sab.personelsi.dao.OrganeRepo;
import com.sab.personelsi.entities.Organe;
import com.sab.personelsi.exceptions.LibbeleException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrganeSvcImpl implements OrganeSvc {
    @Autowired
    OrganeRepo orgRepo;

    @Override
    public Organe getOrganeById(Long id) {
        return orgRepo.findById(id).get();
    }

    @Override
    public List<Organe> getAllOrganes() {
        return orgRepo.findAll();
    }

    @Override
    public Organe saveOrgane(Organe organe) {
        try {
        
            
            return orgRepo.save(organe);
        } catch (Exception ex)

        {
            throw new LibbeleException("Erreur Fatale");
        }
    }
    }
    

