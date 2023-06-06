/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Chips;

/**
 *
 * @author letha
 */
@Local
public interface ChipsFacadeLocal {

    void create(Chips chips);

    void edit(Chips chips);
    
    Chips getChips(String type);

    void remove(Chips chips);

    Chips find(Object id);

    List<Chips> findAll();

    List<Chips> findRange(int[] range);

    int count();
    
}
