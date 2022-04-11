package com.example.manytomanymapping.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "student")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "enrolledStudent")
    private Set<course> enrolledStudent = new HashSet<>();

    public student() {

    }

	public student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Set<course> getEnrolledStudent() {
		return enrolledStudent;
	}

	public void setEnrolledStudent(Set<course> enrolledStudent) {
		this.enrolledStudent = enrolledStudent;
	}


}
