Payroll Management System
A simple Java-based Payroll Management System created to practice and understand core Java Object-Oriented Programming (OOP) concepts and the Java Collections Framework.

Concepts Covered
Abstraction – Using an abstract Employee class and abstract calculateSalary() method.
Encapsulation – Using private fields with getter methods.
Inheritance – FullTimeEmployee and PartTimeEmployee extend the Employee class.
Polymorphism – Different employee types provide their own implementation of calculateSalary().
Method Overriding – Child classes override the calculateSalary() method.
Constructors – Initializing employee objects using constructors.
super Keyword – Calling the parent class constructor.
ArrayList – Storing and managing multiple employee objects.
Enhanced for-loop – Iterating through the employee collection.
toString() – Providing a meaningful representation of employee objects.
Project Structure
Employee (Abstract Class)
       |
       |-------------------|
       |                   |
FullTimeEmployee    PartTimeEmployee
       |                   |
Monthly Salary       Hourly Rate × Hours

             ↓
       PayrollSystem
             |
          ArrayList
             |
      Employee Objects
