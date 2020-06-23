package com.emyshops.dto;


public class RolDTO {

   
    private Short idRol;
    private String nombre;

    public RolDTO() {
    }

    public RolDTO(Short idRol) {
        this.idRol = idRol;
    }

    public Short getIdRol() {
        return idRol;
    }

    public void setIdRol(Short idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{" + "idRol=" + idRol + ", nombre=" + nombre + '}';
    }

}
