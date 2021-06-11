<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>


<body>
<h2>    Dear Employee, please enter your details </h2>

<br>


    <form:form action="showDetails" modelAttribute="employee">

         Name <form:input path="name"/>  <form:errors path="name"/>
        <br>  <br>

        Surname <form:input path="surName"/> <form:errors path="surName"/>

        <br>
        <br>

        Salary <form:input path="salary"/> <form:errors path="salary"/>
        <br>
        <br>
        Department <form:select path="department">
        <form:options items="${employee.departments}"/>


    </form:select>
        <br><br>
        Your car?

        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <br><br>
       Foreign language(s)?
        <form:checkboxes path="foreignLanguage" items="${employee.foreignLanguages}"/>
        <br><br>
        Email <form:input path="email"/>  <form:errors path="email"/>
        <br><br>
        Phone number <form:input path="phoneNumver"/>  <form:errors path="phoneNumver"/>
        <br>  <br>
       <input type="submit" value="OK">

    </form:form>



</body>
</html>
