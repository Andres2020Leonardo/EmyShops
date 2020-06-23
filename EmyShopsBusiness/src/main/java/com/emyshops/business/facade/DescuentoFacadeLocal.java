/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade;

import com.emyshops.data.entity.Descuento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Developer
 */
@Local
public interface DescuentoFacadeLocal {

    void create(Descuento descuento);

    void edit(Descuento descuento);

    void remove(Descuento descuento);

    Descuento find(Object id);

    List<Descuento> findAll();

    List<Descuento> findRange(int[] range);

    int count();
    
}
