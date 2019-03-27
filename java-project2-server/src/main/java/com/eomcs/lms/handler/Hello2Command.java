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
public class Hello2Command {

  BoardService boardService;

  public Hello2Command(BoardService boardService) {
    this.boardService = boardService;
  }

  @RequestMapping("/hello2")
  public void list(ServletRequest request, ServletResponse response) throws Exception {

    PrintWriter out = response.getWriter();

    out.println("<html><head><title>hello2</title></head>");
    out.println("<body><h1>hello2, world!</h1>");
    out.println("</table></body></html>");

  }
}










