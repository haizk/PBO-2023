public class Main {
    public static void main(String[] args) {
        // deklarasi

        int[] intArray = new int[5];

        // mengisi array
        for (int i = 0; i < intArray.length; i++) {
           intArray[i] = i*2;
        }

        // Menampilkan isi array
        System.out.println("Isi array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Elemen pada indeks: " + i + ": " + intArray[i]);;
        }

        // Mengirimkan ke method untuk menghitung jumlah semua nilai
        int sum = calculatedSum(intArray);
        System.out.println("Jumlah dari semua elemen array: " + sum);
    }

    public static int calculatedSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
