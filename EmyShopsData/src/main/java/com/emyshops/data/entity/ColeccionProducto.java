/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.data.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "COLECCION_PRODUCTO", catalog = "", schema = "COMPRADB")
@NamedQueries({
    @NamedQuery(name = "ColeccionProducto.findAll", query = "SELECT c FROM ColeccionProducto c")
    , @NamedQuery(name = "ColeccionProducto.findByPrecio", query = "SELECT c FROM ColeccionProducto c WHERE c.precio = :precio")
    , @NamedQuery(name = "ColeccionProducto.findByExistencia", query = "SELECT c FROM ColeccionProducto c WHERE c.existencia = :existencia")
    , @NamedQuery(name = "ColeccionProducto.findByIdProducto", query = "SELECT c FROM ColeccionProducto c WHERE c.coleccionProductoPK.idProducto = :idProducto")
    , @NamedQuery(name = "ColeccionProducto.findByIdColeccion", query = "SELECT c FROM ColeccionProducto c WHERE c.coleccionProductoPK.idColeccion = :idColeccion")
    , @NamedQuery(name = "ColeccionProducto.findByIva", query = "SELECT c FROM ColeccionProducto c WHERE c.iva = :iva")})
public class ColeccionProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ColeccionProductoPK coleccionProductoPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO")
    private Double precio;
    @Column(name = "EXISTENCIA")
    private BigInteger existencia;
    @Column(name = "IVA")
    private Double iva;
    @JoinColumn(name = "ID_COLECCION", referencedColumnName = "ID_COLECCION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Coleccion coleccion;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID_PRODUCTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    public ColeccionProducto() {
    }

    public ColeccionProducto(ColeccionProductoPK coleccionProductoPK) {
        this.coleccionProductoPK = coleccionProductoPK;
    }

    public ColeccionProducto(BigInteger idProducto, BigInteger idColeccion) {
        this.coleccionProductoPK = new ColeccionProductoPK(idProducto, idColeccion);
    }

    public ColeccionProductoPK getColeccionProductoPK() {
        return coleccionProductoPK;
    }

    public void setColeccionProductoPK(ColeccionProductoPK coleccionProductoPK) {
        this.coleccionProductoPK = coleccionProductoPK;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public BigInteger getExistencia() {
        return existencia;
    }

    public void setExistencia(BigInteger existencia) {
        this.existencia = existencia;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Coleccion getColeccion() {
        return coleccion;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coleccionProductoPK != null ? coleccionProductoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ColeccionProducto)) {
            return false;
        }
        ColeccionProducto other = (ColeccionProducto) object;
        if ((this.coleccionProductoPK == null && other.coleccionProductoPK != null) || (this.coleccionProductoPK != null && !this.coleccionProductoPK.equals(other.coleccionProductoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emyshops.data.entity.ColeccionProducto[ coleccionProductoPK=" + coleccionProductoPK + " ]";
    }
    
}
