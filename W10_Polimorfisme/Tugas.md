# Tugas  

Sebuah perusahaan membayar karyawannya setiap minggu. Karyawan terdiri dari empat jenis:
- Karyawan gaji tetap: yang dibayar dengan gaji pokok mingguan tetap tanpa memandang jumlah jam kerja
- Karyawan per jam: dibayar berdasarkan jumlah jam kerja mereka,
- Karyawan komisi: dibayar dalam persentase dari penjualan mereka
- Karyawan komisi plus: yang menerima gaji menerima gaji pokok mingguan ditambah persentase dari penjualan mereka.

Untuk periode pembayaran saat ini, perusahaan telah memutuskan untuk memberikan penghargaan kepada karyawan yang menerima komisi dengan menambahkan 10% ke gaji pokok mereka. Perusahaan ingin mengimplementasikan aplikasi Java yang melakukan perhitungan penggajian dengan menerapkan polimorfisme.

### Kalian bebas untuk:
- menentukan gaji mingguan setiap karyawan gaji tetap
- menentukan jumlah jam kerja dari setiap karyawan per jam
- menentukan jumlah penjualan setiap karyawan komisi dan karyawan komisi plus
- menentukan gaji pokok karyawan komisi plus
- Mengkreasikan program selama masih sesuai dengan batasan di bawah:

### Kalian wajib untuk:
- Menerapkan method overloading, (penjelasan terdapat pada bagian compiled-time polymorphism)
- Menerapkan runtime polymorphism (overriding)
- Menerapkan pewarisan
- Memastikan program berfungsi dengan baik sesuai perintah
- Menuliskan di bagian akhir program, dengan komentar untuk menjawab pertanyaan berikut:
 1. Bagaimana polimorfisme yang diterapkan bisa mempermudah perhitungan gaji perusahaan?
 2. Apakah program masih dapat bekerja sesuai fungsinya jika tidak menggunakan polimorfisme? Berikan alasannya.

### Petunjuk:
- Gunakan kelas `Karyawan` untuk mewakili konsep umum seorang karyawan. Kelas yang meng-extend Karyawan adalah `KaryawanGajiTetap`, `KaryawanKomisi`, dan `KaryawanPerJam`. Kelas `KaryawanKomisiPlus` meng-extend kelas `KaryawanKomisi`.
- Gunakan kelas `PPBO_10_NIM` untuk menuliskan method main.
- Jika kalian memiliki ide untuk menerapkan operator polymorphism, akan ada nilai tambahan. Kalian bisa mencobanya di kelas `KaryawanKomisiPlus`.

Format penulisan nama file adalah **PPBO_10_NIM**, dengan isi file sebagai berikut:

```java
// Nama : ...
// NIM  : ...

// import ...

public class PPBO_10_NIM {
    public static void main(String[] args) {
        // ...
    }
}

// class ...
