package com.vintrace.students;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false)
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private LocalDate dateOfBirth;

	@Column(nullable = false)
	private Gender gender;

	private StudentType studentType;

	private OffsetDateTime startTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public StudentType getStudentType() {
		return studentType;
	}

	public void setStudentType(StudentType studentType) {
		this.studentType = studentType;
	}

	public OffsetDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(OffsetDateTime startTime) {
		this.startTime = startTime;
	}

	public enum Gender {
		M,
		F,
	}

	public enum StudentType {
		FULL_TIME,
		PART_TIME,
	}
}
