<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Confirmation form</title>
</head>

<body>

<h1>The Student ${student.firstName} ${student.lastName} was added to database!</h1>
<br><br>
Country: ${student.country}
Language: ${student.favouriteLanguage}
<br>
Operating Systems:

<ul>
<c:forEach var="temp" items="${student.operatingSystems }">
	<li> ${temp} </li>
</c:forEach>
</ul>

</body>
</html>