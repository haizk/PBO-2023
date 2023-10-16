import java.util.Scanner;

public class ScannerInputUser {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama;
        int usia;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.print("Nama: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // menggunakan scanner dan menyimpan apa yang diketik di variabel usia
        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");

        keyboard.close();
    }
}
