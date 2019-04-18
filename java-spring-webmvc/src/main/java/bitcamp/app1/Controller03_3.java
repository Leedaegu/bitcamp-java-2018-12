// request handler를 구분하는 방법 - Accept 요청 헤더의 값에 따라 구분하기 
package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/c03_3") 
public class Controller03_3 {

  // 테스트 방법:
  // => http://localhost:8080/java-spring-webmvc/html/app1/c03_3.html
  // => 요청 헤더 중에서 Accept의 값에 따라 구분할 때 사용한다.

  @GetMapping(produces = "text/plain")
  @ResponseBody
  public String handler1() {
    return "handler1";
  }

  @GetMapping(produces = "text/html") // age라는 파라미터 값이 있으면 handler2()가 호출된다.
  @ResponseBody
  public String handler2() {
    return "handler2";
  }

  @GetMapping(produces = "application/json") // 파라미터가 여러개일때는 배열로 지정하면 된다.
  @ResponseBody 
  public String handler3() {
    return "handler3";
  }

  @GetMapping // 파라미터가 여러개일때는 배열로 지정하면 된다.
  @ResponseBody 
  public String handler4() {
    return "handler4";
  }

}
