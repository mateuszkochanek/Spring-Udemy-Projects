<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Customer Registration form</title>
	
	<style>
	.error{
	color:red;
	}
	
	</style>
</head>

<body>

Fill the form, (*) means that information is required.

<form:form action="processForm" modelAttribute="customer">

	First name: <form:input path="firstName"/><br><br>
	Last name (*): <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/><br><br>
	Free passes: <form:input path="freePasses"/>
	<form:errors path="freePasses" cssClass="error"/>
	<input type="submit" value="Submit"/>
</form:form>

</body>
</html>