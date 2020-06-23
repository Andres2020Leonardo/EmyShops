/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emyshops.business.AbstractFacade;

import com.emyshops.data.dao.IPersonaDao;
import com.emyshops.data.dao.IUsuarioDao;
import com.emyshops.data.dao.ipml.IPersonaDaoIpml;
import com.emyshops.data.dao.ipml.IUsuarioDaoImpl;
import com.emyshops.data.entity.Persona;
import com.emyshops.data.entity.Usuario;
import com.emyshops.data.utils.Utilities;
import com.emyshops.dto.UsuarioDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Developer
 */
public abstract class AbstractFacade<T> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.emyshops_EmyShopsData_jar_1.0PU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction entityTransaction = em.getTransaction();
    Utilities u = new Utilities();

    public Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void create(T entity) {

        if (entity instanceof Usuario) {
            System.out.println("usuario = " + entity);
            IUsuarioDao usuarioDao = new IUsuarioDaoImpl((Class<Usuario>) entityClass);
            usuarioDao.AbstractDaocreate((Usuario) entity);
        }

    }

    public Usuario findForUserAndPassword(T entity) {
        Usuario usuario = (Usuario) entity;
        IUsuarioDao usuarioDao = new IUsuarioDaoImpl((Class<Usuario>) entityClass);
        Usuario usuarioRecibido = usuarioDao.findForUserAndPassword(usuario);

        return usuarioRecibido;
    }

    public Usuario findForUser(T entity) {
        Usuario usuario = (Usuario) entity;
        IUsuarioDao usuarioDao = new IUsuarioDaoImpl((Class<Usuario>) entityClass);
        Usuario usuarioRecibido = usuarioDao.findForUserAndPassword(usuario);

        return usuarioRecibido;
    }

    public void edit(T entity) {
        if (entity instanceof Usuario) {
            Usuario usuario = (Usuario) entity;
            IUsuarioDao usuarioDao = new IUsuarioDaoImpl((Class<Usuario>) entityClass);
            usuarioDao.AbstractDaoEdit(usuario);
        }
        if (entity instanceof Persona) {
            Persona persona = (Persona) entity;
            IPersonaDao iPersonaDaoIpml = new IPersonaDaoIpml((Class<Persona>) entityClass);
            iPersonaDaoIpml.AbstractDaoEdit(persona);
        }

    }

    public void remove(T entity) {
        em.remove(em.merge(entity));
    }

    public T find(Object id) {
        if (id instanceof Usuario) {
            IUsuarioDao usuarioDao = new IUsuarioDaoImpl((Class<Usuario>) entityClass);
            return (T) usuarioDao.AbstractDaofind(id);
        }if (id instanceof Persona) {
            IPersonaDao personaDao = new IPersonaDaoIpml((Class<Persona>) entityClass);
            return (T) personaDao.AbstractDaofind(id);
        }
        return null;
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

}
