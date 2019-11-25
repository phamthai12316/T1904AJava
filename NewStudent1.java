package jv2.assignment2;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import java.sql.*;

public class NewStudent1 {

    public TextField txtname = new TextField();
    public TextField txtage = new TextField();
    public TextField txtmark = new TextField();

    public void SubmitStudent(){
        try{
            String fn = txtname.getText();
            Integer ag,mk;
            try {
                ag = Integer.parseInt(txtage.getText());
                mk = Integer.parseInt(txtmark.getText());
            } catch (Exception e) {
                ag = mk = 0;
            }
            Student3 s1 = new Student3(fn,ag,mk);

            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/T1904A";
                String username = "root";
                String password = "";

                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stm = conn.createStatement();


                String ins_sql = "INSERT INTO student(name,age,mark) VALUES('"+fn+"',"+ag+","+mk+");";
                stm.executeUpdate(ins_sql);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

            ListStudent1.list.add(s1);

            Parent listStudent = FXMLLoader.load(getClass().getResource("tbView1.fxml"));
            Main10.mainStage.getScene().setRoot(listStudent);
        }catch(Exception e){

        }
    }
}