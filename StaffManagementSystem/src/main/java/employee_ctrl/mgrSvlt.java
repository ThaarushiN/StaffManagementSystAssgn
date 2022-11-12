package employee_ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mgrSvlt
 */
@WebServlet("/mgrSvlt")
public class mgrSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String catchOtrt=request.getParameter("otRt");
		String catchHrrt=request.getParameter("hrRt");
		
//		double ort=Double.parseDouble(request.getParameter("otRt"));
//		double hrt=Double.parseDouble(request.getParameter("hrRt"));
		
//		mgrDBUtil.changeOtRt(ort);
//		mgrDBUtil.changeHrlyRt(hrt);
		
		if(!(catchOtrt==null)) {
			double ort=Double.parseDouble(request.getParameter("otRt"));
			mgrDBUtil.changeOtRt(ort);
		}
		
		if(!(catchHrrt==null)) {
			double hrt=Double.parseDouble(request.getParameter("hrRt"));
			mgrDBUtil.changeHrlyRt(hrt);
		}
		
	}

}
