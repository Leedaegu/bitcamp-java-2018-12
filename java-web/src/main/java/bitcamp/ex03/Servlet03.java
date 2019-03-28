// 클라이언트로 출력하기 - HTML 출력하기
package bitcamp.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s3")
public class Servlet03 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
 
    res.setContentType("text/html;charset=UTF-8"); // UTF-16 ==> UTF-8
    PrintWriter out = res.getWriter();
    
    out.println("<!DOCTYPE html>"); // 지정하지않아도 브라우저가 알아서 처리한다.
    out.println("<html>");
    out.println("<head><title>servlet03</title></head>");
    out.println("<body><h1>안녕하세요!</h1></body>");
    out.println("</html>");
  }
}






