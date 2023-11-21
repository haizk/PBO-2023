# Abstract Class
Abstract class adalah kelas yang tidak dapat diinstansiasi (tidak dapat dibuat objeknya) dan biasanya berisi setidaknya satu method abstrak (Method tanpa implementasi). Method abstrak adalah Method yang hanya dideklarasikan tanpa memberikan implementasi. Abstract class dapat memiliki Method concrete (dengan implementasi) dan variabel anggota (fields).

## Contoh Code
```java
abstract class Animal {
    // abstract method
    public abstract void sound();

    // concrete method
    public void weight() {
        System.out.println("Unknown Weight");
    }
}
```
# Interface
Interface menyediakan cara untuk mendefinisikan kontrak atau spesifikasi tanpa memberikan implementasi konkret. Kelas yang mengimplementasikan sebuah interface diharuskan memberikan implementasi untuk semua metode yang dideklarasikan dalam interface tersebut.

Beberapa poin penting tentang interface:

1. Metode Abstrak: Interface hanya dapat memiliki metode abstrak (tanpa implementasi) dan konstanta (variabel yang secara otomatis bersifat `public`, `static`, dan `final`).

2. Tidak Dapat Diinstansiasi: Seperti halnya abstract class, Anda tidak dapat membuat objek langsung dari sebuah interface.

3. Implementasi oleh Kelas: Interface digunakan oleh kelas untuk menyediakan implementasi metode-metodenya. Sebuah kelas dapat mengimplementasikan banyak interface.

4. Menggalang Polimorfisme: Interface memungkinkan penggunaan polimorfisme, di mana objek dapat dianggap sebagai objek dari interface yang diimplementasinya.

## Contoh Code
```java
interface Shape {
    void draw(){
        System.out.println("Drawing a shape");
    } // abstract method

    double calculateArea(); // abstract method
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Trapesium implements Shape {
    private double alasAtas;
    private double alasBawah;
    private double tinggi;

    public Trapesium(double alasAtas, double alasBawah, double tinggi) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a trapesium");
    }

    @Override
    public double calculateArea() {
        return 0.5 * (alasAtas + alasBawah) * tinggi;
    }
}

public class Main1 {
    public static void main(String[] args) {
        // membuat objek dari class cicle
        Shape circle = new Circle(5);

        // membuat objek dari class trapesium
        Shape trapesium = new Trapesium(2,3,5);
        
        
        System.out.println("Luas Lingkaran: " + circle.calculateArea());
        circle.draw();
        System.out.println("Luas Trapesium: " + trapesium.calculateArea());
        trapesium.draw();
    }
}
```
# Perbedaan ABstract Class dan Interface
1. **Abstract Class**:
    - Didefinisikan sebagai kelas yang dinyatakan dengan kata kunci “abstract”.
    - Ini adalah kumpulan karakteristik subkelas umum yang harus mencakup setidaknya satu metode abstract.
    - Kelas abstract dapat memiliki beberapa metode concrete.
    - Kelas abstract tidak dapat diinisiasi, yang berarti kita tidak dapat membuat objek dengannya.
    - Programmer menggunakan abstract class Java ketika mereka membutuhkan fungsionalitas default untuk subkelas, template untuk kelas tertentu di masa mendatang, menentukan interface umum untuk subkelas apa pun, dan reusabilitas kode1.

2. **Interface**:
    - Interface adalah blue print yang digunakan untuk mengimplementasikan kelas.
    - Ini adalah kumpulan metode abstract dan tidak mengandung metode concrete, tidak seperti kelas abstract.
    - Interface menawarkan abstraksi penuh di Java, sesuatu yang tidak dapat dilakukan kelas abstract.
    - Interface tidak dapat diinisiasi, meskipun kelas abstract yang mengimplementasikan interface dapat melakukannya.
    - Programmer menggunakan interface saat mereka membutuhkan untuk mencapai abstraksi, untuk mendukung resolusi yang dinamis saat proses run time, mencapai loose coupling, dan memisahkan definisi metode dari hierarki inheritance1.

Harap dicatat bahwa suatu abstract class hanya bisa meng-extend satu abstract class lainnya, sedangkan suatu interface bisa meng-extend satu atau lebih interface lainnya. Abstract class hanya bisa meng-extend satu abstract class dan meng-implement beberapa interface. Suatu interface hanya bisa meng-extend interface lainnya dan tidak bisa meng-implement class atau interface
### Bacaan
1. [Baeldung - Java Abstract Class](https://www.baeldung.com/java-abstract-class)
2. [Petani Kode - Java OOP Abstract](https://www.petanikode.com/java-oop-abstract/)
3. [Petani Kode - Java OOP Interface](https://www.petanikode.com/java-oop-interface/)