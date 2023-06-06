
package za.ac.tut.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.ChipsFacadeLocal;
import za.ac.tut.bl.CoffeeFacadeLocal;
import za.ac.tut.bl.DagWoodFacadeLocal;
import za.ac.tut.bl.FatKoekFacadeLocal;
import za.ac.tut.bl.SphahloFacadeLocal;
import za.ac.tut.entities.Card;
import za.ac.tut.entities.Chips;
import za.ac.tut.entities.Coffee;
import za.ac.tut.entities.DagWood;
import za.ac.tut.entities.FatKoek;
import za.ac.tut.entities.Sphahlo;


public class AddItemSession extends HttpServlet {
@EJB
private ChipsFacadeLocal cfl;
@EJB
private CoffeeFacadeLocal cofl;
@EJB
private DagWoodFacadeLocal dfl;
@EJB
private FatKoekFacadeLocal fkl;
@EJB
private SphahloFacadeLocal sfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = (String)request.getParameter("name");
        String type = (String)request.getParameter("type");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        String url="";
        
        if(name.equalsIgnoreCase("FatKoek"))
        {
             FatKoek fatkoek = createfatkoek(name,type,price,quantity);
             fkl.create(fatkoek);
             request.setAttribute("fatkoek", fatkoek);
             List<FatKoek> list = new ArrayList<>();
             List<Card> lit = new ArrayList<>();
             list.add(fatkoek);
             session.setAttribute("cardlist", lit);
             url = "FatKoekOutcome.jsp";
             
        }
        if(name.equalsIgnoreCase("Sphahlo"))
        {
            Sphahlo sphahlo = createsphahlo(name,type,price,quantity);
            sfl.create(sphahlo);
            request.setAttribute("sphahlo", sphahlo);
            url = "SphahloOutcome.jsp";
        }
        if(name.equalsIgnoreCase("Dag Wood"))
        {
            DagWood dagwood = createdagwood(name,type,price,quantity);
            dfl.create(dagwood);
            request.setAttribute("dagwood", dagwood);
            url = "DagWoodOutcome.jsp";
        }
        if(name.equalsIgnoreCase("Chips"))
        {
            Chips chips = createchips(name,type,price,quantity);
            cfl.create(chips);
            request.setAttribute("chips", chips);
            url = "ChipsOutcome.jsp";
            
        }
        if(name.equalsIgnoreCase("Cofee"))
        {
            Coffee coffee = createcoffee(name,type,price,quantity);
            cofl.create(coffee);
             request.setAttribute("coffee", coffee);
             url = "CofeeOutcome.jsp";
            
        }
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
        }

    private FatKoek createfatkoek(String name, String type, Double price, Integer quantity) 
    {
        FatKoek item = new FatKoek();
        item.setName(name);
        item.setType(type);
        item.setQuantity(quantity);
        item.setPrice(price);
        
        return item;
    }

    private Sphahlo createsphahlo(String name, String type, Double price, Integer quantity) {
        Sphahlo item = new Sphahlo();
        item.setName(name);
        item.setType(type);
        item.setQuantity(quantity);
        item.setPrice(price);
        
        return item;
    }

    private DagWood createdagwood(String name, String type, Double price, Integer quantity) 
    {
        DagWood item = new DagWood();
        item.setName(name);
        item.setType(type);
        item.setQuantity(quantity);
        item.setPrice(price);
        
        return item;
    }

    private Chips createchips(String name, String type, Double price, Integer quantity) 
    {
        Chips item = new Chips();
        item.setName(name);
        item.setType(type);
        item.setQuantity(quantity);
        item.setPrice(price);
        
        return item;
    }

    private Coffee createcoffee(String name, String type, Double price, Integer quantity) 
    {
        Coffee item = new Coffee();
        item.setName(name);
        item.setType(type);
        item.setQuantity(quantity);
        item.setPrice(price);
        
        return item;
    }
    }

    

       
        
    

  