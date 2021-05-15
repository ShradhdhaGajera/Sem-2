import javax.servlet.*;
import java.io.*;

public class MyFirstServlet extends GenericServlet
{
	public void init()
	{
		System.out.println("init()");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws Servletexception,IOException
	{
		System.out.println("service()");
	}
	
	public void destroy()
	{
		System.out.println("destroy()");
	}
}