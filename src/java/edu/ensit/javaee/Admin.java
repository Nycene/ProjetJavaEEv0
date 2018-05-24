/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ensit.javaee;

import static edu.ensit.javaee.Catalog.connexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Naycene Boussoffara
 */
@WebServlet(name = "Admin", urlPatterns = {"/Admin"})
public class Admin extends HttpServlet {
    String confirmation;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String password=(String)request.getParameter("password");
        String username=(String)request.getParameter("username");
         if ("sys".equals(username) && ("1234".equals(password))){
             confirmation="1";
        }
        else  confirmation="0";
         request.setAttribute("confirmation",confirmation);
        String author=(String)request.getParameter("author");
        String title=(String)request.getParameter("title");
        String price=(String)request.getParameter("price");
        String date=(String)request.getParameter("date");
        String category=(String)request.getParameter("category");
        String address=(String)request.getParameter("address");
        //Connect to the Database
        String hostdb = "localhost:1527";  			// MySQl host
        String userdb = "NIB";  			        // MySQL username
        String passdb = "1234";  			        // MySQL password
        String namedb = "Livres";  	// MySQL database name
        
        // Establish a connection to the database
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e){
            System.err.println("Echec1");
        }
        try{
            connexion=DriverManager.getConnection("jdbc:derby://localhost:1527/Livres","NIB","1234");
        } catch(SQLException e){
            System.err.println("Echec2");
        }
        try {
            Statement state=connexion.createStatement();
            request.setAttribute("state",state);   } 
        catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

       this.getServletContext().getRequestDispatcher("/WEB-INF/Admin.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
