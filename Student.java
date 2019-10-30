package assignment3;

import java.util.Scanner;

public class Student {
    private String Masinhvien;
    private double Diemso;
    private int Tuoi;
    private String Lophoc;

    public Student(){

    }
    public Student(String StudentID,double Point,int Age,String Class){

    }
    public String getMasinhvien() {
        return Masinhvien;
    }
    public void setMasinhvien(String masinhvien) {
        while (masinhvien.length()!=8){
            System.out.println("Yeu cau nhap lai: Ma sinh vien phai 8 ky tu");
            Scanner sc = new Scanner(System.in);
            masinhvien = sc.nextLine();
        }
        Masinhvien = masinhvien;
    }
    public double getDiemso() {
        return Diemso;
    }
    public void setDiemso(double diemso) {
        while (diemso<0||diemso>10){
            System.out.println("Yeu cau nhap lai: Diem so phai tu 0.0 den 10.0");
            Scanner sc = new Scanner(System.in);
            diemso = sc.nextDouble();
        }
        Diemso = diemso;
    }
    public int getTuoi() {
        return Tuoi;
    }
    public void setTuoi(int tuoi) {
        while (tuoi<18){
            System.out.println("Yeu cau nhap lai: Sinh vien phai >= 18 tuoi");
            Scanner sc = new Scanner(System.in);
            tuoi = sc.nextInt();
        }
        Tuoi = tuoi;
    }
    public String getLophoc() {
        return Lophoc;
    }
    public void setLophoc(String lophoc) {
        while (!(lophoc.startsWith("A") || lophoc.startsWith("C"))) {
            System.out.println("Yeu cau nhap lai: Lop hoc phai bat dau chu A hoac C");
            Scanner sc = new Scanner(System.in);
            lophoc = sc.nextLine();
        }
        Lophoc = lophoc;
    }

    public void inputInfo(){
        System.out.println("Nhap thong tin sinh vien");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MA sinh vien: 8 ky tu");
        setMasinhvien(sc.nextLine());
        System.out.println("Nhap DIEM sinh vien: tu 0.0 den 10.0");
        setDiemso(sc.nextDouble());
        System.out.println("Nhap TUOI sinh vien: >= 18 tuoi");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap LOP sinh vien: bat dau chu A hoac C");
        setLophoc(sc.nextLine());
    }

    public void showInfo(){
        System.out.println("Thong tin chi tiet cua sinh vien la: ");
        System.out.println("Ma sinh vien: " + Masinhvien);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Diem: " + Diemso);
        System.out.println("Lop hoc: " + Lophoc);
    }

    public void xetHocbong(){
        if(Diemso>=8){
            System.out.println("Sinh vien nay duoc hoc bong");
        }
        else {
            System.out.println("Sinh vien nay khong duoc hoc bong");
        }
    }
}