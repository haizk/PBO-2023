# Tugas: Pemrograman Sederhana dalam Swalayan

Anda adalah seorang pemrogram yang diberi tugas untuk membuat program sederhana untuk mengelola inventaris Swalayan. Swalayan ini memiliki beberapa barang, dan pemilik toko ingin Anda membantu dalam melacak barang-barang tersebut.

## Tugas Anda adalah sebagai berikut:

1. **Array Barang**: Anda harus membuat sebuah array yang berisi daftar barang-barang yang ada di toko. Setiap barang akan direpresentasikan oleh sebuah objek dengan atribut seperti nama barang (string), harga (int), dan jumlah stok (int).

2. **Variabel Static**: Gunakan variabel static untuk melacak jumlah total transaksi penjualan yang telah dilakukan di toko ini. Variabel ini akan digunakan untuk melihat seberapa baik kinerja toko.

3. **Variabel Non-Static**: Buat variabel non-static untuk melacak jumlah uang kas (int) di toko. Variabel ini akan diperbarui setiap kali ada transaksi penjualan atau pembelian barang.

4. **Variabel Lokal**: Ketika pelanggan datang ke toko, Anda harus menggunakan variabel lokal untuk menghitung jumlah total belanjaan mereka dan jumlah kembalian yang harus diberikan.

5. **Parameter**: Anda akan membuat dua method, yaitu `jualBarang` dan `restokBarang`. method `jualBarang` akan menerima parameter berupa nama barang yang dibeli oleh pelanggan dan jumlah barang yang dibeli. method ini akan mengurangkan stok barang yang dibeli dari toko, menghitung total belanjaan, dan mengupdate jumlah uang kas toko. method `restokBarang` akan menerima parameter berupa nama barang dan jumlah barang yang akan di-restok. method ini akan menambahkan jumlah barang yang di-restok ke inventaris toko.

6. **Konstanta**: Gunakan konstanta untuk mendefinisikan pajak pertambahan nilai sebesar 11% yang digunakan di setiap pembelian.

## Penilaian:

Tugas ini memberikan pemahaman tentang konsep-konsep dasar pemrograman seperti array, variabel static dan non-static, variabel lokal, parameter, serta penggunaan konstanta dalam konteks manajemen Swalayan sederhana.
