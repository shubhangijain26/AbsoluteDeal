package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=stylesheet type=text/css href=\"a.css\">\r\n");
      out.write("<style>\r\n");
      out.write("td\r\n");
      out.write("{\r\n");
      out.write("background-color: white;\r\n");
      out.write("border-bottom: 2px solid #000020;\r\n");
      out.write("border-top: 2px solid #000020;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tab\r\n");
      out.write("{\r\n");
      out.write("margin:0;\r\n");
      out.write("padding:0 0 5px;\r\n");
      out.write("font-family:\"Trebuchet MS\";\r\n");
      out.write("font-size:17px;\r\n");
      out.write("color:#787878;\r\n");
      out.write("}\r\n");
      out.write("tab1{\r\n");
      out.write("margin-bottom:16px;\r\n");
      out.write("font-size:25px;\r\n");
      out.write("font-family:\"Trebuchet MS\";\r\n");
      out.write("}\r\n");
      out.write("tab2\r\n");
      out.write("{\r\n");
      out.write("margin:0;\r\n");
      out.write("padding:0 0 5px;\r\n");
      out.write("font-family:\"Trebuchet MS\";\r\n");
      out.write("font-size:17px;\r\n");
      out.write("color:black;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("font{\r\n");
      out.write("text-align: center;\r\n");
      out.write("color:#000058;\r\n");
      out.write("font-family: \"Comic Sans MS\";\r\n");
      out.write("font-size:30px;\r\n");
      out.write("color:green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#339966;\">\r\n");
      out.write("<table border=\"0\"  cellpadding=\"40\" cellspacing=\"110\" align=\"center\" width=\"80%\" >\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<font><center>Congratulations</font><br><br>\r\n");
      out.write("<tab>Your Ad (Ad Id: 314578827) is now Posted and the changes will be visible shortly</center></tab>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.write("<tab1>Your Add Summary</tab1><br><br><br><hr>\r\n");
      out.write("<pre>\r\n");
      out.write("<tab1>");
      out.print(request.getSession().getAttribute("category").toString());
      out.write("</tab1><br>\r\n");
      out.write("<tab>Mobile No.:</tab><tab2>");
      out.print(request.getSession().getAttribute("mobno").toString());
      out.write(" </tab2> <br><br><hr>\r\n");
      out.write("<tab>Located In:</tab><tab2>");
      out.print(request.getSession().getAttribute("city").toString());
      out.write("</tab2>                              <tab>Year:</tab><tab2>");
      out.print(request.getSession().getAttribute("year").toString());
      out.write("</tab2>                              <tab>Color:</tab><tab2>");
      out.print(request.getSession().getAttribute("color").toString());
      out.write("</tab2>     <br><br>\r\n");
      out.write("<tab>Selling Price:</tab><tab2><tab2>");
      out.print(request.getSession().getAttribute("price").toString());
      out.write("</tab2></tab2>                           <tab>Name:</tab><tab2><tab2>");
      out.print(request.getSession().getAttribute("name").toString());
      out.write("</tab2></tab2>                              <tab>Email:</tab><tab2>");
      out.print(request.getSession().getAttribute("email").toString());
      out.write("</tab2>   <br><br>\r\n");
      out.write("<tab>Description:</tab><br>\r\n");
      out.write("<tab2>");
      out.print(request.getSession().getAttribute("descrip").toString());
      out.write("</tab2>\r\n");
      out.write("\r\n");
      out.write("</pre>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<div class=\"footer\" style=\"margin-bottom:0px\">\r\n");
      out.write("<p>\r\n");
      out.write("<table cellspacing=\"20\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>CONTACT </td> <td>CONNECT</td>  <td  rowspan=\"5\">Mail Us:\r\n");
      out.write("Flipkart Internet Pvt Ltd Block B (Begonia),\r\n");
      out.write("\r\n");
      out.write("Ground Floor, Embassy Tech Village,\r\n");
      out.write("\r\n");
      out.write("Outer Ring Road, Devarabeesanahalli Village,\r\n");
      out.write("\r\n");
      out.write("Varthur Hobli, Bengaluru East Taluk,\r\n");
      out.write("\r\n");
      out.write("Bengaluru District,\r\n");
      out.write("\r\n");
      out.write("Karnataka, India, 560103.</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Info@quikr.com </td>  <td>Facebook</td>                           \r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Helpline number:65892309</td> <td>Twitter</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Sarojini,Delhi</td> <td>Instagram</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Suite 701</td> <td>Linkedin</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
