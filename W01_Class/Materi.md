# Class, Object, Method, Package, dan Constructor
## Daftar Isi
[Pemrograman Berbasis Objek](#pemrograman-berbasis-objek)

[Class](#class)

[Object](#object)

[Method](#method)

[Package](#package)

[Constructor](#constructor)

## Pemrograman Berbasis Objek
Java menggunakan Pemrograman Berorientasi Objek (PBO), gaya pemrograman yang ditujukan untuk membuat pemikiran tentang pemrograman lebih mendekati pemikiran tentang dunia nyata. Dalam PBO, setiap object adalah unit independen dengan identitas unique, sama seperti object dalam dunia nyata. Contohnya, sebuah apel adalah sebuah object; begitu pula dengan sebuah cangkir. Setiap object memiliki identitasnya sendiri. Mungkin ada dua cangkir yang terlihat sama, tetapi mereka tetap merupakan object yang terpisah dan unique.

Object juga memiliki karakteristik, yang digunakan untuk menggambarkannya. Sebagai contoh, sebuah mobil bisa berwarna merah atau biru, sebuah cangkir bisa penuh atau kosong, dan sebagainya. Karakteristik ini juga disebut sebagai attribute. Attribute menggambarkan keadaan terkini dari sebuah object.

Di dunia nyata, setiap object berperilaku sesuai dengan caranya sendiri. Mobil bergerak, telepon berdering, dan sebagainya. Hal yang sama berlaku untuk object: perilaku khusus untuk jenis objectnya masing-masing.

## Class
Sebuah Class menggambarkan apa yang akan menjadi object, tetapi terpisah dari object itu sendiri. Dengan kata lain, Class dapat dijelaskan sebagai cetakan, deskripsi, atau definisi untuk sebuah object. Kita dapat menggunakan Class yang sama sebagai cetakan untuk membuat banyak object. Langkah pertama adalah mendefinisikan Class, yang kemudian menjadi cetakan untuk pembuatan object.
Setiap Class memiliki nama, dan masing-masing digunakan untuk mendefinisikan attribute dan perilaku.

### Cara Membuat Class
Sebuah Class memiliki attribute dan method. Attributenya pada dasarnya adalah variable-variable dalam sebuah Class. Mari kita buat sebuah Class yang disebut "Vehicle" dengan attribute dan methodnya.

```java
public class Vehicle {
  int maxSpeed;
  int wheels;
  String color;
  double fuelCapacity;  

  void horn() {
    System.out.println("Beep!");
  }  
}
```

maxSpeed, wheels, color, dan fuelCapacity adalah attribute-attribute dari Class Vehicle kita, dan horn() adalah satu-satunya method. Kita dapat mendefinisikan sebanyak mungkin attribute dan method yang diperlukan.

## Object
Dalam bahasa Java, object adalah instansiasi (pembuatan konkret) dari sebuah class. Object ini memiliki karakteristik dan perilaku yang telah didefinisikan oleh class tersebut. Dalam bahasa Indonesia, kita dapat menjelaskan object sebagai berikut:

Sebuah object dalam Java adalah representasi konkret dari suatu class. Object ini memiliki karakteristik dan perilaku yang telah didefinisikan oleh class tersebut. Dalam dunia nyata, kita dapat menganggap object sebagai benda fisik atau entitas tertentu, seperti mobil, buku, atau manusia. Setiap object memiliki atribut yang menggambarkan karakteristiknya dan metode yang mendefinisikan perilaku atau tindakan yang dapat dilakukan oleh object tersebut.

Sebagai contoh, jika kita memiliki class Vehicle, maka object dari class tersebut dapat mewakili kendaraan nyata dengan atribut seperti warna, kecepatan, dan merek, serta metode seperti "start()" dan "end()".

### Cara Membuat Object
Selanjutnya, kita dapat membuat beberapa object dari class Vehicle kita dan menggunakan sintaks titik (dot syntax) untuk mengakses atributte-atributte dan method-method mereka. Berikut adalah contoh cara membuat beberapa object Vehicle dan mengakses atributte dan method menggunakan sintaks titik:

```java
class MyClass {
  public static void main(String[ ] args) {
    Vehicle v1 = new Vehicle();
    Vehicle v2 = new Vehicle();
    v1.color = "red";
    v2.horn();
  }
}
```

## Method
Method (metode) adalah blok kode yang terkait dengan sebuah objek atau class yang digunakan untuk melakukan tindakan atau operasi tertentu. Metode adalah bagian dari definisi class dan mendefinisikan perilaku atau fungsi-fungsi yang dapat dilakukan oleh objek dari class tersebut.

Metode digunakan untuk melakukan tugas-tugas tertentu, memanipulasi data, atau mengembalikan hasil berdasarkan logika yang telah ditentukan. Setiap metode memiliki nama, tipe data pengembalian (return type), dan parameter yang dapat menerima input atau argumen. Berikut adalah contoh penggunaan method.

### Deklarasi dan Definisi Metode
Metode dideklarasikan dalam sebuah class dengan menentukan tipe data pengembalian (return type), nama metode, dan daftar parameter jika diperlukan.

```java
public int tambahkan(int angkaPertama, int angkaKedua) {
    // Isi metode di sini
}
```

Dalam contoh tersebut, kita mendeklarasikan metode tambahkan yang mengembalikan integer dan menerima dua parameter angkaPertama dan angkaKedua bertipe integer. Setelah deklarasi, kita mendefinisikan bagaimana metode tersebut berfungsi. Logika atau instruksi yang akan dijalankan oleh metode ditempatkan dalam blok kode metode.

```java
public int tambahkan(int angkaPertama, int angkaKedua) {
    int hasilPenjumlahan = angkaPertama + angkaKedua;
    return hasilPenjumlahan;
}
```

Dalam definisi ini, metode tambahkan menghitung penjumlahan dari angkaPertama dan angkaKedua, lalu mengembalikan hasilnya.

### Method Overloading
Method overloading adalah konsep dalam pemrograman yang memungkinkan kita untuk mendefinisikan beberapa metode dengan nama yang sama dalam sebuah kelas, tetapi dengan parameter-parameter yang berbeda. Saat kita memanggil metode dengan nama tersebut, Java akan memutuskan metode mana yang akan dijalankan berdasarkan jumlah dan tipe parameter yang diberikan.

Beberapa hal yang perlu diingat tentang method overloading:
- Nama yang Sama: Metode-metode dalam method overloading harus memiliki nama yang sama.
- Parameter yang Berbeda: Setiap metode dalam overloading harus memiliki daftar parameter yang berbeda. Ini bisa berbeda dalam jumlah parameter, tipe parameter, atau keduanya.
- Tipe Parameter: Tipe parameter yang berbeda dapat mencakup perbedaan dalam urutan tipe data, jumlah tipe data, atau keduanya.
- Tidak Bergantung pada Return Type: Compiler hanya mempertimbangkan parameter saat memutuskan metode mana yang harus dijalankan. Tipe balik (return type) tidak mempengaruhi pemilihan metode.

```java
public class Kalkulator {
    // Metode untuk menjumlahkan dua bilangan bulat
    public int tambah(int a, int b) {
        return a + b;
    }

    // Metode untuk menjumlahkan tiga bilangan bulat
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode untuk menjumlahkan dua bilangan desimal
    public double tambah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("Hasil 1: " + kalkulator.tambah(5, 10)); // 15
        System.out.println("Hasil 2: " + kalkulator.tambah(5, 10, 15)); // 30
        System.out.println("Hasil 3: " + kalkulator.tambah(2.5, 3.5)); // 6.0
    }
}
```
Dalam contoh di atas, kelas Kalkulator memiliki tiga metode tambah yang merupakan contoh dari method overloading. Ketiga metode tersebut memiliki nama yang sama (tambah) tetapi berbeda dalam hal jumlah dan tipe parameter. Compiler akan memutuskan metode mana yang harus dijalankan berdasarkan parameter yang diberikan saat memanggilnya.

### Pemanggilan Metode
Setelah definisi metode, kita dapat memanggilnya dari bagian lain dalam program atau dari objek yang sesuai.

```java
Matematika objek = new Matematika();
int hasilPenjumlahan = objek.tambahkan(5, 3);
```

Dalam contoh ini, kita membuat objek dari class Matematika dan kemudian memanggil metode tambahkan pada objek tersebut dengan memberikan argumen 5 dan 3. Hasil penjumlahan akan disimpan dalam variabel hasilPenjumlahan.

Metode dapat memiliki berbagai jenis tipe data pengembalian (atau tidak memiliki pengembalian dengan tipe data void) dan parameter-parameter yang berbeda sesuai dengan kebutuhan program. Metode digunakan untuk memisahkan dan mengorganisasi kode agar lebih mudah dimengerti dan dikelola.

## Package
Package adalah sebuah mekanisme untuk mengorganisir dan mengelompokkan class-class (classes) dan antarmuka (interfaces) ke dalam hierarki yang terstruktur. Tujuannya adalah untuk membantu pengembang mengatur kode program mereka dengan lebih baik, mencegah konflik nama, dan memudahkan penggunaan class-class yang sudah ada.

### Struktur Package
Package adalah direktori dalam sistem file yang mengandung file-file Java. Nama package biasanya dimulai dengan domain terbalik (misalnya, com.example.project) untuk menghindari tabrakan nama dengan package lain.

### Import Package
Untuk menggunakan class dari package lain, kita perlu mengimpornya menggunakan keyword import. Hal ini memungkinkan kita menggunakan class-class dari package lain tanpa harus menuliskan nama lengkapnya setiap saat. Gunakan wildcard untuk mengimpor semua kelas dalam sebuah paket.
Misalnya, ```import sampel.*``` akan mengimpor semua kelas dalam paket ```sampel```.

### Contoh Penggunaan
```java
// Import class ArrayList dari package java.util
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat objek ArrayList dari package java.util
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Alice");
        daftarNama.add("Bob");
        System.out.println(daftarNama);
    }
}
```
Dalam contoh di atas, kita mengimpor kelas ArrayList dari package java.util agar dapat menggunakannya dalam kode kita.

Penggunaan package membantu menjaga kode program yang lebih besar tetap teratur dan mudah dikelola. Hal ini juga memungkinkan kita untuk membagikan kode dengan orang lain dalam bentuk yang lebih terstruktur dan modular.

## Constructor
Constructor adalah metode khusus dalam sebuah kelas yang digunakan untuk menginisialisasi objek dari kelas tersebut. Constructor memiliki beberapa karakteristik yang membedakannya dari metode biasa: memiliki nama yang sama dengan nama class, tidak memiliki return type (void), dipanggil secara otomatis saat objek dibuat.

```java
public class Karyawan {
    // Variabel-variabel anggota kelas
    String nama;
    int usia;

    // Constructor tanpa parameter
    public Karyawan() {
        nama = "Belum Diketahui";
        usia = 0;
    }

    // Constructor dengan parameter
    public Karyawan(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
    }

    public static void main(String[] args) {
        // Membuat objek Karyawan dengan constructor tanpa parameter
        Karyawan karyawan1 = new Karyawan();

        // Membuat objek Karyawan dengan constructor dengan parameter
        Karyawan karyawan2 = new Karyawan("Alice", 30);

        // Memanggil metode untuk menampilkan informasi karyawan
        karyawan1.tampilkanInfo();
        karyawan2.tampilkanInfo();
    }
}
```
Dalam contoh di atas, kita memiliki dua constructor: satu tanpa parameter dan satu dengan parameter. Kedua constructor digunakan untuk menginisialisasi objek Karyawan dengan nilai awal yang sesuai.