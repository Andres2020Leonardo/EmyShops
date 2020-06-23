/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade;

import com.emyshops.data.entity.DatosEmpresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Developer
 */
@Local
public interface DatosEmpresaFacadeLocal {

    void create(DatosEmpresa datosEmpresa);

    void edit(DatosEmpresa datosEmpresa);

    void remove(DatosEmpresa datosEmpresa);

    DatosEmpresa find(Object id);

    List<DatosEmpresa> findAll();

    List<DatosEmpresa> findRange(int[] range);

    int count();
    
}
