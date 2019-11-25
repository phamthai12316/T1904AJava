package jv2.labsession6.labsession6;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ContactList implements Initializable {

    public ListView<Contact> listView = new ListView<>();

    public static Contact detail;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/T1904A";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM contact";
            ResultSet rs = stm.executeQuery(sql);

            ObservableList<Contact> list  = FXCollections.observableArrayList();

            while (rs.next()){
                Integer id = rs.getInt("id");
                String contact_name = rs.getString("contact_name");
                String company = rs.getString("company");
                String address = rs.getString("address");
                Contact c = new Contact(id,contact_name,company,address);
                list.add(c);
            }
            listView.setItems(list);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void viewContact(){
        detail = listView.getSelectionModel().getSelectedItem();
        try {
            Parent view = FXMLLoader.load(getClass().getResource("detail.fxml"));
            Main11.mainStage.getScene().setRoot(view);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}