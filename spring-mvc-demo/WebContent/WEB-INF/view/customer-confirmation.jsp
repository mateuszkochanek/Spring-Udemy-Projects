<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<title>Customer Confirmation form</title>
</head>

<body>

<h1>The Customer ${customer.firstName} ${customer.lastName} was added to database!</h1><br>
You have ${customer.freePasses} free passes!<br>
${customer.postalCode} is your Postal code!

</body>
</html>