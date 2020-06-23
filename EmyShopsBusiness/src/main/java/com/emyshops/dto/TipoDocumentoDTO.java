/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.dto;

import java.util.List;

/**
 *
 * @author Developer
 */
public class TipoDocumentoDTO {

    private Short idTipoDoc;
    private String descripcion;
    private List<PersonaDTO> personaList;

    public TipoDocumentoDTO() {
    }

    public TipoDocumentoDTO(Short idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public Short getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(Short idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<PersonaDTO> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<PersonaDTO> personaList) {
        this.personaList = personaList;
    }

    @Override
    public String toString() {
        return "TipoDocumentoDTO{" + "idTipoDoc=" + idTipoDoc + ", descripcion=" + descripcion + '}';
    }
    
    
}
