import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderInputFile {
    public static void main(String[] args) {
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
    }
}
