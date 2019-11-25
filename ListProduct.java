package jv2.labsession1.assigment1;

import java.net.URL;
import java.util.PriorityQueue;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListProduct implements Initializable {
    public static ObservableList<Products> listProducts = FXCollections.observableArrayList();
    public TableView<Products> tbproduct = new TableView<>();
    public TableColumn<Products, String> tbName = new TableColumn<>();
    public TableColumn<Products, String> tbid = new TableColumn<>();
    public TableColumn<Products, Float> tbPrice = new TableColumn<>();
    public TableColumn<Products, Integer> tbQty = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tbName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tbName.setCellValueFactory(new PropertyValueFactory<>("id"));
        tbName.setCellValueFactory(new PropertyValueFactory<>("price"));
        tbName.setCellValueFactory(new PropertyValueFactory<>("qty"));


        tbproduct.setItems(listProducts);
    }

    public void addProduct (){
        try{
            Parent newProduct = FXMLLoader.load(getClass().getResource("addProduct.fxml"));
            Main9.mainStage.getScene().setRoot(newProduct);
        }catch(Exception e){

        }
    }

    public void sortProduct(){
        if(Products.sortOder.equals("ASC")){
            Products.sortOder="DESC";
        }else{
            Products.sortOder="ASC";
        }
        PriorityQueue<Products> names = new PriorityQueue<>();
        names.addAll(ListProduct.listProducts);
        ListProduct.listProducts.clear();
        while(!names.isEmpty()){
            ListProduct.listProducts.add(names.poll());
        }
        tbproduct.setItems(listProducts);
    }



}