
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
import za.ac.tut.bl.CardFacadeLocal;
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


public class AddCardSession extends HttpServlet {
@EJB
  private CardFacadeLocal ccfl;
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
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession(true);
        
        String name = (String)session.getAttribute("name");
        String type = (String)request.getParameter("type");
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        
        Double price = 0.0;
        String url = "";
      if(name.equalsIgnoreCase("FatKoek"))
        {
             FatKoek fk = fkl.getFatKoek(type);
             price = fk.getPrice();
            url = "User.jsp";
        }
        if(name.equalsIgnoreCase("Sphahlo"))
        {
           Sphahlo sp = sfl.getSphahlo(type);
           price = sp.getPrice();
            url = "User.jsp";
        }
        if(name.equalsIgnoreCase("Dag Wood"))
        {
           DagWood dw = dfl.getDagWood(type);
           price = dw.getPrice();
            url = "User.jsp";
        }
        if(name.equalsIgnoreCase("Chips"))
        {
            Chips ch = cfl.getChips(type);
            price = ch.getPrice();
             url = "User.jsp";
            
        }
        if(name.equalsIgnoreCase("Cofee"))
        {
            Coffee co = cofl.getCoffe(type);
            price = co.getPrice();
             url = "User.jsp";
            
        }
         Card card = Create(type,price,quantity);
         ccfl.create(card);
         List<Card> crds = ccfl.findAll();
         crds.add(card);
         request.setAttribute("crds", crds);
         RequestDispatcher disp = request.getRequestDispatcher(url);
         disp.forward(request, response);
         
        }

    private Card Create(String type, Double price, Integer quantity) 
    {
        Card c = new Card();
        c.setType(type);
        c.setPrice(price);
        c.setQuantity(quantity);
        
        return c;
    }
    }

 
