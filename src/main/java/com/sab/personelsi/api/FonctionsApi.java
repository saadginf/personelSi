package com.sab.personelsi.api;

import java.util.List;

import com.sab.personelsi.entities.FonctionSi;
import com.sab.personelsi.service.FoncSvc;

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
@RequestMapping("/api/perso/fonctions")
public class FonctionsApi {
    @Autowired
    FoncSvc foncService;
    @GetMapping("/{id}")
    public ResponseEntity<?> getFonc(@PathVariable Long id){
       
       
        return new ResponseEntity< FonctionSi>(foncService.getFonctionSi(id), HttpStatus.OK);
    }
    @GetMapping("")
    public ResponseEntity<?> getAllFonc(){
        return new ResponseEntity< List<FonctionSi> >(foncService.getAllFonctionsSi(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> saveFonc(@RequestBody  FonctionSi fonc){
        return new ResponseEntity< FonctionSi >(foncService.saveFonctionSi(fonc), HttpStatus.OK);
    }
}
