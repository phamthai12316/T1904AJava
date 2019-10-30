package labsession4;

import java.util.Scanner;

public class Main1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.println("Nhap ten");
        u.setTen(sc.nextLine());
        System.out.println("Nhap tuoi");
        u.setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap CMT:");
        u.setCmnd(sc.nextLine());

        Room r = new Room();
        r.setTenPhong("A6");
        r.setVitri("12");

        r.themNguoiDung(u);

        r.showInfo();

        r.xoaNguoiDung(u);
    }
}