/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Sphahlo;

/**
 *
 * @author letha
 */
@Stateless
public class SphahloFacade extends AbstractFacade<Sphahlo> implements SphahloFacadeLocal {

    @PersistenceContext(unitName = "ShopEJBModelPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SphahloFacade() {
        super(Sphahlo.class);
    }

    @Override
    public Sphahlo getSphahlo(String string) 
    {
         Query query = em.createQuery("SELECT c FROM Sphahlo c WHERE c.type = :string");
        query.setParameter("string", string);
        Sphahlo c = (Sphahlo)query.getSingleResult();
        return c;
    }
    
}
