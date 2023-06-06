/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.FatKoek;

/**
 *
 * @author letha
 */
@Stateless
public class FatKoekFacade extends AbstractFacade<FatKoek> implements FatKoekFacadeLocal {

    @PersistenceContext(unitName = "ShopEJBModelPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FatKoekFacade() {
        super(FatKoek.class);
    }

    @Override
    public FatKoek getFatKoek(String string) {
         Query query = em.createQuery("SELECT c FROM FatKoek c WHERE c.type = :string");
        query.setParameter("string", string);
        FatKoek c = (FatKoek)query.getSingleResult();
        return c;
    }
    
}
