// 멀티파트 파일 업로드 처리하기 - apache 라이브러리 사용
package bitcamp.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex04/s4")
public class Servlet04 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {

    // POST 요청
    // - 파일을 첨부하여 서버에 전송한다.
    // - multipart/form-data 형식으로 데이터를 전송하지 않으면
    //    첨부 파일의 데이터는 받을 수 없다.
    
    req.setCharacterEncoding("UTF-8");
    
    String age = req.getParameter("age");
    String name = req.getParameter("name");
    String photo = req.getParameter("photo");
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.printf("나이 = %s\n", age);
    out.printf("이름 = %s\n", name);
    out.printf("사진 = %s\n", photo);
    
    System.out.printf("%s(%s)\n",name, age);
  }
}






