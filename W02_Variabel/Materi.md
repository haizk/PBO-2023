(Terakhir diperbarui 11 September 2023 pukul 00.50 oleh Alfiki, bukan AI)

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
Dalam contoh di atas, kita memiliki variabel kelas jumlahMobil yang digunakan untuk melacak jumlah objek Mobil yang telah dibuat. Ketika objek Mobil dibuat menggunakan constructor, nilai yang ada di dalam variabel kelas ini ditambah (++). Kita dapat mengakses variabel kelas dengan menggunakan nama kelas (dalam hal ini, Mobil) diikuti oleh tkita titik. Variabel kelas ini digunakan untuk menyimpan informasi yang bersifat global untuk kelas tersebut dan dapat diakses oleh semua objek yang dibuat dari kelas tersebut.

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

Variabel parameter (parameter variables) adalah variabel yang dideklarasikan dalam tkita kurung () saat kita mendefinisikan method atau konstruktor dalam Java. Parameter ini digunakan untuk menerima input atau argumen saat method atau konstruktor dipanggil. Fungsinya sebagai saluran komunikasi antara pemanggil method dan method itu sendiri. Parameter memungkinkan kita untuk memberikan nilai atau data ke method, yang kemudian dapat digunakan di dalamnya.

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

Ketika variabel didefinisikan sebagai `final`, beberapa instansi dari nilai konstan yang sama akan dibuat untuk setiap objek yang berbeda, yang tidak diinginkan.

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

# Primitive Data Type

| Jenis Tipe Data | Deskripsi                                                        | Rentang Nilai                                    | Contoh Nilai                        |
|-----------------|------------------------------------------------------------------|--------------------------------------------------|-------------------------------------|
| boolean         | Menyimpan nilai dengan dua status: benar atau salah              | true, false                                      | true, false (tidak boleh 0 atau 1)  |
| char            | Menyimpan karakter tunggal, dikelilingi oleh tkita kutip tunggal | '\u0000' s/d '\uffff'                            | 'A', '1'                            |
| byte            | Menyimpan bilangan bulat tanpa desimal                           | -128 s/d 127                                     | 123, -55                            |
| short           | Menyimpan karakter tunggal, dikelilingi oleh tkita kutip tunggal | -32768 s/d 32767                                 | -345, 5435                          |
| int             | Menyimpan bilangan bulat tanpa desimal                           | -2147483648 s/d 2147483647                       | -49224253, 3132953                  |
| long            | Menyimpan bilangan bulat tanpa desimal                           | -9223372036854775808 s/d 9223372036854775807     | -4242313243L, 5342231435L           |
| float           | Menyimpan angka titik mengambang dengan desimal                  | 1.4E-45 s/d 3.4028235E38                         | 1.45F, 598.67F                      |
| double          | Menyimpan angka titik mengambang dengan desimal                  | 4.9E-324 s/d 1.7976931348623157E308              | 0.4556, 132435.05833                |

Mungkin kalian bertanya-tanya, mengapa String tidak termasuk di tabel ini? Dalam Java, String adalah tipe data yang unik karena sebenarnya merupakan objek. Java memungkinkan penggunaan string dengan cara yang mirip dengan tipe data primitif. Kita dapat membuat string tanpa harus secara eksplisit membuat objek String. Hal ini disebut dengan "string literal" dan memungkinkan penggunaan method-method dari kelas String dengan mudah. Sehingga, meskipun String sebenarnya adalah objek, Java memiliki cara khusus untuk memperlakukannya sebagai tipe data yang lebih mudah digunakan.

Contoh penggunaan reference data type bisa dilihat di kode berikut.
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

        // Tipe data String
        String kata = "Contoh String";

        // Menampilkan nilai dari masing-masing variabel
        System.out.println("Tipe data boolean: " + nilaiBenar + " dan " + nilaiSalah);
        System.out.println("Tipe data char: " + karakter);
        System.out.println("Tipe data byte: " + angkaByte);
        System.out.println("Tipe data short: " + angkaShort);
        System.out.println("Tipe data int: " + angkaInt);
        System.out.println("Tipe data long: " + angkaLong);
        System.out.println("Tipe data float: " + angkaFloat);
        System.out.println("Tipe data double: " + angkaDouble);
        System.out.println("Tipe data String: " + kata);
    }
}
```  

# Reference Data Type
