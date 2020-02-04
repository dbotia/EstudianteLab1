/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.estudiantelab1.ejb;

import com.udea.estudiantelab1.modelo.Account;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Lenovo
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {

    @PersistenceContext(unitName = "com.udea_EstudianteLab1_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }

    @Override
    public boolean checkLogin(String u, String p) {
        Query q = em.createQuery("");
        q.setParameter("u", u);
        q.setParameter("p", p);
        return q.getResultList().size()>0;
                
    }
    
    
    
    
    
    
    
    
    
    
}
