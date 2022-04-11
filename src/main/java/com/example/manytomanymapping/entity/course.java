package com.example.manytomanymapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "course_name")
    private String name;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "enrolled_student",
        joinColumns = { @JoinColumn(name = "corse_id")},
        inverseJoinColumns = { @JoinColumn (name = "student_id")})
    private Set<student> enrolledStudent = new HashSet<>();

    public course(){

    }

    public course(String name) {
        super();
        this.name = name;

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

	public Set<student> getEnrolledStudent() {
		return enrolledStudent;
	}

	public void setEnrolledStudent(Set<student> enrolledStudent) {
		this.enrolledStudent = enrolledStudent;
        

	}

    
}
