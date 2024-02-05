package com.zhangxijing.DemoProjectforSpringBoot.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDate;

@Service
public class StudentService {

    public List<Student> getStudents() {
        // Creating a list of students with sample data
        return List.of(
                new Student(1L, "John Doe", "john.doe@example.com", LocalDate.of(1995, 5, 15), 27),
                new Student(2L, "Jane Smith", "jane.smith@example.com", LocalDate.of(1998, 8, 22), 24),
                new Student(3L, "Bob Johnson", "bob.johnson@example.com", LocalDate.of(1990, 3, 10), 32)
                // Add more students as needed
        );
    }
}