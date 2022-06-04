package com.example.jpademo.student;

import com.example.jpademo.registration.Registration;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Entity
@ToString(exclude = "registration")
@EqualsAndHashCode
@NoArgsConstructor
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(mappedBy = "student", fetch = FetchType.LAZY, optional = false)
  private Registration registration;

  private String name;

  public Student(String name) {
    this.name = name;
  }

  public void updateRegistration(Registration registration) {
    this.registration = registration;
  }
}
