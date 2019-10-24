

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
@WebFilter("/main.jsp")
public class SessionCheckFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SessionCheckFilter() {
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
		Map<String, String[]> map = request.getParameterMap();
		Set<Entry<String,String[]>> set = map.entrySet();
		set.forEach((Entry<String,String[]> a)->{
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		});
		System.out.println(req.getParameter("user")+"hehe");
		HttpSession session = req.getSession();
		String path=req.getServletPath();
		System.out.println(this);
		System.out.println(chain);
		System.out.println(path);
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
