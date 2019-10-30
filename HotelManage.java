package Practical;

import java.util.Scanner;

public class HotelManage {
    public Hotel[] hotelList = new Hotel[10];
    Scanner sc = new Scanner(System.in);

    public void addHotel() {
        for (int i = 0; i < hotelList.length; i++) {
            System.out.println("Input Name " +i + ":");
            String name = sc.nextLine();
            System.out.println("Input Owner Name:");
            String ownerName = sc.nextLine();
            System.out.println("Input Location:");
            String location = sc.nextLine();

            Hotel newHotel = new Hotel(name, ownerName, location);
            hotelList[i] = newHotel;
        }
    }
    public void showHotel() {
        System.out.println("Input name to show detail");
        String name = sc.nextLine();
        for(Hotel ht:hotelList) {
            if (ht.getName().equals(name)) {
                System.out.println("Name Detail: "+ht.getName());
                System.out.println("OwnerName Detail: "+ht.getOwnerName());
                System.out.println("Location Detail: "+ht.getLocation());
            }
        }
    }
}