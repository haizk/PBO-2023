# Input
Seperti dalam bahasa pemrograman yang sudah kalian pelajari sebelumnya terdapat kata Input, Input merupakan nilai yang kita masukan ke program atau ke sebuah variabel yang kita inginkan. Java sendiri memiliki 3 class untuk menambil input yaitu Class Scanner, Class BufferReader, dan Class Console.

## 1 Class Scanner
Scanner class dalam java adalah sebuah kelas yang terdapat di paket java.util yang digunakan untuk mendapatkan input dari pengguna berupa tipe data primitif seperti int, double, dll. dan string. Scanner class dalam java juga dapat digunakan untuk membaca input dari file teks atau biner dengan menggunakan pola pemisah yang ditentukan oleh ekspresi reguler. Scanner class dalam java memudahkan kita untuk membuat program yang interaktif dengan pengguna atau untuk memproses data dari file.

### Method untuk membaca input dalam scanner
![Method Read Input](https://github.com/haizk/PBO-2023/blob/main/W07_Input-Output/image.png)  

### Contoh penggunaan Scanner menerima input dari keyboard
```java
 Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String input = scanner.nextLine();
```
### Contoh penggunaan Scanner menerima input dari file
```java
        try {
            File file = new File("namaFile.txt"); // Ganti dengan path file yang sesuai
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File tidak ditemukan.");
        }
```
## 2 Class BufferReader
Class BufferedReader dalam java adalah sebuah kelas yang digunakan untuk membaca teks dari input stream berbasis karakter. Kelas ini dapat digunakan untuk membaca data baris demi baris dengan menggunakan method readLine(). Kelas ini juga membuat kinerja menjadi lebih cepat karena memiliki buffer internal yang menyimpan karakter-karakter yang dibaca. Kelas ini merupakan turunan dari kelas Reader yang juga dapat membaca input dari user serta file

### Contoh penggunaan BufferReader untuk menerima input dari keyboard
```java
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

        System.out.print ("Masukkan nama anda: ");

        StringBuffer stringBuffer = new StringBuffer ("Selamat datang ");

        stringBuffer.append (input.readLine ());

        input.close ();
```
### Contoh penggunaan BufferReader untuk menerima input dari file
```java
        try {
            // Membuat objek BufferedReader dengan parameter FileReader
            BufferedReader reader = new BufferedReader(new FileReader("namaFile.txt"));

            // Membaca baris pertama dari file
            String line = reader.readLine();

            // Selama baris tidak null, artinya masih ada isi file yang harus dibaca
            while (line != null) {
                // Menampilkan baris yang dibaca
                System.out.println(line);

                // Membaca baris selanjutnya
                line = reader.readLine();
            }

            // Menutup objek BufferedReader
            reader.close();
        } catch (IOException e) {
            // Menampilkan pesan kesalahan jika terjadi eksepsi
            e.printStackTrace();
        }
```
## 3 Class Console
Class Console dalam java adalah sebuah kelas yang digunakan untuk mendapatkan input dari konsol. Kelas ini menyediakan metode untuk membaca teks dan password. Jika anda membaca password menggunakan kelas Console, password tersebut tidak akan ditampilkan kepada pengguna. Kelas java.io.Console ini terhubung dengan konsol sistem secara internal. Kelas Console ini diperkenalkan sejak versi 1.5

### Method di Class Console
- `Reader reader()`: Metode ini digunakan untuk mendapatkan objek Reader yang terkait dengan konsol.
- `String readLine(String fmt, Object... args)`: Metode ini menyediakan prompt yang diformat kemudian membaca satu baris teks dari konsol.
- `char[] readPassword()`: Metode ini digunakan untuk membaca password yang tidak ditampilkan di konsol.
- `char[] readPassword(String fmt, Object... args)`: Metode ini menyediakan prompt yang diformat kemudian membaca password yang tidak ditampilkan di konsol.
- `Console format(String fmt, Object... args)`: Metode ini digunakan untuk menulis string yang diformat ke output stream konsol.
- `Console printf(String format, Object... args)`: Metode ini digunakan untuk menulis string ke output stream konsol.
- `PrintWriter writer()`: Metode ini digunakan untuk mendapatkan objek PrintWriter yang terkait dengan konsol.
- `void flush()`: Metode ini digunakan untuk membersihkan konsol.

### Contoh penggunaan Class Console (baca teks)
```java
import java.io.Console;
class ReadStringTest {
    public static void main(String args[]) {
        // Membuat objek Console
        Console c = System.console();
        System.out.println("Masukkan nama anda: ");
        // Membaca teks dari konsol
        String n = c.readLine();
        System.out.println("Selamat datang " + n);
    }
}
```

### Contoh penggunaan Class Console (baca password)
```java
import java.io.Console;
class ReadPasswordTest {
    public static void main(String args[]) {
        // Membuat objek Console
        Console c = System.console();
        System.out.println("Masukkan password: ");
        // Membaca password dari konsol
        char[] ch = c.readPassword();
        // Mengubah array karakter menjadi string
        String pass = String.valueOf(ch);
        System.out.println("Password anda adalah: " + pass);
    }
}
```

# Output
Output pada java adalah cara untuk menampilkan hasil dari program java ke layar, konsol, atau media lainnya. Output pada java dapat dilakukan dengan menggunakan beberapa metode yang tersedia di kelas System, seperti print(), println(), dan printf(). Metode-metode ini membutuhkan argumen berupa string atau tipe data lain yang akan ditampilkan. Berikut ini adalah penjelasan singkat tentang masing-masing metode:

- `print()`: Metode ini digunakan untuk mencetak argumen tanpa pindah baris. Jika ingin mencetak lebih dari satu argumen, maka harus dipisahkan dengan operator +. Contoh: `System.out.print("Hello" + "World");`
- `println()`: Metode ini digunakan untuk mencetak argumen dengan pindah baris. Jika ingin mencetak lebih dari satu argumen, maka harus dipisahkan dengan operator +. Contoh: `System.out.println("Hello" + "World");`
- `printf()`: Metode ini digunakan untuk mencetak argumen dengan format tertentu. Format ini ditentukan oleh string format yang berisi spesifikasi konversi yang menunjukkan bagaimana argumen akan ditampilkan. Contoh: `System.out.printf("Nama: %s, Umur: %d", "Budi", 20);`

# Tambahan (Method '`.close()`)

Metode close() dalam input java adalah metode yang digunakan untuk menutup koneksi input stream. Input stream adalah aliran data yang masuk ke program java dari suatu sumber, seperti keyboard, file, jaringan, dll. Koneksi input stream harus ditutup setelah selesai digunakan untuk menghemat sumber daya dan mencegah kebocoran memori. Jika koneksi input stream tidak ditutup, maka data yang masuk mungkin tidak dapat dibaca dengan benar atau menyebabkan konflik dengan input stream lainnya.

Untuk menggunakan metode close(), kita perlu memanggilnya pada objek input stream yang ingin ditutup. Misalnya, jika kita menggunakan objek Scanner untuk membaca input dari keyboard, maka kita bisa menutup koneksi input stream dengan kode berikut:
### Scanner
```java
// membuat objek Scanner
Scanner input = new Scanner(System.in);

// membaca input dari keyboard
String data = input.nextLine();

// menampilkan input yang dibaca
System.out.println("Data yang dimasukkan: " + data);

// menutup koneksi input stream
input.close();
```

### BufferReader
```java
// membuat objek BufferedReader dengan parameter FileReader
BufferedReader reader = new BufferedReader(new FileReader("data.txt"));

// membaca baris pertama dari file
String line = reader.readLine();

// selama baris tidak null, artinya masih ada isi file yang harus dibaca
while (line != null) {
    // menampilkan baris yang dibaca
    System.out.println(line);

    // membaca baris selanjutnya
    line = reader.readLine();
}

// mencoba menutup koneksi input stream
try {
    // menutup objek BufferedReader
    reader.close();
} catch (IOException e) {
    // menangkap dan menampilkan pengecualian IOException
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```