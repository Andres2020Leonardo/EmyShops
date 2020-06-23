/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.impl;

import com.emyshops.business.AbstractFacade.AbstractFacade;
import com.emyshops.business.facade.MetodoPagoFacadeLocal;
import com.emyshops.data.entity.MetodoPago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Developer
 */
@Stateless
public class MetodoPagoFacade extends AbstractFacade<MetodoPago> implements MetodoPagoFacadeLocal {

    public MetodoPagoFacade() {
        super(MetodoPago.class);
    }
    
}
