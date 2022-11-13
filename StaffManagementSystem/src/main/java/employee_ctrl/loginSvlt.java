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
		
		ArrayList person=EmployeeDBUtil.validate(usern, pass);
		
		while(person!=null) {
			try {
				
				//check if arraylist return a manager
				Manager m=(Manager) (person.get(0));
				RequestDispatcher dis = request.getRequestDispatcher("managerDashboard.html");
				dis.forward(request, response);
			}catch(Exception e) {
				request.setAttribute("EmpAttr", person);
				
				RequestDispatcher dis = request.getRequestDispatcher("profile.jsp");
				dis.forward(request, response);
			}
		}
		
		
	}

}
