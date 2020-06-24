package com.emyshops.data.entity;

import com.emyshops.data.entity.DetalleFacturaPK;
import com.emyshops.data.entity.Pedido;
import com.emyshops.data.entity.Producto;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-06-23T16:43:23")
@StaticMetamodel(DetalleFactura.class)
public class DetalleFactura_ { 

    public static volatile SingularAttribute<DetalleFactura, Pedido> pedido;
    public static volatile SingularAttribute<DetalleFactura, BigInteger> cantidad;
    public static volatile SingularAttribute<DetalleFactura, Producto> producto;
    public static volatile SingularAttribute<DetalleFactura, DetalleFacturaPK> detalleFacturaPK;

}