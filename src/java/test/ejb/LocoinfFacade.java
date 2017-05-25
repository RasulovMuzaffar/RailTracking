/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import test.model.Locoinf;

/**
 *
 * @author LapasovFG.VCRP
 */
@Stateless
public class LocoinfFacade extends AbstractFacade<Locoinf> {
    @PersistenceContext(unitName = "TestGPSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LocoinfFacade() {
        super(Locoinf.class);
    }
    
}
