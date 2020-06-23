/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.impl;

import com.emyshops.business.AbstractFacade.AbstractFacade;
import com.emyshops.business.facade.PersonaFacadeLocal;
import com.emyshops.data.entity.Persona;
import javax.ejb.Stateless;

/**
 *
 * @author Developer
 */
@Stateless
public class PersonaFacade extends AbstractFacade<Persona> implements PersonaFacadeLocal {

    public PersonaFacade() {
        super(Persona.class);
    }
    
}
