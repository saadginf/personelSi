package com.sab.personelsi.outils;

import java.util.ArrayList;
import java.util.List;

public class AddEvaFields {
    private List<Fields> personnel = new ArrayList<Fields>() ;
    private List<Fields> organes = new ArrayList<Fields>() ;
   
    public AddEvaFields() {
    }

    public List<Fields> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(List<Fields> personnel) {
        this.personnel = personnel;
    }

    public List<Fields> getOrganes() {
        return organes;
    }

    public void setOrganes(List<Fields> organes) {
        this.organes = organes;
    }
   
}
