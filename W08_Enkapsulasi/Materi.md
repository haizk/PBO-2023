# ENKAPSULASI
Enkapsulasi, yang diambil dari bahasa Inggris "encapsulation", berasal dari kata dasar "capsule" yang dapat diartikan sebagai suatu hal yang melindungi hal lain yang ada didalamnya. Konsep enkapsulasi pada bahasa pemrograman berbasis objek merupakan sebuah konsep dimana kita sebagai programmer menyembunyikan data-data sensitif dari class yang kita buat dari pengguna.

Di Java, enkapsulasi dicapai dengan mendeklarasikan variabel instan suatu kelas sebagai private, yang berarti variabel tersebut hanya dapat diakses di dalam kelas tersebut. Untuk mengizinkan akses luar terhadap variabel instan, metode publik yang disebut getter dan setter didefinisikan, yang masing-masing digunakan untuk mengambil dan mengubah nilai variabel instan. Dengan menggunakan getter dan setter, kelas dapat menerapkan aturan validasi datanya sendiri dan memastikan bahwa status internalnya tetap konsisten.

### Mengapa Enkapsulasi Penting?
Enkapsulasi pada bahasa pemrograman berorientasi objek penting karena beberapa hal.

-   Dapat mengontrol atribut dan metode kelas dengan baik, tidak mudah untuk diubah dengan tidak sengaja
-   Dapat membuat sebuah atribut atau metode kelas `read-only` atau `write-only`
-   Membuat kode lebih modular, dapat mengubah sebuah bagian kode tanpa mengubah bagian lainnya

### Contoh Kelas Ter-enkapsulasi

```java
public class Person {
    private String full_name;
}
```

Pada contoh di atas, dapat dilihat bahwa kelas `Person` memiliki sebuah atribut bertipe `String` bernama `full_name` yang sifatnya `private`. Dengan access modifier private yang kita berikan, kita membuat variabel `full_name` sebuah variabel yang _encapsulated_.

Namun dengan implementasi di atas, pengguna sama sekali tidak bisa menggunakan variabel `full_name`, lalu apa guna variabel tersebut? Lihat contoh di bawah, di mana kita langsung mengakses variabel `full_name` di atas.

```java
public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.full_name);
    }
}

class Person {
    private String full_name;
}
```

```
<< Output >>
error: full_name has private access in Person
        System.out.println(person.full_name);
                                 ^
1 error
```

Dapat dilihat bahwa Java memberikan error yang menjelaskan bahwa atribut `full_name` pada kelas `Person` memiliki akses private yang tidak bisa diakses dari luar kelas tersebut. Oleh karena itu, konsep enkapsulasi memperkenalkan metode **getter** dan **setter**.

### Getter dan Setter

Getter dan setter merupakan dua buah metode konsep yang memberikan akses terbatas untuk mengakses dan memodifikasi atribut kelas yang aksesnya private. Sesuai dengan namanya, metode getter merupakan metode untuk mengakses sebuah atribut private, sedangkan setter untuk memodifikasinya.

Perhatikan sebuah contoh kelas ter-enkapsulasi di bawah ini.

```java
public class Person {
    private String full_name;

    public String getname() {
        return full_name;
    }
    public void setname(String full_name) {
        this.full_name = full_name;
    }
}
```

Dengan konsep di atas, kita bisa mengakses metode `getname()` untuk mengakses variabel `full_name` yang bersifat private dan `setname()` untuk mengubah nilai dari variabel `full_name`
