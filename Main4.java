package labsession6;

import java.util.Scanner;

public class Main4 {
    public static void main(String args[]){
        News ns = new News();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID:");
        int id = sc.hasNextInt()?sc.nextInt():0;
        ns.setId(id);

        sc.nextLine();
        System.out.println("Nhap title:");
        ns.setTitle(sc.nextLine());
        System.out.println("Nhap publishDate:");
        ns.setPublishDate(sc.nextLine());
        System.out.println("Nhap author:");
        ns.setAuthor(sc.nextLine());
        System.out.println("Nhap content");
        ns.setContent(sc.nextLine());

        System.out.println("Nhap 3 so rateList");
        for (int i=0;i<3;i++){
            ns.rateList[i] = sc.hasNextInt()?sc.nextInt():0;
        }

        ns.Display();
        ns.Calculate();
        ns.Display();
    }
}