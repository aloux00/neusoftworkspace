

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Online
 *
 */
@WebListener
public class Online implements HttpSessionListener {
int count=0;
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		count++;
		System.out.println("session创建了");
		ServletContext context = arg0.getSession().getServletContext();
		context.setAttribute("count", count);
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		count--;
		ServletContext context = se.getSession().getServletContext();
		context.setAttribute("count", count);
		
	}


	
}
