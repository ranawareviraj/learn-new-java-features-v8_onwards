package multiThreading;



public class CustomThread extends Thread {
    public void run() {
        try {
            sleep(1000);
            System.out.println("Thread is running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        customThread.start();

        System.out.println("Main thread is running");

        CustomThread customThread2 = new CustomThread();
        customThread2.start();

        System.out.println("Main thread is running");
    }
}
