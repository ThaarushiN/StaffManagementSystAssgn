<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.0-alpha1/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <fieldset>
        <legend><h2>Update Salary Rates</h2></legend>
            
            <form name ="" action="mgrSvlt" method="POST">
                <p>Hourly Rate</p> <input type="number" name="hrRt"  placeholder="enter new hourly rate..." class="rounded form-control mb-2 " > <button type="submit" class="btn btn-outline-secondary">Save</button>
            </form>
            <br>
            <form name ="" action="mgrSvlt" method="POST">
                <p>Overtime Rate</p> <input type="number" name="otRt"  placeholder="enter new overtime rate..." class="rounded form-control mb-2" > <button type="submit" class="btn btn-outline-secondary" >Save</button>
            </form>
    </fieldset>

</body>
</html>