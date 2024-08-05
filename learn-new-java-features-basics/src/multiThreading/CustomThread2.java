package multiThreading;

public class CustomThread2 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        CustomThread2 customThread = new CustomThread2();
        Thread thread = new Thread(customThread);
        thread.start();

        System.out.println("Main thread is running");

        CustomThread2 customThread2 = new CustomThread2();
        Thread thread2 = new Thread(customThread2);
        thread2.start();

        System.out.println("Main thread is running");
    }
}
