# Tugas Week 12 - MultiThreading

Anda diminta untuk membuat sebuah program sederhana yang menghitung jumlah bilangan prima dalam rentang tertentu. Implementasikan program tersebut dengan dua pendekatan: menggunakan single-thread dan menggunakan multithreading.

## Spesifikasi Program:

### Program Single-thread:
- Buat sebuah fungsi untuk menghitung jumlah bilangan prima dalam suatu rentang tertentu (minimal 1 - 10000) dengan pendekatan single-thread.
- Buat program utama yang menerima input rentang bilangan dan menggunakan fungsi single-thread untuk menghitung jumlah bilangan prima dalam rentang tersebut.

### Program Multithreading:
- Buat sebuah fungsi untuk menghitung jumlah bilangan prima dalam suatu rentang sama dengan pada program single-thread dengan pendekatan multithreading. Bagi rentang tersebut menjadi 5 bagian, dan alokasikan tugas menghitung bilangan prima ke beberapa thread.
- Buat program utama yang menerima input rentang bilangan dan menggunakan fungsi multithreading untuk menghitung jumlah bilangan prima dalam rentang tersebut.

### Perbandingan:

- Hitung waktu eksekusi untuk kedua pendekatan (single-thread dan multithreading) menggunakan `System.nanoTime()`, `System.currentTimeMillis()` atau metode lainnya yang tersedia.
- Bandingkan hasil waktu eksekusi dari kedua pendekatan dan jelaskan hasilnya.

### Panduan Implementasi:
- Gunakan bahasa pemrograman Java.
- Gunakan konsep multithreading yang ada pada bahasa pemrograman Java.
- Pastikan program berjalan dengan benar dan hasilnya konsisten pada setiap eksekusi.
  
### Format Pengumpulan:
- Kirimkan kode program, komentar yang menjelaskan setiap bagian pada code sangat dihargai.
- Jelaskan hasil perbandingan dan temuan dari implementasi multithreading diakhir code dengan menggunakan comment section.
- Format penulisan nama file adalah **PPBO_12_NIM**, dengan isi file sebagai berikut:

```java
// Nama : ...
// NIM  : ...

public class PPBO_12_NIM {
    public static void main(String[] args) {
        // ...
    }
}

// class ...   
