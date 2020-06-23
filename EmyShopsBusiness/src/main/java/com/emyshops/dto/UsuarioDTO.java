package com.emyshops.dto;

public class UsuarioDTO {

    private Long idUsuario;
    private String userName;
    private String password;
    private PersonaDTO persona;
    private RolDTO idRol;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long idUsuario, String password, PersonaDTO persona, RolDTO idRol) {
        this.idUsuario = idUsuario;
        this.password = password;
        this.persona = persona;
        this.idRol = idRol;
    }
    
    
    
    public UsuarioDTO(String userName, String password, PersonaDTO persona, RolDTO idRol) {
        this.userName = userName;
        this.password = password;
        this.persona = persona;
        this.idRol = idRol;
    }

    public UsuarioDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    public RolDTO getIdRol() {
        return idRol;
    }

    public void setIdRol(RolDTO idRol) {
        this.idRol = idRol;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "idUsuario=" + idUsuario + ", userName=" + userName + ", password=" + password + ", persona=" + persona + ", idRol=" + idRol + '}';
    }

   

}
