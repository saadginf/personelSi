package com.sab.personelsi.service;

import java.util.List;

import com.sab.personelsi.entities.Organe;
import com.sab.personelsi.entities.Personnel;

public interface PersonelSiSvc {
    public Personnel getPersonnelById(Long id);
    public List<Personnel> getAllPersonnels();
    public List<Personnel> findAllPersonnelsByOrgane(Organe org);
    public Personnel savePersonnel(Personnel Personnel);

}
