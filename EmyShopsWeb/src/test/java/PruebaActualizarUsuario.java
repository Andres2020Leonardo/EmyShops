/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.emyshops.business.facade.conector.FacadeConector;
import com.emyshops.dto.PersonaDTO;
import com.emyshops.dto.RolDTO;
import com.emyshops.dto.UsuarioDTO;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Developer
 */
public class PruebaActualizarUsuario {
    
    FacadeConector pruebaFacade = FacadeConector.getInstance();
    
    public PruebaActualizarUsuario() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void actualizarUsuario(){
        PersonaDTO personaDTO = null;
        RolDTO rolDTO = null;
        UsuarioDTO usuarioDTO = new UsuarioDTO(Long.valueOf(82), "12345", personaDTO, rolDTO);
        pruebaFacade.actualizarUsuario(usuarioDTO);
    }
}
