<%@ page import="hodowla.Pies" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="pies" class="hodowla.Pies" scope="session"/>
<jsp:setProperty name="pies" property="*"/>
<jsp:useBean id="dane" class="hodowla.Dane" scope="application"/>

<%
    dane.dodaj(pies);
    response.sendRedirect("hodowla.jsp");
%>