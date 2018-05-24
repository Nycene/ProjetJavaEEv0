package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            \n");
      out.write("            .group {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left:30%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css\" integrity=\"sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.1.1.slim.min.js\" integrity=\"sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\" integrity=\"sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("        <body style= \"background:#ffffff \">\n");
      out.write("        <nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\"> \n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Servlet1\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Catalog\">Catalog</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link disabled\" href=\"#\">Suggest a Book</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Search\">Search</a>\n");
      out.write("                    </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
 String confirmation=(String)request.getAttribute("confirmation");
        if ("1".equals(confirmation)){
            out.println("Succes");
        }
        else {out.println("WRONG INFORMATIONS");
          this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);}
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"group\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-dark\" data-toggle=\"modal\" data-target=\"#myModal\"> ADD A BOOK </button>\n");
      out.write("                <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\"> \n");
      out.write("                    <h2 class=\"modal-title\"> Add a Book </h2>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button></div>\n");
      out.write("                <div class=\"modal-body\"><div class=\"modal-footer\">\n");
      out.write("                <form style=\"position: relative; right: 50%;\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"formGroupExampleInput\">Title of the Book</label>\n");
      out.write("                    <input name=\"title\" type=\"text\" class=\"form-control\" id=\"formGroupExampleInput\" placeholder=\"Title\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"formGroupExampleInput2\">Author of the Book</label>\n");
      out.write("                    <input name=\"author\" type=\"text\" class=\"form-control\" id=\"formGroupExampleInput2\" placeholder=\"Author\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"formGroupExampleInput2\">Category of the Book</label>\n");
      out.write("                    <input name=\"category\" type=\"text\" class=\"form-control\" id=\"formGroupExampleInput2\" placeholder=\"Category\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"formGroupExampleInput2\">Address of the Book</label>\n");
      out.write("                    <input name=\"address\" type=\"text\" class=\"form-control\" id=\"formGroupExampleInput2\" placeholder=\"Address\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"formGroupExampleInput2\">Date of the Book</label>\n");
      out.write("                    <input name=\"date\" type=\"text\" class=\"form-control\" id=\"formGroupExampleInput2\" placeholder=\"Date\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"formGroupExampleInput2\">Price of the Book</label>\n");
      out.write("                    <input name=\"price\" type=\"text\" class=\"form-control\" id=\"formGroupExampleInput2\" placeholder=\"Price\">\n");
      out.write("                  </div>\n");
      out.write("                </form></div>\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Back</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" >Add\n");
      out.write("                ");
 String author=(String)request.getParameter("author");
                    String title=(String)request.getParameter("title");
                    String price=(String)request.getParameter("price");
                    String date=(String)request.getParameter("date");
                    String category=(String)request.getParameter("category");
                    String address=(String)request.getParameter("address");
                    Statement state=(Statement)request.getAttribute("state");
                    int rs = state.executeUpdate("INSERT INTO Livre (title, author,category,address,date,price) VALUES ('"+title+"','"+author+"','"+category+"','"+address+"','"+date+"','"+price+"');");
                    out.println(rs);
                
      out.write("\n");
      out.write("                </button></div></div>\n");
      out.write("               </div></div>\n");
      out.write("            \n");
      out.write("            <!-- 2eme !-->\n");
      out.write("             <button type=\"button\" class=\"btn btn-dark\" data-toggle=\"modal\" data-target=\"#myModal\"> DELETE A BOOK </button>\n");
      out.write("                <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("              <h2 class=\"modal-title\"> Delete a Book </h2>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button></div>\n");
      out.write("                <div class=\"modal-body\"><div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Back</button></div></div>\n");
      out.write("               </div></div></div>\n");
      out.write("             <!-- 3eme !-->\n");
      out.write("             <button type=\"button\" class=\"btn btn-dark\" data-toggle=\"modal\" data-target=\"#myModal\"> EDIT A BOOK </button>\n");
      out.write("                <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("               <h2 class=\"modal-title\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button></div>\n");
      out.write("                <div class=\"modal-body\"><div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Back</button></div></div>\n");
      out.write("               </div></div></div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
