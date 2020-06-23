/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops;

import com.emyshops.business.facade.UsuarioFacadeLocal;
import com.emyshops.business.facade.impl.UsuarioFacade;
import com.emyshops.dto.UsuarioDTO;
import java.util.List;
import javax.ejb.EJB;


/**
 *
 * @author Developer
 */
public class NewClass {
    
    @EJB
    UsuarioFacadeLocal facadeLocal;
    
    public static void main(String[] args) {
        
        
//        List<UsuarioDTO> usuarioDTOs = facadeLocal.findAll();
//        for (UsuarioDTO usuarioDTO : usuarioDTOs) {
//            System.out.println("usuarioDTO = " + usuarioDTO);
//        }
    }
}
