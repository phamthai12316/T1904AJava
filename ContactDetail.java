package jv2.labsession6.labsession6;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class ContactDetail implements Initializable {

    public Text txt = new Text();
    public ListView<PhoneNumber1> listView = new ListView<>();

    private String sql_txt = "SELECT * FROM phone_number WHERE c_id = ?";

    public static ObservableList<PhoneNumber1> list = FXCollections.observableArrayList();
    public static Integer detail_id = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txt.setText(ContactList.detail.getContact_name());
        if(detail_id != ContactList.detail.getId()){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/T1904A";
                String username = "root";
                String password = "";
                Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement prstm = conn.prepareStatement(sql_txt);
                prstm.setInt(1,ContactList.detail.getId());

                ResultSet rs = prstm.executeQuery();
                list.clear();
                while (rs.next()){
                    Integer id = rs.getInt("id");
                    String tel = rs.getString("telephone");
                    String type = rs.getString("type");
                    PhoneNumber1 p = new PhoneNumber1(id,tel,type);
                    list.add(p);
                }
                detail_id = ContactList.detail.getId();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        listView.setItems(list);

    }

    public void back(){
        try {
            Parent view = FXMLLoader.load(getClass().getResource("contact.fxml"));
            Main11.mainStage.getScene().setRoot(view);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}