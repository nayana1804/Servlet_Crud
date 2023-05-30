<%@page import="dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<StudentDto> l1=(List<StudentDto>) request.getAttribute("studentlist"); %>
<table border="">
<tr>
<th>id</th>
<th>name</th>
<th>gender</th>
<th>number</th>
<th>delete</th>
<th>update</th>
</tr>
<% for(StudentDto a:l1) { %>
<tr>
<td><%=a.getStd_id() %> </td>
<td><%=a.getStd_name() %> </td>
<td><%=a.getPhno() %> </td>
<td><%=a.getGender() %> </td>
<td><a href="delete?id=<%=a.getStd_id()%>">remove</a></td>
<td><a href="update.jsp?
sid=<%=a.getStd_id()%>
&phno=<%=a.getPhno()%>
&name=<%=a.getStd_name()%>
&gender=<%=a.getGender()%>
">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>