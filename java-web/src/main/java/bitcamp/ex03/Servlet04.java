// 클라이언트로 출력하기 - 바이너리 데이터 출력하기
package bitcamp.ex03;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s4")
public class Servlet04 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    ServletContext ctx = req.getServletContext();

    String path = ctx.getRealPath("/WEB-INF/photo.jpeg");

    FileInputStream in = new FileInputStream(path);

    // 바이너리를 출력할 때 MIME 타입을 지정해야 웹 브라우저가 제대로 출력할 수 있다.
    // => 웹 브라우저가 모르는 형식을 지정하면 웹 브라우저는 처리하지 못해
    //    그냥 다운로드 대화상자를 띄운다.
    res.setContentType("image/jpeg"); // UTF-16 ==> UTF-8

    BufferedOutputStream out = new BufferedOutputStream(res.getOutputStream());

    int b;
    int i = 0;
    while ((b = in.read()) != -1) {
      out.write(b);
      i++;
    }
    System.out.println(i);
    out.flush(); // 버퍼데코레이터에 보관된 데이터를 클라이언트로 방출한다.
    in.close();
  }
}






