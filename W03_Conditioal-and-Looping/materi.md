# Conditional Statement
Conditional statement atau pernyataan kondisional dalam bahasa pemrograman Java adalah jenis pernyataan yang digunakan untuk mengatur eksekusi program berdasarkan kondisi atau kriteria tertentu, terdapat beberapa jenis pernyataan kondisional yang dapat digunakan berdasarkan kondisi tertentu. Berikut adalah beberapa jenis pernyataan kondisional yang umum digunakan dalam Java

## if Statement
Pernyataan if digunakan untuk menjalankan blok kode jika kondisi yang diberikan bernilai benar (true).

Contoh:
```java
if (kondisi) {
    // Kode yang akan dijalankan jika kondisi benar
}
```
## if-else Statement
Pernyataan if-else digunakan untuk menjalankan satu blok kode jika kondisi benar (true) dan blok kode lainnya jika kondisi salah (false).

Contoh:
```java
if (kondisi) {
    // Kode yang akan dijalankan jika kondisi benar
} else {
    // Kode yang akan dijalankan jika kondisi salah
}
```
## else-if Statement
Pernyataan else-if digunakan untuk mengevaluasi beberapa kondisi secara berurutan dan menjalankan kode dari blok pertama yang sesuai dengan kondisi yang benar (true).

Contoh:
```java
if (kondisi1) {
    // Kode yang akan dijalankan jika kondisi1 benar
} else if (kondisi2) {
    // Kode yang akan dijalankan jika kondisi2 benar
} else {
    // Kode yang akan dijalankan jika semua kondisi salah
}
```
## switch Statement
Pernyataan switch digunakan untuk memilih salah satu dari beberapa blok kode yang akan dijalankan berdasarkan nilai yang sama dengan nilai yang diberikan.

Contoh:
```java
switch (nilai) {
    case nilai1:
        // Kode yang akan dijalankan jika nilai sama dengan nilai1
        break;
    case nilai2:
        // Kode yang akan dijalankan jika nilai sama dengan nilai2
        break;
    default:
        // Kode yang akan dijalankan jika tidak ada nilai yang cocok
}
```
## Ternary Operator
Operator ternary (? :) digunakan untuk menentukan nilai suatu ekspresi berdasarkan kondisi tertentu.

Contoh:
```java
int hasil = (kondisi) ? if_true : if_false;
```
##
Pernyataan kondisional di atas memungkinkan Kita untuk membuat alur program yang fleksibel berdasarkan kondisi yang diberikan. Kita dapat memilih jenis pernyataan kondisional yang sesuai dengan kebutuhan dalam pengembangan perangkat lunak Java.

# Looping Statement
Looping statement atau pernyataan perulangan dalam bahasa pemrograman Java memungkinkan Kita untuk mengulangi sejumlah pernyataan atau blok kode berulang kali berdasarkan kondisi tertentu. Ini adalah alat yang penting dalam pengembangan perangkat lunak Java karena memungkinkan Kita untuk melakukan tugas yang berulang atau mengoperasikan data dalam jumlah besar dengan efisien. Berikut adalah beberapa jenis pernyataan perulangan yang sering digunakan dalam Java

## for Loop
Perulangan for digunakan ketika Kita tahu berapa kali perulangan harus dijalankan. Ini memiliki tiga bagian utama:

- Inisialisasi: Inisialisasi variabel penghitung atau kondisi awal.
- Kondisi: Pengecekan kondisi setiap kali perulangan dieksekusi. Jika kondisi adalah benar (true), perulangan akan berlanjut; jika tidak, perulangan akan berhenti.
- Perubahan: Perubahan pada variabel penghitung setiap kali perulangan selesai dieksekusi.

Contoh: 
```java
for (int i = 0; i < 5; i++) {
    // Kode yang akan diulang 5 kali
}
```

## foreach Loop
Foreach loop dalam Java juga dikenal sebagai enhanced for loop atau for-each loop. Ini adalah cara sederhana dan praktis untuk mengulangi elemen-elemen dari berbagai jenis data seperti array, koleksi, atau objek yang mengimplementasikan antarmuka Iterable. For-each loop mempermudah penggunaan elemen-elemen ini tanpa perlu mengurus indeks atau iterasi manual.

Contoh:
```java
List<String> daftarNama = new ArrayList<>();
daftarNama.add("Alice");
daftarNama.add("Bob");
daftarNama.add("Charlie");

for (String nama : daftarNama) {
    System.out.println(nama);
}
```

## while Loop
Perulangan while digunakan ketika Kita hanya mengetahui kondisi perulangan, dan perulangan akan terus dijalankan selama kondisi tersebut benar (bernilai true). Kondisi dievaluasi sebelum perulangan dieksekusi, jadi jika kondisi awalnya salah (false), perulangan tidak akan dijalankan sama sekali.

Contoh:
```java
int angka = 0;
while (angka < 5) {
    // Kode yang akan diulang selama angka < 5
    angka++;
}
```
## do-while Loop
Perulangan do-while mirip dengan while, tetapi kode dalam blok do akan dijalankan setidaknya satu kali, bahkan jika kondisi awalnya salah (false). Setelah satu iterasi, kondisi dievaluasi, dan jika benar, perulangan akan terus berlanjut.
```java
int angka = 0;
do {
    // Kode yang akan diulang setidaknya satu kali
    angka++;
} while (angka < 5);
```
##
Looping statement memungkinkan Kita untuk mengotomatiskan tugas-tugas yang berulang, memproses data dalam jumlah besar, atau membuat algoritma yang fleksibel dalam pengembangan perangkat lunak Java. Pastikan untuk merancang kondisi perulangan dengan benar agar tidak terjebak dalam perulangan tak terbatas.

# Break and Continue
break dan continue adalah dua pernyataan kontrol yang digunakan dalam bahasa pemrograman Java untuk mengubah aliran eksekusi dalam pernyataan perulangan (looping statement) seperti for, while, dan do-while.

## Break
Pernyataan break digunakan untuk menghentikan perulangan saat ini dan keluar dari blok perulangan. Ini berguna ketika Kita ingin menghentikan perulangan sebelum mencapai kondisi akhir yang diharapkan.

Implementasi:
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Keluar dari perulangan jika i sama dengan 5
    }
    System.out.println(i);
}
```
Output
```
1
2
3
4
```
Pada contoh di atas, perulangan for dihentikan saat i sama dengan 5, sehingga pernyataan System.out.println(i); untuk i yang sama dengan 5 tidak dieksekusi.

## Continue
Pernyataan continue digunakan untuk melanjutkan ke iterasi berikutnya dalam perulangan saat ini, mengabaikan sisa pernyataan dalam iterasi saat ini. Ini berguna ketika Kita ingin mengabaikan beberapa iterasi berdasarkan kondisi tertentu.

Implementasi:
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Lewati iterasi saat i adalah bilangan genap
    }
    System.out.println(i);
}
```
Output:
```
1
3
5
7
9
```
Pada contoh di atas, perulangan for melanjutkan ke iterasi berikutnya jika i adalah bilangan genap, sehingga pernyataan System.out.println(i); hanya dieksekusi untuk bilangan ganjil.

##
Pada pertemuan kali ini kita sudah mempelajari tentang kondisional, looping serta implementasi dari menggunakan break dan continue, untuk selanjutnya kalian akan mempelajari hal yang lebih menarik, jadi tetap semangat dan timbulkan rasa ingin tahu didalam diri kalian.

## Referensi dan Bacaan Lain
1. **Kondisional dalam Java**:
[Java If Else | W3Schools](https://www.w3schools.com/java/java_conditions.asp)
[Java Ternary Operator | W3Schools](https://www.w3schools.com/java/java_conditions_shorthand.asp)
[Java Switch Case | W3Schools](https://www.w3schools.com/java/java_switch.asp)
2. **Looping dalam Java**:
[Java While Loop | W3Schools](https://www.w3schools.com/java/java_while_loop.asp)
[Java For Loop | W3Schools](https://www.w3schools.com/java/java_for_loop.asp)
[Java Foreach Loop | W3Schools](https://www.w3schools.com/java/java_foreach_loop.asp)
3. **Break dan Continue dalam Java**
[Java Break and Continue | W3Schools](https://www.w3schools.com/java/java_break.asp)
