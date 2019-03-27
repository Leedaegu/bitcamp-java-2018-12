package com.eomcs.lms.handler;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.stereotype.Component;
import com.eomcs.lms.context.RequestMapping;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.service.BoardService;

@Component
public class HelloCommand {

  BoardService boardService;
  public HelloCommand(BoardService boardService) {
    this.boardService = boardService;
  }

  @RequestMapping("/hello")
  public void list(ServletRequest request, ServletResponse response) throws Exception {

    PrintWriter out = response.getWriter();

    out.println("<html><head><title>hello</title></head>");
    out.println("<body><h1>hello, world!</h1>");
    out.println("</table></body></html>");

  }
}










