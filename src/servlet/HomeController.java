package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	//클라이언트가 요청할 때 마다 콜백(요청 방식과는 상관없다)
	//역할: 요청 처리
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 실행");
		//처리 결과를  JSP로 이동
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request,response);
			
	}
}
