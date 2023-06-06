/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.DagWood;

/**
 *
 * @author letha
 */
@Stateless
public class DagWoodFacade extends AbstractFacade<DagWood> implements DagWoodFacadeLocal {

    @PersistenceContext(unitName = "ShopEJBModelPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DagWoodFacade() {
        super(DagWood.class);
    }

    @Override
    public DagWood getDagWood(String string) 
    {
         Query query = em.createQuery("SELECT c FROM DagWood c WHERE c.type = :string");
        query.setParameter("string", string);
        DagWood c = (DagWood)query.getSingleResult();
        return c;
    }
    
}
