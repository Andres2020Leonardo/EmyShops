package com.emyshops.data.entity;

import com.emyshops.data.entity.Coleccion;
import com.emyshops.data.entity.ColeccionProductoPK;
import com.emyshops.data.entity.Producto;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-06-23T16:43:23")
@StaticMetamodel(ColeccionProducto.class)
public class ColeccionProducto_ { 

    public static volatile SingularAttribute<ColeccionProducto, BigInteger> existencia;
    public static volatile SingularAttribute<ColeccionProducto, Double> precio;
    public static volatile SingularAttribute<ColeccionProducto, Double> iva;
    public static volatile SingularAttribute<ColeccionProducto, Coleccion> coleccion;
    public static volatile SingularAttribute<ColeccionProducto, Producto> producto;
    public static volatile SingularAttribute<ColeccionProducto, ColeccionProductoPK> coleccionProductoPK;

}