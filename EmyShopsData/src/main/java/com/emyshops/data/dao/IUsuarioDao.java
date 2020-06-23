package com.emyshops.data.dao;

import com.emyshops.data.entity.Usuario;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IUsuarioDao {

    void AbstractDaocreate(Usuario usuario);

    void AbstractDaoEdit(Usuario usuario);

    void AbstractDaoRemove(Usuario usuario);

    Usuario AbstractDaofind(Object id);

    public Usuario findForUserAndPassword(Usuario usuario); 
    
    public Usuario findForUser(Usuario usuario);
            
    List<Usuario> AbstractDaofindAll();

    List<Usuario> AbstractDaofindRange(int[] range);

    int AbstractDaocount();

}
