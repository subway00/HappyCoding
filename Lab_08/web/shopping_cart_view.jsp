<%-- 
    Document   : shopping_cart_view
    Created on : 2019/7/9, 下午 01:32:23
    Author     : User
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fmt:requestEncoding value="UTF-8"/>
        <h1>${user} 購物車</h1>
        <ul>
            <c:forEach var="item" items="${paramValues.fruit}">
                <li>
                    ${item}
                </li>
            </c:forEach>
        </ul>
        <a href="index.jsp">回首頁</a>
    </body>
</html>
