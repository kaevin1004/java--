<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 반복문 : forEach 실습</title>
</head>
<body>
<c:forEach var="cnt" begin="2" end="20" step="2">
 <font size ="${cnt/2}" > ${cnt/2 }
야~호~</font><br>
</c:forEach>
</body>
</html>