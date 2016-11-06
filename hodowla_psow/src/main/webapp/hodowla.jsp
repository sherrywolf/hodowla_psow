<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dane" class="com.example.hodowla.service.Dane" scope="application"/>
<!DOCTYPE>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HODOWLA</title>
</head>
<body>
<h2>Oto Twoja hodowla:</h2>

<div>
    <c:if test="${dane.gethodowla().size() == 0}">
        <div>
            <h4>Twoja hodowla wydaje się być pusta</h4>
            <a href="przykladowe.jsp">Dodaj przykładowe dane!</a>
        </div>
    </c:if>
    <c:forEach items="${dane.gethodowla()}" var="pies">
        <a href="pokazpies.jsp?id=${dane.gethodowla().indexOf(pies)}">
                        <h2>${pies.getimie()}</h2>
                    
                
            </a>
    </c:forEach>
</div>

<h5><p><a href="Dod_Psa.jsp">Dodaj psa!</a></p></h5>
</body>
</html>
