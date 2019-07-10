<%-- 
    Document   : logout
    Created on : 2019/7/9, 下午 01:10:39
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <c:if test="${user != null}">
                ${user}
            </c:if>
            <br>
            <br>
            您已完成登出!
        </h1>
        <br>
        <br>
        <a href="index.jsp">回首頁</a>
    </body>
</html>
