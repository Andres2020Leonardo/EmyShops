package com.emyshops.data.dao;


import com.emyshops.data.entity.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IPersonaDao {

    void AbstractDaocreate(Persona persona);

    void AbstractDaoEdit(Persona persona);

    void AbstractDaoRemove(Persona persona);

    Persona AbstractDaofind(Object id);
            
    List<Persona> AbstractDaofindAll();

    List<Persona> AbstractDaofindRange(int[] range);

    int AbstractDaocount();

}
