/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.facade.conector;

import com.emyshops.business.facade.impl.PersonaFacade;
import com.emyshops.business.facade.impl.UsuarioFacade;
import com.emyshops.data.entity.Persona;
import com.emyshops.data.entity.Usuario;
import com.emyshops.data.utils.Utilities;
import com.emyshops.dto.PersonaDTO;
import com.emyshops.dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Developer
 */
public class FacadeConector {

    private static FacadeConector instance = new FacadeConector();

    UsuarioFacade usuarioFacade = new UsuarioFacade();
    
    PersonaFacade personaFacade = new PersonaFacade();
    
    

    public FacadeConector() {
        super();
    }

    public static FacadeConector getInstance() {
        if (instance == null) {
            instance = new FacadeConector();
        }
        return instance;
    }

    public List<UsuarioDTO> consultarUsuariosDTO() {

        List<Usuario> usuarios = usuarioFacade.findAll();
        List<UsuarioDTO> usuarioDTOs = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            usuarioDTOs.add(Utilities.convertUsuarioToDTO(usuario));
        }
        return usuarioDTOs;
    }

    public UsuarioDTO login(UsuarioDTO usuarioDTO) {
        Usuario usuario = Utilities.convertUsuarioToEntity(usuarioDTO);
        Usuario usuarioRecibido = usuarioFacade.findForUserAndPassword(usuario);
        UsuarioDTO usuarioDTORecibido = Utilities.convertUsuarioToDTO(usuarioRecibido);
        return usuarioDTORecibido;
    }

    public void registroUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = Utilities.convertUsuarioToEntity(usuarioDTO);
        usuarioFacade.create(usuario);
    }

    public void actualizarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuarioBuscado = usuarioFacade.find(Utilities.convertUsuarioToEntity(usuarioDTO));

        if (usuarioDTO.getIdUsuario().equals(usuarioBuscado.getIdUsuario())) {
            if (usuarioDTO.getPassword() != null) {
                usuarioBuscado.setPassword(usuarioDTO.getPassword());
            }
            if (usuarioDTO.getUserName() != null) {
                usuarioBuscado.setUserName(usuarioDTO.getUserName());
            }
            if (usuarioDTO.getIdRol() != null) {
                usuarioBuscado.setIdRol(Utilities.comvertRolToEntity(usuarioDTO.getIdRol()));
            }
            if (usuarioDTO.getPersona() != null) {
                if (usuarioDTO.getPersona().getIdPersona() != null) {

                    usuarioBuscado.setIdPersona(Utilities.convertPersonaToEntity(usuarioDTO.getPersona()));

                }
            }
            usuarioFacade.edit(usuarioBuscado);
        } else {
            System.out.println("No se puede encontrar = " + usuarioBuscado);
        }

    }

    public void actualizarPersona(PersonaDTO personaDTO) {
        Persona persona = personaFacade.find(Utilities.convertPersonaToEntity(personaDTO));

        if (personaDTO.getIdPersona().equals(persona.getIdPersona())) {
            if (personaDTO.getNombres() != null) {
                persona.setNombres(personaDTO.getNombres());
            }
            if (personaDTO.getApellidos() != null) {
                persona.setApellidos(personaDTO.getApellidos());
            }
            if (personaDTO.getEmail() != null) {
                persona.setEmail(personaDTO.getEmail());
            }
            if (personaDTO.getTelefono() != null) {
                persona.setTelefono(personaDTO.getTelefono());
            }
            personaFacade.edit(persona);
        } else {
            System.out.println("No se puede encontrar = " + persona);
        }
    }

}
