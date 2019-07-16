<%-- 
    Document   : loginjsp
    Created on : 2019/7/16, 下午 04:21:39
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
        <h1>Login</h1>
        <p>
            <font color="red">
            ${loginError}
            </font>
        </p>          
        <form action="ApplicationController" method="POST">
            <p>
                UserName:
                <input type="text" name="user"/>
            </p>
            <p>
                Password:
                <input type="password" name="pass"/>
            </p>
            <input type="hidden" name="operation" value="LoginSubmit"/>
            <input type="submit" />
        </form>
    </body>
</html>
