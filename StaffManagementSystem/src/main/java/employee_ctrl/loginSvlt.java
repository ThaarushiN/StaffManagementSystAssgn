package employee_ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;


@WebServlet("/loginSvlt")
public class loginSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String usern=request.getParameter("usrn");
		String pass=request.getParameter("psswrd");
		
		if(EmployeeDBUtil.validate(usern, pass)==true) {
			
			while(EmployeeDBUtil.isManager()==true) {
				RequestDispatcher dis = request.getRequestDispatcher("managerDashboard.html");
				dis.forward(request, response);
			}
		
			
			ArrayList<Employee> person=EmployeeDBUtil.getProfile();
			request.setAttribute("EmpAttr", person);
			RequestDispatcher dis = request.getRequestDispatcher("profile.jsp");
			dis.forward(request, response);
			
		}
		
		
		
		
	}

}
