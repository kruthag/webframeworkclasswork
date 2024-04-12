package com.example.CE5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.CE5.model.Student;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
    @GetMapping("/students")
   public List<Student> getMethodName()
   {
    List<Student>st=new ArrayList<>();
    st.add(new Student("John","Welcome, John!"));
    return st;
   }
}
