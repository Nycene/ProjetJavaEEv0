package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.List;
import java.util.ArrayList;
import edu.ensit.javaee.Livre;
import java.sql.Connection;
import javax.persistence.Query;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Statement;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("            #inlineFormCustomSelect{\n");
      out.write("                width: 200px;\n");
      out.write("            }\n");
      out.write("            option{\n");
      out.write("                margin: 80px;\n");
      out.write("           font-size: 15px;\n");
      out.write("           font-family: \"Serif\";\n");
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
      out.write("        <br><br><br> \n");
      out.write("        <form class=\"form-inline\">\n");
      out.write("        <label class=\"mr-sm-2\" >Preference</label>\n");
      out.write("        <select name=\"choisir\" class=\"custom-select mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormCustomSelect\">\n");
      out.write("        <option selected>Choose...</option>\n");
      out.write("        <option value=\"1\">Search by Name</option>\n");
      out.write("        <option value=\"2\">Search by Category</option>\n");
      out.write("        <option value=\"3\">Search by Date</option></select>\n");
      out.write("    <input type=\"text\" name=\"choix\" placeholder=\"Search here\" class=\"form-control mx-sm-3\">\n");
      out.write("    <small class=\"text-muted\">\n");
      out.write("      Must be 4-20 characters long.\n");
      out.write("    </small>\n");
      out.write("        </form>\n");
      out.write("        ");
  Statement stmt=(Statement)request.getAttribute("stmt");
        String choisir=(String)request.getAttribute("choisir");
        String choix=(String)request.getAttribute("choix");
        ResultSet rs=null;
            if ("1".equals(choisir) || (choisir!=null) ){
            rs = stmt.executeQuery("Select * from Livre WHERE TITLE='"+choix+"'");}
            else if ("2".equals(choisir) || (choisir!=null) ){
            rs = stmt.executeQuery("Select * from Livre WHERE CATEGORY='"+choix+"'");}
            else {
            rs = stmt.executeQuery("Select * from Livre WHERE DATE='"+choix+"'"); }
             System.out.println("choisir puis choix "+choisir+" "+choix);
            
      out.write(" \n");
      out.write("            \n");
      out.write("        ");
  out.println("<table class=\"table\"> <tr><th scope=\"col\">Title</th><th scope=\"col\">Author</th><th scope=\"col\">Category</th></tr>");
            while (rs.next()) {
           out.println("<tr style=\"background:#f0f0f0\">");
                out.println("<td class=\"table-danger\">" + rs.getString(2)+"</td>" );
                out.println("<td class=\"table-danger\">" + rs.getString(3)+"</td>" );
                out.println("<td class=\"table-danger\">" + rs.getString(4)+"</td>" );
           out.println("</tr>");
          } out.println("</table");

            
      out.write("\n");
      out.write("   </table>\n");
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
