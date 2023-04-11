package com.Institute.management.system.InstituteManagementSystem.controller;

import com.Institute.management.system.InstituteManagementSystem.model.Course;
import com.Institute.management.system.InstituteManagementSystem.model.CourseAssigner;
import com.Institute.management.system.InstituteManagementSystem.model.Teacher;
import com.Institute.management.system.InstituteManagementSystem.service.CourseService;
import com.Institute.management.system.InstituteManagementSystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/assigner")
public class CourseAssignController {
    @Autowired
    CourseService courseService;
    @Autowired
    TeacherService teacherService;
    @PostMapping
    public CourseAssigner assignMentorToCourse(@RequestBody CourseAssigner courseAssigner){
        Optional<Course> optionalCourse=courseService.getOneCourse(courseAssigner.course_id);
        Optional<Teacher> optionalTeacher=teacherService.getTeacher(courseAssigner.teacher_id);
        optionalCourse.ifPresent(course -> {
            optionalTeacher.ifPresent(teacher -> {
                course.mentor=teacher;
                courseService.registerCourse(course);
            });
        });

return courseAssigner;
    }
}
