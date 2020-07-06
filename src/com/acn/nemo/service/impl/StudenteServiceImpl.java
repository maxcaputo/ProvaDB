package com.acn.nemo.service.impl;

import com.acn.nemo.dao.StudentDao;
import com.acn.nemo.model.Studente;
import com.acn.nemo.service.StudenteService;

public class StudenteServiceImpl implements StudenteService {

    StudentDao studentDao = new StudentDao();

    @Override
    public void getStudente(Studente studente) {
        int result = studentDao.findStudent(studente);
        if( result > 1 ){


        }else{

        }
    }

    @Override
    public void addStudente(Studente studente) {
        //Verifica se l'utente già esiste
        //If se non esiste --> aggiunge
    }

    @Override
    public void modificaStudente(Studente studente) {

    }

    @Override
    public void cancellaStudente(Studente studente) {

    }
}
