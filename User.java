package labsession4;

public class User {
    public String ten;
    public int tuoi;
    public String cmnd;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void getInfo(){
        System.out.println(this.getTen());
        System.out.println(this.getTuoi());
        System.out.println(this.getCmnd());
    }
}