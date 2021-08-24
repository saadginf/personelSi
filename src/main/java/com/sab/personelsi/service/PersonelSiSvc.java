package com.sab.personelsi.service;

import java.util.List;

import com.sab.personelsi.entities.Personnel;

public interface PersonelSiSvc {
    public Personnel getPersonnelById(Long id);
    public List<Personnel> getAllPersonnels();
    public Personnel savePersonnel(Personnel Personnel);

}
