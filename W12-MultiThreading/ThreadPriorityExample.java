class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Set prioritas thread
        t1.setPriority(Thread.MIN_PRIORITY); // Prioritas minimum
        t2.setPriority(Thread.NORM_PRIORITY); // Prioritas normal (default)
        t3.setPriority(Thread.MAX_PRIORITY); // Prioritas maksimum

        // Memulai thread
        t1.start();
        t2.start();
        t3.start();

        t1.interrupt();
    }
}