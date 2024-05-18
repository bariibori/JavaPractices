package employee;
import java.util.Scanner;

public class Employee {
    private String name, id, company;
    private double salary;

    public Employee() { // default constructor
        System.out.println("This is the default constructor");
    }

    public Employee(String name, String id, String company, double salary) { // parameterized constructor
        this.name = name;
        this.id = id;
        this.company = company;
        this.salary = salary;
    }

    public Employee(Employee e) { // copy constructor
        this.name = e.name;
        this.id = e.id;
        this.company = e.company;
        this.salary = e.salary;
    }

    public void inputFromUser() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee details:");
        System.out.print("Enter employee name: ");
        this.name = s.nextLine();
        System.out.print("Enter employee ID: ");
        this.id = s.nextLine();
        System.out.print("Enter employee company: ");
        this.company = s.nextLine();
        System.out.print("Enter employee salary: ");
        this.salary = s.nextDouble();
        System.out.println("Here are the employee details:");
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee company: " + this.company);
        System.out.println("Employee salary: " + this.salary);
    }

    public void display() {
        System.out.println("Here are the employee details:");
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee company: " + this.company);
        System.out.println("Employee salary: " + this.salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee(); // default constructor
        e.company = "JU";
        e.name = "Bona";
        e.id = "0098";
        e.salary = 2000;
        e.display();

        Employee e1 = new Employee();
        e1.inputFromUser();

        System.out.println("Parameterized Constructor");
        Employee emp = new Employee("chala", "989", "Ju", 7000);
        emp.display();

        System.out.println("Copy Constructor");
        Employee emp1 = new Employee(emp);
        emp1.display();
    }
}