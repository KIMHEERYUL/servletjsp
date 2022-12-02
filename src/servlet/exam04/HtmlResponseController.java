package servlet.exam04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "exam04.HtmlResponseController", urlPatterns = "/exam04/HtmlResponseController" )
public class HtmlResponseController extends HttpServlet{
	
	//클라이언트가 요청할때마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답Http Content=body에 들어가는 형식이 뭔지 지정(response.setContentType())
		//MIME타입 대분류 소분류 지정
		//body 안에 내용을 넣을 땐 출력스트림 사용 javax.servlet.ServletOutputStream = 바이트 기반 스트림(어떤 종류든 출력가능, 그림, 동영상 등)
		//PrintWriter는 문자기반 스트림
		response.setContentType("text/html; charset=UTF-8");
		//ServletOutputStream sos = response.getOutputStream();
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h4>한글</h4>");
		pw.println("</body>");
		pw.println("</html>");
		pw.flush();
		pw.close();
		
		request.getRequestDispatcher("/WEB-INF/views/exam04/html.jsp").forward(request, response);
	}
	
}
