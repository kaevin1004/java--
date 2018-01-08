<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<hr>

<h1>User</h1>
<p> <a href="/rest/curtime" target="_blank">/rest/curtime</a> </p>
<p> <a href="/rest/selectuserlist" target="_blank">/rest/selectuserlist</a> </p>
<p> <a href="./rest/login?userid=test1id&passwd=test1pw" target="_blank"> "/rest/login?userid=test1id&passwd=test1pw" </a></p>
<p> <a href="./rest/login?userid" target="_blank"> "/rest/login?id=test2id&pw=test2pw" </a></p>
<p> <a href="./rest/checkuserid?userid" target="_blank"> "/rest/checkuserid?id=test2id&pw=test2pw" </a></p>
<p> <a href="./rest/checkuserid?fadfad" target="_blank"> "/rest/checkuserid?id=test2id&pw=test2pw" </a></p>
<p> <a href="./rest/updatepasswd?userid=id&currentPasswd=&newPasswd=newpw" target="_blank"> "/rest/updatepasswd?userid&currentPasswd&newPasswd=test2id&pw=test2pw" </a></p>

<p>//@RequesBody 실습 : json 형태만 가능 , POST만 가능 soapui를 이용해서 테스트</p>
<p> <a href="./rest/updateuserinfo?userid=id&111&email=111" target="_blank"> ""./rest/insertuser?userid=id&111&email=111" </a></p>
<p> <a href="./rest/insertuser?userid=id&111&email=111" target="_blank"> ""./rest/insertuser?userid=id&111&email=111" </a></p>

<hr>

<h1>Board</h1>
<p> <a href="/rest/getboardone?cd=free" target="_blank">/rest/getboardone?cd=free</a> </p>



<button id="joinOk">getboardone 호출</button>
<div id="message1"></div>
</body>
</html>
