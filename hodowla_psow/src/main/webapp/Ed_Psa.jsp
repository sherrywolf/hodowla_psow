<%@ page import="com.example.hodowla.domain.Pies" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dane" class="com.example.hodowla.service.Dane" scope="application"/>
<% int id = Integer.parseInt(request.getParameter("id"));
    Pies pies = dane.gethodowla().get(id);
    pageContext.setAttribute("pies", pies);
%>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HODOWLA</title>
</head>

<body>

<article>
    <h1>Edycja psa o id ${dane.gethodowla().indexOf(pies)}:</h1>

    <form action="edytuj.jsp">
        <input type="hidden" name="id" value="${dane.gethodowla().indexOf(pies)}"/>
        <div>
            <label for="imie">Imie</label>
            <input id="imie" type="text" name="imie" value="${pies.getimie()}" required/>
        </div>
        <div>
            <label for="rok">Rok urodzenia:</label>
            <input id="rok" type="number" name="rok" value="${pies.getrok()}" min="1990" max="2017" required/>
        </div>
        <label for="plec">Płeć</label>
        <select id="plec" name="plec">
            <option>${pies.getplec()}</option>
        </select>
        <div>
            <label for="zdjUrl">Link zdjęcia</label>
            <input id="zdjUrl" type="url" name="zdjUrl" value="${pies.getzdjUrl()}" required/>
        </div>
        <div>
            <a href="pokazpies.jsp?id=${dane.gethodowla().indexOf(pies)}">Wróć</a>
            <input type="submit" value="Edytuj">
        </div>
    </form>

</article>
</body>
</html>