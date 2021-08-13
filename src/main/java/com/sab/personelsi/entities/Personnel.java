package com.sab.personelsi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Champ Obligatoire")
    private String nom;
    @NotNull(message = "Champ Obligatoire")
    private String prenom;
    @ManyToOne
    @JoinColumn(name = "ID_GR")
    private Grade grade;
    @ManyToOne
    @JoinColumn(name = "ID_ORG")
   private Organe organe;
   @NotNull(message = "Champ Obligatoire")
    private String fonction;
   
    private String mail;
 
    private String tel;


    
    public Organe getOrgane() {
        return organe;
    }
    public void setOrgane(Organe organe) {
        this.organe = organe;
    }
    public Personnel() {
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
  
    public String getFonction() {
        return fonction;
    }
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    
}
