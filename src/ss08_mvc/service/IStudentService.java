package ss08_mvc.service;


import ss08_mvc.model.Student;

public interface IStudentService {
    // CRUD sort , search order ...
    Student[] findAll();

    void addStudent(Student student);

    //Validation
}
