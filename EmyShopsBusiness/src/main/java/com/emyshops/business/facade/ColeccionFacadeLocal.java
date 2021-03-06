/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade;

import com.emyshops.data.entity.Coleccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Developer
 */
@Local
public interface ColeccionFacadeLocal {

    void create(Coleccion coleccion);

    void edit(Coleccion coleccion);

    void remove(Coleccion coleccion);

    Coleccion find(Object id);

    List<Coleccion> findAll();

    List<Coleccion> findRange(int[] range);

    int count();
    
}
