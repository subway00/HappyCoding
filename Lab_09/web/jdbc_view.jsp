<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fmt:requestEncoding value="UTF-8" />
        <h1>Servlet JDBCServlet at /WebJDBC</h1>
        <ul>
            <c:forEach var="item" items="${list}">
                <li>
                    ${item}
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
