/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.data.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Developer
 */
@Embeddable
public class ColeccionProductoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_PRODUCTO")
    private BigInteger idProducto;
    @Basic(optional = false)
    @Column(name = "ID_COLECCION")
    private BigInteger idColeccion;

    public ColeccionProductoPK() {
    }

    public ColeccionProductoPK(BigInteger idProducto, BigInteger idColeccion) {
        this.idProducto = idProducto;
        this.idColeccion = idColeccion;
    }

    public BigInteger getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(BigInteger idProducto) {
        this.idProducto = idProducto;
    }

    public BigInteger getIdColeccion() {
        return idColeccion;
    }

    public void setIdColeccion(BigInteger idColeccion) {
        this.idColeccion = idColeccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        hash += (idColeccion != null ? idColeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ColeccionProductoPK)) {
            return false;
        }
        ColeccionProductoPK other = (ColeccionProductoPK) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        if ((this.idColeccion == null && other.idColeccion != null) || (this.idColeccion != null && !this.idColeccion.equals(other.idColeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emyshops.data.entity.ColeccionProductoPK[ idProducto=" + idProducto + ", idColeccion=" + idColeccion + " ]";
    }
    
}
