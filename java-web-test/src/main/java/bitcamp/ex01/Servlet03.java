package bitcamp.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex01/s03")
public class Servlet03 extends HttpServlet {


  private static final long serialVersionUID = 1L;

//  @Override
//  protected void service(HttpServletRequest req, HttpServletResponse res)
//      throws ServletException, IOException {
//    res.setContentType("text/plain;charset=UTF-8");
//    PrintWriter out = res.getWriter();
//    
//    out.println("실행 잘되네3");
//    System.out.println("Servlet03.doHead");
//  }
  @Override
  protected void doDelete(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("실행 잘되네33");
    System.out.println("Servlet03.doHead");
  }
  
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("실행 잘되네34");
    System.out.println("Servlet03.doHead");
  }
  
//  @Override
//  protected void doGet(HttpServletRequest req, HttpServletResponse res)
//      throws ServletException, IOException {
//    res.setContentType("text/plain;charset=UTF-8");
//    PrintWriter out = res.getWriter();
//    
//    out.println("실행 잘되네32");
//    System.out.println("Servlet03.doHead");
//  }
  

}




