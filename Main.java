package assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=2;i<n;i++){
            if(checkSNT(i)){
                System.out.println(i+" la so nguyen to");
            }
        }
        System.out.println("Tong 20 so Fibo: ");
        totalFibo();
    }

    public static boolean checkSNT(int n){
        for (int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return  true;
    }

    public static void totalFibo(){
        int S = 0;
        int x1 = 1,x2=1,x3=2;
        for (int i=4;i<=20;i++){
            x1 = x2;
            x2=x3;
            x3= x1+x2;
            S += x3;
        }
        System.out.println("S= "+S);
    }
}