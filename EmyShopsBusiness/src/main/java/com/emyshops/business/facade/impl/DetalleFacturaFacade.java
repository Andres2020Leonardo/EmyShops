/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.impl;

import com.emyshops.business.AbstractFacade.AbstractFacade;
import com.emyshops.business.facade.DetalleFacturaFacadeLocal;
import com.emyshops.data.entity.DetalleFactura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Developer
 */
@Stateless
public class DetalleFacturaFacade extends AbstractFacade<DetalleFactura> implements DetalleFacturaFacadeLocal {

    public DetalleFacturaFacade() {
        super(DetalleFactura.class);
    }

}
