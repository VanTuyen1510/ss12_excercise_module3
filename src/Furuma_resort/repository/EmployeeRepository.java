package Furuma_resort.repository;

import Furuma_resort.data.EmployeeData;
import Furuma_resort.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private static List<Employee> employeeList = new ArrayList<>();
//        public Employee(String name, String date, String gender, int id, String phone, String email, String code, String level, String location, int salary) {
//        super(name, date, gender, id, phone, email);
    static {
        Employee employee1 = new Employee("Tuyen","15/10/1997","nam",1 ,"08996878706","tuyen@gmail.com","1","Đại học","Giasm đốc",1);
        employeeList.add(employee1);
    }
    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
            employeeList =  EmployeeData.readEmployee();
        }


    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        EmployeeData.writeEmployee(employee);
    }

    @Override
    public void edit(String code, Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if ((employeeList.get(i).getCode().equals(code))) {
                employeeList.set(i, employee);
                EmployeeData.writeEmployee(employee);
            }

        }


    }
}
