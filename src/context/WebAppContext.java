package context;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import dao.BoardDao;
import dao.UserDao;
import service.BoardService;
import service.UserService;

public class WebAppContext implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("WebApp(ServletContext)가 생성완료됨");
		//생성된 ServletContext 객체 얻기
		ServletContext application = sce.getServletContext();
		
		//ServletContext 객체에 데이터(객체) Service, DAO 저장
		//WebApp의 실행 환경 정보를 담는 ServletContext객체
		//모든 클라이언트들이 공유하는 공유 객체가 된다
		application.setAttribute("userService", new UserService(application));
		application.setAttribute("boardService", new BoardService(application));
		
		application.setAttribute("userDao", new UserDao());
		application.setAttribute("boardDao", new BoardDao());
		
		
		
	}
}
