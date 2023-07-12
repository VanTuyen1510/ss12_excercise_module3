package Furuma_resort.service;

import Furuma_resort.models.Employee;

public interface IEmployeeService {
    void display();
    void add(Employee employee);
    void edit(String code, Employee employee);
}
