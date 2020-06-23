package com.emyshops.data.dao.ipml;

import com.emyshops.data.dao.Abstract.AbstractDao;
import com.emyshops.data.dao.IPersonaDao;
import com.emyshops.data.entity.Persona;
import javax.ejb.Stateless;

@Stateless
public class IPersonaDaoIpml extends AbstractDao<Persona> implements IPersonaDao {

    public IPersonaDaoIpml(Class<Persona> entityClass) {
        super(entityClass);
    }

}
