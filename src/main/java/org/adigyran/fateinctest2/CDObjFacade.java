/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adigyran.fateinctest2;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adigyran
 */
@Stateless
public class CDObjFacade extends AbstractFacade<CDObj> {

    @PersistenceContext(unitName = "org.sample_fateinctest2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CDObjFacade() {
        super(CDObj.class);
    }
    
}
