package jv2.session3.assigment3;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Timer { /// khi implement initazlize ! nếu cần chạy luôn khi bật stage thì impleemnt! nếu k thì k cần

    public TextField txtMin = new TextField();
    public Text min = new Text();
    public Text sec = new Text();
    public Button btn = new Button();

    public static int s_min;

    public void startTime(){
        try{
            s_min = Integer.parseInt(txtMin.getText());
        } catch (Exception e){
            s_min = 10;
        }
        btn.setDisable(true);
        Runnable r = new Runnable() { // R bien local // Tạo 1 đối tượng từ lớp ẩn danh có implement lớp Runnable! Giống như 1 class

            // Nếu ta tạo đối tượng trong lớp này thì có thể dùng biến của lớp này vd như min, sec (Tiện hơn )
            @Override
            public void run() {
                for (Integer i = s_min - 1; i>=0; i--){
                    for (Integer j = 59; j>=0; j--){
                        min.setText(String.format("%02d",i));
                        sec.setText(String.format("%02d",j));
//                        System.out.println(i+":"+j);
                    try{
                        Thread.sleep(1000);
                    } catch(Exception e){};
                    }
                }
                Platform.exit();
            }
        };
        Thread t = new Thread(r);
        t.start();
    };
}
