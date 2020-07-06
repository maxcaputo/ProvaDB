package com.acn.nemo.dao;

import com.acn.nemo.model.Studente;
import com.acn.nemo.utils.DBUtils;

public interface StudentDao {

    //Esegue esclusivamente interrogazioni al DB

    public int findStudent(Studente s);
}
