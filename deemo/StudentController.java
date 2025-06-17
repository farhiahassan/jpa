package com.example221.deemo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    //requests
    //get all
    @GetMapping("/all")
    public java.util.List<com.example221.deemo.student> findAll() {
        return service.findAllStudents();
    }

    @GetMapping("{id}")
    public student findById(@PathVariable Long id) {
        return service.findStudentById(id);
    }
    //add
    @PostMapping
    public void save(@RequestBody student student) {
        service.addStudent(student);
    }


    @PutMapping("{id}")
    public void update(@PathVariable Long id,
                       @RequestBody student newStudent) {
        service.updateStudent(newStudent , id);
    }


    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteStudentById(id);
    }
}
