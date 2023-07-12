package ss08_mvc.repository;


import ss08_mvc.model.Student;

public interface IStudentRepository {
    // CRUD sort , search order ...
    Student[] findAll();

    void addStudent(Student student);

    //Validation
}
