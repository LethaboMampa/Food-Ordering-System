/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.FatKoek;

/**
 *
 * @author letha
 */
@Local
public interface FatKoekFacadeLocal {

    void create(FatKoek fatKoek);

    void edit(FatKoek fatKoek);
    
    FatKoek getFatKoek(String type);

    void remove(FatKoek fatKoek);

    FatKoek find(Object id);

    List<FatKoek> findAll();

    List<FatKoek> findRange(int[] range);

    int count();
    
}
