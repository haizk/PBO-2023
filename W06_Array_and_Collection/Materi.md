# Array

Array dalam Java adalah tipe data referensi yang berisi kelompok variabel dengan tipe yang sama dan nama yang sama. Array di Java berbeda dengan bahasa C/C++ dalam beberapa aspek penting. Berikut adalah poin-poin penting tentang array di Java:

## Sifat-sifat Array di Java

- Di Java, semua array dialokasikan secara dinamis.
- Elemen-elemen array disimpan secara berurutan di memori.
- Array di Java adalah objek, sehingga kita dapat mengakses panjangnya dengan properti `length`, tidak seperti di C/C++ yang menggunakan `sizeof`.
- Deklarasi variabel array di Java mirip dengan variabel biasa, dengan penambahan `[]` setelah tipe data.
- Setiap elemen dalam array memiliki indeks yang dimulai dari 0.
- Array di Java dapat menggunakan kata kunci static, dapat menjadi variabel lokal, atau parameter.
- Ukuran array di Java harus diinisialisasi dengan nilai bertipe `int` atau `short`, tidak boleh dengan `long`.
- Penggunaan array memungkinkan akses elemen-elemen secara acak (mendukung Random Access).
- Ukuran array tidak dapat diubah setelah diinisialisasi, tetapi referensi array dapat diarahkan ke array lain.
- Array dapat berisi tipe data primitif (seperti int, char, dll.) atau tipe data referensi (tipe non-primitif), tergantung pada deklarasinya. Tipe primitif menyimpan nilai yang sebenarnya dalam memori, sedangkan tipe objek menyimpan referensi ke objek di segmen heap.

## Membuat, Menginisialisasi, dan Mengakses Array

### Array Satu Dimensi

Dalam Java, array satu dimensi dapat dideklarasikan dengan bentuk umum:

```java
tipe[] nama-var;
```

Contoh deklarasi:

```java
int[] intArray;
double[] doubleArray;
String[] stringArray;
```

Array di Java hanya dideklarasikan sebagai tipe data referensi. Untuk mengalokasikan memori untuk array, Anda bisa menggunakan keyword `new`:

```java
nama-var = new tipe[ukuran];
```

Contoh penggunaan:

```java
int[] intArray = new int[10];
double[] doubleArray = new double[5];
String[] stringArray = new String[20];
```

### Array Literal

Jika ukuran dan elemen array sudah diketahui, Anda dapat menggunakan array literal seperti di bawah ini:

```java
int[] intArray = new int[]{1, 2, 3, 4, 5};
```

Di Java terbaru, Anda bahkan dapat menggunakan sintaksis lebih singkat:

```java
int[] intArray = {1, 2, 3, 4, 5};
```

### Mengakses Elemen Array

Anda dapat mengakses elemen-elemen array dengan indeks dimulai dari 0 hingga (panjang array - 1). Contoh penggunaan loop for untuk mengakses elemen array:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println("Elemen pada indeks " + i + ": " + arr[i]);
}
```

### Array dari Objek

Array dari objek dapat dibuat seperti array dengan tipe data primitif:

```java
NamaKelas[] arr = new NamaKelas[ukuran];
```

Contoh:

```java
Student[] studentArray = new Student[5];
```

Setelah membuat array dari objek, Anda dapat menginisialisasi elemen-elemennya dengan objek-objek dari kelas yang sesuai:

```java
studentArray[0] = new Student("John");
studentArray[1] = new Student("Alice");
```

## Exception saat Mengakses Array

Jika Anda mencoba mengakses elemen di luar batas array (indeks negatif atau lebih besar atau sama dengan panjang array), JVM akan melempar (throw) exception `ArrayIndexOutOfBoundsException`.

Contoh exception:

```java
int[] arr = new int[4];
System.out.println(arr[5]); // Ini akan menghasilkan ArrayIndexOutOfBoundsException
```

## Array Multidimensi

Array multidimensi adalah struktur array yang terdiri dari array-array, di mana setiap elemen dalam array tersebut adalah referensi ke array lain. Istilah lain untuk array multidimensi adalah Array Bersarang. Array multidimensi dibentuk dengan menambahkan tanda kurung siku ([]) sesuai dengan jumlah dimensi. Visualisasi dari array multidimensi dapat dilihat pada gambar berikut.  

![Array Multidimensi](https://github.com/haizk/PBO-2023/blob/main/W06_Array_and_Collection/Array%20Multidimensi.png)

### Syntax:

```java
datatype[][] arrayname;
atau
datatype arrayname[][];
```

### Contoh:

```java
// Java
import java.io.*;

class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // Contoh array 2D dengan 3 baris dan 3 kolom
    }
}
```

### Output:

```java
int[][] intArray = new int[10][20]; // Contoh array 2D atau matriks (Dalam python, array 2D sering dipakai di Machine Learning)
int[][][] intArray = new int[10][20][10]; // Contoh array 3D
```

### Contoh:

```java
// Java
public class multiDimensi {
    public static void main(String args[]) {
        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } }; // Contoh array 2D

        // Cetak array 2D
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
}
```

### Output:

```
2 7 9 
3 6 1 
7 4 2 
```

## Mengirimkan Array ke Method

Seperti variabel, array juga dapat dikirimkan ke method. Berikut adalah contoh program yang mengirimkan array ke method `sum` untuk menghitung jumlah nilai dalam array.

```java
// Program Java untuk mendemonstrasikan pengiriman array ke method

public class Test {
    public static void main(String args[]) {
        int arr[] = { 3, 1, 2, 5, 4 };

        // Mengirimkan array ke method sum
        sum(arr);
    }

    public static void sum(int[] arr) {
        // Menghitung jumlah nilai array
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("Jumlah nilai array: " + sum);
    }
}
```

### Output:

```
Jumlah nilai array: 15
```

## Mengembalikan Array dari Method

Method juga dapat mengembalikan sebuah array. Berikut adalah contoh program yang mengembalikan sebuah array dari method `oneTwoThree`.

```java
// Program Java untuk mendemonstrasikan
// pengembalian array dari method

class Test {
    public static void main(String args[]) {
        int arr[] = oneTwoThree();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] oneTwoThree() {
        // Mengembalikan array
        return new int[] { 1, 2, 3 };
    }
}
```

### Output:

```
1 2 3 
```

## Objek Kelas dari Array

Setiap array dalam Java memiliki sebuah objek Class yang terkait, dan objek Class ini digunakan semua array sesuai dengan tipe elemennya.

```java
// Program Java untuk mendemonstrasikan Objek Kelas untuk Array

class Test {
    public static void main(String args[]) {
        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];

        // Array dari String
        String[] strArray = new String[3];

        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());
    }
}
```

### Output:

```
class [I
class java.lang.Object
class [B
class [S
class [Ljava.lang.String;
```

Dalam contoh kode Java di atas, kita membuat beberapa jenis array seperti intArray, byteArray, shortsArray, dan strArray. Kemudian, kita mencetak tipe Class dari masing-masing array menggunakan metode getClass().

Hasilnya adalah:
intArray.getClass() menghasilkan "class [I", yang merupakan tanda tipe run-time untuk objek Class dari array dengan tipe komponen int.
byteArray.getClass() menghasilkan "class [B", yang merupakan tanda tipe run-time untuk objek Class dari array dengan tipe komponen byte.
shortsArray.getClass() menghasilkan "class [S", yang merupakan tanda tipe run-time untuk objek Class dari array dengan tipe komponen short.
strArray.getClass() menghasilkan "class [Ljava.lang.String;", yang merupakan tanda tipe run-time untuk objek Class dari array dengan tipe komponen String.  

Selain itu, perlu diingat bahwa superclass langsung dari tipe array adalah java.lang.Object untuk semua jenis array. Jadi, intArray.getClass() menghasilkan "class [I" karena itu adalah objek Class dari array int, dan hal seperti itu juga berlaku untuk array dengan tipe komponen yang berbeda.

## Penyalinan Array

Ketika menggandakan array satu dimensi seperti Object[], maka dilakukan "deep copy" dengan array baru yang berisi salinan elemen-elemen array asli bukan referensi (salinan membuat array yang benar-benar baru).  

![Array DeepCopy](https://github.com/haizk/PBO-2023/blob/main/W06_Array_and_Collection/Array%20Deepcopy.png)

```java
// Program Java untuk mendemonstrasikan
// penggandaan array satu dimensi

class Test {
    public static void main(String args[]) {
        int intArray[] = { 1, 2, 3 };
        int cloneArray[] = intArray.clone();

        //

 Akan mencetak false karena deep copy dibuat
        // untuk array satu dimensi
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }
}
```

### Output:

```
false
1 2 3 
```

Saat Anda membuat salinan dari array multi-dimensi, salinan tersebut hanya membuat array baru, tetapi elemen-elemen dalam array merujuk (referensi) ke elemen-elemen dalam array yang asli. Jika ada subarray di dalam array utama, subarray tersebut tidak akan disalin sebagai array yang baru. Sebaliknya, subarray akan tetap menjadi referensi ke subarray asli dalam array aslinya. Jadi, jika Anda mengubah nilai di salah satu subarray dalam salinan shallow copy, perubahan itu juga akan terlihat dalam array asli.  

![Array DeepCopy](https://github.com/haizk/PBO-2023/blob/main/W06_Array_and_Collection/Array%20ShallowCopy.png)

```java
// Program Java untuk mendemonstrasikan
// penggandaan array multidimensi

class Test {
    public static void main(String args[]) {
        int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };
        int cloneArray[][] = intArray.clone();

        // Akan mencetak false
        System.out.println(intArray == cloneArray);

        // Akan mencetak true karena shallow copy dibuat
        // Sub-array-nya di-share
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
    }
}
```

### Output:

```
false
true
true
```
