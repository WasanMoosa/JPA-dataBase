package com.Institute.management.system.InstituteManagementSystem.service;

import com.Institute.management.system.InstituteManagementSystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.Institute.management.system.InstituteManagementSystem.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    // Get all student
    public List<Student> getStudents() {

        return studentRepository.findAll();
    }

    // Get specific student
    public Optional<Student> getStudent(int id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // update student
    public Optional<Student> updateStudent(int id, Student updatedStudent) {
        Optional<Student> student = studentRepository.findById(id);
        student.ifPresent((currStudent) -> {
            currStudent.name = updatedStudent.name;
            currStudent.email = updatedStudent.email;
            studentRepository.save(currStudent);
        });

        return student;
    }

    // Delete student
    public Optional<Student> deleteStudent(int id) {
        Optional<Student> student = getStudent(id);
        studentRepository.deleteById(id);
        return student;
    }
}
