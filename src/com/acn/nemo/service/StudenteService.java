package com.acn.nemo.service;

import com.acn.nemo.model.Studente;

public interface StudenteService {
    void getStudente(Studente studente);
    void addStudente(Studente studente);
    void modificaStudente(Studente studente);
    void cancellaStudente(Studente studente);
}
