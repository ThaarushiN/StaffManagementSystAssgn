<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
    <h1 >Employee Profile</h1>
    <div >
	    <table>
			<c:forEach items="${person}" var="EmpAttr" >
			
				<c:set var="empNo" value="${EmpAttr.empNo}"/>
				<c:set var="name" value="${EmpAttr.name}"/>
				<c:set var="unit" value="${EmpAttr.unitNo}"/>
				<c:set var="street" value="${EmpAttr.stName}"/>
				<c:set var="town" value="${EmpAttr.town}"/>
				<c:set var="city" value="${EmpAttr.city}"/>
				<c:set var="depID" value="${EmpAttr.depID}"/>
				<c:set var="username" value="${EmpAttr.username}"/>
				<c:set var="password" value="${EmpAttr.psswrd}"/>

				<tr>
					<td>Employee No</td>
					<td>${EmpAttr.empNo}</td>
				</tr>
				<tr>
					<td>Name</td>
					<td>${EmpAttr.name}</td>
				</tr>
				<tr>
					<td>Address</td>
					<td>${EmpAttr.unitNo} , ${EmpAttr.stName} , ${EmpAttr.town} , ${EmpAttr.city}</td>
				</tr>
				<tr>
					<td>Department</td>
					<td>${EmpAttr.depID}</td>
				</tr>
				<tr>
					<td>Username</td>
					<td>${EmpAttr.username}</td>
				</tr>
				
				<tr>
					<td>Password</td>
					<td>${EmpAttr.psswrd}</td>
				</tr>

			</c:forEach>


		</table>

        <div>
            <button class="btn btn-secondary "><a href="#" class=" text-decoration-none link-light">Edit Profile...</a></button>
        </div>
        
    </div>

    <div>
        <table class="text-right">
            <tr>
                <td><button class="btn btn-secondary "><a href="#" class="text-decoration-none link-light">Request Leave</a></button></td>
            </tr>
            <tr>
                <td><button class="btn btn-secondary  "><a href="#" class="text-decoration-none link-light">View Payslips</a></button></td>
            </tr>
            <tr>
                <td><button class="btn btn-secondary "><a href="#" class="text-decoration-none link-light">PIP/Training Programs</a></button></td>
            </tr>
        </table>
    </div>

    
</body>
</html>