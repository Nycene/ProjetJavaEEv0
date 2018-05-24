<%-- 
    Document   : Search
    Created on : 27 mars 2018, 19:19:42
    Author     : Naycene Boussoffara
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.ensit.javaee.Livre"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.persistence.Query"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            #inlineFormCustomSelect{
                width: 200px;
            }
            option{
                margin: 80px;
           font-size: 15px;
           font-family: "Serif";
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <br><br><br> 
        <form class="form-inline">
        <label class="mr-sm-2" >Preference</label>
        <select name="choisir" class="custom-select mb-2 mr-sm-2 mb-sm-0" id="inlineFormCustomSelect">
        <option selected>Choose...</option>
        <option value="1">Search by Name</option>
        <option value="2">Search by Category</option>
        <option value="3">Search by Date</option></select>
    <input type="text" name="choix" placeholder="Search here" class="form-control mx-sm-3">
    <small class="text-muted">
      Must be 4-20 characters long.
    </small>
        </form>
            <%  
                ResultSet rs=(ResultSet)request.getAttribute("rs");
            out.println("<table class=\"table\"> <tr><th scope=\"col\">Title</th><th scope=\"col\">Author</th><th scope=\"col\">Category</th></tr>");
            while (rs.next()) {
           out.println("<tr style=\"background:#f0f0f0\">");
                out.println("<td class=\"table-danger\">" + rs.getString(2)+"</td>" );
                out.println("<td class=\"table-danger\">" + rs.getString(3)+"</td>" );
                out.println("<td class=\"table-danger\">" + rs.getString(4)+"</td>" );
           out.println("</tr>");
          } out.println("</table");

            %>
   </table>
    </body>
</html>
