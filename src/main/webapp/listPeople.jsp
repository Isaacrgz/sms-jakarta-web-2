<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>People liste</title>
    </head>
    <body>
        <h1>People list</h1>
        <ul>
            <c:forEach items="${people}" var="person">
                <li>${person.name} ${persoon.lastname}</li>
            </c:forEach>
        </ul>
        <br/>
        <a href="${pageContext.request.contextPath}/index.html">Return to Home page</a>
    </body>
</html>
