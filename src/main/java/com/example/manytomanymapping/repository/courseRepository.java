package com.example.manytomanymapping.repository;

import com.example.manytomanymapping.entity.course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepository extends JpaRepository<course, Long> {
}
