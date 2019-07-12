<%-- 
    Document   : EmployeeView
    Created on : 2019/7/12, 下午 02:38:05
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
        <h1>所有員工</h1>
        <ul>
            <c:forEach var="emp" items="${list}">
                <li>
                    ${emp}
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
