
package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.CardFacadeLocal;
import za.ac.tut.entities.Card;


public class StartServlet extends HttpServlet {
@EJB
private CardFacadeLocal cfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String type= (String)request.getParameter("type");
        String url = "";
        if(type.equalsIgnoreCase("Admin"))
        {
           url = "CheckAdmin.jsp"; 
        }
        else if(type.equalsIgnoreCase("User"))
        {
            List<Card> card = cfl.findAll();
            Integer size = card.size();
            session.setAttribute("size", size);
           session.setAttribute("card", card);
            
            url = "register.html";
        }
        
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
        }
    }

   