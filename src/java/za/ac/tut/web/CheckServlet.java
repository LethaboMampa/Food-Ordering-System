/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CheckServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String code = (String)request.getParameter("code");
        String url = "";
        if(code.equalsIgnoreCase("123"))
        {
            url = "Admin.jsp";
        }
        else
        {
            String message = "Incorrect code";
            request.setAttribute("message", message);
            url = "CheckAdmin.jsp";
        }
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
      
        
        }
    }

   