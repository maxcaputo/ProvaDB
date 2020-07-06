package com.acn.nemo.controller;

import com.acn.nemo.model.Studente;
import com.acn.nemo.service.StudenteService;
import com.acn.nemo.service.impl.StudenteServiceImpl;

public class StudentController {

    StudenteService studenteService = new StudenteServiceImpl();

    public void findStudente(Studente studente){

        if( checkValidita(studente)){
            studenteService.getStudente(studente);
            Syste
        }
    }




    private boolean checkValidita(Studente s){

        return true;
    }
}
