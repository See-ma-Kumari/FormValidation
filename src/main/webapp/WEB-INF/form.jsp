<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>${title }</title>
<meta charset="ISO-8859-1">
<%@ taglib prefix =
"form" uri = "http://www.springframework.org/tags/form"
%> 
</head>
<body>
<form:form method="post" action="handle" modelAttribute="user">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <form:input type="email" path="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"/>
  <form:errors path="email"/>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <form:input type="password" path="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
  <form:errors path ="password"/>
  </div>
  
  <form:button type="submit" path="submit" class="btn btn-primary">Submit</form:button>
</form:form>




</body>
</html>