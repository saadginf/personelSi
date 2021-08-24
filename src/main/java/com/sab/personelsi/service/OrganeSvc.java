package com.sab.personelsi.service;

import java.util.List;

import com.sab.personelsi.entities.Organe;

public interface OrganeSvc {
    public Organe getOrganeById(Long id);
    public List<Organe> getAllOrganes();
    public Organe saveOrgane(Organe organe);
}
