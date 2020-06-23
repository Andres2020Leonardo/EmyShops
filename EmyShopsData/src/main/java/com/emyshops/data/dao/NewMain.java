
package com.emyshops.data.dao;

import com.emyshops.data.entity.Persona;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NewMain {

    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.emyshops_EmyShopsData_jar_1.0PU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1. Iniciar una transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 2. Ejecuta SQL de tipo select
        Persona persona1 = em.find(Persona.class, new BigDecimal(1));
        Persona persona2 = (Persona) em.createNamedQuery("Persona.findByNumIndent").setParameter("numIndent", "1075296543").getSingleResult();
        
        //Paso 3. termina la transaccion
        tx.commit();
       
        //Objeto en estado de detached
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        //Cerramos el entity manager
        em.close();
    }
    
}
