
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="pies" class="com.example.hodowla.domain.Pies" scope="session"/>
<!-- <jsp:setProperty name="pies" property="*"/> -->
<jsp:useBean id="dane" class="com.example.hodowla.service.Dane" scope="application"/>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    dane.edytuj(pies, id);
    //out.println(pies.getimie());
    response.sendRedirect("hodowla.jsp");
%>