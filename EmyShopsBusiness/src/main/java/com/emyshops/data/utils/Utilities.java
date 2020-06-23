package com.emyshops.data.utils;

import com.emyshops.data.entity.Persona;
import com.emyshops.data.entity.Rol;
import com.emyshops.data.entity.TipoDocumento;
import com.emyshops.data.entity.Usuario;
import com.emyshops.dto.PersonaDTO;
import com.emyshops.dto.RolDTO;
import com.emyshops.dto.TipoDocumentoDTO;
import com.emyshops.dto.UsuarioDTO;

public class Utilities {

    public static Persona convertPersonaToEntity(PersonaDTO personaDTO) {
        if (personaDTO == null) {
            return null;
        } else {
            Persona persona = new Persona();
            persona.setIdPersona(personaDTO.getIdPersona());
            persona.setNombres(personaDTO.getNombres());
            persona.setApellidos(personaDTO.getApellidos());
            persona.setEmail(personaDTO.getEmail());
            persona.setTelefono(personaDTO.getTelefono());
            persona.setIdTipoDocum(Utilities.convertTipoDocToEntity(personaDTO.getTipoDocumento()));
            persona.setNumIndent(personaDTO.getNumIndent());
            return persona;
        }
    }

    public static PersonaDTO convertPersonaToDTO(Persona persona) {
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setIdPersona(persona.getIdPersona());
        personaDTO.setNombres(persona.getNombres());
        personaDTO.setApellidos(persona.getApellidos());
        personaDTO.setEmail(persona.getEmail());
        personaDTO.setTelefono(persona.getTelefono());
        personaDTO.setTipoDocumento(Utilities.convertTipoDocToDTO(persona.getIdTipoDocum()));
        personaDTO.setNumIndent(persona.getNumIndent());
        return personaDTO;
    }

    public static Usuario convertUsuarioToEntity(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(usuarioDTO.getIdUsuario());
        usuario.setUserName(usuarioDTO.getUserName());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setIdRol(comvertRolToEntity(usuarioDTO.getIdRol()));
        usuario.setIdPersona(convertPersonaToEntity(usuarioDTO.getPersona()));
        System.out.println("Persona = " + usuarioDTO.getPersona());
        return usuario;
    }

    public static UsuarioDTO convertUsuarioToDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setIdUsuario(usuario.getIdUsuario());
        usuarioDTO.setUserName(usuario.getUserName());
        usuarioDTO.setPassword(usuario.getPassword());
        usuarioDTO.setIdRol(comvertRolToDTO(usuario.getIdRol()));
        usuarioDTO.setPersona(convertPersonaToDTO(usuario.getIdPersona()));
        return usuarioDTO;
    }

    public static Rol comvertRolToEntity(RolDTO rolDTO) {
        if (rolDTO == null) {
            return null;
        } else {
            Rol rol = new Rol();
            rol.setIdRol(rolDTO.getIdRol());
            rol.setNombre(rolDTO.getNombre());
            return rol;
        }

    }

    public static RolDTO comvertRolToDTO(Rol rol) {
        RolDTO rolDTO = new RolDTO();
        rolDTO.setNombre(rol.getNombre());
        rolDTO.setIdRol(rol.getIdRol());
        return rolDTO;
    }

    public static TipoDocumentoDTO convertTipoDocToDTO(TipoDocumento tipoDocumento) {
        if (tipoDocumento == null) {
            return null;
        } else {
            TipoDocumentoDTO documentoDTO = new TipoDocumentoDTO();
            documentoDTO.setIdTipoDoc(tipoDocumento.getIdTipoDoc());
            documentoDTO.setDescripcion(tipoDocumento.getDescripcion());
            return documentoDTO;
        }
    }

    public static TipoDocumento convertTipoDocToEntity(TipoDocumentoDTO documentoDTO) {
        if (documentoDTO == null) {
            return null;
        } else {
            TipoDocumento documento = new TipoDocumento();
            documento.setIdTipoDoc(documentoDTO.getIdTipoDoc());
            documento.setDescripcion(documentoDTO.getDescripcion());
            return documento;
        }
    }

}
