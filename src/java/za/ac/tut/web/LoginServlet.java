/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import za.ac.tut.bl.UsersFacadeLocal;
import za.ac.tut.entities.Users;

/**
 *
 * @author Student
 */
public class LoginServlet extends HttpServlet {
     @EJB
private UsersFacadeLocal Uf1;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses= request.getSession();
        String url = "";
    String email = request.getParameter("email");
    String password = request.getParameter("pswd");
        System.out.println(email);
    List<Users> users = Uf1.findAll();
        System.out.println(users.get(0).getPassword());
//    boolean userRegistered = false;
//    for (Users user : users) {
//        String UserName =user.getUserName();
//        String userEmail = user.getEmail();
//        String userPassword = user.getPassword();
//        ses.setAttribute("username", UserName);
//        if (userEmail.equalsIgnoreCase(email) && userPassword.equalsIgnoreCase(password)) {
//            userRegistered = true;
//            break;
//        }
//    }
//
//    if (userRegistered) {
//        // User is registered
//        url = "Home.jsp";
//       
//    } 
      url =getUrl(users,email,password,ses);
    ses.setAttribute("email", email);
    ses.setAttribute("password",password );
     RequestDispatcher disp =  request.getRequestDispatcher(url);
     disp.forward(request, response);
        }

    private String getUrl(List<Users> users, String email, String password, HttpSession ses) {
      String url="";
      Integer correct = 0,wrong = 0; 
       String usera ="";
       String pass="";
        for (int i = 0; i < users.size(); i++) {
            usera = users.get(i).getEmail();
            pass = users.get(i).getPassword();
            if(usera.equalsIgnoreCase(email) ){
                
                String name = users.get(i).getUsername();
                ses.setAttribute("names", name);
                url = "User.jsp";
               
            }
             else{
            url="Login.jsp";
        }
        }
       
        return url;
    }
    }

   
