package com.emyshops.data.entity;

import com.emyshops.data.entity.DetalleFactura;
import com.emyshops.data.entity.Factura;
import com.emyshops.data.entity.MetodoPago;
import com.emyshops.data.entity.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-06-23T16:43:23")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Factura> factura;
    public static volatile SingularAttribute<Pedido, Usuario> idUsuario;
    public static volatile SingularAttribute<Pedido, BigDecimal> idPedido;
    public static volatile ListAttribute<Pedido, DetalleFactura> detalleFacturaList;
    public static volatile SingularAttribute<Pedido, MetodoPago> idMetodoPago;

}