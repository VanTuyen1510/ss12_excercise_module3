package Furuma_resort.service;

import Furuma_resort.models.Employee;
import Furuma_resort.repository.EmployeeRepository;

public class EmployeeService implements IEmployeeService{
    private static EmployeeRepository repository = new EmployeeRepository();

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void add(Employee employee) {
        repository.add(employee);
    }

    @Override
    public void edit(String code, Employee employee) {
        repository.edit(code, employee);
    }
}
