package com.example.jpademo.application;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

  private final MyApplication myApplication;


  @Override
  public void run(ApplicationArguments args) {
    myApplication.seeding();
  }
}
