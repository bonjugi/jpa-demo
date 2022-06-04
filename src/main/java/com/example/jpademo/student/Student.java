package com.example.jpademo.student;

import com.example.jpademo.registration.Registration;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
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

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinTable(name = "registration",
      joinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "id")},
      inverseJoinColumns = {@JoinColumn(
          name = "student_id",
          referencedColumnName = "id",
          insertable = false,
          updatable = false)}
  )
  private Registration registration;

  private String name;

  public Student(String name) {
    this.name = name;
  }

  public void updateRegistration(Registration registration) {
    this.registration = registration;
  }
}
