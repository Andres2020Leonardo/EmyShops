/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.impl;

import com.emyshops.business.AbstractFacade.AbstractFacade;
import com.emyshops.business.facade.ProveedorFacadeLocal;
import com.emyshops.data.entity.Proveedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Developer
 */
@Stateless
public class ProveedorFacade extends AbstractFacade<Proveedor> implements ProveedorFacadeLocal {

    public ProveedorFacade() {
        super(Proveedor.class);
    }

}
