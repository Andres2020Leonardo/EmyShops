/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.data.dao.Abstract;

import com.emyshops.data.entity.Persona;
import com.emyshops.data.entity.Usuario;
import java.util.List;
import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Local
public abstract class AbstractDao<T> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.emyshops_EmyShopsData_jar_1.0PU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction entityTransaction = em.getTransaction();

    private Class<T> entityClass;

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void AbstractDaocreate(T entity) {
        entityTransaction.begin();
        System.out.println("entity = " + entity);
        em.persist(entity);
        entityTransaction.commit();
        em.close();
    }

    public T findForUserAndPassword(Usuario usuario) {
        Query q = em.createNamedQuery("Usuario.findByPasswordAndUserName");
        q.setParameter("user", usuario.getUserName());
        q.setParameter("password", usuario.getPassword());
        Usuario usuarioRecibido = null;
        try {
            usuarioRecibido = (Usuario) q.getSingleResult();
        } catch (Exception e) {
            System.out.println("Error al consultar");
        }

        return (T) usuarioRecibido;

    }

    public T findForUser(Usuario usuario) {
        Query q = em.createNamedQuery("Usuario.findByUserName");
        q.setParameter("userName", usuario.getUserName());
        Usuario usuarioRecibido = null;
        try {
            usuarioRecibido = (Usuario) q.getSingleResult();
        } catch (Exception e) {
            System.out.println("Error al consultar");
        }

        return (T) usuarioRecibido;
    }

    public void AbstractDaoEdit(T entity) {
        if (entity instanceof Usuario) {
            Usuario usuario = (Usuario) entity;
            entityTransaction.begin();
             em.merge(usuario);
            entityTransaction.commit();
            em.close();
        } if (entity instanceof Persona) {
            Persona persona = (Persona) entity;
            entityTransaction.begin();
             em.merge(persona);
            entityTransaction.commit();
            em.close();
        }

    }

    public void AbstractDaoRemove(T entity) {
        em.remove(em.merge(entity));
    }

    public T AbstractDaofind(Object id) {
        if (id instanceof Usuario) {
            Usuario usuario = (Usuario) id;
            Query q = em.createNamedQuery("Usuario.findByIdUsuario");
            q.setParameter("idUsuario", usuario.getIdUsuario());
            Usuario usuarioRecibido = null;
            try {
                usuarioRecibido = (Usuario) q.getSingleResult();
            } catch (Exception e) {
                System.out.println("Error al consultar");
            }
            return (T) usuarioRecibido;
        }if (id instanceof Persona) {
            Persona persona = (Persona) id;
            Query q = em.createNamedQuery("Persona.findByIdPersona");
            q.setParameter("idPersona", persona.getIdPersona());
            Persona personaRecibido = null;
            try {
                personaRecibido = (Persona) q.getSingleResult();
            } catch (Exception e) {
                System.out.println("Error al consultar");
            }
            return (T) personaRecibido;
        }
        return null;
    }

    public List<T> AbstractDaofindAll() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }

    public List<T> AbstractDaofindRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int AbstractDaocount() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
}
