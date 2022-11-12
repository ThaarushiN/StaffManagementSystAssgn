<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Dashboard</title>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
    <h1>Welcome!</h1>

    <div>
        <div><button><a href="#">View Requests</a></button></div>
        <div class="position-absolute top-0 end-0"> 
                <p id="systDate">   </p>

                <script type="text/javascript">

                        function display_c(){
                        var refresh=1000; // Refresh rate in milli seconds
                        mytime=setTimeout('display_ct()',refresh)
                        }

                        function display_ct() {
                        var x = new Date()
                        document.getElementById("systDate").innerHTML = x;
                        display_c();
                        }

                </script>

        </div><!-- dt -->
    </div>

    <table>
        <tr>
            <td><button class="btn btn-primary">View Attendence Log</button></td>
            <td><button class="btn btn-primary">Push Notification/Notice</button></td>
        </tr>
        <tr>
            <td><button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Calculate Salary</button>
                    <ul class="dropdown-menu">
                        <li><a href="#">Calculate Full-timer Salary</a></li>
                        <li><a href="#">Calculate Part-timer Salary</a></li>
                        <li><a href="#">Change Salary Rate</a></li>
                    </ul>
            </td>
            <td><button class="btn btn-primary">Generate/View Payslips</button></td>
        </tr>
        <tr>
            <td><button>Performance Improvement Plans</button></td>
            <td><button>Training Programmes</button></td>
        </tr>
    </table>

    <div>
        <button><a href="#">View Pending Tasks...</a></button>
    </div>
</body>
</html>