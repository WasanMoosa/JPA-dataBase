package com.Institute.management.system.InstituteManagementSystem.repository;

import com.Institute.management.system.InstituteManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


}
