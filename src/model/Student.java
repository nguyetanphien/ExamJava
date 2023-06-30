package model;

import java.util.Scanner;

public class Student extends Person {
    private String batch;
    private double mark1;
    private double mark2;

    public Student() {
    }


    public Student(int id, String name, String numberPhone, String address, String batch, double mark1, double mark2) {
        super(id, name, numberPhone, address);
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    @Override
    public void input(Scanner scanner) {
        System.out.println("---------Enter Student-------------");
        System.out.println("Enter student Id: ");
        setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter student Name: ");
        setName(scanner.nextLine());
        System.out.println("Enter numberPhone: ");
        setNumberPhone(scanner.nextLine());
        System.out.println("Enter address: ");
        setAddress(scanner.nextLine());
        System.out.println("Enter Batch: ");
        batch = scanner.nextLine();
        System.out.println("Enter Mark1: ");
        mark1 = scanner.nextDouble();
        System.out.println("Enter Mark2: ");
        mark2 = scanner.nextDouble();
    }

    @Override
    public void output() {
        System.out.println("------------Student------------");
        System.out.println("teacher Id:" + getId());
        System.out.println("teacher Name:" + getName());
        System.out.println("teacher Number phone:" + getNumberPhone());
        System.out.println("address:" + getAddress());
        System.out.println("Batch:" + getBatch());
        System.out.println("Mark1:" + getMark1());
        System.out.println("Mark2:" + getMark2());
        System.out.println("Avg Mark: " + avgMark());
    }

    public double avgMark() {
        return (mark1 + mark2) / 2;
    }
}
