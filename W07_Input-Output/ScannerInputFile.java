import java.io.File;
import java.util.Scanner;

public class ScannerInputFile {
    public static void main(String[] args) {
        try {
            // membuat objek scanner dengan parameter file
            Scanner input = new Scanner(new File("nilai.txt"));

            // membaca isi file dengan pola pemisah koma
            input.useDelimiter(",");

            // menampilkan output ke konsol
            System.out.println("Nama\t\tNilai");
            System.out.println("---------------------");

            // selama masih ada token berikutnya dalam file
            while (input.hasNext()) {
                // mengambil token berikutnya sebagai string
                String nama = input.next();
                // mengambil token berikutnya sebagai int
                int nilai = input.nextInt();
                // menampilkan nama dan nilai siswa
                System.out.println(nama + "\t\t" + nilai);
            }

            // menutup scanner
            input.close();
        } catch (Exception e) {
            // menampilkan pesan kesalahan jika terjadi eksepsi
            e.printStackTrace();
        }
    }
}
