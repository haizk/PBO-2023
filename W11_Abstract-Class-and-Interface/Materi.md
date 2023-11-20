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
