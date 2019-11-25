package jv2.practical;

import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<StudentPractical> studentPracticalList;
    private StudentCare studentCare;


    public StudentManager() {
        studentCare = new StudentCare();
        studentPracticalList = studentCare.read();
    }


    public void add() {
        String id = inputId();
        String name = inputName();
        String address = inputAddress();
        String phone = inputPhone();
        StudentPractical studentPractical = new StudentPractical(id, name,  address, phone);
        studentPracticalList.add(studentPractical);
        studentCare.write(studentPracticalList);
    }



    public void show() {
        for (StudentPractical studentPractical : studentPracticalList) {
            System.out.format("%5s | ", studentPractical.getId());
            System.out.format("%20s | ", studentPractical.getName());
            System.out.format("%20s | ", studentPractical.getAddress());
            System.out.format("%20s%n", studentPractical.getPhone());
        }
    }


    public String inputId() {
        System.out.print("Input Student Id: ");
        return scanner.nextLine();
    }

    private String inputName() {
        System.out.print("Input Student Name: ");
        return scanner.nextLine();
    }


      private String inputAddress() {
        System.out.print("Input Student Address: ");
        return scanner.nextLine();
    }

    private String inputPhone() {
        System.out.print("Input Student Phone: ");
        return scanner.nextLine();
    }


    // getter && setter
    public List<StudentPractical> getStudentList() {
        return studentPracticalList;
    }

    public void setStudentList(List<StudentPractical> studentPracticalList) {
        this.studentPracticalList = studentPracticalList;
    }
}