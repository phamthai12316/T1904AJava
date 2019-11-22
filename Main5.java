package jv2.labsession3;

public class Main5 {
    public static void main(String[] args) {
        SubThread s1 = new SubThread();
        Thread t1 = new Thread(s1);
        t1.start();
    }
}
