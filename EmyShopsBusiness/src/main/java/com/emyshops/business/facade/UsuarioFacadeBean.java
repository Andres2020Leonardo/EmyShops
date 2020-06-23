/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade;

import com.emyshops.dto.UsuarioDTO;
import java.util.List;
import javax.ejb.Local;

@Local
public interface UsuarioFacadeBean {
    
    public List<UsuarioDTO> listarUsuarios();
    
    
}
