/**
 * 
 */
package piergiuseppe82.ee6.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import piergiuseppe82.ee6.ejb.sbean.HelloBean;

/**
 * @author placava
 *
 */
@WebServlet(name="HelloServlet", urlPatterns="/hello")
public class HelloServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -93171493293383335L;
	
	@EJB
	private HelloBean helloBean;
	
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	response.getWriter().append("<html>");
    	response.getWriter().append("<body>");
    	response.getWriter().append("<h1>"+helloBean.getMessage(null)+"</h1>");
    	response.getWriter().append("<h1>"+helloBean.getMessage("Selen")+"</h1>");
    	response.getWriter().append("</body>");
    	response.getWriter().append("</html>");
    }
	
	
	
}
