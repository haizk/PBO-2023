# TESTING AND DOCUMENTATION

## Testing

### Pengertian
Unit Testing adalah metode untuk menguji source code agar sesuai untuk digunakan dalam produksi. Biasanya unit testing dibuat unutk berbagai kasus pengujian untuk memverifikasi perilaku masing-masing unit source code. 
Unit testing adalah langkah penting dalam desain dan implementasi perangkat lunak. Hal ini tidak hanya meningkatkan efisiensi dan efektivitas kode, tetapi juga membuat kode menjadi lebih kuat dan mengurangi kemunduran 
dalam pengembangan dan pemeliharaan di masa mendatang.


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
   
   Didalam folder baru yang bernama `docs` tadi akan terdapat file bernama `index.html` buka file tersebut di browser anda dan kita dapat melihat dokumentasi JavDoc kita.
   
