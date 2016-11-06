<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dane" class="com.example.hodowla.service.Dane" scope="application"/>
<jsp:useBean id="licznik" class="com.example.hodowla.web.Licznik" scope="application"/>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="static/style.css">
    <title>HODOWLA</title>
</head>
<body>
<h2 class="nagl">Oto Twoja hodowla:</h2>

<% licznik.zero(); %>

<div class="index">
    <c:if test="${dane.gethodowla().size() == 0}">
        <div>
            <h4>Twoja hodowla wydaje się być pusta</h4>
            <a href="przykladowe.jsp" class="button">Dodaj przykładowe dane!</a>
        </div>
    </c:if>
    <c:forEach items="${dane.gethodowla()}" var="pies">
        <a href="pokazpies.jsp?id=${dane.gethodowla().indexOf(pies)}">
                        <h2 class="button">${pies.getimie()}</h2>
                    
                
            </a>
    </c:forEach>

    <h5><a href="Dod_Psa.jsp" class="button">Dodaj psa!</a></h5>
    <p>Możesz wyświetlić również same <a href="samice.jsp">samice</a> lub samych <a href="samce.jsp">samców</a></p>

</div>
</body>
</html>
