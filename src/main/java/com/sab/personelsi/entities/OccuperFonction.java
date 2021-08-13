package com.sab.personelsi.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class OccuperFonction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ID_PERS")
    private Personnel personnel;
    @ManyToOne
    @JoinColumn(name = "ID_FSI")
    private FonctionSi fonctionSi;
    private Date dateDebut;
    private Date dateFin;
    private boolean active;

    
    public OccuperFonction() {
    }
    public Personnel getPersonnel() {
        return personnel;
    }
    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }
    public FonctionSi getFonctionSi() {
        return fonctionSi;
    }
    public void setFonctionSi(FonctionSi fonctionSi) {
        this.fonctionSi = fonctionSi;
    }
    public Date getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Date getDateFin() {
        return dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    
}
