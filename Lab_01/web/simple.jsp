<%-- 
    Document   : simple
    Created on : 2019/6/28, 上午 10:17:35
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p> 你最愛的動物是
        <%= request.getParameter("FavoriteAnimal")%>    
<!--        //getParameter() 放入請求參數名稱並傳回參數值。-->
        </p>
    </body>
</html>
