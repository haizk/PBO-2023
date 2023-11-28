public class ThreadMethod implements Runnable {
    public Thread thread;
    private final String namaThread;
    private boolean suspended = false;

    // void suspend()
    // void stop()
    // void resume()
    // void wait()
    // void notify()

    public ThreadMethod(String namaThread) {
        this.namaThread = namaThread;
        System.out.printf("Thread " + namaThread + " diciptakan.");
    }

    @Override
    public void run() {
        System.out.println("Thread " + namaThread + " dijalankan.");

        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread " + namaThread + " ke-" + i);

                Thread.sleep(300);
            }

            synchronized (this) {
                while (suspended) {
                    wait();
                    // thread yang sedang dijalankan (prosesnya belum selesai) memasuki kondisi waiting,
                    // thread akan dilanjutkan apabila metode notify dipanggil
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + namaThread + " diinterupsi.");
        }

        System.out.println("Thread " + namaThread + " selesai.");
    }

    public void start() {
        System.out.println("Thread " + namaThread + " dimulai");

        if (thread == null) {
            thread = new Thread(this, namaThread);
            thread.start();
        }
    }

    public void suspend() {
        suspended = true;
    }

    synchronized void resume() {
        suspended = false;
        notify();
    }
}