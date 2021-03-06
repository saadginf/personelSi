package com.sab.personelsi.api;

import java.util.List;

import com.sab.personelsi.entities.Organe;
import com.sab.personelsi.service.OrganeSvc;

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
@RequestMapping("/api/perso/organes")
public class OrganeApi {
    @Autowired
    OrganeSvc orService;
    @GetMapping("/{id}")
    public ResponseEntity<?> getOrgane(@PathVariable Long id){
       
       
        return new ResponseEntity< Organe >(orService.getOrganeById(id), HttpStatus.OK);
    }
    @GetMapping("")
    public ResponseEntity<?> getAllOrganes(){
        return new ResponseEntity< List<Organe> >(orService.getAllOrganes(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> saveOrgane(@RequestBody  Organe organe){
        return new ResponseEntity< Organe >(orService.saveOrgane(organe), HttpStatus.OK);
    }
}
