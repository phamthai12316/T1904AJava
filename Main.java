package assignment2;

public class Main {
    public static void main(String args[]){
        NhanVien nv1= new NhanVien();
        nv1.inputInfo();
        nv1.printInfo();
        System.out.println("thuong thang cua nhan vien "
                +nv1.getName()+" la: "+nv1.tinhThuong());

        TamGiac tg = new TamGiac();
        TamGiac tg2 = new TamGiac(1,2,3);
        TamGiac tg3 = new TamGiac(1.5,2.03,3.03);
        System.out.println("dien tich: "+tg2.dienTich());
    }
}