package com.zhangxijing.DemoProjectforSpringBoot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudent() {
        // Creating a list of students with sample data
        return List.of(
                new Student(1L, "John Doe", "john.doe@example.com", LocalDate.of(1995, 5, 15), 27),
                new Student(2L, "Jane Smith", "jane.smith@example.com", LocalDate.of(1998, 8, 22), 24),
                new Student(3L, "Bob Johnson", "bob.johnson@example.com", LocalDate.of(1990, 3, 10), 32)
                // Add more students as needed
        );
    }
}
