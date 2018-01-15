<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style>
table, td, th { border: 1px solid green; }
th { background-color: green; color: white; }
</style>

<title>Insert title here</title>

</head>
<body>
    <table>
        <tr>
            <th>no</th>
            <th>name</th>
            <th>manufacturer</th>
            <th>price</th>
        </tr>
        <c:forEach var="phone" items="${list}" varStatus="status">
        <tr>
            <td>${name}</td>
            <td>${manufacturer}</td>
            <td>${price}</td>
        </tr>
        </c:forEach>
    </table>

</body>
</html>