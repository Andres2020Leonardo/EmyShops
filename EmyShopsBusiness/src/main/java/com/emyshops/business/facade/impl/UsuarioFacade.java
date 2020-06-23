/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.impl;

import com.emyshops.business.AbstractFacade.AbstractFacade;
import com.emyshops.business.facade.UsuarioFacadeLocal;
import com.emyshops.data.entity.Usuario;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Developer
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    private static UsuarioFacade instance = new UsuarioFacade();

    public UsuarioFacade() {
        super(Usuario.class);
    }

}
