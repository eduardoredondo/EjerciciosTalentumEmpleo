package listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ListenerSesion
 *
 */
@WebListener
public class ListenerSesion implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public ListenerSesion() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent sesion)  { 
    	ServletContext contexto=sesion.getSession().getServletContext();
    	
        synchronized(contexto){
        	
        	Integer numeroUsuarios=(Integer)contexto.getAttribute("numeroUsuarios");
        	numeroUsuarios++;
        	contexto.setAttribute("numeroUsuarios",numeroUsuarios);
        }
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
