package com.example221.deemo;


@org.springframework.stereotype.Service
public class StudentService {
    private final StudentRepository repo;
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    void addStudent(student student) {
        repo.save(student);
    }

    //update
    <Student> void updateStudent(student newstudent , Long id) {
        newstudent.setId(id);
        repo.save(newstudent);
    }


    public java.util.List<student> findAllStudents() {
        return repo.findAll();
    }

    //select by id
    public student findStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    //delete
    public void deleteStudentById(Long id) {
        repo.deleteById(id);
    }
}
