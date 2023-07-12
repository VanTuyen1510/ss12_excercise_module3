package Furuma_resort.data;

import Furuma_resort.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    private static final String FILE_PATH = "D:\\HocLai_module2\\src\\Furuma_resort\\data\\Employee.csv";

    public static void writeEmployee(Employee employee) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH,true);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            buff.write(employee.getName() + "," +
                    employee.getDate() + "," +
                    employee.getGender() + "," +
                    employee.getId() + "," +
                    employee.getPhone() + "," +
                    employee.getEmail() + "," +
                    employee.getCode() + "," +
                    employee.getLevel() + "," +
                    employee.getLocation() + "," +
                    employee.getSalary() + "\n"
            );
            buff.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static List<Employee> readEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            String[] temp;
            Employee employee;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                String name = temp[0];
                String date = temp[1];
                String gender = temp[2];
                int id = Integer.parseInt(temp[3]);
                String phone = temp[4];
                String email = temp[5];
                String code = temp[6];
                String level = temp[7];
                String location = temp[8];
                int salary = Integer.parseInt(temp[temp.length - 1]);

                employee = new Employee(name, date, gender, id, phone, email, code, level, location, salary);
                employeeList.add(employee);
            }
            buff.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter in full!");
        } catch (IOException e) {
            System.out.println("Error!");
        }
        return employeeList;
    }
}
