<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<body>
<div align="center">

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <h1>
        <fmt:message key="label.title" />
    </h1>

    <br/><br/>
    <div align="center">
        <table border="1" cellpadding="5">
            <tr>
                <th>Model</th>
                <th>Engine Type</th>
                <th>Price</th>
            </tr>
            <c:forEach  items="${cars}" var ="car">
                <tr>
                    <td>${car.model}</td>
                    <td>${car.engineType}</td>
                    <td>${car.price}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>

</body>
</html>