<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<body>
<h2>    Dear  Employee, you are welcome!!! </h2>
<br><br>
<br>

<%--Your name : ${param.employeeName}--%>

Your name : ${employee.name}
<br>
<br>
Your surname : ${employee.surName}
<br><br>
Your salary : ${employee.salary}

<br><br>
Your department: ${employee.department}

<br><br>
Your car: ${employee.carBrand}
<br><br>
Foreign language(s)
<ul>
    <c:forEach var = "lang" items="${employee.foreignLanguage}">
        <li> ${lang}</li>
    </c:forEach>
</ul>

<br>
Email: ${employee.email}
<br>

Phone number : ${employee.phoneNumver}


</form>
</body>
</html>
