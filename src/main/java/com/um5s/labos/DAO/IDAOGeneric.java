package com.um5s.labos.DAO;

import java.util.List;

/**
 * Created by l.IsSaM.l on 26/06/2017.
 */
public interface IDAOGeneric<T> {


    void ajouter(T u);


    T modifier(T u) ;

    void supprimer(T u);

    List<T> getAll();


    T parID(long id);
}
