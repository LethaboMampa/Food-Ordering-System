/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Sphahlo;

/**
 *
 * @author letha
 */
@Local
public interface SphahloFacadeLocal {

    void create(Sphahlo sphahlo);

    void edit(Sphahlo sphahlo);
    
    Sphahlo getSphahlo(String type);

    void remove(Sphahlo sphahlo);

    Sphahlo find(Object id);

    List<Sphahlo> findAll();

    List<Sphahlo> findRange(int[] range);

    int count();
    
}
