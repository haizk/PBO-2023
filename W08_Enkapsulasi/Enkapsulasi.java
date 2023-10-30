public class Mahasiswa {
    // Atribut atau variabel yang dienkapsulasi
    private String nama;
    private String nim;
    private double ipk;

    // Getter dan Setter untuk atribut nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk atribut NIM
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter dan Setter untuk atribut IPK
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }
}

public class Enkapsulasi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("John Doe");
        mahasiswa1.setNim("12345678");
        mahasiswa1.setIpk(3.75);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNama("Jane Smith");
        mahasiswa2.setNim("98765432");
        mahasiswa2.setIpk(3.90);

        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa1.tampilkanInfo();

        System.out.println("Informasi Mahasiswa 2:");
        mahasiswa2.tampilkanInfo();
    }
}
