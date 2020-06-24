package com.emyshops.data.entity;

import com.emyshops.data.entity.Factura;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-06-23T16:43:23")
@StaticMetamodel(DatosEmpresa.class)
public class DatosEmpresa_ { 

    public static volatile SingularAttribute<DatosEmpresa, String> naturaleza;
    public static volatile SingularAttribute<DatosEmpresa, String> representante;
    public static volatile SingularAttribute<DatosEmpresa, BigInteger> nit;
    public static volatile SingularAttribute<DatosEmpresa, String> direccion;
    public static volatile ListAttribute<DatosEmpresa, Factura> facturaList;
    public static volatile SingularAttribute<DatosEmpresa, Short> idEmpresa;
    public static volatile SingularAttribute<DatosEmpresa, String> telefono;
    public static volatile SingularAttribute<DatosEmpresa, String> dian;

}