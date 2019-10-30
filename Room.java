package labsession4;

import java.util.ArrayList;

public class Room {
    public String tenPhong;
    public String vitri;
    public ArrayList<User> dsNguoiDung;

    public Room(){
        this.dsNguoiDung = new ArrayList<>();
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public void themNguoiDung(User u){
        this.dsNguoiDung.add(u);
    }

    public void xoaNguoiDung(User u){
        this.dsNguoiDung.remove(u);
    }

    public void showInfo(){
        System.out.println("Ten phong: "+this.getTenPhong());
        System.out.println("Vi tri: "+this.getVitri());

//        for (int i =0;i < this.dsNguoiDung.size();i++){
//            System.out.println(this.dsNguoiDung.get(i).getTen());
//            System.out.println(this.dsNguoiDung.get(i).getTuoi());
//            System.out.println(this.dsNguoiDung.get(i).getCmnd());
//        }

        for (User u: this.dsNguoiDung){
            u.getInfo();
        }
    }

}