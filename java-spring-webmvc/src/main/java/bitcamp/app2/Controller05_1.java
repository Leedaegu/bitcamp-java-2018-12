// JSON 콘텐트 출력하기
package bitcamp.app2;

import java.sql.Date;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

@Controller 
@RequestMapping("/c05_1")
public class Controller05_1 {

  ArrayList<Board> list = new ArrayList<>();

  public Controller05_1() {
    list.add(new Board(1, "제목입니다1", "내용1", "홍길동1", 10, Date.valueOf("2019-5-11")));
    list.add(new Board(2, "제목입니다2", "내용2", "홍길동2", 20, Date.valueOf("2019-5-12")));
    list.add(new Board(3, "제목입니다3", "내용3", "홍길동3", 30, Date.valueOf("2019-5-13")));
    list.add(new Board(4, "제목입니다4", "내용4", "홍길동4", 40, Date.valueOf("2019-5-14")));
    list.add(new Board(5, "제목입니다5", "내용5", "홍길동5", 50, Date.valueOf("2019-5-15")));
    list.add(new Board(6, "제목입니다6", "내용6", "홍길동6", 60, Date.valueOf("2019-5-16")));
    list.add(new Board(7, "제목입니다7", "내용7", "홍길동7", 70, Date.valueOf("2019-5-17")));
    list.add(new Board(8, "제목입니다8", "내용8", "홍길동8", 80, Date.valueOf("2019-5-18")));
    list.add(new Board(9, "제목입니다9", "내용9", "홍길동9", 90, Date.valueOf("2019-5-19")));
    list.add(new Board(10, "제목입니다10", "내용10", "홍길동10", 100, Date.valueOf("2019-5-10")));
  }
  // 1) JSP에서 JSON 형식의 콘텐트 출력하기
  // 테스트:
  //   http://.../app2/c05_1/h1
  @GetMapping("h1")
  public void handler1(Model model) {
    model.addAttribute("list", this.list);
  }

  // 2) 구글 Gson 라이브러리를 사용하여 JSON 형식의 콘텐트 출력하기 -I
  // 테스트:
  //   http://.../app2/c05_1/h2
  @GetMapping(value="h2", produces="text/plain;charset=UTF-8")
  @ResponseBody
  public String handler2() {
    return new Gson().toJson(this.list);
  }

  // 3) 구글 Gson 라이브러리를 사용하여 JSON 형식의 콘텐트 출력하기 -II
  // 테스트:
  //   http://.../app2/c05_1/h3
  @GetMapping("h3")
  @ResponseBody
  public Object handler3() {
    return this.list; // JSON 형식의 문자열은 자동으로 UTF-8로 인코딩 된다.
  }
}





