/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.emyshops.business.facade.conector.FacadeConector;
import com.emyshops.dto.PersonaDTO;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Developer
 */
public class PruebaActualizarPersona {
    
    FacadeConector pruebaFacade = FacadeConector.getInstance();
    
    public PruebaActualizarPersona() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void acrualizarPersona(){
        PersonaDTO personaDTO = new PersonaDTO(BigDecimal.valueOf(11), "sonia", "escobar", null);
        pruebaFacade.actualizarPersona(personaDTO);
    }
}
