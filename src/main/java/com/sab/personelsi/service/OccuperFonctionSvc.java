package com.sab.personelsi.service;

import java.util.List;

import com.sab.personelsi.entities.OccuperFonction;
import com.sab.personelsi.entities.Personnel;

public interface OccuperFonctionSvc {
    List<OccuperFonction> GetActiveFonctionByPersonnel(Personnel personnel);
}
