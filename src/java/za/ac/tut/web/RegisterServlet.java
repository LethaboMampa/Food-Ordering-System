/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.Users;
import za.ac.tut.bl.UsersFacadeLocal;

/**
 *
 * @author Student
 */
public class RegisterServlet extends HttpServlet {
@EJB
private UsersFacadeLocal Uf1;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      String username =request.getParameter("txt");
      String email =request.getParameter("email");
      String password= request.getParameter("pswd");
      
      Users user =createUser(username,email,password);
      List<Users> list = Uf1.findAll();
      
     
          Uf1.create(user);
      
      RequestDispatcher disp = request.getRequestDispatcher("Index2.jsp");
      disp.forward(request, response);
        }

    private Users createUser(String username, String email, String password) {
        Users u = new Users();
        
        u.setUsername(username);
        u.setEmail(email);
        u.setPassword(password);
        return u;
    }
    }

   


