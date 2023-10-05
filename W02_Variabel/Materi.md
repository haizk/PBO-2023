# Variabel
Variabel digunakan untuk menyimpan dan mengelola data di dalam program. Di Java, ada berbagai jenis variabel, misalnya:

## Variabel Instance (Non-Static)
Variabel instance (non-static) dalam bahasa pemrograman Java adalah variabel yang dideklarasikan di dalam sebuah kelas dan terkait dengan objek yang dibuat dari kelas tersebut. Setiap objek yang dibuat dari kelas memiliki salinan sendiri dari variabel instance, yang berarti setiap objek memiliki nilai variabel instance yang independen. Ini memungkinkan setiap objek untuk memiliki data yang berbeda.

Contoh penulisan variabel instance dalam Java:
```java
public class Mobil {
    // Variabel instance (non-static)
    String merk;
    String warna;
    int tahunProduksi;

    // Constructor untuk kelas Mobil
    public Mobil(String merk, String warna, int tahunProduksi) {
        this.merk = merk; // 'this' mengacu pada variabel instance
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    // Metode untuk menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public static void main(String[] args) {
        // Membuat objek-objek Mobil
        Mobil mobil1 = new Mobil("Supreme", "Biru", 2035);
        Mobil mobil2 = new Mobil("Mas", "Emas", 2025);

        // Memanggil metode untuk menampilkan informasi mobil
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
    }
}
```  
Pada contoh di atas, merek, warna, dan tahunProduksi adalah variabel instance dalam kelas Mobil. Setiap objek mobil1 dan mobil2 memiliki salinan independen dari variabel ini, yang dapat diakses dan diubah oleh method dalam kelas Mobil. Hal ini memungkinkan setiap objek untuk memiliki data yang berbeda, seperti merek, warna, dan tahun produksi yang berbeda.

## Variabel Kelas (Static)
Variabel kelas (class variables) juga dikenal sebagai variabel statis (static variables). Variabel kelas adalah variabel yang terkait dengan kelas itu sendiri, bukan dengan instance (objek) dari kelas tersebut. Artinya, semua objek yang dibuat dari kelas tersebut akan berbagi nilai yang sama untuk variabel kelas tersebut. Variabel kelas dideklarasikan dengan kata kunci static.

Berikut adalah contoh penulisannya:

```java
public class Mobil {
    // Variabel kelas (static variables)
    static int jumlahMobil = 0; // Ini adalah contoh variabel kelas

    // Variabel instance (non-static variables)
    String merek;
    String model;

    // Constructor untuk kelas Mobil
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
        jumlahMobil++; // Setiap kali objek Mobil dibuat, variabel kelas "jumlahMobil" akan bertambah
    }

    // method lain dalam kelas Mobil
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
    }

    // method untuk mengakses variabel kelas
    public static void tampilkanJumlahMobil() {
        System.out.println("Jumlah Mobil: " + jumlahMobil);
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Supreme", "Ureu");
        Mobil mobil2 = new Mobil("Mas", "Elon");

        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();

        // Memanggil method untuk menampilkan jumlah mobil
        Mobil.tampilkanJumlahMobil(); // Output: Jumlah Mobil: 2
    }
}
```  
Dalam contoh di atas, kita memiliki variabel kelas jumlahMobil yang digunakan untuk melacak jumlah objek Mobil yang telah dibuat. Ketika objek Mobil dibuat menggunakan constructor, nilai yang ada di dalam variabel kelas ini ditambah (++). Kita dapat mengakses variabel kelas dengan menggunakan nama kelas (dalam hal ini, Mobil) diikuti oleh tanda titik. Variabel kelas ini digunakan untuk menyimpan informasi yang bersifat global untuk kelas tersebut dan dapat diakses oleh semua objek yang dibuat dari kelas tersebut.

## Variabel Lokal
Variabel ini dideklarasikan di dalam suatu method, blok kode, atau konstruktor, dan hanya dapat diakses di dalam ruang lingkup di mana variabel dideklarasikan. Variabel lokal memiliki batasan dalam hal waktu hidup (scope), yang berarti hanya ada dan dapat diakses saat program berada dalam konteks yang sesuai. Variabel lokal tidak memiliki nilai default dan harus diinisialisasi sebelum digunakan.

Contoh penggunaan variabel lokal bisa seperti ini:

```java
public class Mobil {
    // Variabel instance (non-static variables)
    String merek;
    String model;

    // Constructor untuk kelas Mobil
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    // method lain dalam kelas Mobil
    public void tampilkanInfo() {
        // Variabel lokal dalam method tampilkanInfo
        int tahunProduksi = 2023;

        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Supreme", "Ureu");
        Mobil mobil2 = new Mobil("Mas", "Elon");

        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
    }
}
```  
Dalam contoh di atas, tahunProduksi adalah variabel lokal yang hanya terdefinisi dalam method tampilkanInfo(). Variabel lokal ini hanya dapat diakses di dalam method tersebut dan tidak dapat diakses dari method lain atau dari luar kelas "Mobil". Variabel lokal ini digunakan untuk menyimpan nilai tahun produksi yang hanya relevan untuk method tampilkanInfo(). Variabel lokal sangat berguna untuk menyimpan data sementara atau perhitungan dalam suatu method tanpa mengotori ruang lingkup kelas secara keseluruhan.

## Variabel Parameter

Variabel parameter (parameter variables) adalah variabel yang dideklarasikan dalam tanda kurung () saat kita mendefinisikan method atau konstruktor dalam Java. Parameter ini digunakan untuk menerima input atau argumen saat method atau konstruktor dipanggil. Fungsinya sebagai saluran komunikasi antara pemanggil method dan method itu sendiri. Parameter memungkinkan kita untuk memberikan nilai atau data ke method, yang kemudian dapat digunakan di dalamnya.

Contoh penggunaan variabel parameter bisa dilakukan seperti ini:

```java
public class Mobil {
    // Variabel instance (non-static variables)
    String merek;
    String model;

    // Constructor untuk kelas Mobil dengan parameter
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    // method lain dalam kelas Mobil dengan parameter
    public void tampilkanInfo(String pemilik) {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Pemilik: " + pemilik);
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Supreme", "Ureu");
        Mobil mobil2 = new Mobil("Mas", "Elon");

        mobil1.tampilkanInfo("Fiki");
        mobil2.tampilkanInfo("Wawan");
    }
}
```
Dalam contoh di atas, method tampilkanInfo menerima satu parameter yang disebut "pemilik". Ketika method ini dipanggil, kita memberikan nilai "Fiki" saat memanggil mobil1.tampilkanInfo("Fiki") dan nilai "Wawan" saat memanggil mobil2.tampilkanInfo("Wawan"). Variabel parameter "pemilik" digunakan di dalam method tampilkanInfo untuk mencetak pemilik mobil.

Penggunaan String[] args adalah sebuah parameter yang khusus digunakan dalam method main dalam kelas Java. Ini digunakan untuk menerima argumen yang diberikan saat program dijalankan dari baris perintah (command line). Misalnya, jika kita menjalankan program Java dari baris perintah seperti ini:

```bash
javac Mobil.java
java -cp . Mobil Fiki
```
"Mobil" merupakan nama file yang mengandung method main. Baris pertama membuat file Mobil.java dikompilasi terlebih dahulu. Jika berhasil, akan muncul file baru di direktori yang sama dengan nama Mobil.class. Selanjutnya, pada baris kedua, baris perintah tersebut akan mengatur classpath untuk mencari kelas "Mobil" dalam direktori saat ini (-cp . Mobil), lalu String "Fiki" akan disimpan dalam args, dan kita dapat mengaksesnya dalam method main sebagai berikut:

```java
public static void main(String[] args) {
    String pemilik = args[0]; // Mengambil argumen pertama (Fiki)
    Mobil mobil1 = new Mobil("Mas", "Elon");
    mobil1.tampilkanInfo(pemilik);
} // Output:
  // Merek: Mas
  // Model: Elon
  // Pemilik: Fiki
```  

# Konstanta

Seperti namanya, konstanta adalah entitas dalam pemrograman yang nilainya tidak dapat diubah. Java tidak mendukung konstanta secara langsung. Namun, ada cara alternatif untuk mendefinisikan konstanta di Java dengan menggunakan modifier non-access `static` dan `final`.

## Cara mendeklarasikan konstanta di Java
Menurut konvensi penamaan Java, nama identifikasi harus dalam huruf kapital. Untuk menuliskan konstanta, kita perlu modifier non-access `static` dan `final`. Tujuan menggunakan modifier `static` adalah untuk mengelola memori. Hal ini juga memungkinkan variabel tersedia tanpa memuat instance dari kelas di mana variabel itu didefinisikan. Modifier `final` mewakili bahwa nilai variabel tidak dapat diubah. Hal ini yang membuat tipe data primitif menjadi tidak dapat diubah.

Syntax untuk mendeklarasikan konstanta adalah sebagai berikut:

```java
static final tipe_data NAMA_KONSTANTA = nilai;
```

Contohnya, `price` adalah variabel yang ingin kita jadikan konstan.

```java
static final double PRICE = 432.78;
```

Di mana `static` dan `final` adalah modifier non-access. `double` adalah tipe data dan `PRICE` adalah nama identifikasi di mana nilai 432.78 diberikan.

Dalam pernyataan di atas, modifier `static` menyebabkan variabel tersedia tanpa instance dari kelas yang mendefinisikannya, dan modifier `final` membuat variabel menjadi tetap.

## Mengapa perlu ada `static final`?
Jika kita mendeklarasikan variabel sebagai `static`, semua objek dari kelas (di mana konstanta didefinisikan) akan dapat mengakses variabel tersebut dan dapat mengubah nilainya. Untuk mengatasi masalah ini, perlu menggunakan modifier `final` dengan modifier `static`.

Ketika variabel didefinisikan sebagai `final`, beberapa instansi dari nilai konstan yang sama akan dibuat untuk setiap objek yang berbeda.

Ketika menggunakan modifier `static` dan `final` bersama-sama, variabel tetap menjadi statis dan dapat diinisialisasi sekali. Oleh karena itu, untuk mendeklarasikan variabel sebagai konstan, digunakanlah modifier `static` dan `final`. Jadi, semua objek kelas akan berbagi lokasi memori yang sama (dalam hal mengakses konstanta).

## Mengapa kita menggunakan konstanta?
Penggunaan konstanta dalam pemrograman membuat program menjadi lebih mudah dan dapat dipahami oleh orang lain. Hal ini juga bisa mempercepat kinerja karena variabel konstan dicache oleh JVM dan aplikasi.

## Poin yang perlu diingat:
- Tulis nama identifikasi dalam huruf kapital yang ingin kita deklarasikan sebagai konstan. Misalnya, `MAX = 12`.
- Jika kita menggunakan private access-specifier sebelum nama konstan, nilai konstan tidak dapat diubah dalam kelas tertentu.
- Jika kita menggunakan public access-specifier sebelum nama konstan, nilai konstan dapat diubah dalam program.

Mari kita lihat beberapa contoh cara menggunakan konstanta.

### Contoh 1: Mendeklarasikan Konstan sebagai Private
```java
import java.util.Scanner;
public class ConstantExample1 {
    //declaring constant   
    private static final double PRICE = 234.90;
    public static void main(String[] args) {
        int unit;
        double total_bill;
        System.out.print("Enter the number of units you have used: ");
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();
        total_bill = PRICE * unit;
        System.out.println("The total amount you have to deposit is: " + total_bill);
    }
}
```

### Contoh 2:
```java
public class ConstantExample2 {
    private static final double PRICE = 2999;
    public static void main(String[] args) {
        System.out.println("Old Price of Iron: " + PRICE);
        ConstantExample obj = new ConstantExample();
        obj.showPrice();
    }
}
class ConstantExample {
    private static final double PRICE = 3599;
    void showPrice() {
        System.out.print("New Price of Iron: " + PRICE);
    }
}
```

### Contoh 3: Mendeklarasikan Konstan sebagai Public
Dalam contoh berikut, kita telah mendeklarasikan konstan PI sebagai public. Dalam metode main(), kita telah memberikan nilai 3,15 pada konstan PI. Setelah itu, kita telah memanggil metode printValue(). Ketika kita menjalankan program, itu menunjukkan kesalahan tidak dapat memberikan nilai ke variabel final PI.

```java
public class ConstantExample3 {
    //declaring PI as constant   
    public static final double PI = 3.14;
    public static void main(String[] args) {
        printValue();
        //trying to assign 3.15 in the constant PI  
        PI = 3.15;
        printValue();
    }
    void printValue() {
        System.out.print("The value of PI cannot be changed to " + PI);
    }
}
```

# Access Modifier

Terdapat banyak access modifier di Java yang dimaksudkan untuk melindungi variable atau method tertentu dari sebuah class. Perlindungan ini dimaksudkan agar akses kedalam sebuah class menjadi lebih terawasi. Adapun bentuk modifier tersebut adalah:

## Daftar Akses Modifier

| No. | Modifier   | Pada class dan interface                     | Pada method dan variable                                                                         |
| --- | ---------- | -------------------------------------------- | ------------------------------------------------------------------------------------------------ |
| 1.  | Default    | Dapat diakses oleh class dalam satu package. | Dapat diakses oleh class dalam satu package dan dapat diakses oleh method dalam satu kelas.      |
| 2.  | Public     | Dapat diakses oleh class manapun             | Dapat diakses oleh class dalam package manapun dan dapat diakses oleh method dari class manapun. |
| 3.  | Protected  | Dapat class turunan                          | Dapat diakses oleh class turunannya dan method yang dalam satu package.                          |
| 4.  | Private    | Tidak dapat diakses oleh class lain.         | Hanya dapat diakses oleh class itu sendiri.                                                      |

Secara garis besar, bentuk perlindungan dalam hak akses tersebut dapat dilihat sebagai berikut:

## Perbedaan dan persamaan aksesibilitas pada Java

| Aksesibilitas                | public | private | protected | default  |
| ---------------------------- | ------ | ------- | --------- | -------- |
| Class yang sama              | ✔      | ✔      | ✔         | ✔       |
| Class manapun                | ✔      | ❌     | ✔         | ✔       |
| Class dalam satu package     | ✔      | ❌     | ❌        | ❌      |
| Sub-class dalam satu package | ✔      | ❌     | ✔         | ✔       |
| Sub-class dari package lain  | ✔      | ❌     | ✔         | ❌      |

Selain ke-empat modifier tersebut, terdapat juga non-access modifier yaitu `static`, `abstract`, `synchronized`, `native`, `volatile`, `transient`, dan sebagainya. Non-access modifier selain `static` ini tidak dibahas pada materi ini.


# Primitive Data Type

| Jenis Tipe Data | Deskripsi                                                        | Rentang Nilai                                    | Contoh Nilai                        |
|-----------------|------------------------------------------------------------------|--------------------------------------------------|-------------------------------------|
| boolean         | Menyimpan nilai dengan dua status: benar atau salah              | true, false                                      | true, false (tidak boleh 0 atau 1)  |
| char            | Menyimpan karakter tunggal, dikelilingi oleh tanda kutip tunggal | '\u0000' s/d '\uffff'                            | 'A', '1'                            |
| byte            | Menyimpan bilangan bulat tanpa desimal                           | -128 s/d 127                                     | 123, -55                            |
| short           | Menyimpan karakter tunggal, dikelilingi oleh tanda kutip tunggal | -32768 s/d 32767                                 | -345, 5435                          |
| int             | Menyimpan bilangan bulat tanpa desimal                           | -2147483648 s/d 2147483647                       | -49224253, 3132953                  |
| long            | Menyimpan bilangan bulat tanpa desimal                           | -9223372036854775808 s/d 9223372036854775807     | -4242313243L, 5342231435L           |
| float           | Menyimpan angka titik mengambang dengan desimal                  | 1.4E-45 s/d 3.4028235E38                         | 1.45F, 598.67F                      |
| double          | Menyimpan angka titik mengambang dengan desimal                  | 4.9E-324 s/d 1.7976931348623157E308              | 0.4556, 132435.05833                |

Mungkin kalian bertanya-tanya, mengapa String tidak termasuk di tabel ini? Dalam Java, String adalah tipe data yang unik karena sebenarnya merupakan objek. Java memungkinkan penggunaan string dengan cara yang mirip dengan tipe data primitif. Kita dapat membuat string tanpa harus secara eksplisit membuat objek String. Hal ini disebut dengan "string literal" dan memungkinkan penggunaan method-method dari kelas String dengan mudah. Sehingga, meskipun String sebenarnya adalah objek, Java memiliki cara khusus untuk memperlakukannya sebagai tipe data yang lebih mudah digunakan.

Contoh penggunaan primitive data type bisa dilihat di kode berikut.
```java
public class TipeDataContoh {
    public static void main(String[] args) {
        // Tipe data boolean
        boolean nilaiBenar = true;
        boolean nilaiSalah = false;

        // Tipe data char
        char karakter = 'A';

        // Tipe data byte
        byte angkaByte = 100;

        // Tipe data short
        short angkaShort = 1000;

        // Tipe data int
        int angkaInt = 100000;

        // Tipe data long
        long angkaLong = 1000000000L; // Perhatikan penambahan 'L' untuk literal long

        // Tipe data float
        float angkaFloat = 3.14f; // Perhatikan penambahan 'f' untuk literal float

        // Tipe data double
        double angkaDouble = 3.14159265359;

        // Menampilkan nilai dari masing-masing variabel
        System.out.println("Tipe data boolean: " + nilaiBenar + " dan " + nilaiSalah);
        System.out.println("Tipe data char: " + karakter);
        System.out.println("Tipe data byte: " + angkaByte);
        System.out.println("Tipe data short: " + angkaShort);
        System.out.println("Tipe data int: " + angkaInt);
        System.out.println("Tipe data long: " + angkaLong);
        System.out.println("Tipe data float: " + angkaFloat);
        System.out.println("Tipe data double: " + angkaDouble);
    }
}
```  

# Reference Data Type

## String
String adalah tipe data dalam bahasa pemrograman Java yang digunakan untuk merepresentasikan teks atau rangkaian karakter. String di Java adalah objek, bukan tipe data primitif seperti int atau float. Ini berarti bahwa kita dapat menggunakan berbagai metode dan operasi yang disediakan oleh kelas String untuk memanipulasi teks.

Berikut beberapa hal penting yang perlu diketahui tentang String di Java:

### Deklarasi dan Inisialisasi
Untuk mendeklarasikan dan menginisialisasi String, salah satunya adalah dengan langsung menetapkan nilai string ke dalamnya, misalnya:
```java
String nama = "UNS";
```  
Selain itu, kita juga dapat membuat objek String dengan menggunakan konstruktor, seperti:

```java
String alamat = new String("Jl. Ir Sutami No.36, Kentingan, Kec. Jebres, Kota Surakarta, Jawa Tengah 57126");
```

### Immutable
String di Java bersifat immutable, yang berarti setelah membuat sebuah String, kita tidak dapat mengubah nilai karakternya. Jika kita melakukan operasi yang memodifikasi String, seperti penggabungan (concatenation) atau pemotongan (substring), maka akan dibuat String baru sebagai hasilnya.

Di dalam Java, kita bisa melakukan operasi String seperti penggabungan, membagi karakter, perbandingan, konversi nilai, dan sebagainya. Ada juga konsep String "pool". Hal-hal lebih detail mengenai hal ini akan dibahas di pertemuan-pertemuan selanjutnya.

## Array
Array adalah struktur data yang digunakan untuk menyimpan kumpulan elemen dengan tipe data yang sama di dalam bahasa pemrograman Java. Array adalah objek dalam Java dan memiliki beberapa karakteristik penting:

1. **Deklarasi dan Inisialisasi Array**:  
   kita dapat mendeklarasikan dan menginisialisasi array dalam Java dengan cara berikut:

   - **Deklarasi**: Menentukan tipe data elemen array dan nama array.
   
     ```java
     TipeData[] namaArray;
     ```

   - **Inisialisasi dengan ukuran tertentu**:
   
     ```java
     TipeData[] namaArray = new TipeData[ukuran];
     ```

     Contoh:

     ```java
     int[] angka = new int[5]; // Membuat array integer dengan 5 elemen
     ```

   - **Inisialisasi dengan nilai awal**:
   
     ```java
     TipeData[] namaArray = {nilai1, nilai2, nilai3, ...};
     ```

     Contoh:

     ```java
     String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
     ```

2. **Indeks Array**:
   Indeks array dimulai dari 0, yang berarti elemen pertama memiliki indeks 0, elemen kedua memiliki indeks 1, dan seterusnya. kita dapat mengakses elemen array dengan menggunakan indeksnya.

   Contoh:

   ```java
   int[] angka = {10, 20, 30, 40, 50};
   int nilaiPertama = angka[0]; // Mengambil nilai pertama (10)
   int nilaiKedua = angka[1];   // Mengambil nilai kedua (20)
   ```

3. **Panjang Array**:
   kita dapat mengetahui panjang atau jumlah elemen dalam array dengan menggunakan properti `length`.

   Contoh:

   ```java
   int[] angka = {10, 20, 30, 40, 50};
   int panjangArray = angka.length; // Panjang array adalah 5
   ```

4. **Array Multidimensi**:
   Java juga mendukung array multidimensi, seperti array 2D (matriks) dan array 3D. Ini memungkinkan kita untuk menyimpan data dalam bentuk tabel atau kumpulan tabel.

   Contoh array 2D:

   ```java
   int[][] matriks = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
   ```

5. **Looping Melalui Array**:
   kita dapat menggunakan loop, seperti `for` atau `foreach`, untuk mengakses dan memanipulasi setiap elemen dalam array.

   Contoh:

   ```java
   int[] angka = {10, 20, 30, 40, 50};
   for (int i = 0; i < angka.length; i++) {
       System.out.println(angka[i]);
   }
   ```

6. **Array sebagai Parameter dan Hasil dari Metode**:
   kita dapat menggunakan array sebagai parameter untuk metode dan mengembalikan array dari metode. Ini memungkinkan kita untuk mengorganisasi kode kita dengan lebih baik dan menghindari pengulangan yang tidak perlu.

   Contoh:

   ```java
   public static int[] tambahDua(int[] array) {
       for (int i = 0; i < array.length; i++) {
           array[i] += 2;
       }
       return array;
   }
   ```  

## Class
Dalam pemrograman berorientasi objek, sebuah class adalah blueprint atau cetakan yang digunakan untuk membuat objek. Class mendefinisikan atribut (variabel) dan metode (fungsi) yang akan dimiliki oleh objek yang akan dibuat berdasarkan class tersebut. Dengan kata lain, class adalah abstraksi dari objek yang mendeskripsikan karakteristik dan perilaku yang dimiliki oleh objek. Penjelasan mengenai class ada pada materi pertemuan pertama.

## Objek
Objek adalah salah satu konsep paling fundamental dalam bahasa pemrograman Java. Ini adalah instance (wujud nyata) dari kelas, dan sebagian besar kode Java ditulis dalam konteks objek. Berikut adalah beberapa poin penting terkait objek di Java:

**Instance:** Ketika membuat objek dari sebuah kelas, itu artinya kita membuat instance (wujud nyata) dari kelas tersebut. Misalnya, jika kita membuat objek `mobilMerah` dari kelas `Mobil`, `mobilMerah` adalah sebuah instance dari kelas `Mobil`.

**Atribut:** Atribut adalah variabel yang menyimpan data untuk objek. Setiap objek memiliki nilai yang berbeda untuk atribut-atributnya. Misalnya, objek `mobilMerah` mungkin memiliki atribut warna dengan nilai "merah" dan atribut merek dengan nilai `"Supreme"`.

**Metode:** Metode adalah fungsi atau tindakan yang dapat dilakukan oleh objek. Metode digunakan untuk mengakses atau memanipulasi atribut objek atau untuk menjalankan operasi tertentu. Contohnya, objek `mobilMerah` dapat memiliki metode `start()` untuk memulai mesin mobil.

**Inisialisasi:** Objek biasanya diinisialisasi menggunakan konstruktor kelas. Konstruktor adalah metode khusus yang dipanggil saat objek dibuat. Ini digunakan untuk mengatur nilai awal atribut-atribut objek.

**Referensi:** Ketika kita membuat objek, sebenarnya itu membuat referensi ke objek tersebut. Referensi adalah variabel yang menunjuk ke objek di dalam memori. Ini memungkinkan kita untuk berinteraksi dengan objek melalui referensi tersebut.

Informasi lengkap mengenai Objek bisa dilihat pada materi pertemuan pertama.

## Interface dan Abstract Class
Interface adalah kontrak yang mendefinisikan metode yang harus diimplementasikan oleh kelas-kelas yang menggunakannya. Fungsinya adalah untuk menciptakan standar komunikasi antar kelas tanpa memengaruhi struktur kelas itu sendiri. Abstract class adalah kelas yang tidak dapat diinstansiasi sendiri dan berfungsi sebagai kerangka umum untuk kelas-kelas turunan. Perbedaannya, interface dapat diimplementasikan oleh banyak kelas, sementara abstract class hanya dapat diwarisi oleh satu kelas. Interface memiliki semua metode abstrak, sementara abstract class dapat memiliki metode konkret bersama dengan metode abstrak. Pemilihan tergantung pada kebutuhan desain. Penjelasan lebih lanjut mengenai hal ini akan disampaikan pada pertemuan yang akan datang.

## Collections
Collections dalam Java adalah kerangka kerja yang memberikan berbagai kelas dan antarmuka untuk mengelola data dalam bentuk koleksi. Contohnya, ArrayList adalah jenis koleksi yang digunakan untuk menyimpan sejumlah elemen dalam urutan tertentu. Kita dapat menambahkan elemen ke dalamnya, mengakses elemen berdasarkan indeks, atau menghapus elemen dari ArrayList dengan mudah. Collections framework juga menyediakan HashSet yang adalah koleksi untuk menyimpan elemen-elemen unik tanpa urutan tertentu. Misalnya, kita dapat menggunakan HashSet untuk menyimpan daftar nama pengguna unik dalam aplikasi. Dengan bantuan kerangka kerja ini, pengelolaan data dalam aplikasi Java menjadi lebih efisien dan mudah. Penjelasan lebih lanjut mengenai hal ini akan disampaikan pada pertemuan yang akan datang.

## Enum
Enum (singkatan dari "enumeration") adalah tipe data khusus di Java yang digunakan untuk mendefinisikan sebuah kumpulan nilai konstan yang terbatas. Enum digunakan untuk menyederhanakan dan memperjelas kode, khususnya saat kita memiliki sekelompok nilai yang tetap dan terbatas yang semestinya memiliki makna khusus.

Berikut ini beberapa hal yang perlu diketahui tentang Enum di Java:

Deklarasi Enum:
Kita bisa mendeklarasikan sebuah Enum dengan kata kunci enum. Berikut adalah contoh deklarasi Enum yang mendefinisikan hari-hari dalam seminggu:

```java
enum Hari {
    SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
}
```  

**Nilai Enum:**
Nilai-nilai Enum adalah konstanta yang tetap dan telah didefinisikan dalam Enum tersebut. Dalam contoh di atas, SENIN, SELASA, dll., adalah nilai-nilai Enum yang merupakan hari-hari dalam seminggu.

**Mengakses Nilai Enum:**
Untuk dapat mengakses nilai Enum, gunakan nama Enum diikuti oleh nilai yang diinginkan. Misalnya:

```java
Hari hariIni = Hari.SENIN;
```

**Comparing Enum:**
Kita dapat membandingkan Enum menggunakan operator == karena nilai-nilai Enum adalah konstanta yang unik.

```java
if (hariIni == Hari.SENIN) {
    System.out.println("Hari ini adalah Senin.");
}
```  
**Looping Enum:**
Kita bisa melakukan looping atau iterasi melalui semua nilai Enum menggunakan values().

```java
for (Hari hari : Hari.values()) {
    System.out.println(hari);
}
```

**Method di Enum:**

Kita dapat menambahkan metode dalam Enum. Contohnya:

```java
enum Hari {
    SENIN("Minggu Pertama"), SELASA("Minggu Kedua"), RABU("Minggu Ketiga");
    
    private String minggu;
    
    private Hari(String minggu) {
        this.minggu = minggu;
    }
    
    public String getMinggu() {
        return minggu;
    }
}
```  

Dengan cara ini, setiap nilai Enum memiliki nilai tambahan yang bisa diakses dengan metode getMinggu().

Enum sangat berguna dalam mengurangi kesalahan karena kita hanya dapat memilih dari satu set nilai yang telah ditentukan. Mereka berguna dalam kasus seperti konfigurasi, pengkodean status, atau saat kita memiliki himpunan nilai yang terbatas yang ingin kita wakili dengan cara yang jelas dan bermakna.

## File
Di Java, `File` digunakan untuk merepresentasikan berkas atau direktori dalam sistem berkas. Tipe data "File" memungkinkan untuk berinteraksi dengan berkas dan direktori, seperti membaca, menulis, menghapus, atau memeriksa informasi tentang mereka. kita dapat menggunakan kelas-kelas seperti `FileInputStream`, `FileOutputStream`, `FileReader`, dan `FileWriter` untuk mengakses berkas, serta metode-metode yang ada dalam kelas `File` untuk mengelola direktori.

Contoh penggunaan tipe data "File" untuk membaca sebuah berkas:

```java
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BacaBerkas {
    public static void main(String[] args) {
        try {
            File berkas = new File("contoh.txt");
            FileReader reader = new FileReader(berkas);
            int karakter;
            
            while ((karakter = reader.read()) != -1) {
                System.out.print((char) karakter);
            }
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Untuk informasi lebih lanjut tentang tipe data "File" dan cara menggunakannya, silakan merujuk ke dokumentasi resmi Java di situs web Oracle:

[Java File Class Documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html)

## Wrapper Classes
Wrapper classes adalah kelas-kelas yang ada dalam Java dan digunakan untuk mengenkapsulasi (membungkus) tipe data primitif menjadi objek. Ini memungkinkan tipe data primitif, seperti `int`, `char`, dan `boolean`, untuk berperilaku seperti objek sehingga dapat digunakan dalam konteks yang memerlukan objek, seperti koleksi (collections) atau sebagai argumen dalam pemanggilan metode yang menerima objek.

Berikut beberapa hal penting yang perlu diketahui tentang wrapper classes:

1. **Tipe Data Primitif dan Wrapper Classes**:
   - `int` memiliki wrapper class `Integer`
   - `char` memiliki wrapper class `Character`
   - `boolean` memiliki wrapper class `Boolean`
   - Dan sebagainya untuk tipe data primitif lainnya.

2. **Autoboxing dan Unboxing**:
   Java memiliki fitur otomatis untuk mengubah (autobox) tipe data primitif menjadi wrapper class ketika diperlukan dan sebaliknya (unbox) saat diperlukan. Contohnya:

   ```java
   Integer nilaiInteger = 10; // Autoboxing: int menjadi Integer
   int nilaiPrimitif = nilaiInteger; // Unboxing: Integer menjadi int
   ```

3. **Nilai Default**:
   Nilai default untuk objek wrapper class adalah `null`, sedangkan nilai default untuk tipe data primitif adalah nilai defaultnya masing-masing (misalnya, `0` untuk `int` atau `false` untuk `boolean`).

4. **Manipulasi Data dalam Wrapper Classes**:
   Kita dapat melakukan operasi matematika atau perbandingan dengan wrapper classes seperti yang kita lakukan dengan tipe data primitif. Sebagai contoh:

   ```java
   Integer a = 5;
   Integer b = 10;
   Integer hasil = a + b; // Operasi penjumlahan
   boolean sama = a.equals(b); // Memeriksa kesamaan
   ```

5. **Penggunaan dalam Koleksi**:
   Wrapper classes sering digunakan dalam koleksi Java, seperti ArrayList, karena koleksi hanya dapat menyimpan objek, bukan tipe data primitif. Jadi, jika kita ingin menyimpan sejumlah `int` dalam ArrayList, kita harus menggunakan `Integer`.

   ```java
   ArrayList<Integer> daftarAngka = new ArrayList<>();
   daftarAngka.add(5);
   daftarAngka.add(10);
   ```

Wrapper classes sangat berguna dalam banyak situasi dalam pemrograman Java ketika kita perlu menggabungkan tipe data primitif dengan objek. Mereka juga sering digunakan dalam operasi I/O, manipulasi data dalam bentuk objek, dan saat berurusan dengan berbagai kerangka kerja Java yang menggunakan objek daripada tipe data primitif.

# Bacaan Lebih Lanjut
Berikut ini adalah tautan ke pembahasan lebih lanjut mengenai materi pada bab ini:

1. **Variabel di Java**:
   - [Dokumentasi Resmi Java - Variable](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

2. **Konstanta**:
   - [Educative - Java Constant](https://www.educative.io/answers/how-to-declare-constants-in-java)

3. **Tipe Data Primitif**:
   - [Dokumentasi Resmi Java - Primitive Data Type](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

4. **Tipe Data Referensi**:
   - [Java T Point - Reference Data Type](https://www.javatpoint.com/reference-data-types-in-java)
