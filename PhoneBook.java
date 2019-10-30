package assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> PhoneList;

    public PhoneBook() {
        PhoneList = new ArrayList<>();
    }

    @Override
    void insertPhone(String name, String phone) {
        for(PhoneNumber p : PhoneList){
            if(p.getName().equals(name)){
                if(!p.getPhone().contains(phone)){
                    p.setPhone(p.getPhone()+":"+phone);
                    return;
                }
                return;
            }
        }
        PhoneNumber phoneNumber = new PhoneNumber(name,phone);
        PhoneList.add(phoneNumber);
    }

    @Override
    void removePhone(String name) {
        for (PhoneNumber p:PhoneList){
            if(p.getName().equals(name)){
                PhoneList.remove(p);
                return;
            }
        }
    }

    @Override
    void updatePhone(String name, String newphone) {
        for (PhoneNumber p:PhoneList){
            if(p.getName().equals(name)){
                p.setPhone(newphone);
                return;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (PhoneNumber p:PhoneList){
            if(p.getName().equals(name)){
                System.out.println(p.getPhone());
                return;
            }
        }
    }

    @Override
    void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (PhoneNumber p:PhoneList){
            System.out.println(p.getName()+"-"+p.getPhone());
        }
    }
}