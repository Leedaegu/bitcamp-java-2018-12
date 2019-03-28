package bitcamp.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet01 implements Servlet {

  ServletConfig config;
  
  
  @Override  
  public void init(ServletConfig config) throws ServletException {
    this.config = config;
    System.out.println("Servlet01.init()");
  }


  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    
    res.setContentType("text/html;charset=UTF-8"); // UTF-16 ==> UTF-8
    PrintWriter out = res.getWriter();

    out.println("실행 잘되네");
    System.out.println("Servlet01.service()");    
  }

  @Override
  public void destroy() {
    System.out.println("Servlet01.destroy()");
  }

  @Override
  public ServletConfig getServletConfig() {
    System.out.println("Servlet01.ServletConfig()");
    return this.config;
  }

  @Override
  public String getServletInfo() {
    System.out.println("Servlet01.getServletInfo()");
    return this.config.getClass().getSimpleName();
  }


}




