package labsession3;

public class Main {
    public static void main(String args[]){
        PhanSo fc = new PhanSo();
        fc.nhapPhanSo();
        fc.inPhanSo();
        fc.rutGonPhanSo();
        fc.inPhanSo();
        fc.nghichDaoPhanSo();
        fc.inPhanSo();
        PhanSo fc2 = new PhanSo(1,3);

        PhanSo tong = fc.addPhanSo(fc2);
        char a[] = {'a','b','c','d','e'};

    }
}