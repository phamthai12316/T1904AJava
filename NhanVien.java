package assignment2;

import java.util.Scanner;

public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int totalTime;

    public NhanVien(){
        System.out.println("Vua tao 1 nhan vien");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien:");
        setName(sc.nextLine());
        System.out.println("Nhap tuoi:");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap dia chi:");
        setAddress(sc.nextLine());
        System.out.println("Nhap so luong:");
        setSalary(sc.nextDouble());
        System.out.println("nhap so gio lam:");
        setTotalTime(sc.nextInt());
    }

    public void printInfo(){
        System.out.println("Ten: "+getName());
        System.out.println("Tuoi: "+getAge());
        System.out.println("Dia chi: "+getAddress());
        System.out.println("Luong: "+getSalary());
        System.out.println("So gio lam: "+getTotalTime());
    }

    public double tinhThuong(){
        double thuong = 0;
        if(getTotalTime()>=200){
            thuong = getSalary()*0.2;
        }else if(getTotalTime()>=100){
            thuong = getSalary()*0.1;
        }else{
            thuong = 0;
        }
        return thuong;
    }
}