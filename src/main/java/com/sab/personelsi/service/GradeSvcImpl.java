package com.sab.personelsi.service;
import java.util.List;
import com.sab.personelsi.dao.GradeRepo;
import com.sab.personelsi.entities.Grade;
import com.sab.personelsi.exceptions.LibbeleException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GradeSvcImpl implements GradeSvc {
    @Autowired
    GradeRepo gradRepo;

    @Override
    public Grade getGradeById(Long id) {
        return gradRepo.findById(id).get();
    }

    @Override
    public List<Grade> getAllGrade() {
        return gradRepo.findAll();
    }

    @Override
    public Grade saveGrade(Grade grade) {
        try {
        
            
            return gradRepo.save(grade);
        } catch (Exception ex)

        {
            throw new LibbeleException("Erreur Fatale");
        }
    }



  
    }
    

