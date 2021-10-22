package com.sab.personelsi.api;



import java.util.List;

import com.sab.personelsi.entities.FonctionSi;
import com.sab.personelsi.entities.Grade;
import com.sab.personelsi.entities.Organe;
import com.sab.personelsi.entities.Personnel;
import com.sab.personelsi.outils.AddEvaFields;
import com.sab.personelsi.outils.AddPersonFields;
import com.sab.personelsi.outils.Fields;
import com.sab.personelsi.service.FoncSvc;
import com.sab.personelsi.service.GradeSvc;
import com.sab.personelsi.service.OrganeSvc;
import com.sab.personelsi.service.PersonelSiSvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/perso/fields")
public class FieldsApi {
    @Autowired
    FoncSvc foncService;
    @Autowired
    GradeSvc gradeSvc;
    @Autowired
    OrganeSvc organeSvc;
    @Autowired
    PersonelSiSvc pSvc;
    @GetMapping("/addPerson")
    public ResponseEntity<?> getFonc(){
       
        AddPersonFields fields = new AddPersonFields();
       
        List<Grade> grades = gradeSvc.getAllGrade();
        for (Grade grade : grades) {
            Fields fl = new Fields();
            fl.setLabel(grade.getLabel());
            fl.setValue(grade.getId().toString());
            fields.getGrades().add(fl);
        }
        List<FonctionSi> fonctions = foncService.getAllFonctionsSi();
        for (FonctionSi fonction : fonctions) {
            Fields fl = new Fields();
            fl.setLabel(fonction.getLabel());
            fl.setValue(fonction.getId().toString());
            fields.getFonctions().add(fl);
        }
        List<Organe> organes = organeSvc.getAllOrganes();
        for (Organe organe : organes) {
            Fields fl = new Fields();
            fl.setLabel(organe.getLabel());
            fl.setValue(organe.getId().toString());
            fields.getOrganes().add(fl);
        }

        return new ResponseEntity< AddPersonFields>(fields, HttpStatus.OK);
    }
    @GetMapping("/addEva")
    public ResponseEntity<?> getEva(){
       
        AddEvaFields fields = new AddEvaFields();

        List<Organe> organes = organeSvc.getAllOrganes();
        for (Organe organe : organes) {
            Fields fl1 = new Fields();
            fl1.setLabel(organe.getLabel());
            fl1.setValue(organe.getId().toString());
            fields.getOrganes().add(fl1);
            List<Personnel> personnels = pSvc.findAllPersonnelsByOrgane(organe);
            for (Personnel personnel : personnels) {
                 Fields fl2 = new Fields();
                 fl2.setLabel(personnel.getGrade().getLabel()+" "+personnel.getNom()+" "+personnel.getPrenom());
                 fl2.setValue(personnel.getId().toString());
                 fields.getPersonnel().add(fl2);
            }
           
            

        }

        return new ResponseEntity< AddEvaFields>(fields, HttpStatus.OK);
    }
 
}
