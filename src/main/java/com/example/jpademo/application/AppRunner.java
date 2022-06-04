package com.example.jpademo.application;

import com.example.jpademo.registration.Registration;
import com.example.jpademo.registration.RegistrationRepository;
import com.example.jpademo.student.Student;
import com.example.jpademo.student.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

  private final RegistrationRepository registrationRepository;
  private final StudentRepository studentRepository;


  @Override
  public void run(ApplicationArguments args) {
    seeding();
  }

  private void seeding() {
    Student std1 = studentRepository.save(new Student("s1"));
    Student std2 = studentRepository.save(new Student("s2"));
    Student std3 = studentRepository.save(new Student("s3"));

    registrationRepository.save(new Registration(std1, "r1"));
    registrationRepository.save(new Registration(std2, "r2"));
    registrationRepository.save(new Registration(std3, "r3"));

  }
}
