/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade;

import com.emyshops.data.entity.Marca;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Developer
 */
@Local
public interface MarcaFacadeLocal {

    void create(Marca marca);

    void edit(Marca marca);

    void remove(Marca marca);

    Marca find(Object id);

    List<Marca> findAll();

    List<Marca> findRange(int[] range);

    int count();
    
}
