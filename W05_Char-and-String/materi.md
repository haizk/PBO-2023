# Character Class

Character (char) adalah salah satu type data primitive yang umum terdapat di berbagai macam bahasa pemrograman salah satunya adalah Java. Char hanya dapat menyimpan satu Unicode Character pada satu waktu. Kita bisa melakukan assign dengan cara yang sama ke karakter lainnya baik berupa huruf kecil, huruf kapital, angka, ataupun karakter khusus. Sebagai upaya untuk mencegah permasalahan pada proses pembacaan karakter yang bisa mengakibatkan perbedaan karakter, maka perusahaan komputer di US membuat suatu skema coding yang bernama ASCII (American Standard Code for Information Interchange). Table ASCII dapat dilihat pada gambar berikut.
![Table ASCII](ascii.png)

## Char Declaration
Character dideklarasikan dengan menggunakan single quotes('').
Contoh penggunaan :

```java
char ch = 'a';

// Unicode for uppercase Greek omega character
char uniChar = '\u039A';
```
## 
# String Class

String merupakan sebuah nilai tunggal yang berisikan kumpulan dari character.

## String Declaration
String di deklarasikan dengan menggunakan double quotes("").
Contoh penggunaan :

```java
String str = "Hello World";
```
Selain itu kita juga dapat membuat String dengan menggunakan keyword "new". Tetapi hal ini jarang digunakan.
Contoh penggunaan :
```java
String anotherString = new String("Hello");

```
## String Concatenation
Di Java dapat menggabungkan/mengkonket 2 buah string dengan menggunakan operator '+'.
Contoh penggunaan :
```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
```
Saat Anda perlu melakukan banyak operasi manipulasi string, penggunaan penggabungan String dengan operator + bisa menjadi tidak efisien karena pembuatan objek baru. Dalam kasus seperti itu, Anda dapat menggunakan StringBuilder atau StringBuffer untuk membuat dan memodifikasi string secara efisien. Keduanya mirip dalam fungsionalitas, tetapi memiliki perbedaan utama: StringBuilder tidak bersifat thread-safe, sedangkan StringBuffer bersifat thread-safe.\n
Contoh penggunaan stringBuilder :
```java
// Inisialisasi StringBuilder
StringBuilder builder = new StringBuilder();

// Menambahkan teks ke dalam StringBuilder
builder.append("Hello");

// Menambahkan karakter atau string
builder.append(' ');

// Menambahkan lebih banyak teks
builder.append("World!");

// Mengganti karakter di indeks tertentu
builder.setCharAt(0, 'h');

// Menghapus karakter pada indeks tertentu
builder.deleteCharAt(6);

// Mengubah StringBuilder menjadi String
String result = builder.toString();

System.out.println(result); // Output: "hello World!"
```
StringBuilder lebih efisien saat Anda perlu memanipulasi string secara berulang dalam satu thread, seperti dalam pengulangan atau saat menggabungkan banyak string.

Contoh penggunaan stringBuffer :
```java
// Inisialisasi StringBuffer
StringBuffer buffer = new StringBuffer();

// Menambahkan teks ke dalam StringBuffer
buffer.append("Hello");

// Menambahkan karakter atau string
buffer.append(' ');

// Menambahkan lebih banyak teks
buffer.append("World!");

// Mengganti karakter di indeks tertentu
buffer.setCharAt(0, 'h');

// Menghapus karakter pada indeks tertentu
buffer.deleteCharAt(6);

// Mengubah StringBuffer menjadi String
String result = buffer.toString();

System.out.println(result); // Output: "hello World!"
```
StringBuffer, meskipun sedikit lebih lambat dalam penggunaan tunggal, berguna dalam lingkungan multithread karena bersifat thread-safe, sehingga dapat digunakan secara aman dalam konteks bersamaan oleh beberapa thread.

## String Method
Di bahasa pemrograman Java terdapat beberapa build-in method pada String Class yang dapat membantu kita dalam memproses informasi dari String.
Berikut beberapa contoh String Method :
### 1. CharAt()
Method ChatAt() digunakan untuk mengembalikan sebuah character dari sebuah String pada indek tertentu.
Contoh penggunaan :
```java
String text = "Hello, World!";
char character = text.charAt(0); // Mengambil karakter pertama 'H'
System.out.println(character);
```
### 2. compareTo()
Metode compareTo() digunakan untuk membandingkan urutan leksikal antara dua string. Itu mengembalikan nilai negatif jika string pertama lebih kecil, nilai positif jika string pertama lebih besar, dan 0 jika kedua string sama.
Contoh penggunaan :
```java
String str1 = "apple";
String str2 = "banana";
int result = str1.compareTo(str2); // Menghasilkan nilai negatif
System.out.println(result);
```
### 3. toLowerCase() dan toUpperCase()
Metode toLowerCase() digunakan untuk mengonversi semua karakter dalam string menjadi huruf kecil, sedangkan toUpperCase() mengonversi semua karakter menjadi huruf besar.
Contoh penggunaan :
```java
String text = "Hello, World!";
String lowercaseText = text.toLowerCase();
String uppercaseText = text.toUpperCase();
System.out.println(lowercaseText); // hello, world!
System.out.println(uppercaseText); // HELLO, WORLD!
```
### 4. startsWith() dan endsWith()
Metode startsWith() digunakan untuk memeriksa apakah string dimulai dengan substring tertentu. endsWith() digunakan untuk memeriksa apakah string diakhiri dengan substring tertentu.
```java
String text = "Hello, World!";
boolean startsWithHello = text.startsWith("Hello"); // true
boolean endsWithWorld = text.endsWith("World!"); // true
System.out.println(startsWithHello);
System.out.println(endsWithWorld);
```
### 5. split()
Metode split() digunakan untuk membagi string menjadi potongan-potongan berdasarkan suatu pemisah (separator) dan mengembalikan array string.
```java
String sentence = "Java is a powerful programming language";
String[] words = sentence.split(" "); // Memecah berdasarkan spasi
for (String word : words) {
    System.out.println(word);
}
```
