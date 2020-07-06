package com.acn.nemo.dao;

import com.acn.nemo.model.Studente;
import com.acn.nemo.utils.DBUtils;

public class StudentDao {

    //Esegue esclusivamente interrogazioni al DB

    public int findStudent(Studente s){
        //Si prende la connessione
        //esegue la query
        //Eventualmente gestisce / rilancia eccezioni
        DBUtils.getConnectio();
        return  1;
    }
}
