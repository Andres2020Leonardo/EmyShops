/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.impl;

import com.emyshops.business.AbstractFacade.AbstractFacade;
import com.emyshops.business.facade.RolFacadeLocal;
import com.emyshops.data.entity.Rol;
import javax.ejb.Stateless;

/**
 *
 * @author Developer
 */
@Stateless
public class RolFacade extends AbstractFacade<Rol> implements RolFacadeLocal {

    public RolFacade() {
        super(Rol.class);
    }
    
}
