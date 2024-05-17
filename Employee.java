
package employee;
import java.util.Scanner;
public class Employee {
String name,id,company;//fields
double salary;
    public Employee() {//default constructor
        System.out.println("This is default constructor");
    }
    public Employee(String name, String id, String company, double salary) {//parameterized constructor
        this.name = name;
       this.id = id;
        this.company = company;
        this.salary = salary;
    }
    Employee(Employee e){//copy constructor
        name=e.name;
        id=e.id;
        company=e.company;
        salary=e.salary;
    }
void InpufromUser(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter employee Details:");
            System.out.print("Enter employee Name:");
            String n=s.nextLine();
            System.out.print("Enter employee ID:");
            String id=s.nextLine();
            System.out.print("Enter employee Company:");
            String c=s.nextLine();
            System.out.print("Enter employee Salary:");
            double sa=s.nextDouble();
            System.out.print("Here are employee Details:");
    System.out.println("employee Name:"+name+""+id+""+company+"salary");
}
void display(){
     System.out.println("Here are employee Details:");
     System.out.println("employee Name:"+name+""+id+""+company+"salary");
}
    public static void main(String[] args) {
       Employee e=new Employee();//defaullt constructor
        e.company="JU";
        e.name="Bomna";
        e.id="0098";  
        e.salary=2000;
        e.display();
        Employee e1=new Employee();
        e1.InpufromUser();
       System.out.println("Parameterized Constuctor");
       Employee emp=new Employee("chala", "989", "Ju", 7000);
       emp.display();
        System.out.println("Copy Constructor");
       Employee emp1=new Employee(emp);
       emp1.display();
    }
}
