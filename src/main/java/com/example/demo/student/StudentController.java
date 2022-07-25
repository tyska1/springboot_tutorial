package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping(path = "api/v1/student") //localhost
public class StudentController {

    private final StudentService studentService;

    @Autowired //must know where to find
    public StudentController(StudentService studentService) {
        this.studentService = new StudentService();
    }

    @GetMapping //get sth out from our server
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
