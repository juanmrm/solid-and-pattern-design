package com.demo.pattern.structural.composite;

public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee CEO = new EmployeeImpl("John","CEO", 30000);
        Employee headSales = new EmployeeImpl("Robert","Head Sales", 20000);
        Employee headMarketing = new EmployeeImpl("Michel","Head Marketing", 20000);
        Employee clerk1 = new EmployeeImpl("Laura","Marketing", 10000);
        Employee clerk2 = new EmployeeImpl("Bob","Marketing", 10000);
        Employee salesExecutive1 = new EmployeeImpl("Richard","Sales", 10000);
        Employee salesExecutive2 = new EmployeeImpl("Rob","Sales", 10000);
        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        printAllEmployees(CEO);
    }

    // Print all hierarchy using recursion
    private static void printAllEmployees(Employee employee) {
        System.out.println(employee);
        employee.getSubordinates().forEach(CompositePatternDemo::printAllEmployees);
    }
}