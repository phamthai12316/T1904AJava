package session2;

import java.util.Scanner;

public class Session2 {
    private String name;
    private int age;

    public Session2(){
        // System.out.println("Vua tao 1 doi tuong Session 2 xong");
        inputInfo();
        showInfo();
    }

    public static String abc = "good";

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

    public void showInfo(){
        System.out.println("Fullname: "+name);
        // System.out.println("Fullname: "+this.name);
        System.out.println("Age: "+age);
        System.out.println(Session2.abc);
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        setName(sc.nextLine());
        System.out.println("Nhap Tuoi:");
        setAge(sc.nextInt());
    }

    public static void main(String args[]){
        //  Session2 ss2 = new Session2();
//        ss2.inputInfo();
//        ss2.showInfo();
        //  Session2 ss3 = new Session2();
//        ss3.inputInfo();
//        ss3.showInfo();
//        System.out.println("So sanh");
//        System.out.println("SS2 name: "+ss2.getName());
//        System.out.println("SS3 name: "+ss3.getName());
        SoNguyenTo snt = new SoNguyenTo();
        for (int i=0;i<10;i++){
//            int x = snt.timSoNguyenToTiepTheo();
//            snt.setA(x);
            snt.setA(snt.timSoNguyenToTiepTheo());
            System.out.println(snt.getA());
        }
        //int z = 43;
        snt.setA(43);
        System.out.println("Next: "+snt.timSoNguyenToTiepTheo());
    }

    public static void sayHello(){
        Session2 ss3 = new Session2();
        ss3.showInfo();
        // System.out.println("Fullname: "+name);
        System.out.println("Hello World!");
        System.out.println(abc);
    }
}