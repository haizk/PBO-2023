# Polimorfisme  
Kata "polimorfisme" berasal dari bahasa Yunani, di mana "poly" berarti banyak, dan "morphe" berarti bentuk. Jadi, secara harfiah, "polimorfisme" berarti memiliki banyak bentuk. Dalam konteks pemrograman, konsep polimorfisme mengacu pada kemampuan suatu objek untuk memiliki banyak tampilan atau perilaku, sesuai dengan konteks atau jenisnya. Polimorfisme menjadi konsep penting dalam pemrograman berorientasi objek yang memungkinkan objek dari kelas yang berbeda untuk diakses dan digunakan melalui antarmuka yang sama. Sederhananya, ini berarti kita dapat menggunakan suatu antarmuka atau kelas dasar untuk mengakses objek-objek yang mungkin memiliki implementasi yang berbeda. Dalam Java, polimorfisme dapat diimplementasikan pada tingkat kompilasi (compile time) dan pada tingkat runtime (runtime), memberikan fleksibilitas dan kemampuan untuk menangani berbagai tipe objek.

## Compile Time Polymorphism  
Compile time polymorphism terjadi pada saat kompilasi program. Hal ini mencakup dua konsep utama: method overloading dan operator polymorphism. Saat program dikompilasi, kompiler menentukan metode atau operator mana yang harus dipanggil berdasarkan jumlah dan tipe parameter atau tipe operand yang digunakan.

### Method Overloading  
Method overloading adalah bentuk polimorfisme pada tingkat kompilasi yang memungkinkan penggunaan beberapa metode dengan nama yang sama dalam satu kelas, tetapi dengan parameter yang berbeda.

Contoh kode:
```java
class Calculator {
    // Method untuk menambahkan dua angka integer
    public int add(int a, int b) {
        return a + b;
    }

    // Method untuk menambahkan dua angka desimal
    public double add(double a, double b) {
        return a + b;
    }

    // Method untuk menggabungkan dua string
    public String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Memanggil method overloading
        int sumInt = calculator.add(5, 10);
        double sumDouble = calculator.add(5.5, 10.5);
        String concatStr = calculator.add("Hello", "World");
    }
}
```

Penjelasan:
- Kelas Calculator memiliki tiga metode add dengan nama yang sama tetapi berbeda dalam parameter.
- Saat objek calculator dibuat, kita dapat memanggil metode add dengan parameter yang sesuai.

### Operator Polymorphism  
Meskipun Java tidak mendukung operator overloading secara langsung, beberapa operator dapat digunakan secara berbeda tergantung pada tipe data, menciptakan operator polymorphism.

Contoh kode:
```java
public class OperatorOverloading {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        String str1 = "Hello";
        String str2 = "World";

        int sumInt = num1 + num2;          // Operator + untuk penjumlahan int
        String concatStr = str1 + str2;    // Operator + untuk penggabungan String
    }
}
```
Penjelasan:  
Operator `+` memiliki perilaku yang berbeda tergantung pada tipe data yang digunakan. Jika tipe datanya adalah String, operator `+` berguna untuk menggabungkan String. Apabila tipe datanya int, operator `+` berguna untuk menjumlahkan nilai bilangan bulat.

## Runtime Polymorphism  
Runtime polymorphism terjadi saat program sedang dijalankan (runtime). Runtime adalah saat program sedang berjalan atau dieksekusi. Ini adalah fase ketika instruksi program dijalankan oleh komputer dan data dimanipulasi secara aktif. Runtime polymorphism melibatkan konsep method overriding, di mana metode dalam kelas turunan memberikan implementasi yang berbeda untuk metode yang sudah dideklarasikan di kelas induk. Pemilihan metode yang benar terjadi pada saat runtime, tergantung pada objek aktual yang diakses. Runtime polymorphism juga disebut dengan Dynamic Method Dispatch (DMD).
Satu-satunya jenis method yang bisa menggunakan runtime polymorphism hanyalah virtual method.

### Virtual Method  
Pada Java, semua metode dianggap virtual secara default, yang berarti mereka dapat di-override oleh kelas turunan. Dalam konteks runtime polymorphism, virtual method memungkinkan pemanggilan metode yang sesuai dengan objek sebenarnya yang sedang diakses pada saat runtime.
Jenis polimorfisme ini disebut dengan Metode Overriding. Hal ini terjadi ketika subclass memberikan implementasi yang berbeda untuk metode yang sudah dideklarasikan di superclass. Method dasar tersebut dikatakan telah di-override.  

Contoh kode:
```java
class Animal {
    // Virtual method
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Wolf extends Animal {
    // Override virtual method
    @Override
    void makeSound() {
        System.out.println("Wolf roars");
    }
}

class Cat extends Animal {
    // Override virtual method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myWolf = new Wolf();
        Animal myCat = new Cat();

        // Virtual method calls
        myWolf.makeSound();  // Output: Wolf roars
        myCat.makeSound();  // Output: Cat meows
    }
}
```  
Penjelasan:
Dalam contoh ini, metode makeSound pada kelas Animal dianggap sebagai virtual karena dapat di-override oleh kelas turunan. Saat objek dibuat menggunakan tipe data superclass (Animal), tetapi diinisialisasi dengan objek dari kelas turunan (Wolf dan Cat), metode yang dipanggil selama runtime adalah versi yang di-override oleh kelas turunan tersebut. Ini menunjukkan bagaimana virtual method mendukung runtime polymorphism dalam Java.  

Mungkin kalian ingin tahu apa bedanya dengan method non-virtual?

#### Perbedaan antara Method Virtual dan Non-Virtual
| Kriteria               | Method Virtual                     | Method Non-Virtual                 |
|------------------------|------------------------------------|------------------------------------|
| **Default pada Java**  | Semua metode dianggap virtual secara default di Java. | Beberapa bahasa menggunakan kata kunci khusus (seperti `final` pada Java) untuk menandai metode sebagai non-virtual. |
| **Pemanggilan Dinamis** | Saat metode virtual dipanggil, pemilihan terjadi pada saat runtime, berdasarkan jenis objek aktual. | Saat metode non-virtual dipanggil, pemilihan terjadi pada saat kompilasi, bukan pada saat runtime. |
| **Polymorphism**       | Mendukung runtime polymorphism, di mana metode yang benar dipilih berdasarkan objek aktual yang diakses pada saat runtime. | Tidak mendukung tingkat fleksibilitas yang sama seperti metode virtual dalam mencapai polymorphism pada tingkat runtime. |

Contoh Penggunaan pada Java:

Method Virtual (Default):

```java
class Animal {
    // Virtual method (bisa di-*override*)
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Override virtual method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```  
Method Non-Virtual (Ditandai dengan final):

```java
class Animal {
    // Non-virtual method
    final void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Compiler error: Cannot override the final method from Animal
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```  

## Perbedaan antara Compile Time dan Runtime Polymorphism
| Kriteria                              | Compile Time Polymorphism               | Runtime Polymorphism                    |
|---------------------------------------|----------------------------------------|----------------------------------------|
| **Waktu Terjadinya**                   | Terjadi pada saat kompilasi.          | Terjadi pada saat runtime saat program dijalankan.|
| **Pemilihan Metode**                   | Terjadi berdasarkan tipe dan jumlah parameter pada saat kompilasi. | Terjadi pada saat runtime, berdasarkan objek aktual yang diakses. |
| **Konsep Utama**                       | Method overloading dan operator polymorphism. | Method overriding. |
| **Keuntungan Utama**                   | Peningkatan keterbacaan dan pemeliharaan kode. | Fleksibilitas dan kemampuan untuk menangani objek dari kelas turunan dengan cara yang dinamis. |
