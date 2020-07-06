package com.acn.nemo.dao.impl;

import com.acn.nemo.dao.StudentDao;
import com.acn.nemo.model.Studente;
import com.acn.nemo.utils.DBUtils;

public class StudentDaoImpl implements StudentDao {
    @Override
    public int findStudent(Studente s) {

            //Si prende la connessione
            //esegue la query
            //Eventualmente gestisce / rilancia eccezioni
            DBUtils.getConnectio();
            return  1;
        }
    }
}
