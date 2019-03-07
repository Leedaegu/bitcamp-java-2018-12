// select 결과 값을 Map 객체에 받기
package ch26.d;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test05 {

  public static void main(String[] args) throws Exception {

    InputStream inputStream = Resources.getResourceAsStream(
        "ch26/d/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory =
        new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = sqlSessionFactory.openSession();

    // select 결과를 맵 객체로 받을 수 있다.
    Map<?,?> map = sqlSession.selectOne("board.select6"); 
    System.out.println(map);
    System.out.println(map.get("board_id"));
    System.out.println(map.get("title"));
    System.out.println(map.get("contents"));
    System.out.println(map.get("created_date"));
    System.out.println(map.get("view_count"));
    System.out.println("---------------------------------");

    List<Map<?,?>> list = sqlSession.selectList("board.select7");
    for (Map<?,?> m : list) {
      System.out.println(m);
    }

    // map 은 hashCode 리턴값으로 위치를 계산하여 (키값의 해쉬코드리턴값 / 방의숫자)알고리즘으로
    // 방에 값들을 지정하기때문에 컬럼순서대로 출력되지 않는다.
    for(Object a : map.keySet()) {
      System.out.print(a + "=");
      System.out.print(a.hashCode());
      System.out.println();
    }

  }

}






