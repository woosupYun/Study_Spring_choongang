<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Mobile setting -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!-- jQuery library -->
<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>
<!-- IconFontawesome ADD-->
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>${num } 단</h1>
	

	<c:forEach var="k" begin="1" end="9">
		${num } X ${k } = ${num*k }<br />
	</c:forEach> 

	${num } X 1 = ${num*1 } <br />
	${num } X 2 = ${num*2 } <br />
	${num } X 3 = ${num*3 } <br />
	${num } X 4 = ${num*4 } <br />
	${num } X 5 = ${num*5 } <br />
	${num } X 6 = ${num*6 } <br />
	${num } X 7 = ${num*7 } <br />
	${num } X 8 = ${num*8 } <br />
	${num } X 9 = ${num*9 } <br />
</body>
</html>