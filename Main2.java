package assignment4;

public class Main2 {
    public static void main(String args[]){
        Product p1= new Product(1,"Tivi Sony",2,20000);
        Product p2= new Product(2,"Loa Sony",1,10000);
        Product p3= new Product(3,"Dien thoai Samsung",5,75000);

        Cart c1 = new Cart(1,"Nguyen van AN",0,"HN");
        Cart c2 = new Cart(2,"Nguyen Thi Van",0,"BN");

        c1.addProductToCart(p1);
        c1.addProductToCart(p2);

        System.out.println("Danh sach san pham Gio 1");
        for (Product p: c1.getProductList()){
            System.out.println(p.getProductName()+"--"+p.getPrice());
        }
        System.out.println("so tien gio hang 1: "+c1.checkOut());

        c2.addProductToCart(p2);
        c2.addProductToCart(p3);

        System.out.println("Danh sach san pham Gio 2");
        for (Product p: c2.getProductList()){
            System.out.println(p.getProductName()+"--"+p.getPrice());
        }
        System.out.println("so tien gio hang 2: "+c2.checkOut());
    }
}