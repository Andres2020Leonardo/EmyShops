/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade;

import com.emyshops.data.entity.ColeccionProducto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Developer
 */
@Local
public interface ColeccionProductoFacadeLocal {

    void create(ColeccionProducto coleccionProducto);

    void edit(ColeccionProducto coleccionProducto);

    void remove(ColeccionProducto coleccionProducto);

    ColeccionProducto find(Object id);

    List<ColeccionProducto> findAll();

    List<ColeccionProducto> findRange(int[] range);

    int count();
    
}
