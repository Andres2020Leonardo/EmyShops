package com.emyshops.data.entity;

import com.emyshops.data.entity.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-06-23T16:43:23")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile ListAttribute<Marca, Producto> productoList;
    public static volatile SingularAttribute<Marca, Integer> idMarca;
    public static volatile SingularAttribute<Marca, String> nombre;

}