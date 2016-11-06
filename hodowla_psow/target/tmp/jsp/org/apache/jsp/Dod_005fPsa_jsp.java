package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dod_005fPsa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      com.example.hodowla.service.Dane dane = null;
      synchronized (application) {
        dane = (com.example.hodowla.service.Dane) _jspx_page_context.getAttribute("dane", PageContext.APPLICATION_SCOPE);
        if (dane == null){
          dane = new com.example.hodowla.service.Dane();
          _jspx_page_context.setAttribute("dane", dane, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/style.css\">\r\n");
      out.write("    <title>HODOWLA</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<article>\r\n");
      out.write("    <h1 class=\"nagl\">Dodaj psa:</h1>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"dodaj.jsp\" class=\"index\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"imie\">Imie:</label><br>\r\n");
      out.write("                <input id=\"imie\" type=\"text\" name=\"imie\" class=\"pole\" required/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"rok\">Rok urodzenia:</label><br>\r\n");
      out.write("                <input id=\"rok\" type=\"number\" name=\"rok\" class=\"pole\" value=\"\" min=\"1990\" max=\"2017\" required/>\r\n");
      out.write("            </div>\r\n");
      out.write("                <label for=\"plec\">Płeć:</label><br>\r\n");
      out.write("                <select id=\"plec\" name=\"plec\" class=\"pole\">\r\n");
      out.write("                    <option>samica</option>\r\n");
      out.write("                    <option>samiec</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"zdjUrl\">Link zdjęcia:</label><br>\r\n");
      out.write("                <input id=\"zdjUrl\" type=\"url\" name=\"zdjUrl\" value=\"\" class=\"pole\" required/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <a href=\"hodowla.jsp\" class=\"button\">Wróć</a>\r\n");
      out.write("                <input type=\"submit\" class=\"button2\" value=\"Dodaj\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("</article>\r\n");
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
