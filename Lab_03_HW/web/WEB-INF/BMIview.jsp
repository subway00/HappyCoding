<%-- 
    Document   : BMIview
    Created on : 2019/6/28, 下午 02:28:15
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
        <p>
            身高值為:  ${model.height} 
            
        </p>
        <p>
           體重值為:${model.weight}  
        </p>
        <p>
            BMI值為:  ${model.bmi}
        </p>
    </body>
</html>
