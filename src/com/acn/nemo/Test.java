package com.acn.nemo;

import com.acn.nemo.controller.StudentController;
import com.acn.nemo.model.Studente;

public class Test {


    public static void main(String[] args){

        Studente s = new Studente();
        s.setId(1);
        s.setUsername("massimo");
        s.setLastname("caputo");

        //TODO
        //Trova Studente --- Retrive --> select
        //Aggiungi Studente -- Create --> insert
        //Modifica Studente --Update --> update
        //Rimuovi Studente  -- Delete --> delete

        StudentController controller = new StudentController();

        controller.findStudente(s);
    }
}
