package com.sab.personelsi.api;



import com.sab.personelsi.entities.Personnel;

import com.sab.personelsi.service.PersonelSiSvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/perso")
public class PersonelApi {
    @Autowired
    PersonelSiSvc persoSvc;
    @GetMapping("/{id}")
    public ResponseEntity<?> getPerso(@PathVariable Long id){
       
        return new ResponseEntity< Personnel >(persoSvc.getPersonnelById(id), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> saveOrgane(@RequestBody  Personnel personnel){
        return new ResponseEntity< Personnel >(persoSvc.savePersonnel(personnel), HttpStatus.OK);
    }
}


