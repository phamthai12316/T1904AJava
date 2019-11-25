package jv2.labsession1.assigment1;

public class Products implements Comparable<Products> {
    public String name;
    public String id;
    public Float price;
    public int qty;

    public static String sortBy = "name";
    public static String sortOder = "ASC";

    public Products() {
    }

    public Products(String name, String id, Float price, int qty) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public int compareTo(Products o) {
        if(Products.sortBy.equals("name")){
            if(Products.sortOder.equals("ASC")){
                return this.getName().compareTo(o.getName());
            }else{
                return -this.getName().compareTo(o.getName());
            }
        }else{
            if(Products.sortOder.equals("ASC")){
                return this.getPrice().compareTo(o.getPrice());
            }else{
                return -this.getPrice().compareTo(o.getPrice());
            }
        }
    }



}