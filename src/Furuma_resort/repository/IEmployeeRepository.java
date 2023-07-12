package Furuma_resort.repository;

import Furuma_resort.models.Employee;

public interface IEmployeeRepository {
    void display();
    void add(Employee employee);
    void edit(String code, Employee employee);
}
