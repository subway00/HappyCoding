<%-- 
    Document   : bmi_view
    Created on : 2019/7/1, 下午 02:14:53
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
        <jsp:useBean id="bmi" class="domain.Bmi" scope="request"/>                <!-- id:設定變數 參考到domain.Address下的物件-->
        <jsp:setProperty name="bmi" property="*" />
        cm:${bmi.cm}<br> 
        kg:${bmi.kg}<br>
        bmi:${bmi.bmi}<br>
    </body>
</html>
