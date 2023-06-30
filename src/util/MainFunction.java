package util;

import model.Person;
import model.Student;
import model.Teacher;

import java.util.*;

public class MainFunction {
    public static ArrayList<Person> arrayList = new ArrayList<>();

    public static void menu() {
        System.out.println("1. Input");
        System.out.println("2. Output Student");
        System.out.println("3. Output Teacher");
        System.out.println("4. salary for a teacher");
        System.out.println("5. AvgMark for students.");
        System.out.println("6. ascending student placement");
        System.out.println("7.  sort a this list by alphabetical order teacher");
        System.out.println("8. Exit");
    }

    public static void input(Scanner scanner) {
        int chosse;
        System.out.println(" 1. Enter Student");
        System.out.println(" 2. Enter Teacher");
        chosse = scanner.nextInt();
        if (chosse == 1)
            inputStudent(scanner);
        else
            inputTeacher(scanner);
    }

    public static void inputTeacher(Scanner scanner) {
        Teacher teacher = new Teacher();
        teacher.input(scanner);
        arrayList.add(teacher);
    }

    public static void inputStudent(Scanner scanner) {
        Student student = new Student();
        student.input(scanner);
        arrayList.add(student);
    }

    public static void outputSudent() {
        for (Person p : arrayList) {
            if (p instanceof Student student)
                student.output();
        }
    }

    public static void outputTeacher() {
        for (Person p : arrayList) {
            if (p instanceof Teacher teacher)
                teacher.output();
        }
    }

    public static void sortAvg() {
        Person s;

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) instanceof Student) {
                for (int j = i + 1; j < arrayList.size(); j++) {
                    if (arrayList.get(j) instanceof Student) {
                        if (((Student) arrayList.get(i)).avgMark() > ((Student) arrayList.get(j)).avgMark()) {
                            s = arrayList.get(i);
                            arrayList.set(i, arrayList.get(j));
                            arrayList.set(j, s);
                        }
                    }

                }
            }
        }
        outputSudent();

    }

    public static void sortAphabeticalTeacher() {
        Person p;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) instanceof Teacher) {
                for (int j = i + 1; j < arrayList.size(); j++) {

                    if (arrayList.get(j) instanceof Teacher) {
                        if (arrayList.get(i).getName().compareTo(arrayList.get(j).getName()) > 0) {
                            p = arrayList.get(i);
                            arrayList.set(i, arrayList.get(j));
                            arrayList.set(j, p);
                        }
                    }

                }
            }
        }
        outputTeacher();
    }
}
