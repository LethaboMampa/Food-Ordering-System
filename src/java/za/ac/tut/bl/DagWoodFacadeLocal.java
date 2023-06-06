/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.DagWood;

/**
 *
 * @author letha
 */
@Local
public interface DagWoodFacadeLocal {

    void create(DagWood dagWood);

    void edit(DagWood dagWood);
    
    DagWood getDagWood(String type);

    void remove(DagWood dagWood);

    DagWood find(Object id);

    List<DagWood> findAll();

    List<DagWood> findRange(int[] range);

    int count();
    
}
