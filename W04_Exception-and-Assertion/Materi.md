# Exception
Arti Kamus: `Exception` adalah kondisi abnormal.

Dalam bahasa Java, `exception` adalah kejadian yang tidak diinginkan atau tidak terduga, yang terjadi selama eksekusi suatu program, yaitu pada saat runtime, yang mengganggu keberjalanan program. `Exception` dapat ditangkap dan ditangani oleh program. Ketika `exception` terjadi dalam suatu method, maka akan menciptakan sebuah objek. Objek ini disebut objek `exception`. Objek ini berisi informasi tentang `exception`, seperti nama dan deskripsi `exception` serta status program saat `exception` terjadi.

Perbedaannya dengan `error` adalah `error` mewakili kondisi yang tidak dapat dipulihkan seperti Java Virtual Machine (JVM) kehabisan memori, kebocoran memori, kesalahan stack overflow, ketidakcocokan library, rekursi tak terbatas, dll. `Error` biasanya di luar kendali programmer.

## Exception Handling
`Exception handling` adalah mekanisme untuk menangani hal-hal unexpected/unwanted saat runtime seperti ClassNotFoundException, IOException, SQLException, RemoteException, dll.

Keuntungan utama dari `exception handling` adalah menjaga keberjalanan program. `Exception` biasanya mengganggu keberjalanan program, untuk itulah kita perlu `exception handling`. Mari kita lihat contoh berikut:

``` java
pernyataan 1;
pernyataan 2;
pernyataan 3;
pernyataan 4;
pernyataan 5; //exception terjadi
pernyataan 6;
pernyataan 7;
pernyataan 8;
pernyataan 9;
pernyataan 10;
```

Misalkan ada 10 pernyataan dalam program Java dan pengecualian terjadi pada pernyataan 5, maka sisa kode tidak akan dieksekusi, yaitu pernyataan 6 sampai 10 tidak akan dieksekusi. Namun, ketika kita melakukan `exception handling`, pernyataan lainnya akan dieksekusi.

## Keywords
Java menyediakan lima kata kunci yang digunakan untuk melakukan `exception handling`. Tabel berikut menjelaskan masing-masingnya.

Keyword                | Deskripsi 
---------------------------- | ------ 
try | Keyword `try` digunakan untuk menentukan blok di mana kita harus menempatkan kode exception. Artinya, kita tidak dapat menggunakan blok `try` sendirian. Blok `try` harus diikuti oleh blok `catch` atau `finally`.
catch | Blok `catch` digunakan untuk menangani exception. Blok ini harus mendahului blok `try`, yang berarti kita tidak dapat menggunakan blok `catch` sendirian. Blok `catch` dapat diikuti oleh blok `finally`.
finally | Blok `finally` digunakan untuk menjalankan kode yang diperlukan dalam program. Blok ini akan dieksekusi apapun yang terjadi setelah `try-catch` blok.
throw | Keyword `throw` digunakan untuk melemparkan (_throw_) exception.
throws | Keyword `throws` digunakan untuk mendeklarasikan exception. Hal ini memberi tahu bahwa mungkin terjadi exception dalam method. Keyword ini tidak melemparkan exception.

## Hirarki dan Tipe dari Exception Class
Class java.lang.Throwable adalah root class dari `exception` yang diwarisi oleh dua subclass: `Exception` dan `Error`. Hierarki dari class Exception adalah sebagai berikut (tidak semua terlampir):
![Hirarki dari Exception Class](image.png)

Java mendefinisikan beberapa jenis exception yang berhubungan dengan berbagai class libraries. Java juga memungkinkan pengguna untuk men-define exception mereka sendiri.
![Tipe dari Exception Class](image-1.png)

## Method dari Exception Class
[Methods](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html) of java.lang.Throwable class

```addSuppressed(), fillInStackTrace(), getCause(), getLocalizedMessage(), getMessage(), getStackTrace(), getSuppressed(), initCause(), printStackTrace(), printStackTrace(), printStackTrace(), setStackTrace(), dan toString().```

[Methods](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html) of java.lang.Object class

```clone(), equals(), finalize(), getClass(), hashCode(), notify(), notifyAll(), dan wait().```

## Contoh Kasus
Kasus di bawah adalah apabila kita melakukan pembagian dengan 0:
```java
public class JavaExceptionExample{  
    public static void main(String args[]){  
        try{  //kode yang mungkin ada exception
            int data=100/0;  
        } catch(ArithmeticException e){
            System.out.println(e);
        }  
        //kode lainnya yang akan dijalankan   
        System.out.println("rest of the code...");  
    }  
}
```
Output:
```
java.lang.ArithmeticException: / by zero
rest of the code...
```

# Assertion 

# Baca Lebih Lanjut
https://docs.oracle.com/javase%2Ftutorial%2F/essential/exceptions/index.html
https://www.geeksforgeeks.org/exceptions-in-java/
https://www.w3schools.com/java/java_try_catch.asp
https://www.javatpoint.com/exception-handling-in-java
https://www.javatpoint.com/exception-class-in-java
https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html
https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
https://www.javatpoint.com/custom-exception