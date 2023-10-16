import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferReaderInputUser {
    public static void main (String [] args) throws IOException {
        // Membuat objek BufferedReader
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

        // Membuat user prompt untuk menginput nama
        System.out.print ("Masukkan nama anda: ");

        // Membuat objek StringBuffer
        StringBuffer stringBuffer = new StringBuffer ("Selamat datang ");

        // Membaca input dari user
        stringBuffer.append (input.readLine ());

        // Menutup objek BufferedReader
        input.close ();

        // Menampilkan string setelah menerima input dari user
        System.out.println (stringBuffer);
    }
}
