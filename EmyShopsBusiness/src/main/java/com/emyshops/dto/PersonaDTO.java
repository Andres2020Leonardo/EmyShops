package com.emyshops.dto;

import java.math.BigDecimal;

public class PersonaDTO {

    private BigDecimal idPersona;
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;
    private String numIndent;
    private TipoDocumentoDTO tipoDocumento;

    public PersonaDTO() {
    }

    public PersonaDTO(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public PersonaDTO(BigDecimal idPersona, String nombres, String apellidos, String email) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
    }
 
    
    public PersonaDTO(String nombres, String apellidos, String email, String telefono, String numIndent, TipoDocumentoDTO tipoDocumento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.numIndent = numIndent;
        this.tipoDocumento = tipoDocumento;
    }

    public BigDecimal getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(BigDecimal idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumIndent() {
        return numIndent;
    }

    public void setNumIndent(String numIndent) {
        this.numIndent = numIndent;
    }

    public TipoDocumentoDTO getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return "PersonaDTO{" + "idPersona=" + idPersona + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", telefono=" + telefono + ", numIndent=" + numIndent + ", tipoDocumento=" + tipoDocumento.getDescripcion() + '}';
    }

}
