package com.sab.personelsi.service;
import java.util.List;
import com.sab.personelsi.dao.FonctionRepo;
import com.sab.personelsi.entities.FonctionSi;
import com.sab.personelsi.exceptions.LibbeleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FoncSvcImpl implements FoncSvc {
    @Autowired
    FonctionRepo foncRepo;

    @Override
    public FonctionSi getFonctionSi(Long id) {
        // TODO Auto-generated method stub
        return foncRepo.findById(id).get();
    }

    @Override
    public List<FonctionSi> getAllFonctionsSi() {
        // TODO Auto-generated method stub
        return foncRepo.findAll();
    }

    @Override
    public FonctionSi saveFonctionSi(FonctionSi fonctionSi) {
        try {
        
            
            return foncRepo.save(fonctionSi);
        } catch (Exception ex)

        {
            throw new LibbeleException("Erreur Fatale");
        }
     
    }

  
    }
    

