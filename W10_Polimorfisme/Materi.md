# Polimorfisme  
Kata "polimorfisme" berasal dari bahasa Yunani, di mana "poly" berarti banyak, dan "morphe" berarti bentuk. Jadi, secara harfiah, "polimorfisme" berarti memiliki banyak bentuk. Dalam konteks pemrograman, konsep polimorfisme mengacu pada kemampuan suatu objek untuk memiliki banyak tampilan atau perilaku, sesuai dengan konteks atau jenisnya. Polimorfisme menjadi konsep penting dalam pemrograman berorientasi objek yang memungkinkan objek dari kelas yang berbeda untuk diakses dan digunakan melalui antarmuka yang sama. Sederhananya, ini berarti kita dapat menggunakan suatu antarmuka atau kelas dasar untuk mengakses objek-objek yang mungkin memiliki implementasi yang berbeda. Dalam Java, polimorfisme dapat diimplementasikan pada tingkat kompilasi (compile time) dan pada tingkat runtime (runtime), memberikan fleksibilitas dan kemampuan untuk menangani berbagai tipe objek.

![Diagram Polimorfisme](https://github.com/haizk/PBO-2023/blob/main/W10_Polimorfisme/diagram.jpg)

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

**Penjelasan:**
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
**Penjelasan:**
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
**Penjelasan:**
Dalam contoh ini, metode makeSound pada kelas Animal dianggap sebagai virtual karena dapat di-override oleh kelas turunan. Saat objek dibuat menggunakan tipe data superclass (Animal), tetapi diinisialisasi dengan objek dari kelas turunan (Wolf dan Cat), metode yang dipanggil selama runtime adalah versi yang di-override oleh kelas turunan tersebut. Ini menunjukkan bagaimana virtual method mendukung runtime polymorphism dalam Java.  

Mungkin kalian ingin tahu apa bedanya dengan method non-virtual?

#### Perbedaan antara Method Virtual dan Non-Virtual
| Kriteria               | Method Virtual                     | Method Non-Virtual                 |
|------------------------|------------------------------------|------------------------------------|
| **Default pada Java**  | Semua metode dianggap virtual secara default di Java. | Beberapa bahasa menggunakan kata kunci khusus (seperti `final` pada Java) untuk menandai metode sebagai non-virtual. |
| **Pemanggilan Dinamis/Statis?** | Dinamis: Saat metode virtual dipanggil, pemilihan method yang akan dieksekusi terjadi pada saat runtime, berdasarkan jenis objek aktual. | Statis: Saat metode non-virtual dipanggil, pemilihan method yang akan dieksekusi terjadi pada saat kompilasi, bukan pada saat runtime. |
| **Memungkinkan Polimorfisme?**       | Mendukung runtime polimorfisme, di mana metode yang benar dipilih berdasarkan objek aktual yang diakses pada saat runtime. | Tidak mendukung tingkat fleksibilitas yang sama seperti metode virtual dalam mencapai polimorfisme pada tingkat runtime. |

Contoh Penggunaan pada Java:

**Method Virtual (Default):**

```java
class Animal {
    // Virtual method (bisa di-*override*)
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
```  
**Method Non-Virtual (Ditandai dengan final):**

```java
class Animal {
    // Non-virtual method
    final void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Wolf extends Animal {
    // Compiler error: Cannot override the final method from Animal
    void makeSound() {
        System.out.println("Wolf roars");
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

## Perbedaan Method Overloading dan Method Overriding  
| Kriteria                          | Method Overloading                              | Method Overriding                              |
|-----------------------------------|-------------------------------------------------|-------------------------------------------------|
| **Definisi**                      | Dua atau lebih metode dalam satu kelas dengan nama yang sama tetapi dengan parameter yang berbeda. | Metode dalam kelas turunan menggantikan atau memberikan implementasi kembali dari metode yang ada di kelas induk. |
| **Kelas yang Terlibat**           | Bisa terjadi dalam satu kelas.                       | Hanya bisa terjadi antara kelas induk dan kelas turunan.   |
| **Parameter**                     | Jumlah atau tipe parameter harus berbeda.      | Jumlah dan tipe parameter harus sama.           |
| **Keyword yang Digunakan**        | Tidak ada kata kunci spesifik yang digunakan.   | Sering menggunakan kata kunci `@Override` untuk menunjukkan bahwa ini adalah metode yang di-*override* (Jika tidak digunakan tidak apa-apa) |
| **Ketentuan Kompilasi**           | Kompilasi berdasarkan jumlah atau tipe parameter yang berbeda. | Kompilasi berhasil jika ada metode dengan nama, tipe, dan jumlah parameter yang sama di kelas induk. Jika tidak, akan ada error kompilasi. |
| **Hubungan Antar Metode**         | Independen satu sama lain, tanpa memperhatikan hubungan kelas. | Menciptakan hubungan antara metode di kelas induk dan kelas turunan, memungkinkan untuk polymorphism pada runtime. |
| **Pewarisan vs. Independen**      | Independen dari pewarisan.                    | Terkait dengan pewarisan; metode yang sama diwariskan dan diberikan implementasi yang berbeda di kelas turunan. |  

![Diagram Polimorfisme](https://github.com/haizk/PBO-2023/blob/main/W10_Polimorfisme/differences.jpg?raw=true)

## Keuntungan dan Kerugian Penggunaan Polimorfisme  

**Keuntungan Polimorfisme dalam Java:**
1. **Memungkinkan Kode yang Sama Dipakai Berulang:** Misalnya kita menulis kode untuk sesuatu yang berlaku untuk semua kelas (misalnya hewan), kita hanya perlu menuliskannya satu kali dan itu akan berfungsi untuk semua kelas turunannya (semua jenis hewan). 

2. **Meningkatkan Keterbacaan dan Pemeliharaan Kode:** Dengan mengurangi jumlah kode yang perlu ditulis dan dipelihara, kode menjadi lebih mudah dibaca dan efisien, sehingga mudah diperbaiki jika ada kesalahan.

3. **Mendukung Binding Dinamis:** Dukungan untuk binding dinamis memungkinkan pemanggilan metode yang tepat pada saat runtime, berdasarkan kelas  yang sebenarnya dari objek. Binding merujuk pada kaitan antara suatu nama (seperti nama metode atau variabel) dengan implementasinya. Ada dua jenis binding dalam pemrograman berorientasi objek: binding statis (atau early binding) dan binding dinamis (atau late binding).

- **Statis (Early) Binding:** Terjadi pada saat kompilasi di mana kaitan antara nama dan implementasi sudah ditentukan. Hal ini umumnya terkait dengan metode overloading dan binding terjadi sebelum program dijalankan.

- **Dinamis (Late) Binding:** Terjadi pada saat runtime di mana kaitan antara nama dan implementasinya ditentukan saat program dijalankan. Hal ini terkait dengan konsep polimorfisme dan terutama dengan metode overriding.

4. **Memungkinkan Objek Diperlakukan Sebagai Satu Tipe:** Hal ini merujuk pada kemampuan untuk menganggap objek dari berbagai kelas yang berbeda sebagai objek dari tipe yang sama, terutama dalam konteks polimorfisme.

Contoh: Jika ada kelas "Hewan" dan kelas "Mobil," dan keduanya memiliki metode "bersuara," dengan polimorfisme, kita dapat memperlakukan objek dari kedua kelas ini sebagai objek dari tipe umum "Suara." Dengan kata lain, meskipun kelas-kelas ini berbeda, kita dapat mengakses metode "bersuara" dari keduanya sebagai objek dari tipe yang sama.

```java
// Contoh menggunakan Java
class Hewan {
    void bersuara() {
        System.out.println("Bunyi hewan");
    }
}

class Mobil {
    void bersuara() {
        System.out.println("Bunyi mobil");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        Mobil sedan = new Mobil();

        // Polimorfisme - Objek diperlakukan sebagai satu tipe
        Hewan binatang1 = kucing;
        Hewan binatang2 = sedan;

        binatang1.bersuara();  // Output: Bunyi hewan
        binatang2.bersuara();  // Output: Bunyi mobil
    }
}
```

Dalam contoh ini, objek dari kelas "Hewan" dan "Mobil" diperlakukan sebagai objek dari tipe "Hewan," memungkinkan kita untuk menggunakan polimorfisme untuk mengakses metode yang sama pada kedua objek.  

**Kerugian Polimorfisme dalam Java:**
1. **Meningkatkan Kesulitan Memahami Perilaku Objek:** Polimorfisme dapat membuat lebih sulit memahami perilaku suatu objek, terutama jika kode tersebut kompleks.

2. **Potensial Masalah Kinerja:** Penggunaan polimorfisme dapat menyebabkan masalah kinerja karena perilaku polimorfik dapat memerlukan perhitungan tambahan pada saat runtime.

## Contoh Penerapan Polimorfisme

### 1. Overloading dan Overriding pada Pewarisan

#### a. Overloading pada Pewarisan:

```java
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class AdvancedMathOperation extends MathOperation {
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        AdvancedMathOperation math = new AdvancedMathOperation();
        
        System.out.println(math.add(2, 3));         // Memanggil metode add(int, int) dari superclass
        System.out.println(math.add(2.5, 3.5));     // Memanggil metode add(double, double) dari superclass
        System.out.println(math.add(2, 3, 4));      // Memanggil metode add(int, int, int) dari subclass
    }
}
```

**Penjelasan:**
- Kelas `MathOperation` memiliki dua metode `add` yang di-*overload* dengan jumlah dan tipe parameter yang berbeda.
- Kelas `AdvancedMathOperation` mewarisi dari `MathOperation` dan menambahkan metode `add` baru yang di-*overload*.

#### b. Overriding pada Pewarisan:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Wolf extends Animal {
    @Override
    void makeSound() {
        System.out.println("Wolf roars");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myPet = new Wolf();
        myPet.makeSound();  // Output: Wolf roars
    }
}
```

**Penjelasan:**
- Kelas `Wolf` *mengoverride* metode `makeSound` dari kelas induk `Animal`.
- Saat objek `myPet` dari tipe `Animal` diinisialisasi dengan objek `Wolf`, pemanggilan metode `makeSound` menghasilkan output yang sesuai dengan metode di kelas turunan (`Wolf`).

### 2. Overloading dan Overriding pada Interface

#### a. Overloading pada Interface:

```java
interface Shape {
    void draw();

    void draw(String color);
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void draw(String color) {
        System.out.println("Drawing a " + color + " circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw();               // Output: Drawing a circle
        myCircle.draw("red");          // Output: Drawing a red circle
    }
}
```

**Penjelasan:**
- *Interface* `Shape` memiliki dua metode `draw`, satu tanpa parameter dan satu dengan parameter `color`.
- Kelas `Circle` mengimplementasikan *interface* `Shape` dan memberikan implementasi untuk kedua metode `draw`.

#### b. Overriding pada Interface:

```java
interface Animal {
    void makeSound();
}

class Wolf implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Wolf roars");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myPet = new Wolf();
        myPet.makeSound();  // Output: Wolf roars
    }
}
```

**Penjelasan:**
- *Interface* `Animal` memiliki metode `makeSound`.
- Kelas `Wolf` mengimplementasikan *interface* `Animal` dan memberikan implementasi untuk metode `makeSound`.

### 3. Overloading dan Overriding pada Abstract Class

**a. Overloading pada Abstract Class:**

```java
abstract class Shape {
    abstract void draw();

    void draw(String color) {
        System.out.println("Drawing a " + color + " shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw();               // Output: Drawing a circle
        myCircle.draw("red");          // Output: Drawing a red shape
    }
}
```

**Penjelasan:**
- Kelas abstrak `Shape` memiliki metode abstrak `draw` dan metode `draw` yang di-*overload*.
- Kelas `Circle` mengextends dari `Shape` dan memberikan implementasi untuk metode `draw`.

#### b. Overriding pada Abstract Class:

```java
abstract class Animal {
    abstract void makeSound();
}

class Wolf extends Animal {
    @Override
    void makeSound() {
        System.out.println("Wolf roars");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myPet = new Wolf();
        myPet.makeSound();  // Output: Wolf roars
    }
}
```

**Penjelasan:**
- Kelas abstrak `Animal` memiliki metode abstrak `makeSound`.
- Kelas `Wolf` mengextends dari `Animal` dan memberikan implementasi untuk metode `makeSound`.

### 4. Contoh Lain

#### 1. Operator Overloading (Ad-Hoc Polymorphism)  
Ad-Hoc Polymorphism adalah teknik yang digunakan untuk mendefinisikan method yang sama dengan implementasi berbeda dan argumen berbeda.

**Operator Overloading untuk Bilangan Kompleks:**

```java
class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Operator overloading untuk penambahan
    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1, 2);
        ComplexNumber num2 = new ComplexNumber(2, 3);

        ComplexNumber sum = num1.add(num2);
        System.out.println("Hasil Penambahan: " + sum.real + " + " + sum.imaginary + "i");
    }
}
```

**Penjelasan:**
- Dalam contoh ini, kita memiliki representasi bilangan kompleks dengan bagian riil dan imajiner.
- Operator overloading digunakan untuk mengizinkan kita menambahkan dua objek bilangan kompleks dengan cara yang intuitif, seperti `num1 + num2`.

#### 2. Generics (Parametric Polymorphism)  
Parametric polymorphism, juga dikenal sebagai generic programming, adalah konsep dalam pemrograman komputer di mana suatu fungsi atau tipe data dapat bekerja dengan berbagai jenis data tanpa menggantungkan diri pada tipe data tertentu.

**Generic Box:**

```java
class Box<T> {
    private T content;

    Box(T content) {
        this.content = content;
    }

    T getContent() {
        return content;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(42);
        Box<String> strBox = new Box<>("Halo, Generik!");

        System.out.println("Isi Kotak Integer: " + intBox.getContent());
        System.out.println("Isi Kotak String: " + strBox.getContent());
    }
}
```

**Penjelasan:**
- Dalam contoh ini, kita memiliki kelas `Box` yang dapat menampung berbagai jenis tipe data, seperti kotak angka atau kotak kata.
- Generics memungkinkan kita membuat kelas yang bersifat umum tanpa harus menentukan tipe data secara spesifik.

#### 3. Metode Polimorfik (Polymorphic Algorithms)  
Polymorphic algorithms merujuk pada konsep dalam pemrograman komputer di mana suatu algoritma dapat bekerja dengan berbagai tipe data atau objek, terlepas dari tipe data atau struktur data khusus yang digunakan.  

**Metode Polimorfik untuk Penambahan:**

```java
class MathOperation {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Penambahan (int): " + MathOperation.add(2, 3));
        System.out.println("Penambahan (double): " + MathOperation.add(2.5, 3.5));
        System.out.println("Penambahan Generik: " + add(2, 3.5));
    }
}
```

**Penjelasan:**
- Dalam contoh ini, kita memiliki kelas `MathOperation` dengan metode penambahan yang berbeda untuk tipe data int dan double.
- Melalui metode polimorfik, kita dapat menambahkan angka dengan metode generik tanpa mempedulikan jenis data yang spesifik.

## Bacaan Lebih Lanjut
Untuk mendalami konsep polimorfisme dan konsep lain dalam pemrograman berorientasi objek, silakan merujuk pada sumber-sumber berikut:

### Dokumentasi Resmi:

1. **[The Java™ Tutorials](https://docs.oracle.com/javase/tutorial/):** Panduan resmi dari Oracle memberikan penjelasan rinci tentang konsep OOP, termasuk polimorfisme dalam bahasa Java.

### Sumber Online:

1. **[GeeksforGeeks - Polymorphism in Java](https://www.geeksforgeeks.org/polymorphism-in-java/):** Artikel ini memberikan penjelasan rinci tentang berbagai jenis polimorfisme dalam Java.

2. **[Tutorialspoint - Java Polymorphism](https://www.tutorialspoint.com/java/java_polymorphism.htm):** Tutorialspoint menyediakan tutorial yang mudah dimengerti tentang konsep polimorfisme dalam Java.

3. **[W3Schools - Java Polymorphism](https://www.w3schools.com/java/java_polymorphism.asp):** W3Schools memberikan tutorial singkat dan contoh untuk pemahaman cepat tentang polimorfisme.

### Forum dan Komunitas:

1. **[Stack Overflow](https://stackoverflow.com/):** Platform ini dapat membantu dengan pertanyaan spesifik dan memahami masalah atau konsep tertentu yang berkaitan dengan polimorfisme.
