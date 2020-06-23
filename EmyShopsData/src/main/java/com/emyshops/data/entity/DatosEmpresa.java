/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.data.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "DATOS_EMPRESA", catalog = "", schema = "COMPRADB")
@NamedQueries({
    @NamedQuery(name = "DatosEmpresa.findAll", query = "SELECT d FROM DatosEmpresa d")
    , @NamedQuery(name = "DatosEmpresa.findByIdEmpresa", query = "SELECT d FROM DatosEmpresa d WHERE d.idEmpresa = :idEmpresa")
    , @NamedQuery(name = "DatosEmpresa.findByDian", query = "SELECT d FROM DatosEmpresa d WHERE d.dian = :dian")
    , @NamedQuery(name = "DatosEmpresa.findByNit", query = "SELECT d FROM DatosEmpresa d WHERE d.nit = :nit")
    , @NamedQuery(name = "DatosEmpresa.findByRepresentante", query = "SELECT d FROM DatosEmpresa d WHERE d.representante = :representante")
    , @NamedQuery(name = "DatosEmpresa.findByNaturaleza", query = "SELECT d FROM DatosEmpresa d WHERE d.naturaleza = :naturaleza")
    , @NamedQuery(name = "DatosEmpresa.findByTelefono", query = "SELECT d FROM DatosEmpresa d WHERE d.telefono = :telefono")
    , @NamedQuery(name = "DatosEmpresa.findByDireccion", query = "SELECT d FROM DatosEmpresa d WHERE d.direccion = :direccion")})
public class DatosEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EMPRESA")
    private Short idEmpresa;
    @Column(name = "DIAN")
    private String dian;
    @Column(name = "NIT")
    private BigInteger nit;
    @Column(name = "REPRESENTANTE")
    private String representante;
    @Column(name = "NATURALEZA")
    private String naturaleza;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "DIRECCION")
    private String direccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<Factura> facturaList;

    public DatosEmpresa() {
    }

    public DatosEmpresa(Short idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Short getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Short idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getDian() {
        return dian;
    }

    public void setDian(String dian) {
        this.dian = dian;
    }

    public BigInteger getNit() {
        return nit;
    }

    public void setNit(BigInteger nit) {
        this.nit = nit;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosEmpresa)) {
            return false;
        }
        DatosEmpresa other = (DatosEmpresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emyshops.data.entity.DatosEmpresa[ idEmpresa=" + idEmpresa + " ]";
    }
    
}
