package com.emyshops.data.entity;

import com.emyshops.data.entity.ColeccionProducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-06-23T16:43:23")
@StaticMetamodel(Coleccion.class)
public class Coleccion_ { 

    public static volatile SingularAttribute<Coleccion, String> descripcion;
    public static volatile SingularAttribute<Coleccion, Character> estado;
    public static volatile ListAttribute<Coleccion, ColeccionProducto> coleccionProductoList;
    public static volatile SingularAttribute<Coleccion, Integer> idColeccion;
    public static volatile SingularAttribute<Coleccion, String> nombre;

}