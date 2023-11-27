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

## Cycle 
