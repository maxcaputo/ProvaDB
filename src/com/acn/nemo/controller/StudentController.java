package com.acn.nemo.controller;

import com.acn.nemo.model.Studente;
import com.acn.nemo.service.impl.StudenteServiceImpl;

public class StudentController {

    StudenteServiceImpl studenteService = new StudenteServiceImpl();

    public void findStudente(Studente studente){

        if( checkValidita(studente)){
            studenteService.getStudente(studente);
        }
    }




    private boolean checkValidita(Studente s){

        return true;
    }
}
