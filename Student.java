package labsession5;
import java.time.LocalDate;

public class Student extends Person{
    public void ktTuoi(){
        LocalDate now = LocalDate.now();
        String[] arrS = this.getNgaysinh().split("-");
        if(now.getYear() - Integer.parseInt(arrS[2])>=18) System.out.println("Du 18");
        else System.out.println("Khong du 18");
    }
}