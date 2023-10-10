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
Sumber gambar: dokumen penulis

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

Dalam contoh kode Java di atas, kita membuat beberapa jenis array seperti intArray, byteArray, shortsArray, dan strArray. Kemudian, kita mencetak tipe Class dari masing-masing array menggunakan method getClass().

Hasilnya adalah:
intArray.getClass() menghasilkan "class [I", yang merupakan tanda tipe run-time untuk objek Class dari array dengan tipe komponen int.
byteArray.getClass() menghasilkan "class [B", yang merupakan tanda tipe run-time untuk objek Class dari array dengan tipe komponen byte.
shortsArray.getClass() menghasilkan "class [S", yang merupakan tanda tipe run-time untuk objek Class dari array dengan tipe komponen short.
strArray.getClass() menghasilkan "class [Ljava.lang.String;", yang merupakan tanda tipe run-time untuk objek Class dari array dengan tipe komponen String.  

Selain itu, perlu diingat bahwa superclass langsung dari tipe array adalah java.lang.Object untuk semua jenis array. Jadi, intArray.getClass() menghasilkan "class [I" karena itu adalah objek Class dari array int, dan hal seperti itu juga berlaku untuk array dengan tipe komponen yang berbeda.

## Penyalinan Array

Ketika menggandakan array satu dimensi seperti Object[], maka dilakukan "deep copy" dengan array baru yang berisi salinan elemen-elemen array asli bukan referensi (salinan membuat array yang benar-benar baru).  

![Array DeepCopy](https://github.com/haizk/PBO-2023/blob/main/W06_Array_and_Collection/Array%20Deepcopy.png)  
Sumber gambar: dokumen penulis

```java
// Program Java untuk mendemonstrasikan
// penggandaan array satu dimensi

class Test {
    public static void main(String args[]) {
        int intArray[] = { 1, 2, 3 };
        int cloneArray[] = intArray.clone();

        // Akan mencetak false karena deep copy dibuat untuk array satu dimensi
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
Sumber gambar: dokumen penulis

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

# Collections

## Pengenalan Framework Collection dalam Java

Sebelum adanya Framework Collection (sebelum JDK 1.2), Java menggunakan Arrays, Vectors, atau Hashtables untuk mengelompokkan objek. Namun, masalahnya adalah struktur data ini tidak memiliki interface yang sama. Hal ini membuat programmer sulit mengimplementasikannya karena perlu mengingat method dan sintaksis yang berbeda untuk setiap struktur data.

Contoh:

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();

        v.addElement(1);
        v.addElement(2);

        h.put(1, "informatika");
        h.put(2, "4informatika");

        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
    }
}
```

Kita bisa lihat bahwa untuk menampilkan elemen dari setiap struktur data, diperlukan method yang berbeda. Hal ini membuat pengembangan program menjadi sulit. Selain itu, sebagian besar method dalam 'Vector' bersifat final, sehingga tidak dapat diperluas untuk membuat collection serupa. Oleh karena itu, Framework Collection diperkenalkan dalam JDK 1.2.

## Keuntungan Framework Collection

Keuntungan dari Framework Collection adalah:

1. **Interface Konsisten:** Terdapat interface dasar seperti Collection, Set, List, dan Map. Semua kelas yang mengimplementasikan interface ini memiliki method yang sama.

2. **Memudahkan Perancangan Program:** Pemrogram tidak perlu memikirkan desain collection, sehingga bisa fokus pada penggunaannya dalam program. Hal ini adalah contoh konsep abstraksi dalam pemrograman berorientasi objek.

3. **Meningkatkan Kinerja dan Kualitas Program:** Framework menyediakan implementasi struktur data dan algoritma yang mangkus dan sangkil (efektif dan efisien), menghilangkan kebutuhan untuk memikirkan algoritma implementasi struktur data yang paling sangkil.

## Hierarki Framework Collection

Framework Collection terdapat dalam package utility (java.util) dan memiliki hierarki interface dan kelas. Semua collection mengimplementasikan interface dasar Iterable yang menyediakan iterator. Interface utama dari semua struktur data yang dipelajari di bawah ini adalah `Collection`, yang menjadi dasar dari framework ini.

![Hierarki Framework Collection di Java](https://github.com/haizk/PBO-2023/blob/main/W06_Array_and_Collection/Collection%20Hierarchy.png)  
Sumber gambar: Data Flair

Catatan:
**Interface** merupakan blueprint yang hanya mendefinisikan method tanpa implementasi. Interface ini digunakan untuk memberikan aturan dasar dari setiap perilaku kelas yang mengimplementasikannya.

## Method dalam Interface Collection

Berikut adalah method dalam interface Collection:

| Method                        | Deskripsi                                                                                                    |
| ----------------------------- | ------------------------------------------------------------------------------------------------------------ |
| `add(Object)`                 | Method ini digunakan untuk menambahkan sebuah objek ke dalam collection.                                        |
| `addAll(Collection c)`        | Method ini menambahkan semua elemen dalam collection yang diberikan ke dalam collection ini.                     |
| `clear()`                     | Method ini menghapus semua elemen dari collection ini.                                                         |
| `contains(Object o)`          | Method ini mengembalikan nilai true jika collection ini mengandung elemen yang ditentukan.                     |
| `containsAll(Collection c)`   | Method ini mengembalikan nilai true jika collection ini mengandung semua elemen dalam collection yang diberikan. |
| `equals(Object o)`            | Method ini membandingkan objek yang ditentukan dengan collection ini untuk kesamaan.                           |
| `hashCode()`                  | Method ini digunakan untuk mengembalikan nilai hash code untuk collection ini.                                  |
| `isEmpty()`                   | Method ini mengembalikan nilai true jika collection ini tidak mengandung elemen.                                 |
| `iterator()`                  | Method ini mengembalikan iterator untuk elemen-elemen dalam collection ini.                                     |
| `max()`                       | Method ini digunakan untuk mengembalikan nilai maksimum yang ada dalam collection.                              |
| `parallelStream()`            | Method ini mengembalikan sebuah Parallel Stream dengan collection ini sebagai sumbernya.                       |
| `remove(Object o)`            | Method ini digunakan untuk menghapus objek yang diberikan dari collection. Jika terdapat nilai duplikat, maka method ini akan menghapus kemunculan pertama objek tersebut. |
| `removeAll(Collection c)`     | Method ini digunakan untuk menghapus semua objek yang disebutkan dalam collection yang diberikan dari collection ini. |
| `removeIf(Predicate filter)`  | Method ini digunakan untuk menghapus semua elemen dalam collection ini yang memenuhi predikat yang diberikan. |
| `retainAll(Collection c)`     | Method ini digunakan untuk menyimpan hanya elemen-elemen dalam collection ini yang terdapat dalam collection yang ditentukan. |
| `size()`                      | Method ini digunakan untuk mengembalikan jumlah elemen dalam collection.                                        |
| `spliterator()`               | Method ini digunakan untuk membuat sebuah Spliterator untuk elemen-elemen dalam collection ini.               |
| `stream()`                    | Method ini digunakan untuk mengembalikan sebuah Sequential Stream dengan collection ini sebagai sumbernya.      |
| `toArray()`                   | Method ini digunakan untuk mengembalikan sebuah array yang berisi semua elemen dalam collection ini.            |

Dengan Framework Collection, Anda dapat mengelola data lebih mudah dengan memanfaatkan collection yang efisien dalam aplikasi Java.

## Interface yang Mengembangkan Interface Collection
Kerangka kerja collection ini memiliki beberapa interface di mana setiap interface digunakan untuk menyimpan jenis data tertentu. Berikut adalah interface yang ada dalam kerangka kerja ini.

### 1. Interface Iterable
Interface ini adalah interface root untuk seluruh framework Collection. Interface collection membutuhkan iterasi. Oleh karena itu, secara inheren, semua interface dan kelas di bawahnya mengimplementasikan interface ini. Fungsi utama interface ini adalah menyediakan iterator untuk collection. Oleh karena itu, interface ini hanya berisi satu method abstrak, yaitu iterator.

    ```java
    Iterator iterator();
    ```

### 2. Interface `Collection`
Interface ini mengembangkan interface yang dapat diiterasi dan diimplementasikan oleh semua kelas dalam kerangka kerja collection. Interface ini berisi semua method dasar yang dimiliki setiap collection, seperti menambahkan data ke dalam collection, menghapus data, menghapus semua data, dan sebagainya. Semua method ini diimplementasikan dalam interface ini karena method-method ini diimplementasikan oleh semua kelas tanpa memandang style implementasinya. Dengan memiliki method-method ini, interface memastikan bahwa nama-nama method tersebut berlaku universal untuk semua collection. Oleh karena itu, kita dapat mengatakan bahwa interface ini membangun dasar di mana kelas-kelas collection diimplementasikan.

### 3. Interface List
Interface ini adalah turunan dari interface collection. Interface ini memungkinkan data duplikat ada di dalamnya. Interface list ini diimplementasikan oleh berbagai kelas seperti ArrayList, LinkedList, Vector, dan lain-lain. Karena semua kelas turunan mengimplementasikan list, kita dapat membuat objek list dengan salah satu dari kelas-kelas ini.

Contoh:

```java
List<T> al = new ArrayList<>();
List<T> ll = new LinkedList<>();
List<T> v = new Vector<>();
```

Di mana T adalah tipe generik. Artinya, tipe ini dapat digantikan oleh objek yang memenuhi syarat apa pun pada saat proses berjalan, misalnya objek Integer, String, dan sebagainya. Kelas-kelas yang mengimplementasikan interface List adalah sebagai berikut:

#### a. ArrayList  
ArrayList menyediakan array dinamis dalam Java. ArrayList berguna dalam program-program di mana banyak diperlukan manipulasi dalam array. Maka dari itu, ArrayList sering dipakai meskipun relatif lebih lambat dibanding array biasa. Ukuran ArrayList diperbesar secara otomatis jika collection bertambah atau menyusut jika objek dihapus dari collection. ArrayList Java memungkinkan kita untuk mengakses list secara acak. ArrayList tidak dapat digunakan untuk tipe data primitif seperti int, char, dll. Kita memerlukan wrapper classes untuk kasus-kasus tersebut (materi wrapper classes ada di bab 2 \[variabel dan tipe data\]).

Contoh ArrayList:

```java
// Contoh ArrayList
ArrayList<Integer> al = new ArrayList<Integer>();

// Menambahkan elemen baru di akhir list
for (int i = 1; i <= 5; i++)
    al.add(i);

// Menghapus elemen pada indeks 2
al.remove(2);

// Menampilkan ArrayList setelah penghapusan
System.out.println(al);

// Menampilkan elemen satu per satu
for (int i = 0; i < al.size(); i++)
    System.out.print(al.get(i) + " ");
```

#### b. LinkedList  
Kelas LinkedList adalah implementasi struktur data LinkedList yang merupakan struktur data linear di mana elemen-elemen tidak disimpan di lokasi berurutan dan setiap elemen adalah objek terpisah dengan bagian data dan bagian address-nya. Elemen-elemen dihubungkan menggunakan pointer dan address. Setiap elemen dikenal sebagai simpul/node.

Contoh LinkedList:

```java
// Contoh LinkedList
LinkedList<Integer> ll = new LinkedList<Integer>();

// Menambahkan elemen baru di akhir list
for (int i = 1; i <= 5; i++)
    ll.add(i);

// Menghapus elemen pada indeks 3
ll.remove(3);

// Menampilkan LinkedList setelah penghapusan
System.out.println(ll);

// Menampilkan elemen satu per satu
for (int i = 0; i < ll.size(); i++)
    System.out.print(ll.get(i) + " ");
```

#### c. Vector  
Vector juga memungkinkan pembuatan array dinamis dalam Java. Vector identik dengan ArrayList dalam hal implementasi. Namun, perbedaan utama antara vektor dan ArrayList adalah bahwa Vektor disinkronkan dan ArrayList tidak disinkronkan. Maksud dari "sinkronisasi" di sini adalah:

**Vector:** Ketika Anda menggunakan Vector untuk menyimpan data, itu berarti operasi-operasi seperti penambahan, penghapusan, atau iterasi ke dalamnya akan secara otomatis dilindungi dari akses konkuren oleh beberapa thread. Artinya, hanya satu thread yang dapat mengakses Vector pada satu waktu. Hal ini memastikan keamanan dalam kasus penggunaan bersama (multithreaded) di mana beberapa thread dapat mengakses Vector secara bersamaan. Konsep ini akan dipelajari kemudian.

**ArrayList:** Sebaliknya, ArrayList tidak memiliki sinkronisasi otomatis. Hal ini berarti jika Anda menggunakannya dalam lingkungan multithreaded, Anda harus secara manual mengimplementasikan mekanisme sinkronisasi, seperti penguncian (locking), untuk melindungi akses ke ArrayList dari beberapa thread. Jika Anda tidak melakukan ini, maka Anda berisiko menghadapi masalah seperti race condition (thread saling berebut mengakses resource) dan ketidak-konsistenan data jika beberapa thread mencoba mengubah ArrayList secara bersamaan tanpa koordinasi.

Contoh Vector:

```java
// Contoh Vector
Vector<Integer> v = new Vector<Integer>();

// Menambahkan elemen baru di akhir list
for (int i = 1; i <= 5; i++)
    v.add(i);

// Menghapus elemen pada indeks 3
v.remove(3);

// Menampilkan Vector setelah penghapusan
System.out.println(v);

// Menampilkan elemen satu per satu
for (int i = 0; i < v.size(); i++)
    System.out.print(v.get(i) + " ");
```

#### d. Stack
Kelas Stack memodelkan dan mengimplementasikan struktur data Stack. Kelas ini didasarkan pada prinsip dasar *last-in-first-out* (LIFO). Selain operasi dasar push dan pop, kelas ini menyediakan tiga fungsi tambahan: `empty`, `search`, dan `peek`. Kelas ini juga dapat disebut sebagai subclass dari Vector.

Contoh Stack:

```java
// Contoh Stack
Stack<String> stack = new Stack<String>();
stack.push("FATISDA");
stack.push("FMIPA");
stack.push("FT");
stack.push("FK");

// Iterator untuk Stack
Iterator<String> itr = stack.iterator();

// Menampilkan Stack
while (itr.hasNext()) {
    System.out.print(itr.next() + " ");
}

System.out.println();

stack.pop();

// Iterator untuk Stack
itr = stack.iterator();

// Menampilkan Stack
while (itr.hasNext()) {
    System.out.print(itr.next() + " ");
}
```

### 4. Interface Queue
Seperti namanya, interface queue menjaga urutan FIFO (First In First Out) seperti antrean di dunia nyata. Interface ini digunakan untuk menyimpan semua elemen di mana urutan elemen dianggap penting. Misalnya, ketika kita mencoba memesan tiket, tiket dijual berdasarkan prinsip first come first serve. Oleh karena itu, orang yang tiba pertama kali dalam queue akan mendapatkan tiket terlebih dahulu. Kita dapat membuat objek queue dengan salah satu dari kelas-kelas ini karena semua kelas turunan ini mengimplementasikan interface queue.

Contohnya:

```java
Queue<T> pq = new PriorityQueue<>(); 
Queue<T> ad = new ArrayDeque<>(); 
```

Implementasi interface queue yang paling sering digunakan adalah PriorityQueue.

#### a. Priority Queue  
PriorityQueue digunakan ketika objek harus diproses berdasarkan prioritas. Meskipun queue mengikuti algoritma First-In-First-Out, kadang-kadang elemen-elemen dalam queue harus diproses sesuai dengan prioritas, maka kelas ini diperlukan. Elemen-elemen dalam priority queue diurutkan berdasarkan urutan alami, atau berdasarkan Comparator yang disediakan pada saat konstruksi queue, tergantung pada konstruktor mana yang digunakan.

Mari kita pahami priority queue dengan contoh:

```java
PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

pQueue.add(10);
pQueue.add(20);
pQueue.add(15);

// Mencetak elemen teratas
System.out.println(pQueue.peek());

// Mencetak elemen teratas lalu menghapusnya dari container PriorityQueue
System.out.println(pQueue.poll());

// Mencetak elemen teratas
System.out.println(pQueue.peek());
```

Output:

```
10
10
15
```

### 5. Interface Deque
Deque, yang juga dikenal sebagai double-ended queue, adalah struktur data di mana kita dapat menambahkan dan menghapus elemen dari kedua ujung queue (double-ended). Interface ini meng-extend interface queue. Kelas yang mengimplementasikan interface ini adalah ArrayDeque. Karena kelas ArrayDeque mengimplementasikan interface Deque, kita dapat membuat objek deque dengan kelas ini.

Contohnya:

```java
Deque<T> ad = new ArrayDeque<>(); 
```

Di mana T adalah tipe objek. Kelas yang mengimplementasikan interface deque adalah ArrayDeque.

#### a. ArrayDeque  
Kelas ArrayDeque yang diimplementasikan dalam framework collection memberikan cara untuk menerapkan array yang dapat disesuaikan ukurannya (resizable). Struktur ini merupakan jenis khusus dari array yang dapat tumbuh dan memungkinkan pengguna untuk menambah atau menghapus elemen dari kedua sisi queue. Array deque tidak memiliki batasan kapasitas dan akan tumbuh sesuai kebutuhan untuk mendukung penggunaan.

Mari kita pahami ArrayDeque dengan contoh:

```java

ArrayDeque<Integer> deQueue = new ArrayDeque<Integer>(10);

deQueue.add(10);
deQueue.add(20);
deQueue.add(30);
deQueue.add(40);
deQueue.add(50);

System.out.println(deQueue);

// menghapus semua elemen
deQueue.clear();

// menambah elemen pada head (depan)
deQueue.addFirst(564);
deQueue.addFirst(291);

// menambah elemen pada tail (belakang)
deQueue.addLast(24);
deQueue.addLast(14);

System.out.println(deQueue);
```

Output:

```
[10, 20, 30, 40, 50]
[291, 564, 24, 14]
```

### 6. Interface Set
Interface Set adalah struktur kumpulan objek yang tidak menggunakan urutan serta tidak memperbolehkan adanya nilai duplikat. Set ini digunakan ketika kita ingin menghindari duplikasi objek. Interface Set ini diimplementasikan oleh berbagai kelas seperti HashSet, TreeSet, LinkedHashSet, dan lain-lain. Karena semua kelas turunan mengimplementasikan set, kita dapat membuat objek set dengan salah satu dari kelas-kelas ini.

Contohnya:

```java
Set<T> hs = new HashSet<>(); 
Set<T> lhs = new LinkedHashSet<>(); 
Set<T> ts = new TreeSet<>();
```

Kelas-kelas berikut mengimplementasikan antarmuka Set:

#### a. HashSet
Kelas HashSet adalah implementasi bawaan dari struktur data tabel hash. Objek yang kita masukkan ke HashSet tidak menjamin akan dimasukkan dalam urutan yang sama. Objek dimasukkan berdasarkan kode hash mereka. Kelas ini juga memungkinkan penambahan elemen NULL. Mari pahami HashSet dengan contoh berikut:

```java

HashSet<String> hs = new HashSet<String>();

hs.add("FSRD");
hs.add("FKIP");
hs.add("FH");
hs.add("FEB");
hs.add("FATISDA");

// Melakukan traverse elemen
Iterator<String> itr = hs.iterator();
while (itr.hasNext()) {
    System.out.println(itr.next());
}
```

#### b. LinkedHashSet
LinkedHashSet sangat mirip dengan HashSet. Perbedaannya adalah LinkedHashSet menggunakan double linked list untuk menyimpan data dan mempertahankan urutan elemen.

Mari pahami LinkedHashSet dengan contoh berikut:

```java
LinkedHashSet<String> lhs = new LinkedHashSet<String>();

lhs.add("FSRD");
lhs.add("FKIP");
lhs.add("FH");
lhs.add("FEB");
lhs.add("FATISDA");

// Melakukan traverse elemen
Iterator<String> itr = lhs.iterator();
while (itr.hasNext()) {
    System.out.println(itr.next());
}
```

### 7. Interface Sorted Set
Interface ini mirip dengan interface Set. Satu-satunya perbedaan adalah antarmuka ini adalah SortedSet bersifat urut. Interface sorted set meng-extend interface set dan digunakan untuk mengelola data yang perlu diurutkan. Kelas yang mengimplementasikan antarmuka ini adalah TreeSet. Karena kelas ini mengimplementasikan SortedSet, kita dapat membuat objek SortedSet dengan kelas ini.

Contohnya:

```java
SortedSet<T> ts = new TreeSet<>(); 
```

Di mana T adalah tipe objek.

Kelas yang mengimplementasikan antarmuka sorted set adalah TreeSet.

#### a. TreeSet
Kelas TreeSet menggunakan struktur Pohon untuk penyimpanan. Urutan elemen dipertahankan oleh set menggunakan urutan alami mereka. TreeSet dapat diatur agar mengurutkan elemen sesuai dengan aturan tertentu yang ditentukan oleh objek Comparator, dan untuk menjalankannya dengan benar sebagai kumpulan objek unik, elemen-elemen tersebut harus mengimplementasikan metode equals dengan benar.

Mari pahami TreeSet dengan contoh:

```java

TreeSet<String> ts = new TreeSet<String>();

ts.add("FSRD");
ts.add("FKIP");
ts.add("FH");
ts.add("FEB");
ts.add("FATISDA");

// Melakukan traverse elemen
Iterator<String> itr = ts.iterator();
while (itr.hasNext()) {
    System.out.println(itr.next());
}
```

### 7. Interface Map
Interface Map adalah struktur data yang mendukung pasangan key-value untuk memetakan data. Interface ini tidak memungkinkan duplikasi key karena kunci (key) yang sama tidak dapat memiliki beberapa map/pemetaan, namun value suatu key boleh sama dengan value di key lainnya. Interface map ini diimplementasikan oleh berbagai kelas seperti HashMap, TreeMap, dan lain-lain. Karena semua kelas turunan mengimplementasikan antarmuka map, kita dapat membuat objek map dengan salah satu dari kelas-kelas ini.

Contoh:

```java
Map<T> hm = new HashMap<>(); 
Map<T> tm = new TreeMap<>();
```

Di mana T adalah jenis objek. Implementasi Antarmuka Map yang sering digunakan adalah HashMap.

#### a. HashMap
HashMap menyediakan implementasi dasar dari Antarmuka Map Java. Objek ini menyimpan data dalam pasangan (Kunci, Nilai). Untuk mengakses nilai dalam HashMap, kita harus tahu kuncinya. HashMap menggunakan teknik yang disebut Hashing. Hashing adalah teknik mengonversi String besar menjadi String kecil yang mewakili String yang sama sehingga operasi indeks dan pencarian lebih cepat. HashSet juga menggunakan HashMap secara internal.

Mari pahami HashMap dengan contoh:

```java
// Membuat HashMap dan menambahkan elemen
HashMap<Integer, String> hm = new HashMap<Integer, String>();

hm.put(1, "Lu punya uang");
hm.put(2, "Lu punya kuasa");

// Menemukan nilai untuk sebuah kunci
System.out.println("Nilai untuk kunci 1 adalah " + hm.get(1));

// Melintasi HashMap
for (Map.Entry<Integer, String> e : hm.entrySet())
    System.out.println(e.getKey() + " " + e.getValue());
```

# Bacaan Lebih Lanjut
**Array:**  
- [Java Arrays (w3schools.com)](https://www.w3schools.com/java/java_arrays.asp)  
- [Arrays (Java Platform SE 8 ) (oracle.com)](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)  

**Collection**:
- [Collections in Java - javatpoint](https://www.javatpoint.com/collections-in-java)  
- [Collection (Java Platform SE 8 ) (oracle.com)](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)  
