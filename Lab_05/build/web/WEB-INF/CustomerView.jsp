<%-- 
    Document   : CustomerView
    Created on : 2019/7/1, 上午 10:32:53
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
        <h1>Customer Information</h1>
        <p>客戶名稱: ${customer.name}</p>
        <p>公司地址:<br/>
            ${customer.officeAddress.address1}<br/>      
            ${customer.officeAddress.address2}<br/>
            ${customer.officeAddress.city}<br/>
            ${customer.officeAddress.region}<br/>
            ${customer.officeAddress.postcode}<br/>
        </p>
        <p>帳單地址:<br/>
             ${customer.billAddress.address1}<br/>      
            ${customer.billAddress.address2}<br/>
            ${customer.billAddress.city}<br/>
            ${customer.billAddress.region}<br/>
            ${customer.billAddress.postcode}<br/>
        </p>
        <p>送貨地址:<br/>
            ${customer.deliveryAddress.address1}<br/>      
            ${customer.deliveryAddress.address2}<br/>
            ${customer.deliveryAddress.city}<br/>
            ${customer.deliveryAddress.region}<br/>
            ${customer.deliveryAddress.postcode}<br/>
        </p>
    </body>
</html>
