package jv2.labsession6.labsession6;

public class PhoneNumber1 {
    public Integer id;
    public String telephone;
    public String type;

    public PhoneNumber1() {
    }

    public PhoneNumber1(Integer id, String telephone, String type) {
        this.id = id;
        this.telephone = telephone;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return this.getType()+" : "+this.getTelephone();
    }
}