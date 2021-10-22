package com.sab.personelsi.service;

import java.util.List;

import com.sab.personelsi.entities.FonctionSi;

public interface FoncSvc {
    public FonctionSi getFonctionSi(Long id);
    public List<FonctionSi> getAllFonctionsSi();
    public FonctionSi saveFonctionSi(FonctionSi fonctionSi);
}
