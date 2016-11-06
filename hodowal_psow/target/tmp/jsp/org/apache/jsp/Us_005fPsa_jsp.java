package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hodowla.Pies;

public final class Us_005fPsa_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      hodowla.Pies pies = null;
      synchronized (session) {
        pies = (hodowla.Pies) _jspx_page_context.getAttribute("pies", PageContext.SESSION_SCOPE);
        if (pies == null){
          pies = new hodowla.Pies();
          _jspx_page_context.setAttribute("pies", pies, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("pies"), request);
      out.write('\r');
      out.write('\n');
      hodowla.Dane dane = null;
      synchronized (application) {
        dane = (hodowla.Dane) _jspx_page_context.getAttribute("dane", PageContext.APPLICATION_SCOPE);
        if (dane == null){
          dane = new hodowla.Dane();
          _jspx_page_context.setAttribute("dane", dane, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

    int id = Integer.parseInt(request.getParameter("id"));
    dane.usun(1);
    response.sendRedirect("hodowla.jsp");

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
