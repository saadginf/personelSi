package com.sab.personelsi.service;
import java.util.List;
import com.sab.personelsi.entities.Grade;

public interface GradeSvc {
    public Grade getGradeById(Long id);
    public List<Grade> getAllGrade();
    public Grade saveGrade(Grade grade);
}
