package assignment2;

import java.util.Scanner;

public class TamGiac {
    public int canh1;
    public int canh2;
    public int canh3;

    public TamGiac(){
        System.out.println("Constructor ko tham so");
    }

    public TamGiac(double a,double b,double c){
        System.out.println("Constructor co tham so float");
    }

    public TamGiac(int c1,int c2,int c3){
        System.out.println("Constructor co tham so");
        while (!this.kiemTra(c1,c2,c3)){
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap lai canh 1:");
            c1 = sc.nextInt();
            System.out.println("nhap lai canh 2:");
            c2 = sc.nextInt();
            System.out.println("nhap lai canh 3:");
            c3 = sc.nextInt();
        }
        this.setCanh1(c1);
        this.setCanh2(c2);
        this.setCanh3(c3);
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public boolean kiemTra(int a,int b,int c){
        if(a+b>c && a+c>b && b+c>a){
            return true;
        }
        return false;
    }

    public int chuVi(){
        return getCanh1()+getCanh2()+getCanh3();
    }

    public double dienTich(){
        double p = (double)this.chuVi()/2;
        return Math.sqrt(p*(p-getCanh1())*(p-getCanh2())*(p-getCanh3()));
    }
}