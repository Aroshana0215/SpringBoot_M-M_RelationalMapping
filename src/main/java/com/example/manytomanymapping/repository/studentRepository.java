package com.example.manytomanymapping.repository;

import com.example.manytomanymapping.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<student, Long> {
}
