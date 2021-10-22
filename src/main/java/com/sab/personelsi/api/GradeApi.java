package com.sab.personelsi.api;

import java.util.List;


import com.sab.personelsi.entities.Grade;

import com.sab.personelsi.service.GradeSvc;

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
@RequestMapping("/api/perso/grades")
public class GradeApi {
    @Autowired
    GradeSvc gradeSvc;
    @GetMapping("/{id}")
    public ResponseEntity<?> getGr(@PathVariable Long id){
       
       
        return new ResponseEntity< Grade>(gradeSvc.getGradeById(id), HttpStatus.OK);
    }
    @GetMapping("")
    public ResponseEntity<?> getAllGrs(){
        return new ResponseEntity< List<Grade> >(gradeSvc.getAllGrade(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> saveFonc(@RequestBody  Grade grade){
        return new ResponseEntity< Grade >(gradeSvc.saveGrade(grade), HttpStatus.OK);
    }
}
