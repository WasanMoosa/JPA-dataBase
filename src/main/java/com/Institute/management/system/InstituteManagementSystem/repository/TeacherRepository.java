package com.Institute.management.system.InstituteManagementSystem.repository;

import com.Institute.management.system.InstituteManagementSystem.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
