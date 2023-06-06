
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
import za.ac.tut.bl.SphahloFacadeLocal;
import za.ac.tut.entities.Sphahlo;


public class SphahloServlet extends HttpServlet {
@EJB
private SphahloFacadeLocal sfl;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        List<Sphahlo> list = sfl.findAll();
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
            url = "Sphahlo.jsp";
        }
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
        }
    }


    
