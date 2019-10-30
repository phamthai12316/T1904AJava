package assignment4;

import java.util.ArrayList;

public class Cart {
    private int id;
    private String customer;
    private double grandTotal;
    private String city;
    private ArrayList<Product> productList;

    public Cart() {
        this.productList = new ArrayList<>();
    }

    public Cart(int id, String customer, double grandTotal, String city) {
        this.id = id;
        this.customer = customer;
        this.grandTotal = grandTotal;
        this.city = city;
        this.productList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Product> getProductList(){
        return productList;
    }

    public boolean addProductToCart(Product product){
        if(product.checkQty()){
            this.productList.add(product);
            product.setQty(product.getQty()-1);
            this.setGrandTotal(this.getGrandTotal()+product.getPrice());
            return true;
        }
        return false;
    }

    public boolean removeProductFromCart(Product product){
        if(this.productList.contains(product)){
            this.productList.remove(product);
            product.setQty(product.getQty()+1);
            this.setGrandTotal(this.getGrandTotal()-product.getPrice());
            return true;
        }
        return false;
    }

    public double checkOut(){
        if(this.getCity().equals("HN") || this.getCity().equals("HCM")){
            return this.getGrandTotal()*1.01;
        }else {
            return this.getGrandTotal()*1.02;
        }
    }


}