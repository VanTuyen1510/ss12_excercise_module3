package Furuma_resort.controller;

import Furuma_resort.data.EmployeeData;
import Furuma_resort.models.Employee;
import Furuma_resort.service.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    static final Scanner sc = new Scanner(System.in);
    private static EmployeeService service = new EmployeeService();

    public static void displayMainMethod(int select) {
        do {
            try {
                System.out.println("-------Menu Management------");
                System.out.println("1. Employee Management");
                System.out.println("2. Customer Management");
                System.out.println("3. Facility Management");
                System.out.println("4. Booking Management");
                System.out.println("5. Promotion Management");
                System.out.println("6. Exit");
                System.out.print("Please input number: ");

                select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1: // employee
                        displayEmployee(select);
                        break;
                    case 2: // customer
                        displayCustomer(select);
                        break;
                    case 3: // facility
                        displayFacility(select);
                        break;
                    case 4: // booking
                        displayBooking(select);
                        break;
                    case 5: // promotion
                        displayPromotion(select);
                        break;
                    case 6: // exit
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }

        } while (select != 6);
    }

    public static void displayEmployee(int select) {
        do {
            String name = "";
            String date = "";
            String gender = "";
            int id;
            String phone = "";
            String email = "";
            String code = "";
            String level = "";
            String location = "";
            int salary;

            System.out.println("-------Employee Management------");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.print("Please input number: ");
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1: // show
                    service.display();
                    break;
                case 2: // add
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    System.out.print("Enter date of birth: ");
                    date = sc.nextLine();
                    System.out.print("Enter gender: ");
                    gender = sc.nextLine();
                    System.out.print("Enter CMND: ");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter phone: ");
                    phone = sc.nextLine();
                    System.out.print("Enter email: ");
                    email = sc.nextLine();
                    System.out.print("Enter employee code: ");
                    code = sc.nextLine();

                    do {
                        System.out.println("Enter level");
                        System.out.println("1. Intermediate");
                        System.out.println("2. College");
                        System.out.println("3. University");
                        System.out.println("4. Graduate");
                        System.out.print("Please input number: ");
                        select = Integer.parseInt(sc.nextLine());
                        switch (select) {
                            case 1:
                                level = "Intermediate";
                                break;
                            case 2:
                                level = "College";
                                break;
                            case 3:
                                level = "University";
                                break;
                            case 4:
                                level = "Graduate";
                                break;
                            default:
                                System.out.println("Enter 1 to 4!");
                        }
                    } while (select < 1 || select > 4);
                    do {
                        System.out.println("Enter location");
                        System.out.println("1. Receptionist");
                        System.out.println("2. Serve");
                        System.out.println("3. Expert");
                        System.out.println("4. Monitor");
                        System.out.println("5. Manage");
                        System.out.println("6. Manager");
                        System.out.print("Please input number: ");
                        select = Integer.parseInt(sc.nextLine());
                        switch (select) {
                            case 1:
                                location = "Receptionist";
                                break;
                            case 2:
                                location = "Serve";
                                break;
                            case 3:
                                location = "Expert";
                                break;
                            case 4:
                                location = "Monitor";
                                break;
                            case 5:
                                location = "Manage";
                                break;
                            case 6:
                                location = "Manager";
                                break;
                            default:
                                System.out.println("Enter 1 to 6!");
                        }
                    } while (select < 1 || select > 6);

                    System.out.print("Enter salary: ");
                    salary = Integer.parseInt(sc.nextLine());

                    Employee addEmployee = new Employee(name, date, gender, id, phone, email, code, level, location, salary);
                    service.add(addEmployee);
                    break;
                case 3: // edit
                    System.out.print("Enter employee code to edit: ");
                    String editCode = sc.nextLine();

                    System.out.print("Enter new name: ");
                    name = sc.nextLine();
                    System.out.print("Enter new date of birth: ");
                    date = sc.nextLine();

                    do {
                        System.out.print("Enter new gender: ");
                        System.out.println("1.Nam");
                        System.out.println("2.Nữ");
                        System.out.println("Please input");
                        select = Integer.parseInt(sc.nextLine());
                        switch (select){
                            case 1:
                                gender = "nam";
                                break;
                            case 2:
                                gender = "nữ";
                                break;

                        }
                    }while (select > 2);


                    System.out.print("Enter new CMND: ");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter new phone: ");
                    phone = sc.nextLine();
                    System.out.print("Enter new email: ");
                    email = sc.nextLine();
                    System.out.print("Enter new employee code: ");
                    code = sc.nextLine();

                    do {
                        System.out.println("Enter level");
                        System.out.println("1. Intermediate");
                        System.out.println("2. College");
                        System.out.println("3. University");
                        System.out.println("4. Graduate");
                        System.out.print("Please input number: ");
                        select = Integer.parseInt(sc.nextLine());
                        switch (select) {
                            case 1:
                                level = "Intermediate";
                                break;
                            case 2:
                                level = "College";
                                break;
                            case 3:
                                level = "University";
                                break;
                            case 4:
                                level = "Graduate";
                                break;
                            default:
                                System.out.println("Enter 1 to 4!");
                        }
                    } while (select < 1 || select > 4);
                    do {
                        System.out.println("Enter location");
                        System.out.println("1. Receptionist");
                        System.out.println("2. Serve");
                        System.out.println("3. Expert");
                        System.out.println("4. Monitor");
                        System.out.println("5. Manage");
                        System.out.println("6. Manager");
                        System.out.print("Please input number: ");
                        select = Integer.parseInt(sc.nextLine());
                        switch (select) {
                            case 1:
                                location = "Receptionist";
                                break;
                            case 2:
                                location = "Serve";
                                break;
                            case 3:
                                location = "Expert";
                                break;
                            case 4:
                                location = "Monitor";
                                break;
                            case 5:
                                location = "Manage";
                                break;
                            case 6:
                                location = "Manager";
                                break;
                            default:
                                System.out.println("Enter 1 to 6!");
                        }
                    } while (select < 1 || select > 6);

                    System.out.print("Enter new salary: ");
                    salary = Integer.parseInt(sc.nextLine());

                    Employee editEmployee = new Employee(name, date, gender, id, phone, email, code, level, location, salary);
                    service.edit(editCode, editEmployee);
                    EmployeeData.writeEmployee(editEmployee);
                    break;
                case 4: // return
                    break;
            }
        } while (select != 4);
    }

    public static void displayCustomer(int select) {
        do {
            System.out.println("-------Customer Management------");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.print("Please input number: ");

            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1: // show
                    break;
                case 2: // add
                    break;
                case 3: /// edit
                    break;
                case 4: // return
                    break;
            }
        } while (true);
    }

    public static void displayFacility(int select) {
        do {
            System.out.println("-------Facility Management------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.print("Please input number: ");

            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1: // show
                    break;
                case 2: // add
                    break;
                case 3: // show list
                    break;
                case 4: // return
                    break;
            }
        } while (true);
    }

    public static void displayBooking(int select) {
        do {
            System.out.println("-------Booking Management------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.print("Please input number: ");

            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1: // add
                    break;
                case 2: // show booking
                    break;
                case 3: // create
                    break;
                case 4: // show contracts
                    break;
                case 5: // edit
                    break;
                case 6: // return
                    break;
            }
        } while (true);
    }

    public static void displayPromotion(int select) {
        do {
            System.out.println("-------Promotion Management------");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.print("Please input number: ");

            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1: // show list use service
                    break;
                case 2: // show list get voucher
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        int select = 0;
        displayMainMethod(select);
    }
}
