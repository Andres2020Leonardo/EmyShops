/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.data.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "COLECCION", catalog = "", schema = "COMPRADB")
@NamedQueries({
    @NamedQuery(name = "Coleccion.findAll", query = "SELECT c FROM Coleccion c")
    , @NamedQuery(name = "Coleccion.findByIdColeccion", query = "SELECT c FROM Coleccion c WHERE c.idColeccion = :idColeccion")
    , @NamedQuery(name = "Coleccion.findByNombre", query = "SELECT c FROM Coleccion c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Coleccion.findByDescripcion", query = "SELECT c FROM Coleccion c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "Coleccion.findByEstado", query = "SELECT c FROM Coleccion c WHERE c.estado = :estado")})
public class Coleccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_COLECCION")
    private Integer idColeccion;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private Character estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coleccion")
    private List<ColeccionProducto> coleccionProductoList;

    public Coleccion() {
    }

    public Coleccion(Integer idColeccion) {
        this.idColeccion = idColeccion;
    }

    public Integer getIdColeccion() {
        return idColeccion;
    }

    public void setIdColeccion(Integer idColeccion) {
        this.idColeccion = idColeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public List<ColeccionProducto> getColeccionProductoList() {
        return coleccionProductoList;
    }

    public void setColeccionProductoList(List<ColeccionProducto> coleccionProductoList) {
        this.coleccionProductoList = coleccionProductoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idColeccion != null ? idColeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coleccion)) {
            return false;
        }
        Coleccion other = (Coleccion) object;
        if ((this.idColeccion == null && other.idColeccion != null) || (this.idColeccion != null && !this.idColeccion.equals(other.idColeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emyshops.data.entity.Coleccion[ idColeccion=" + idColeccion + " ]";
    }
    
}
