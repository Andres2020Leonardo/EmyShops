/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.emyshops.business.facade.conector.FacadeConector;
import com.emyshops.dto.PersonaDTO;
import com.emyshops.dto.RolDTO;
import com.emyshops.dto.TipoDocumentoDTO;
import com.emyshops.dto.UsuarioDTO;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Developer
 */
public class PruebaRegistroUsuario {
    
    FacadeConector pruebaFacade = FacadeConector.getInstance();
    
    public PruebaRegistroUsuario() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void registroUsuario(){
        PersonaDTO personaDTO = new PersonaDTO("aleja", "escobar", "aleja@mail.com", "32423", "234231", new TipoDocumentoDTO(Short.valueOf("1")));
        UsuarioDTO usuarioDTO = new UsuarioDTO("aleja", "1234", personaDTO, new RolDTO(Short.valueOf("2")));
        pruebaFacade.registroUsuario(usuarioDTO);
    }
}
