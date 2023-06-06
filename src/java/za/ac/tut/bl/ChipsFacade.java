/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Chips;

/**
 *
 * @author letha
 */
@Stateless
public class ChipsFacade extends AbstractFacade<Chips> implements ChipsFacadeLocal {

    @PersistenceContext(unitName = "ShopEJBModelPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ChipsFacade() {
        super(Chips.class);
    }

    @Override
    public Chips getChips(String string) {
        Query query = em.createQuery("SELECT c FROM Chips c WHERE c.type = :string");
        query.setParameter("string", string);
        Chips c = (Chips)query.getSingleResult();
        return c;
    }
    
}
