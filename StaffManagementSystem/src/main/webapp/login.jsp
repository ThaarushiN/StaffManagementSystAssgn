<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
<link rel="stylesheet" type="text/css" href="   index.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="index.js"></script>

    <script type="text/javascript">
            function required()
            {
                var un = document.forms["loginF"]["usrn"].value;
                var pw = document.forms["loginF"]["psswrd"].value;
                if (un== " " || pw==" " || un==null || pw==null)
                {
                    alert("Please insert a valid value for username/password!");
                    return false;
                }

                
            }
        </script>
</head>
<body >
    <div class=" d-flex justify-content-center">

        <fieldset >
            <legend>Log In</legend>
            <form action="loginSvlt" method="POST" name="loginF" onsubmit=" return required()">
                <label>Username:</label>
                <input type="text" name="usrn" class="mb-4">
                <br>
                <label>Password:</label>
                <input type="Password" name="psswrd" class="mb-4">
                <br>
                <button type="submit" class="btn btn-secondary">Log In</button>
                <br>
                <p>Do not have an account yet? 
                <a href="">Register.</a></p>
            </form>
        </fieldset>
    </div>
</body>
</html>