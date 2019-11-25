package jv2.practical;

import java.util.Scanner;


public class MainPractical {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();

        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentManager.add();
                    break;
                case "2":
                    studentManager.show();
                    break;
                case "0":
                    System.out.println("Out");
                    exit = true;
                    break;
                default:
                    System.out.println("Choose Again");
                    break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }

    public static void showMenu() {
        System.out.println("1. Add student.");
        System.out.println("2. Show student.");
        System.out.println("0. Exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}