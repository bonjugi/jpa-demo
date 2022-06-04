package com.example.jpademo.application;

import com.example.jpademo.registration.RegistrationRepository;
import com.example.jpademo.student.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MyApplication {

  private final StudentRepository studentRepository;
  private final RegistrationRepository registrationRepository;


  @Transactional
  public void retrieveStudents() {
    log.info("students 시작");
    studentRepository.findAll().forEach(x -> {
      log.info("students : {} ", x);
      log.info("registrations : {} ", x.getRegistration());
    });
    log.info("students 종료");
  }

  @Transactional
  public void retrieveRegistrations() {
    log.info("registrations 시작");
    registrationRepository.findAll().forEach(x -> {
      log.info("registration : {} ", x);
      log.info("students : {} ", x.getStudent());
    });
    log.info("registrations 종료");
  }


}
