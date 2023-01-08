<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Register Here</h1>
		<form:form modelAttribute="userdto">
		
		User : <form:input path="user"/>
		<br>
		<br/>
		User Name : <form:input path="usrName"/>
		<br/>
		<br>
		Password : <form:password path="password"/>
		<br/>
		<br>
		Country : <form:select path="country">
		<form:option value="ind" label="India"></form:option>
		<form:option value="pak" label="Pakisthan"></form:option>
		<form:option value="sl" label="srilanka"></form:option>
		</form:select>
		</form:form>
	</div>

</body>
</html>