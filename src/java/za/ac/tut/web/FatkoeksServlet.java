
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
import za.ac.tut.bl.FatKoekFacadeLocal;
import za.ac.tut.entities.FatKoek;

public class FatkoeksServlet extends HttpServlet {
@EJB
private FatKoekFacadeLocal fkl;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        List<FatKoek> list = fkl.findAll();
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
            url = "Fatkoeks.jsp";
        }
       
        
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
        }
    }

    
