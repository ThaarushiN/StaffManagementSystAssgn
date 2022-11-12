<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
<script type="text/javascript" src="Updation.js"></script>
</head>
<body>
    <fieldset>
        <legend>Update Salary Rates</legend>
            <form name ="" action="mgrSvlt" method="POST">
                <p>Hourly Rate</p> <input type="text" name="hrRt"  placeholder="enter new hourly rate..."> <button type="submit" >Save</button>
            </form>
            <form name ="" action="" method="POST">
                <p>Overtime Rate</p> <input type="text" name="otRt"  placeholder="enter new overtime rate..."> <button type="submit" >Save</button>
            </form>
    </fieldset>

</body>
</html>