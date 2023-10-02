# 5.1 Character Class

Character (char) adalah salah satu type data primitive yang umum terdapat di berbagai macam bahasa pemrograman salah satunya adalah Java. Char hanya dapat menyimpan satu Unicode Character pada satu waktu. Kita bisa melakukan assign dengan cara yang sama ke karakter lainnya baik berupa huruf kecil, huruf kapital, angka, ataupun karakter khusus. Sebagai upaya untuk mencegah permasalahan pada proses pembacaan karakter yang bisa mengakibatkan perbedaan karakter, maka perusahaan komputer di US membuat suatu skema coding yang bernama ASCII (American Standard Code for Information Interchange). Table ASCII dapat dilihat pada gambar berikut.
![Table ASCII](ascii.png)

## 5.1.1 Char Declaration
Character dideklarasikan dengan menggunakan single quotes('').

Contoh penggunaan :

```java
char ch = 'a';

// Unicode for uppercase Greek omega character
char uniChar = '\u039A';
```
## 
# 5.2 String Class

String merupakan sebuah nilai tunggal yang berisikan kumpulan dari character.

## 5.2.1 String Declaration
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
## 5.2.2 String Concatenation
Di Java dapat menggabungkan/mengkonket 2 buah string dengan menggunakan operator `+`.
Contoh penggunaan :
```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
```
Saat Anda perlu melakukan banyak operasi manipulasi string, penggunaan penggabungan String dengan operator `+` bisa menjadi tidak efisien karena pembuatan objek baru. Dalam kasus seperti itu, Anda dapat menggunakan `StringBuilder` atau `StringBuffer` untuk membuat dan memodifikasi string secara efisien. Keduanya mirip dalam fungsionalitas, tetapi memiliki perbedaan utama: `StringBuilder` tidak bersifat thread-safe, sedangkan `StringBuffer` bersifat thread-safe.

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
`StringBuffer`, meskipun sedikit lebih lambat dalam penggunaan tunggal, berguna dalam lingkungan `multithread` karena bersifat thread-safe, sehingga dapat digunakan secara aman dalam konteks bersamaan oleh beberapa thread.

## 5.2.3 String Method
Di bahasa pemrograman Java terdapat beberapa build-in method pada String Class yang dapat membantu kita dalam memproses informasi dari String.
Berikut beberapa contoh String Method :
### 1. CharAt()
Method `ChatAt()` digunakan untuk mengembalikan sebuah character dari sebuah String pada indek tertentu.
Contoh penggunaan :
```java
String text = "Hello, World!";
char character = text.charAt(0); // Mengambil karakter pertama 'H'
System.out.println(character);
```
### 2. compareTo()
Metode `compareTo()` digunakan untuk membandingkan urutan leksikal antara dua string. Itu mengembalikan nilai negatif jika string pertama lebih kecil, nilai positif jika string pertama lebih besar, dan 0 jika kedua string sama.
Contoh penggunaan :
```java
String str1 = "apple";
String str2 = "banana";
int result = str1.compareTo(str2); // Menghasilkan nilai negatif
System.out.println(result);
```
### 3. toLowerCase() dan toUpperCase()
Metode `toLowerCase()` digunakan untuk mengonversi semua karakter dalam string menjadi huruf kecil, sedangkan `toUpperCase()` mengonversi semua karakter menjadi huruf besar.
Contoh penggunaan :
```java
String text = "Hello, World!";
String lowercaseText = text.toLowerCase();
String uppercaseText = text.toUpperCase();
System.out.println(lowercaseText); // hello, world!
System.out.println(uppercaseText); // HELLO, WORLD!
```
### 4. startsWith() dan endsWith()
Metode `startsWith()` digunakan untuk memeriksa apakah string dimulai dengan substring tertentu. `endsWith()` digunakan untuk memeriksa apakah string diakhiri dengan substring tertentu.
```java
String text = "Hello, World!";
boolean startsWithHello = text.startsWith("Hello"); // true
boolean endsWithWorld = text.endsWith("World!"); // true
System.out.println(startsWithHello);
System.out.println(endsWithWorld);
```
### 5. split()
Metode `split()` digunakan untuk membagi string menjadi potongan-potongan berdasarkan suatu pemisah (separator) dan mengembalikan array string.
```java
String sentence = "Java is a powerful programming language";
String[] words = sentence.split(" "); // Memecah berdasarkan spasi
for (String word : words) {
    System.out.println(word);
}
```
## 5.3 Regular Expression
Ekspresi Reguler (Regular Expression), sering disingkat sebagai regex atau regexp, adalah alat yang kuat untuk pencocokan pola dan pencarian dalam string. Dalam bahasa pemrograman Java, ekspresi reguler didukung melalui build-in package `java.util.regex`. Regular Expression memungkinkan untuk mendefinisikan pola yang dapat digunakan untuk mencocokkan dan mencari teks dalam string. Ini sangat berguna untuk tugas seperti validasi data, ekstraksi teks, dan analisis sintaks.

Package java.util.regex menyediakan dua kelas utama: Pattern dan Matcher. Kelas Pattern mewakili ekspresi reguler yang telah dikompilasi, sementara kelas Matcher digunakan untuk melakukan operasi pencocokan pada string input yang diberikan.

Contoh penggunaan Pattern dan Matcher dari Regex pada Java :
```java
//Pembuatan Pattern  atau pola
Pattern pola = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");

//Pembuatan Matcher atau pencocokan
Matcher pencocok = pola.matcher("123-45-6789");
boolean cocok = pencocok.matches(); // Mengembalikan true

```

## 5.3.1 Method find() pada Regular Expression
Metode `find()` dari kelas Matcher mencari kemunculan pertama pola dalam string input. Metode ini mengembalikan true jika ada pattern yang sama pada matcher dan false jika tidak ada string sesuai pattern pada matcher.

Contoh penggunaan:
```java
Pattern pola = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
Matcher pencocok = pola.matcher("Nomor KTP saya adalah 123-45-6789.");
if (pencocok.find()) {
    System.out.println("Ditemukan Nomor KTP: " + pencocok.group()); // Mencetak "Ditemukan Nomor KTP: 123-45-6789"
}
```

## 5.3.2 Regular Expressions Pattern
Parameter pertama dari Pattern.compile() nethod adakah pola/pattern yang mendeskripsikan apa yang sedang dicari.

Berikut contoh penyusunan pola yang biasa digunakan :

`[abc]`	: Find one character from the options between the brackets

`[^abc]`: Find one character NOT between the brackets

`[0-9]`	: Find one character from the range 0 to 9

Braket `[ ]` diatas digunakan untuk mendefinisikan range dari charactersnya.
### 5.3.2.1 Metacharacters
`Metharacters` adalah characters yang memiliki arti tersendiri.

Berikut contoh dari metacharacter yang dapat digunakan untuk pembuatan sebuah pattern:
Methacharacter             | Deskripsi 
---------------------------- | ------ 
\| | Find a match for any one of the patterns separated by '\|' as in: `cat\|dog\|fish`
.	| Find just one instance of any character
^	| Finds a match as the beginning of a string as in: ^Hello
$	| Finds a match at the end of the string as in: World$
\d | Find a digit
\s | Find a whitespace character
\b | Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
\uxxxx | Find the Unicode character specified by the hexadecimal number xxxx

### 5.3.2.2 Quantifiers
Quantifiers dalam pembuatan pola (pattern) dalam ekspresi reguler digunakan untuk mengontrol berapa kali sebuah karakter atau grup karakter tertentu harus muncul dalam string yang dicocokkan. Berikut adalah beberapa quantifier yang umum digunakan dalam ekspresi reguler:
1. `*`       : Quantifier `*` mengindikasikan bahwa karakter atau grup karakter sebelumnya dapat muncul 0 kali atau lebih. Misalnya, `a*` akan cocok dengan string kosong, "a", "aa", "aaa", dan seterusnya.

2. `+`       : Quantifier `+` mengindikasikan bahwa karakter atau grup karakter sebelumnya harus muncul setidaknya satu kali atau lebih. Misalnya, `a+` akan cocok dengan "a", "aa", "aaa", dan seterusnya, tetapi tidak akan                  cocok dengan string kosong.

3. `?`        : Quantifier `?` mengindikasikan bahwa karakter atau grup karakter sebelumnya dapat muncul 0 kali atau tepat 1 kali. Misalnya, `a?` akan cocok dengan string kosong atau "a", tetapi tidak akan cocok dengan "aa".

4. `{n}`      : Quantifier `{n}` mengindikasikan bahwa karakter atau grup karakter sebelumnya harus muncul tepat n kali. Misalnya, `a{3}` akan cocok dengan "aaa" tetapi tidak akan cocok dengan "aa" atau "a".

5. `{n,}`     : Quantifier `{n,}` mengindikasikan bahwa karakter atau grup karakter sebelumnya harus muncul setidaknya n kali atau lebih. Misalnya, `a{2,}` akan cocok dengan "aa", "aaa", "aaaa", dan seterusnya.

6. `{n,m}`    : Quantifier `{n,m}` mengindikasikan bahwa karakter atau grup karakter sebelumnya harus muncul setidaknya n kali dan paling banyak m kali. Misalnya, `a{2,4}` akan cocok dengan "aa", "aaa", atau "aaaa", tetapi tidak akan cocok dengan "a" atau "aaaaa".






