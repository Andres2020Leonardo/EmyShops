/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.emyshops.business.facade.impl.UsuarioFacade;
import com.emyshops.business.facade.conector.FacadeConector;
import com.emyshops.dto.UsuarioDTO;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Developer
 */
public class PruebaListarUsuarios {

    
    FacadeConector pruebaFacade = FacadeConector.getInstance();
    
    public PruebaListarUsuarios() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void pruebaUsuarios() {
        UsuarioDTO dTO  = new UsuarioDTO();
        List<UsuarioDTO> listarUsuarios = pruebaFacade.consultarUsuariosDTO();
        for (UsuarioDTO listarUsuario : listarUsuarios) {
            System.out.println("listarUsuario = " + listarUsuario);
        }
    }
}
