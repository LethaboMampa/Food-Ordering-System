/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Coffee;

/**
 *
 * @author letha
 */
@Local
public interface CoffeeFacadeLocal {

    void create(Coffee coffee);

    void edit(Coffee coffee);
    
    Coffee getCoffe(String type);

    void remove(Coffee coffee);

    Coffee find(Object id);

    List<Coffee> findAll();

    List<Coffee> findRange(int[] range);

    int count();
    
}
