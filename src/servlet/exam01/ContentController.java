package servlet.exam01;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="exam01.ContentController", urlPatterns= {"/exam01/ContentController", "/exam01/content"})
public class ContentController extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ContentController.init() 실행");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 실행");
		
		//처리 결과를  JSP로 이동
		request.getRequestDispatcher("/WEB-INF/views/exam01/content.jsp").forward(request,response);
	}
	@Override
	public void destroy() {
		System.out.println("ContentController.destroy() 실행");
	}

}


