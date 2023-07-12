package service.impl;

import bean.Student;
import repository.IStudentRepository;
import repository.StudentRepository;
import service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    // ArrayList a = new ArrayList
    // List b = new ArrayList  :mềm dẻo hơn chứa được ArrayList và chứa được LinkedList

    private IStudentRepository iStudentRepository = new StudentRepository(); // ép kiểu ngầm định
    //Nguyên lý thứ 5 trong Solid : những module cấp cao  không phụ thuộc trực tiếp vào module cấp thấp thì phải thông qua trừu tượng
    // module cấp cao là service ,module cấp thấp là repo
    @Override
    public List<Student> finalAll() {
        return this.iStudentRepository.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }
}
