<%@ page import="hodowla.Pies" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="pies" class="hodowla.Pies" scope="session"/>
<jsp:setProperty name="pies" property="*"/>
<jsp:useBean id="dane" class="hodowla.Dane" scope="application"/>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    Pies test = dane.gethodowla().get(id);
    dane.edytuj(dane.gethodowla().indexOf(test),pies);
    response.sendRedirect("hodowla.jsp");
%>