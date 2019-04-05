// 쿠키 읽기 - 사용범위가 지정된 쿠키 읽기
package bitcamp.ex10;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex10/s22")
@SuppressWarnings("serial")
public class Servlet22 extends HttpServlet {

  @Override
  protected void service(
      HttpServletRequest request, 
      HttpServletResponse response)
          throws ServletException, IOException {

    // 테스트 방법:
    // => http://localhost:8080/java-web/ex10/s22

    // => 요청 헤더에 포함된 쿠키를 읽는다.
    // => HTTP 요청 프로토콜    
    /*
    GET /java-web/ex10/s2 HTTP/1.1
    Host: localhost:8080
    Connection: keep-alive
    ...
    Cookie: name=hong; age=20; working=true; name2=홍길동; name3=%ED%99%8D%EA%B8%B8%EB%8F%99
     */

    Cookie[] cookies = request.getCookies();

    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();

    if (cookies != null) { 
      for (Cookie c : cookies) {
        out.printf("%s=%s\n", c.getName(), c.getValue());
      }
      
    }
  }
}

