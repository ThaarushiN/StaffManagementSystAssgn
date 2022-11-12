<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>profile</title>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.0-alpha1/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <h1>Employee Profile</h1>
    <div>
        <c:forEach var="empl" items="${empAttr}">
            ${EmpAttr.empNo}
            ${EmpAttr.name}
            ${EmpAttr.unitNo}
            ${EmpAttr.stName}
            ${EmpAttr.town}
            ${EmpAttr.city}
            ${EmpAttr.depID}
            ${EmpAttr.username}
            ${EmpAttr.psswrd}
        </c:forEach>

        <div>
            <button class="btn btn-secondary"><a href="#">Edit Profile...</a></button>
        </div>
        
    </div>

    <div>
        <table>
            <tr>
                <td><button class="btn btn-secondary"><a href="#">Request Leave</a></button></td>
            </tr>
            <tr>
                <td><button class="btn btn-secondary"><a href="#">View Payslips</a></button></td>
            </tr>
            <tr>
                <td><button class="btn btn-secondary"><a href="#">PIP/Training Programs</a></button></td>
            </tr>
        </table>
    </div>

    
</body>
</html>