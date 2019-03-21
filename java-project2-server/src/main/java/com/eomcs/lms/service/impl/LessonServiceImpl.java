package com.eomcs.lms.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.service.LessonService;

// 스프링 IoC 컨테이너가 관리하는 객체 중에서 
// 비즈니스 로직을 담당하는 객체는 
// 특별히 그 역할을 표시하기 위해 @Component 대신에 @Service 애노테이션을 붙인다.
// 이렇게 애노테이션으로 구분해두면 나중에 애노테이션으로 객체를 찾을 수 있다.
@Service
public class LessonServiceImpl implements LessonService {

  LessonDao lessonDao;
  PhotoBoardDao boardDao;
  PlatformTransactionManager txManager;

  public LessonServiceImpl(
      LessonDao lessonDao,
      PhotoBoardDao boardDao,
      PlatformTransactionManager txManager) {

    this.lessonDao = lessonDao;
    this.boardDao = boardDao;
    this.txManager = txManager;
  }

  @Override
  public List<Lesson> list() {
    return lessonDao.findAll();
  }

  @Override
  public int add(Lesson lesson) {

    return lessonDao.insert(lesson);     
  }

  @Override
  public Lesson get(int no) {

    return lessonDao.findByNo(no);

  }

  @Override
  public int update(Lesson lesson) {
    return lessonDao.update(lesson);
  }

  @Override
  public int delete(int no) {
    // 트랜잭션 동작 방식을 설정한다.
    DefaultTransactionDefinition def = new DefaultTransactionDefinition();
    def.setName("tx1");
    def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

    // 트랜잭션을 준비한다.
    TransactionStatus status = txManager.getTransaction(def);
    try {

      boardDao.delete(no);
      int count = lessonDao.delete(no);
      txManager.commit(status);
      return count;

    } catch (Exception e) {
      txManager.rollback(status);
      throw e;
    }
  }
}







