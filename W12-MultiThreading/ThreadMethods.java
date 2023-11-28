class ThreadExample extends Thread {
    @Override
    public void run() {
        // Implementasi tindakan yang akan dijalankan oleh thread
        System.out.println("MyThread is running");
    }
}

class AnotherThread extends Thread {
    @Override
    public void run() {
        // Implementasi tindakan yang akan dijalankan oleh thread lain
        System.out.println("AnotherThread is running");
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        // start()
        Thread threadExample = new ThreadExample();
        threadExample.start();

        // sleep(long milliseconds)
        try {
            Thread.sleep(1000); // Thread tidur selama 1 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // join()
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        try {
            anotherThread.join(); // Menunggu sampai thread selesai
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // isAlive()
        if (threadExample.isAlive()) {
            System.out.println("MyThread masih berjalan.");
        } else {
            System.out.println("MyThread telah selesai.");
        }

        // setName(String name) dan getName()
        threadExample.setName("MyThread");
        String threadName = threadExample.getName();
        System.out.println("Thread name: " + threadName);

        // interrupt()
        threadExample.interrupt();

        // currentThread()
        Thread.yield();
    }
}
