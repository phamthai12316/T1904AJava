package labsession3;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        setTuSo(tuSo);
        setMauSo(mauSo);
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        while (mauSo==0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap mau so:");
            mauSo = sc.nextInt();
        }
        this.mauSo = mauSo;
    }

    public void nhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        setTuSo(sc.nextInt());
        System.out.println("Nhap mau so:");
        setMauSo(sc.nextInt());
    }

    public void inPhanSo(){
        System.out.println(this.getTuSo()+"/"+this.getMauSo());
    }

    public void rutGonPhanSo(){
        int ucln = 1;
        int t = Math.abs(getTuSo());
        int m = Math.abs(getMauSo());
        int min = Math.min(t,m);
        for (int i=min;i>1;i--){
            if(t%i==0 && m%i==0){
                ucln = i;
                break;
            }
        }
        setTuSo(getTuSo()/ucln);
        setMauSo(getMauSo()/ucln);
    }

    public void nghichDaoPhanSo(){
        if(getTuSo() !=0){
            int tmp = getTuSo();
            setTuSo(getMauSo());
            setMauSo(tmp);
            return;
        }
        System.out.println("khong the nghich dao do tu so = 0");
    }

    public PhanSo addPhanSo(PhanSo f){
        PhanSo phanSoTong = new PhanSo();
        phanSoTong.setTuSo(this.getTuSo()*f.getMauSo()+ this.getMauSo()*f.getTuSo());
        phanSoTong.setMauSo(this.getMauSo()*f.getMauSo());
        return phanSoTong;
    }
}