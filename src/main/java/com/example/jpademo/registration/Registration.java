package com.example.jpademo.registration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Entity
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Registration {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "student_id")
  private Long studentId;

  private String name;

  public Registration(Long studentId, String name) {
    this.name = name;
    this.studentId = studentId;
  }
}
