
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.ChipsFacadeLocal;
import za.ac.tut.entities.Chips;


public class ChipsServlet extends HttpServlet {
@EJB
private ChipsFacadeLocal cfl;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         HttpSession session = request.getSession();
        List<Chips> list = cfl.findAll();

        request.setAttribute("list", list);
         String url = "";
        if(list.isEmpty())
        {
            url = "FatKoekEmpty.jsp";
        }
        else
        {
            String name = list.get(0).getName();
            session.setAttribute("name", name);
            url = "Chips.jsp";
        }
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
        }
    }
