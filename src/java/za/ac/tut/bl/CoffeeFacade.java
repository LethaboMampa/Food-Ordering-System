/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Coffee;

/**
 *
 * @author letha
 */
@Stateless
public class CoffeeFacade extends AbstractFacade<Coffee> implements CoffeeFacadeLocal {

    @PersistenceContext(unitName = "ShopEJBModelPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CoffeeFacade() {
        super(Coffee.class);
    }

    @Override
    public Coffee getCoffe(String string)
    {
         Query query = em.createQuery("SELECT c FROM Coffee c WHERE c.type = :string");
        query.setParameter("string", string);
        Coffee c = (Coffee)query.getSingleResult();
        return c;
    }
    
}
