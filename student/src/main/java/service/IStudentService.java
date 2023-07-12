package service;

import bean.Student;

import java.util.List;

public interface IStudentService {
   List<Student> finalAll();
   Student findById(Integer id);
   void save(Student student);
}
