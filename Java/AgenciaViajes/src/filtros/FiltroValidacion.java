package filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FiltroValidacion
 */
@WebFilter("/Busqueda")
public class FiltroValidacion implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroValidacion() {
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
		
		ServletContext contexto=request.getServletContext();
		
		String buscar_palabra=request.getParameter("buscar_palabra");
		
		if(buscar_palabra==null || buscar_palabra.trim().equals("")){
			RequestDispatcher dispatcher=contexto.getRequestDispatcher("/datosinvalidos.jsp");
			dispatcher.forward(request,response);
		}
		
		else{
			
			buscar_palabra=buscar_palabra.trim();
			request.setAttribute("buscar_palabra",buscar_palabra);
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
