package com.example.jpademo.registration;

import com.example.jpademo.student.Student;
import javax.persistence.CascadeType;
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
@EqualsAndHashCode
@ToString(exclude = "student")
@NoArgsConstructor
public class Registration {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Student student;

  private String name;

  public Registration(Student student, String name) {
    this.student = student;
    this.name = name;
    student.updateRegistration(this);
  }
}
