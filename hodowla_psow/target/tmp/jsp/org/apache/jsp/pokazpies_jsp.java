package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.hodowla.domain.Pies;

public final class pokazpies_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      com.example.hodowla.service.Dane dane = null;
      synchronized (application) {
        dane = (com.example.hodowla.service.Dane) _jspx_page_context.getAttribute("dane", PageContext.APPLICATION_SCOPE);
        if (dane == null){
          dane = new com.example.hodowla.service.Dane();
          _jspx_page_context.setAttribute("dane", dane, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
 int id = Integer.parseInt(request.getParameter("id"));
    Pies pies = dane.gethodowla().get(id);
    pageContext.setAttribute("pies", pies);
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/style.css\">\r\n");
      out.write("    <title>HODOWLA</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h2 class=\"nagl\">Szczegóły o ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pies.getimie()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</h2>\r\n");
      out.write("            <div class=\"index\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pies.getzdjUrl()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br>\r\n");
      out.write("                <span> Rok urodzenia: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pies.getrok()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span><br>\r\n");
      out.write("                <span> Płeć: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pies.getplec()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span>\r\n");
      out.write("\r\n");
      out.write("                <br><br><br><a href='hodowla.jsp' class=\"button\">Wróć </a>\r\n");
      out.write("                <a href='Ed_Psa.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dane.gethodowla().indexOf(pies)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' class=\"button\">Edytuj </a>\r\n");
      out.write("                <a href='Us_Psa.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dane.gethodowla().indexOf(pies)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' class=\"button\">Usuń </a>\r\n");
      out.write("            </div></body>\r\n");
      out.write("</html>\r\n");
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
