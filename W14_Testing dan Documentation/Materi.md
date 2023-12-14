# TESTING AND DOCUMENTATION

## Testing

### Pengertian
Unit Testing adalah metode untuk menguji source code agar sesuai untuk digunakan dalam produksi. Biasanya unit testing dibuat unutk berbagai kasus pengujian untuk memverifikasi perilaku masing-masing unit source code. 
Unit testing adalah langkah penting dalam desain dan implementasi perangkat lunak. Hal ini tidak hanya meningkatkan efisiensi dan efektivitas kode, tetapi juga membuat kode menjadi lebih kuat dan mengurangi kemunduran 
dalam pengembangan dan pemeliharaan di masa mendatang.

### Cara Membuat Unit Testing
1. Membuat Java Project

   Buatlah sebuah project Java di IDE anda dengan menggunakan build system Maven.

3. Menambahkan Dependency `JUnit`
   Pada file `pom.xml` lakukan add dependency dengan cara klik `alt + ins` untuk windows lalu tambahkan `JUnit`.
   Lalu di bagian file pom.xml nya akan terbentuk seperti berikut.
   ```java
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.2</version>
        </dependency>>
    ```

3. Membuat Class Baru yang Akan Diberikan Unit Test

   Buatlah sebuah kelas baru. Pada contoh ini dibuat class `Circle` yang didalamnya terdapat method `calculateArea` untuk menghitung luasnya.
   ```java
   public class Circle {

      public static double calculateArea(double radius) {
          return Math.PI * radius * radius;
      }
    }
   ```
   
4. Membuat Unit Test untuk Class Sebelumnya

   Selanjutnya buat Unit Test untuk `Circle` class untuk memastikan method `calculateArea` bekerja sesuai dengan yang diharapkan. Caranya dengan membuat class didalam src/main/test directory.
   Pada contoh ini dibuat class `CircleTest` yang berisikan method `givenRadius_whenCalculateArea_thenReturnArea()` kemudian membandingkan antara actual area hasil dari perhitungan di class     Circle dan juga expexted area hasil perhitungan sebagai testingnya.
   ```java
   import org.junit.Assert;
   import org.junit.jupiter.api.Test;

   public class CircleTest {

    @Test
    public void givenRadius_whenCalculateArea_thenReturnArea() {
        double actualArea = Circle.calculateArea(2.0);
        double expectedArea = 3.141592653589793 * 2.0 * 2.0;
        double delta = 0.001;
        Assert.assertEquals(expectedArea, actualArea, delta);
      }
    }
   ```
   Dalam kasus ini menggunakan annotation `@Test` dari JUnit yang menandakan method `givenRadius_whenCalculateArea_thenReturnArea()` akan dieksekusi sebagai test case selama proses testing.

5. Run Pengujian pada unnit test yang telah dibuat tersebut.



## Documentation

### Pengertian Javadoc
Dokumentasi API yang baik adalah salah satu dari banyak faktor yang berkontribusi terhadap kesuksesan proyek perangkat lunak secara keseluruhan.
Untungnya, semua versi modern JDK menyediakan alat Javadoc untuk membuat dokumentasi API dari komentar yang ada di source code.

### Javadoc Comment
Struktur komentar Javadoc terlihat sangat mirip dengan komentar multi-baris biasa, tetapi perbedaan utamanya adalah tanda bintang tambahan di bagian awal.

Perhatikan susunannya sebagai berikut :
```java
// This is a single line comment

/*
 * This is a regular multi-line comment
 */

/**
 * This is a Javadoc
 */
```
### Javadoc pada level Class
```java
/**
 * Kelas ini merepresentasikan contoh penggunaan JavaDoc.
 *
 * <p>JavaDoc memungkinkan kita memberikan dokumentasi yang kaya untuk kode Java.
 *
 * @author Nama Pengembang
 * @version 1.0
 */
public class ContohJavadoc {
  // fields and methods
}
```
### Javadoc pada level method
```java

    /**
     * Metode ini menampilkan pesan sapaan.
     *
     * @param nama Nama orang yang disapa.
     * @return Pesan sapaan untuk ditampilkan.
     */
    public String sapa(String nama) {
        return "Halo, " + nama + "!";
    }
```
### Javadoc pada level Field
```java
/**
 * The public name of a hero that is common knowledge
 */
private String heroName;
```

## Membuat Dokumentasi JavaDoc
Untuk menghasilkan dokumentasi JavaDoc, Anda dapat menggunakan alat bawaan yang disertakan dengan JDK, yaitu javadoc. Berikut adalah langkah-langkah umum untuk menghasilkan dokumentasi JavaDoc:
1. Pastikan sudah menyusun kode dengan menerapkan komentar JavaDoc
   
   Pastikan Anda telah menambahkan komentar JavaDoc yang sesuai di kelas, metode, dan variabel yang ingin Anda dokumentasikan.
   Gunakan tag-tag seperti @param, @return, dan @throws untuk memberikan informasi tambahan.

   Contoh :
   ```java
   /**
   * Ini adalah deskripsi singkat metode.
   *
   * @param parameter1 Deskripsi parameter pertama.
   * @param parameter2 Deskripsi parameter kedua.
   * @return Deskripsi nilai kembalian.
   * @throws JenisPengecualian Deskripsi pengecualian yang mungkin dilempar.
   */
   
    public int contohMetode(int parameter1, String parameter2) throws JenisPengecualian {
      // Kode metode
    }
   ```

3. Menjalankan perintah 'javadoc' di terminal atau command prompt
   
   Buka terminal atau command prompt, dan gunakan perintah javadoc untuk menyusun dokumen. Pindah ke direktori yang berisi file Java Anda dan jalankan perintah berikut:
   ```java
   javadoc NamaKelas.java
   ```
   Selain itu kita juga bisa menggunakan perintah berikut untuk menyusun dokumentasi semua file Java dalam directori tertentu :
   ```java
   javadoc -d docs *.java
   ```
5. Melihat Hasil Dokumentasi
   
   Setelah proses penyusunan selesai, direktori baru bernama `docs` akan dibuat (atau folder dengan nama yang Anda tentukan).
   Di dalamnya, Anda akan menemukan file HTML dan direktori yang berisi dokumentasi terstruktur.
7. Membuka Dokumentasi
   
   Didalam folder baru yang bernama `docs` tadi akan terdapat file bernama `index.html` buka file tersebut di browser anda dan kita dapat melihat dokumentasi JavaDoc kita.


### Macam-macam tag yang bisa digunakan di JavaDoc
Berikut beberapa tag yang dapat digunakan ketika melakukan dokumentasi menggunakan JavaDoc:

tag         | Deskripsi 
---------------------------- | ------ 
@author | Digunakan untuk menyatakan penulis dari kelas atau metode.
@code atau {@code} |  Digunakan untuk menyisipkan kode dalam teks dokumentasi.
@link atau {@link} | Digunakan untuk menyisipkan tautan ke elemen lain dalam dokumentasi.
@param | menyediakan deskripsi yang berguna tentang parameter atau masukan yang diharapkan dari sebuah metode
@return | memberikan deskripsi tentang apa yang akan atau dapat dikembalikan oleh sebuah metode
@see | akan menghasilkan tautan yang mirip dengan tag {@link}, tetapi lebih dalam konteks referensi dan tidak sebaris
@since | menentukan versi kelas, bidang, atau metode yang ditambahkan ke proyek
@version | menentukan versi perangkat lunak, biasanya digunakan dengan makro %I% dan %G%.
@throws | digunakan untuk menjelaskan lebih lanjut kasus-kasus yang akan menimbulkan pengecualian pada perangkat lunak
@deprecated | memberikan penjelasan mengapa kode tidak digunakan lagi, kapan kode tersebut tidak digunakan lagi, dan apa saja alternatifnya


   
