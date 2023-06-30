package model;

import java.util.Scanner;

public class Teacher extends Person {
    private double salary;
    private int numberWorkDay;

    public Teacher() {
    }


    public Teacher(int id, String name, String numberPhone, String address, double salary, int numberWorkDay) {
        super(id, name, numberPhone, address);
        this.salary = salary;
        this.numberWorkDay = numberWorkDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWorkDay() {
        return numberWorkDay;
    }

    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
    }

    @Override
    public void input(Scanner scanner) {

        System.out.println("---------Enter Teacher-------------");
        System.out.println("Enter teacher Id: ");
        setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter teacher Name: ");
        setName(scanner.nextLine());
        System.out.println("Enter numberPhone: ");
        setNumberPhone(scanner.nextLine());
        System.out.println("Enter address: ");
        setAddress(scanner.nextLine());
        System.out.println("Enter Salary: ");
        salary = scanner.nextDouble();
        System.out.println("Enter Number work day: ");
        numberWorkDay = scanner.nextInt();
    }

    @Override
    public void output() {
        System.out.println("------------Teacher------------");
        System.out.println("teacher Id:" + getId());
        System.out.println("teacher Name:" + getName());
        System.out.println("teacher Number phone:" + getNumberPhone());
        System.out.println("address:" + getAddress());
        System.out.println("salary:" + getSalary());
        System.out.println("Number work day:" + getNumberWorkDay());
        System.out.println("get Salary: " + getSalaryTeacher());

    }

    public double getSalaryTeacher() {
        return numberWorkDay * 800000;
    }
}
