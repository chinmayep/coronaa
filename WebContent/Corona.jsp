<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add info of corona patients</h1>
<form action="save.do" method="post">
Name<input type="text" name="name">
Age<input type="text" name="age">
Email<input type="text" name="email">
Mobile<input type="text" name="mobile">
ID<input type="text" name="id">
<div>
Result yes:<input type="checkbox" value="y" name=0/>
No:<input type="checkbox" value="N" name="result"/>
</div>
States <select name="state">
<option>Select</option>
<c:forEach items="${states}" var="s">
<option>${s}</option>
</c:forEach>
</select>
${states}
<input type="submit" value="save">
</form>
</body>
</html>