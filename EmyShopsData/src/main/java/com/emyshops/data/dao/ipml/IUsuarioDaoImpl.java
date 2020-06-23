package com.emyshops.data.dao.ipml;

import com.emyshops.data.dao.Abstract.AbstractDao;
import com.emyshops.data.dao.IUsuarioDao;
import com.emyshops.data.entity.Usuario;
import javax.ejb.Stateless;

@Stateless
public class IUsuarioDaoImpl extends AbstractDao<Usuario> implements IUsuarioDao {

    public IUsuarioDaoImpl(Class<Usuario> entityClass) {
        super(entityClass);
    }

}
