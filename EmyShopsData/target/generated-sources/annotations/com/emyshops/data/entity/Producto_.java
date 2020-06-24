package com.emyshops.data.entity;

import com.emyshops.data.entity.Categoria;
import com.emyshops.data.entity.ColeccionProducto;
import com.emyshops.data.entity.Color;
import com.emyshops.data.entity.Descuento;
import com.emyshops.data.entity.DetalleFactura;
import com.emyshops.data.entity.Marca;
import com.emyshops.data.entity.Proveedor;
import com.emyshops.data.entity.Talla;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-06-23T16:43:23")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Proveedor> idProvedor;
    public static volatile ListAttribute<Producto, Descuento> descuentoList;
    public static volatile ListAttribute<Producto, ColeccionProducto> coleccionProductoList;
    public static volatile SingularAttribute<Producto, Talla> idTalla;
    public static volatile SingularAttribute<Producto, BigDecimal> idProducto;
    public static volatile ListAttribute<Producto, DetalleFactura> detalleFacturaList;
    public static volatile SingularAttribute<Producto, Categoria> idCategoria;
    public static volatile SingularAttribute<Producto, Marca> idMarca;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Color> idColor;

}