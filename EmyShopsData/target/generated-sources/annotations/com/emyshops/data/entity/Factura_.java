package com.emyshops.data.entity;

import com.emyshops.data.entity.DatosEmpresa;
import com.emyshops.data.entity.Pedido;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-06-23T16:43:23")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, BigDecimal> idFactura;
    public static volatile SingularAttribute<Factura, DatosEmpresa> idEmpresa;
    public static volatile SingularAttribute<Factura, Pedido> idPedido;

}