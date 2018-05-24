<%-- 
    Document   : Admin
    Created on : 7 avr. 2018, 09:54:51
    Author     : Naycene Boussoffara
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            
            .group {
                position: absolute;
                top: 50%;
                left:30%;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <% String confirmation=(String)request.getAttribute("confirmation");
        if ("1".equals(confirmation)){
            out.println("Succes");
        }
        else {out.println("WRONG INFORMATIONS");
          this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);}%>

          <div class="group">
            <button type="button" class="btn btn-dark" data-toggle="modal" data-target="#myModal"> ADD A BOOK </button>
                <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">
                <div class="modal-content">
                <div class="modal-header"> 
                    <h2 class="modal-title"> Add a Book </h2>
                <button type="button" class="close" data-dismiss="modal">&times;</button></div>
                <div class="modal-body"><div class="modal-footer">
                <form style="position: relative; right: 50%;">
                  <div class="form-group">
                    <label for="formGroupExampleInput">Title of the Book</label>
                    <input name="title" type="text" class="form-control" id="formGroupExampleInput" placeholder="Title">
                  </div>
                  <div class="form-group">
                    <label for="formGroupExampleInput2">Author of the Book</label>
                    <input name="author" type="text" class="form-control" id="formGroupExampleInput2" placeholder="Author">
                  </div>
                    <div class="form-group">
                    <label for="formGroupExampleInput2">Category of the Book</label>
                    <input name="category" type="text" class="form-control" id="formGroupExampleInput2" placeholder="Category">
                  </div>
                    <div class="form-group">
                    <label for="formGroupExampleInput2">Address of the Book</label>
                    <input name="address" type="text" class="form-control" id="formGroupExampleInput2" placeholder="Address">
                  </div>
                    <div class="form-group">
                    <label for="formGroupExampleInput2">Date of the Book</label>
                    <input name="date" type="text" class="form-control" id="formGroupExampleInput2" placeholder="Date">
                  </div>
                    <div class="form-group">
                    <label for="formGroupExampleInput2">Price of the Book</label>
                    <input name="price" type="text" class="form-control" id="formGroupExampleInput2" placeholder="Price">
                  </div>
                </form></div>
                <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
                <button type="button" class="btn btn-danger" >Add
                <% String author=(String)request.getParameter("author");
                    String title=(String)request.getParameter("title");
                    String price=(String)request.getParameter("price");
                    String date=(String)request.getParameter("date");
                    String category=(String)request.getParameter("category");
                    String address=(String)request.getParameter("address");
                    Statement state=(Statement)request.getAttribute("state");
                    if (!(title==null)){
                    ResultSet rs = state.executeQuery("INSERT INTO Livre (title,author,category,date,price) VALUES ('"+title+"','"+author+"','"+category+"','"+date+"',"+price+")");
                    out.println(rs);
                    out.println(title);}
                %>
                </button></div></div>
               </div></div>
            
            <!-- 2eme !-->
             <button type="button" class="btn btn-dark" data-toggle="modal" data-target="#myModal"> DELETE A BOOK </button>
                <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">
                <div class="modal-content">
                <div class="modal-header">
              <h2 class="modal-title"> Delete a Book </h2>
                <button type="button" class="close" data-dismiss="modal">&times;</button></div>
                <div class="modal-body"><div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button></div></div>
               </div></div></div>
             <!-- 3eme !-->
             <button type="button" class="btn btn-dark" data-toggle="modal" data-target="#myModal"> EDIT A BOOK </button>
                <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">
                <div class="modal-content">
                <div class="modal-header">
               <h2 class="modal-title">
                <button type="button" class="close" data-dismiss="modal">&times;</button></div>
                <div class="modal-body"><div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button></div></div>
               </div></div></div>
            </div>
    </body>
</html>
