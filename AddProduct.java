package jv2.labsession1.assigment1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import java.util.PriorityQueue;

public class AddProduct {
    public TextField txtname = new TextField();
    public TextField txtid = new TextField();
    public TextField txtprice = new TextField();
    public TextField txtqty = new TextField();

    public void saveProduct(){
        String name = txtname.getText();
        String id = txtid.getText();
        String price = txtprice.getText();
        String qty = txtqty.getText();

        try{
            Parent listProductss = FXMLLoader.load(getClass().getResource("tbProduct.fxml"));
            Main9.mainStage.getScene().setRoot(listProductss);
        }catch(Exception e){

        }
    }
    public void addProductToList(String name, String id, Float price, int qty){
        for(Products p: ListProduct.listProducts){
            if(p.getName().equals(name)){
                p.setName(p.getName()+":"+name);
            }
            return;
        }
        ListProduct.listProducts.add(new Products(name,id,price,qty));
        this.sortName("name", "ASC");
    }

    public void sortName(String sortBy,String sortOder){
        Products.sortBy = sortBy;
        Products.sortOder = sortOder;
        PriorityQueue<Products> names = new PriorityQueue<>();
        names.addAll(ListProduct.listProducts);
        ListProduct.listProducts.clear();
        while (!names.isEmpty()){
            ListProduct.listProducts.add(names.poll());
        }
    }
}