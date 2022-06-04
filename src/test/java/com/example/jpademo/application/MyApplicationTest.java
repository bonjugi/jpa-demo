package com.example.jpademo.application;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@Rollback(false)
@SpringBootTest
@Slf4j
class MyApplicationTest {

  @Autowired
  private MyApplication myApplication;

  @Test
  @DisplayName("student 전체를 조회합니다.")
  void hello() {
    myApplication.retrieveStudents();
  }

  @Test
  @DisplayName("registration 전체를 조회합니다.")
  public void hi() {
    myApplication.retrieveRegistrations();
  }

}