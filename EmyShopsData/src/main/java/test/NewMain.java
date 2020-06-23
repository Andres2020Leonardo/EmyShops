
package test;

import com.emyshops.data.entity.Persona;
import com.emyshops.data.entity.Rol;
import com.emyshops.data.entity.TipoDocumento;
import com.emyshops.data.entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class NewMain {

    public static void main(String[] args) {
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.emyshops_EmyShopsData_jar_1.0PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 1. Crea nuevo objeto
        //objeto en estado transitivo
        Persona persona1 = new Persona("diego", "velez", "diego@gmail.com", "3432134", "654321", new TipoDocumento(Short.valueOf("1")));
        
        //Crear objeto usuario (tiene dependencia con el objeto persona)
        Usuario usuario1 = new Usuario("diego", "1232", persona1, new Rol(Short.valueOf("2")));
        
        //Paso 3. persistimos el objeto usuario unicamente
        em.persist(usuario1);
        
        //Paso 4. commit transaccion
        tx.commit();
        
        //objetos en estados detached
        System.out.println("usuario1 = " + usuario1);
        System.out.println("persona1 = " + persona1);
        em.close();
        
    }
    
}
