package com.sab.personelsi.outils;

import java.util.ArrayList;
import java.util.List;

public class AddPersonFields {
    private List<Fields> grades = new ArrayList<Fields>() ;
    private List<Fields> organes = new ArrayList<Fields>() ;
    private List<Fields> fonctions = new ArrayList<Fields>() ;
    public AddPersonFields() {
    }
    public List<Fields> getGrades() {
        return grades;
    }
    public void setGrades(List<Fields> grades) {
        this.grades = grades;
    }
    public List<Fields> getOrganes() {
        return organes;
    }
    public void setOrganes(List<Fields> organes) {
        this.organes = organes;
    }
    public List<Fields> getFonctions() {
        return fonctions;
    }
    public void setFonctions(List<Fields> fonctions) {
        this.fonctions = fonctions;
    }
}
