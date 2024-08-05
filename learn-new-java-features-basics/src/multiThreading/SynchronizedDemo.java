package multiThreading;

public class SynchronizedDemo {
    public static void main(String[] args) {
        SynchronizedDemo.method1();

        CustomThread customThread = new CustomThread();
        customThread.start();

        CustomThread customThread2 = new CustomThread();
        customThread2.start();
    }

    public static synchronized void method1() {
        System.out.println("Method 1");
    }
}
