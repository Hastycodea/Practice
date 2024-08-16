package com.hastycode.SpringSecExample;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    List<Student> students = new ArrayList<>( List.of(
            new Student(8939, "Junior", 423),
            new Student(8938, "Mark", 222)
    ));

    @GetMapping("/")
    public String home(HttpServletRequest request) {
        return "Welcome home!" + request.getSession().getId();
    }

    @GetMapping("/student")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
