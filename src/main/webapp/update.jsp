<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update1">
id:<input type="number" name="id" value=<%=request.getParameter("sid")%> readonly="readonly"><br>
name:<input type="text" name="name" value=<%=request.getParameter("name")%>><br>
number:<input type="number" name="number" value=<%=request.getParameter("phno")%>><br>

<% if(request.getParameter("gender").equals("male"))  {%>
male:<input type="radio" name="gender" value="male" checked="checked">
female:<input type="radio" name="gender" value="female">
<%}  else {%>
male:<input type="radio" name="gender" value="male">
female:<input type="radio" name="gender" value="female" checked="checked">
<%} %>
<button type="submit">update</button>
</form>
</body>
</html>