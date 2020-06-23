/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.impl;

import com.emyshops.business.AbstractFacade.AbstractFacade;
import com.emyshops.business.facade.TallaFacadeLocal;
import com.emyshops.data.entity.Talla;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Developer
 */
@Stateless
public class TallaFacade extends AbstractFacade<Talla> implements TallaFacadeLocal {

    public TallaFacade() {
        super(Talla.class);
    }
    
}
