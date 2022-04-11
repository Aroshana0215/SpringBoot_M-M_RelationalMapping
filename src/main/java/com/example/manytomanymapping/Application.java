package com.example.manytomanymapping;

import com.example.manytomanymapping.entity.student;

import com.example.manytomanymapping.entity.course;
import com.example.manytomanymapping.repository.courseRepository;
import com.example.manytomanymapping.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private courseRepository courseRepository;
    
    @Autowired
    private studentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    
    	course c1 = new course("Sftware Engineering");
    	course c2 = new course("Network Engineering");
    	
    	student s1 = new student("Aroshana","aroshana@gmail.com");
    	student s2 = new student("Kamal","Kamal@gmail.com");
      
    	
    	c1.getEnrolledStudent().add(s1);
    	c1.getEnrolledStudent().add(s2);
    	
    	s1.getEnrolledStudent().add(c1);
    	s2.getEnrolledStudent().add(c1);
    	
    	s1.getEnrolledStudent().add(c2);
    	c2.getEnrolledStudent().add(s1);

        
    	this.courseRepository.save(c1);
    	this.courseRepository.save(c2);
        
    }


}
