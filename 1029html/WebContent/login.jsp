<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 읽기</title>
</head>
<body>

    <%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		out.println(id + "<br/>");
		out.println(pw + "<br/>");
		
	%>


</body>
</html>