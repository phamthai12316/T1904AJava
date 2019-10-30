package assignment4;

public class Product {
    private int id;
    private String productName;
    private int qty;
    private double price;

    public Product() {
    }

    public Product(int id, String productName, int qty, double price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean checkQty(){
        if(this.getQty() > 0){
            return true;
        }
        System.out.println("san pham het hang");
        return false;
    }
}