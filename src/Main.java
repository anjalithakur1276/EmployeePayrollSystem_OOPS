//abstraction

import java.util.ArrayList;

abstract class Employee {
    private String name;
    private  int id;

//constructor is used to access objects
    public Employee (String name,int id){
        this.name = name;
        this.id = id;
    }

    //using of getter and setters - encapsulation
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    //Declare abstract method & it will hide internal implementation

    public abstract double calculateSalary();
    @Override
    public String toString() {
        return "Employee[name=" + name
                + ",id=" + id
                + ",salary=" + calculateSalary() + "]";
    }
}




//inheritance is used
class FullTimeEmployee extends Employee {
    //variable declaration
    private double monthlySalary;

    //constructor
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        //super keyword is used to access constructor variable from parent class
        super(name, id);
        this.monthlySalary = monthlySalary;

    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
        private int hours;
        private double hourlyRate;
        public  PartTimeEmployee (String name, int id, double hourlyRate,int hours){
            super(name, id);
            this.hourlyRate = hourlyRate;
            this.hours = hours;
        }

        @Override
        public double calculateSalary(){
            return hours*hourlyRate;
        }
}



class PayrollSystem{
    private ArrayList<Employee> employeeArrayList;
    public PayrollSystem (){
        employeeArrayList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeArrayList.add(employee);
    }

    public void removeEmployee(int id) {

        Employee employeeToRemove = null;

        for (Employee employee : employeeArrayList) {

            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }

        if (employeeToRemove != null) {
            employeeArrayList.remove(employeeToRemove);
        }
    }

    public void displayEmployee(){
        for (Employee employee:employeeArrayList){
            System.out.println(employee);
        }
    }


}
public class Main {
    public static void main (String[]args){
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Priya",1,70000.34);
        PartTimeEmployee emp2 = new PartTimeEmployee("Suggu",2,250,10);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initially employee details");
        payrollSystem.displayEmployee();
        System.out.println("Removing employees");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining employee details");
        payrollSystem.displayEmployee();
    }
}