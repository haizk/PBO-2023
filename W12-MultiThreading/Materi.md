# MultiThreading

## Konsep Dasar MultiThreading
Konsep Multithreading berkaitan erat dengan konsep multitasking. Seperti yang diketahui multitasking merupakan pelaksanaan 2 kegiatan atau lebih dalam satu waktu. 
Sebenarnya multitasking dibagi menjadi 2 yaitu `Process Based` dan `Thread Base`. 

`Process Based` adalah multitasking saat suatu program dijalankan bersamaan dengan program lain dalam
satu waktu. Contoh kasus suatu multitasking Process Based adalah bila kita sedang menulis
laporan di OpenOffice sambil mencari referensi di Internet dengan menggunakan Software Mozila
sebagai Software Browser dalam satu waktu. Hal ini kita sedang menggunakan 2 software dalam
satu waktu. 

Sedangkan `Thread Base` merupakan multitasking saat suatu program dijalankan, program itu dapat
melakukan proses – proses lain yang dilakukan bersamaan dalam suatu waktu. Contohnya adalah
bila kita sedang mencetak suatu lembar laporan yang kita lakukan di OpenOffice misalnya. Kadang
sambil menunggu cetakan selesai, kita biasa melihat-lihat cetakan selanjutnya yang akan dicetak,
dan kadang kita juga mengedit tulisan dengan merubah ukuaran huruf atau warna huruf misalnya.
Nah, inilah proses Thread Base multitasking yang terjadi dalam kegiatan tersebut.

## Pengertian MultiThread
Multithreading adalah suatu kemampuan yang memungkinkan beberapa kumpulan
instruksi atau proses dapat dijalankan secara bersamaan dalam sebuah program. Satu kumpulan
instruksi yang akan dieksekusi secara independen dinamakan `Thread`.
Multithreading memungkinkan beberapa thread berjalan secara bersamaan, membantu memaksimalkan penggunaan sumber daya dan meningkatkan kinerja. 
yang berarti jika kita membuat 2 thread untuk mengerjakan 2 pekerjaan yang berbeda, kedua thread dapat mulai berjalan bersama-sama, 
tanpa harus menunggu yang satu selesai.
Setiap kali kalian membuat program Java, paling tidak kalian telah membuat sebuah thread, yaitu main thread. 
Main thread adalah thread yang dibuat untuk mengeksekusi metode main dari program kalian, dan secara otomatis dibuat oleh compiler tanpa harus kalian buat secara manual.

## Life Cycle of a Thread
![Thread Lyfe Cycle](ThreadLyfeCycle.png)

Source : TutorialsPoint (https://www.tutorialspoint.com/java/java_multithreading.htm)


Life cycle (siklus hidup) dari sebuah thread dalam Java melibatkan serangkaian keadaan yang dimulai saat thread dibuat hingga saat thread selesai dieksekusi atau dihentikan. Berikut adalah empat keadaan utama dalam siklus hidup sebuah thread:

1. New (Baru):
   - Thread berada dalam keadaan ini setelah objek thread dibuat menggunakan operator new. Pada saat ini, thread belum diizinkan untuk dieksekusi.

2. Runnable (Dapat dijalankan):
   - Thread masuk ke keadaan ini setelah metode start() dipanggil.
   - Pada saat ini, sistem operasi dapat memilih thread ini untuk dieksekusi, namun sebenarnya belum terjadi eksekusi.
     
3. Running
   - Pada fase ini thread sedang dieksekusi.
     
4. Waiting/Blocked (Menunggu):
   - Thread masuk ke keadaan ini ketika thread sedang menunggu sesuatu, misalnya menunggu input atau respon dari sumber eksternal.
   - Pada saat ini, thread tidak dapat dieksekusi sampai kondisi tertentu terpenuhi.

5. Terminated/End (Berakhir):
   - Thread berada dalam keadaan ini ketika eksekusi thread selesai atau dihentikan.
   - Setelah thread berada dalam keadaan ini, tidak dapat dijalankan lagi.

## Mendefinisikan dan Menjalankan MultiThread
Kalian dapat mendefinisikan thread kalian dalam 2 cara yaitu yaitu dengan membuat sebuah class yang extends class `Thread` dari Java dan juga mengimplementasikan interface `Runnable`.

### Mengextend Thread Class
Pertama, definisikanlah class tersebut seperti di bawah ini.

```java
class MyThread extends Thread {
    public void run() {
        // Definisikan pekerjaan Thread kalian disini
    }
}
```

Setelah itu, kalian dapat menjalankan thread yang kalian buat lewat fungsi `main`. Kalian dapat meng-invoke metode `start` untuk menjalankan pekerjaan thread tersebut.

```java
public class Threading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}
```
Dalam contoh di atas, kita membuat thread dengan meng-extend kelas Thread atau mengimplementasikan antarmuka Runnable dan memulai eksekusinya dengan memanggil metode start(). Hal ini memungkinkan kedua thread berjalan secara bersamaan.

### Mengimplementasikan Interface Runnable

Selain mengextend class `Thread`, dapat juga dengan mengimplementasikan interface `Runnable` untuk mendefinisikan MultiThreading.

```java 
class MyRunnable implements Runnable {
    public void run() {
        // Kode yang akan dieksekusi dalam thread
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start(); // Memulai eksekusi thread1
        thread2.start(); // Memulai eksekusi thread2
    }
}

```
## Thread Priorities

Thread priority atau prioritas thread adalah nilai numerik yang menunjukkan seberapa pentingnya sebuah thread dibandingkan dengan thread lainnya dalam suatu program. Sistem operasi menggunakan nilai prioritas untuk menentukan urutan eksekusi thread ketika ada lebih dari satu thread yang bersaing untuk sumber daya CPU.

Prioritas thread Java berada dalam rentang antara `MIN_PRIORITY` (konstanta 1) dan `MAX_PRIORITY` (konstanta 10). Secara default, setiap thread diberi prioritas `NORM_PRIORITY` (konstanta 5). Semakin tinggi nilai prioritas, semakin penting thread tersebut dianggap oleh sistem operasi. Sistem operasi kemudian akan berusaha memberikan CPU lebih banyak kepada thread dengan prioritas lebih tinggi daripada yang memiliki prioritas lebih rendah. Namun terdapat 

Namun, perlu diingat bahwa implementasi prioritas thread dapat bervariasi antara sistem operasi. Beberapa sistem operasi memberikan dukungan penuh terhadap nilai prioritas, sementara yang lain mungkin memberikan tingkat kontrol yang lebih terbatas.

Dalam Java, Anda dapat mengatur prioritas thread menggunakan metode `setPriority()` dari kelas Thread. Namun, tingkat kontrol ini tergantung pada implementasi sistem operasi dan virtual machine Java yang digunakan. Umumnya, sebaiknya tidak terlalu mengandalkan prioritas thread untuk mengatur logika bisnis atau alur kerja program secara tepat, karena perilaku ini dapat bervariasi antara sistem operasi.

Contoh code :
```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Count: " + i);
            try {
                Thread.sleep(500);
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
    }
}
```

## Method yang Ada di Kelas Thread
1. start()

   Metode ini digunakan untuk memulai eksekusi thread. Itu mengakibatkan pemanggilan metode run() pada objek Thread.
   ```java
   Thread myThread = new MyThread();
   myThread.start();
   ```
2. sleep(long milliseconds)

   Metode ini memaksa thread saat ini untuk tidur selama jangka waktu tertentu (dalam milidetik).
   ```java
   try {
       Thread.sleep(1000); // Thread tidur selama 1 detik
   } catch (InterruptedException e) {
       e.printStackTrace();
   }
   ```
3. join()

   Metode ini membuat thread yang memanggilnya menunggu sampai thread yang disebutnya selesai.
   ```java
   Thread anotherThread = new AnotherThread();
   anotherThread.start();
   try {
       anotherThread.join(); // Menunggu sampai thread selesai
   } catch (InterruptedException e) {
       e.printStackTrace();
   }
   ```
4. isAlive()

   Metode ini mengembalikan true jika thread masih hidup atau false jika telah selesai.
   ```java
   if (myThread.isAlive()) {
       System.out.println("Thread masih berjalan.");
   } else {
       System.out.println("Thread telah selesai.");
   }
   ```
   
6. setName(String name) dan getName()

   Metode `setName()` digunakan untuk menetapkan nama thread, sedangkan `getName()` untuk mendapatkan nama thread.
   ```java
   myThread.setName("MyThread");
   String threadName = myThread.getName();
   ```
7. interrupt()

   Metode ini digunakan untuk menghentikan thread yang sedang tidur atau dalam keadaan terblokir.
   ```java
   myThread.interrupt();
   ```
   
8. currentThread()

   Metode yang digunakan untuk mendapatkan referensi ke thread saat ini yang sedang dieksekusi.
   ```java
   Thread.yield();
   ```

## Keuntungan MultiThreading
Keuntungan dari sistem yang menerapkan multithreading dapat kita kategorikan menjadi 4
bagian:

a) Responsif. 

Aplikasi interaktif menjadi tetap responsif meskipun sebagian dari program
sedang diblok atau melakukan operasi lain yang panjang. Umpamanya, sebuah thread dari
web browser dapat melayani permintaan pengguna sementara thread yang lain berusaha
menampilkan gambar.

b) Berbagi sumber daya. 

Beberapa thread yang melakukan proses yang sama akan berbagi
sumber daya. Keuntungannya adalah mengizinkan sebuah aplikasi untuk mempunyai
beberapa thread yang berbeda dalam lokasi memori yang sama.

c) Ekonomis. 

Pembuatan sebuah proses memerlukan pengalokasian memori dan sumber
daya. Alternatifnya adalah dengan menggunakan thread, karena thread membagi memori
dan sumber daya yang dimilikinya sehingga lebih ekonomis untuk membuat thread dan
context switching thread. Akan susah mengukur perbedaan waktu antara thread dan
switch, tetapi secara umum pembuatan dan pengaturan proses akan memakan waktu lebih
lama dibandingkan dengan thread. Pada Solaris, pembuatan proses memakan waktu 30
kali lebih lama dibandingkan pembuatan thread sedangkan proses context switch 5 kali
lebih lama dibandingkan context switching thread.

d) Utilisasi arsitektur multiprosesor. 

Keuntungan dari multithreading dapat sangat meningkat
pada arsitektur multiprosesor, dimana setiap thread dapat berjalan secara paralel di atas
procesor yang berbeda. Pada arsitektur processor tunggal, CPU menjalankan setiap thread
secara bergantian tetapi hal ini berlangsung sangat cepat sehingga menciptakan ilusi
paralel, tetapi pada kenyataanya hanya satu thread yang dijalankan CPU pada satu-satuan
waktu

# Baca Lebih Lanjut
- [Java - Multithreading - Tutorialspoint](https://www.tutorialspoint.com/java/java_multithreading.htm)
- [Multithreading in Java - GeekForGeeks](https://www.geeksforgeeks.org/multithreading-in-java/)
- [Multithreading in Java – What is Java Multithreading? - Great Learning](https://www.mygreatlearning.com/blog/multithreading-in-java/)
- [Chapter 2 Multithreading - Oracle](https://docs.oracle.com/cd/E19455-01/806-3461/6jck06gqe/)
- [Life Cycle of Thread in Java | Thread State - Scientech Easy](https://www.scientecheasy.com/2020/08/life-cycle-of-thread-in-java.html/)
