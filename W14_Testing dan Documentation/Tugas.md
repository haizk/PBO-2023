# Tugas Week 14 - Documentation and Testing

### Intruksi Tugas
- Buatlah sebuah program java yang berisi 5 method dengan tema bebas.
- Buatlah unit testing dari tiap-tiap method tersebut.
- Dokumentasikan dalam bentuk JavaDoc tiap class dan methodnya.
- Project menggunakan bahasa pemrograman java dengan build system Maven.
- Kreativitas anda dalam mengerjakan tugas sangat dihargai.

### Format Pengumpulan:
- Kirimkan kode program beserta file unit testingnya.
- Format penulisan nama file adalah **PPBO_14_NIM** untuk class utamanya dan **PPBO_14_NIMTest** untuk unit testingnya, dengan isi file sebagai berikut:

File Class Utama :
```java
/**
 * Tema Class anda.
 *
 * <p>Deskripsi tentang class anda.
 *
 * @author Nama_NIM kalian
 */

public class PPBO_13_NIM {
    /**
     * Method ini digunakan ....
     *
     * @param a .
     * @param b .
     * @return Hasil operasi pada method.
    */
    public static int nama_method_anda(int a, int b) {
        // ...
    }
}

// class ...

```
File Unit Testing

```java
/**
  * Kelas pengujian untuk {@link Nama_Method_Anda}.
*/
public class PPBO_14_NIMTest {
    /**
       * Tes untuk metode {@link NamaClassUtama#NamaMethodYangDitest(int, int)}.
     */
    @Test
    public void NamaMethodTesting(){
        //
    }


