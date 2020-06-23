/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.emyshops.business.facade.conector.FacadeConector;
import com.emyshops.dto.UsuarioDTO;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Developer
 */
public class PruebaLogin {

    FacadeConector pruebaFacade = FacadeConector.getInstance();

    public PruebaLogin() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void login() {
        UsuarioDTO usuarioDTO = new UsuarioDTO("andres", "123");
        try {
            UsuarioDTO login = pruebaFacade.login(usuarioDTO);
            System.out.println("login = " + login);
            System.out.println("login = true");
        } catch (Exception e) {
            System.out.println("login = false");
        }

    }
}
