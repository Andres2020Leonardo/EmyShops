/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.impl;

import com.emyshops.business.AbstractFacade.AbstractFacade;
import com.emyshops.business.facade.ColeccionFacadeLocal;
import com.emyshops.data.entity.Coleccion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Developer
 */
@Stateless
public class ColeccionFacade extends AbstractFacade<Coleccion> implements ColeccionFacadeLocal {

    public ColeccionFacade() {
        super(Coleccion.class);
    }

}
