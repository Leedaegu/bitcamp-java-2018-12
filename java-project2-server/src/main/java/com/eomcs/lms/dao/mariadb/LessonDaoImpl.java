package com.eomcs.lms.dao.mariadb;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonDaoImpl implements LessonDao {

  // Mybatis 의존객체 선언
  SqlSessionFactory sqlSessionFactory;

  public LessonDaoImpl(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  public List<Lesson> findAll() {    
    // 오토 클로즈를위해 try사용(리소스 자동해제)    
    try(SqlSession sqlSession = sqlSessionFactory.openSession()){

      return sqlSession.selectList("LessonMapper.findAll");            
    } // sql에서 자동으로 런타임을 던지기때문에 catch안해도됨 
  }


  public void insert(Lesson lesson) {

    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

      sqlSession.insert("LessonMapper.insert", lesson);
      sqlSession.commit();
    }
  }

  public Lesson findByNo(int no) {

    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

      return sqlSession.selectOne("LessonMapper.findByNo", no);
    } 
  }


  public int update(Lesson lesson) {

    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

      int count = sqlSession.update("LessonMapper.update", lesson);
      sqlSession.commit();
      return count;
    }
  }

  public int delete(int no) {

    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

      int count = sqlSession.delete("LessonMapper.delete", no);
      sqlSession.commit();
      
      return count;

    }
  }
}









