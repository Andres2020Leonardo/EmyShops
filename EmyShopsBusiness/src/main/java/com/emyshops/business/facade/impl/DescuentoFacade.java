/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.impl;

import com.emyshops.business.AbstractFacade.AbstractFacade;
import com.emyshops.business.facade.DescuentoFacadeLocal;
import com.emyshops.data.entity.Descuento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Developer
 */
@Stateless
public class DescuentoFacade extends AbstractFacade<Descuento> implements DescuentoFacadeLocal {

    public DescuentoFacade() {
        super(Descuento.class);
    }

}
