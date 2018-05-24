<%-- 
    Document   : Catalog
    Created on : 26 mars 2018, 17:21:53
    Author     : Naycene Boussoffara
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
           <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    </head>
    <style type="text/css">
        .span{
            margin: 80px;
           font-size: 50px;
           font-family: "Goudy Old Style";
           color: #112222;
        }
        </style>
        <body style= "background:#ffffff ">
        <%@include file="header.jsp" %>
        <br><br><br>
        <div class="span" > <strong>+99</strong> BOOKS ARE AT YOUR DISPOSAL ...</div>
        <br><br>
         <select name="choisir" class="form-control" id="inlineFormCustomSelect">
        <option selected>Choose...</option>
        <option value="1">Sort by Name</option>
        <option value="2">Sort by Price</option>
        </select>
         <table class="table">
          <tr>
            <th scope="col">Title</th>
              <th scope="col">Author</th>
              <th scope="col">Category</th>
          </tr>
        
        <% ResultSet rs;
           Statement state=(Statement)request.getAttribute("state");
           String choisir=(String)request.getParameter("choisir");
            if ("1".equals(choisir) ){
                 rs = state.executeQuery("select * from Livre ORDER BY Name");}
            else if("2".equals(choisir) ) {
                rs = state.executeQuery("Select * from Livre ORDER BY Price");}
            else 
                 rs=state.executeQuery("SELECT * FROM Livre");
           
            while (rs.next()){
                System.out.println("Succes");
                out.println("<tr style=\"background:#f0f0f0\">");
                out.println("<td class=\"table-danger\">" + rs.getString(2)+"</td>" );
                out.println("<td class=\"table-danger\">" + rs.getString(3)+"</td>" );
                out.println("<td class=\"table-danger\">" + rs.getString(4)+"</td>" );
                out.println("<td class=\"table-danger\">" );
                out.println("<button type=\"button\" class=\"btn btn-dark\" data-toggle=\"modal\" data-target=\"#myModal\"> More Infos</button>");
                out.println("<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">");
                out.println("<div class=\"modal-dialog\">");
                out.println("javascript:void(0);");
                out.println("<div class=\"modal-content\">");
                out.println("<div class=\"modal-header\">");
                out.println("<h2 class=\"modal-title\">");
                out.println(rs.getString(2)+"</h2>");
                out.println("<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button></div>");
                System.out.println("Iteration "+rs.getString(2));
                out.println("<div class=\"modal-body\">");
                out.println("<img src="+rs.getString(5)+"></div>");
                out.println("<div class=\"modal-footer\"><button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Back</button></div></div>");
                out.println("</div></div></div>");
                out.write("</tr> ");
            }
            System.out.println(choisir);
        %>
            </table>
    </body>
</html>
