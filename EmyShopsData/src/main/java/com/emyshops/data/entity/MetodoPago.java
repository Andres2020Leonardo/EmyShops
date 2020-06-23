/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.data.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "METODO_PAGO", catalog = "", schema = "COMPRADB")
@NamedQueries({
    @NamedQuery(name = "MetodoPago.findAll", query = "SELECT m FROM MetodoPago m")
    , @NamedQuery(name = "MetodoPago.findByIdMPago", query = "SELECT m FROM MetodoPago m WHERE m.idMPago = :idMPago")
    , @NamedQuery(name = "MetodoPago.findByNombre", query = "SELECT m FROM MetodoPago m WHERE m.nombre = :nombre")})
public class MetodoPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_M_PAGO")
    private Short idMPago;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "idMetodoPago")
    private List<Pedido> pedidoList;

    public MetodoPago() {
    }

    public MetodoPago(Short idMPago) {
        this.idMPago = idMPago;
    }

    public Short getIdMPago() {
        return idMPago;
    }

    public void setIdMPago(Short idMPago) {
        this.idMPago = idMPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMPago != null ? idMPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MetodoPago)) {
            return false;
        }
        MetodoPago other = (MetodoPago) object;
        if ((this.idMPago == null && other.idMPago != null) || (this.idMPago != null && !this.idMPago.equals(other.idMPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emyshops.data.entity.MetodoPago[ idMPago=" + idMPago + " ]";
    }
    
}
