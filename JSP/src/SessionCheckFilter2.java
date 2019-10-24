

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class SessionCheckFilter
 */
@WebFilter("/login.jsp")
public class SessionCheckFilter2 implements Filter {

    /**
     * Default constructor. 
     */
    public SessionCheckFilter2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		System.out.println(req.getParameter("user"));
		HttpSession session = req.getSession();
		String path=req.getServletPath();
		System.out.println(this);
		System.out.println(chain);
		if(session.getAttribute("user")!=null||path.contains("LoginServlet")||path.contains("main.jsp")) {
			System.out.println("进入了过滤器");
			chain.doFilter(request, response);
		}else{
			req.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
