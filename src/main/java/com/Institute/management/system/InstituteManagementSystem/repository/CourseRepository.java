package com.Institute.management.system.InstituteManagementSystem.repository;

import com.Institute.management.system.InstituteManagementSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
