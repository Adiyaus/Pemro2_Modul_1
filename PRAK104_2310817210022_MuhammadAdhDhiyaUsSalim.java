import java.util.Scanner;

public class PRAK104_2310817210022_MuhammadAdhDhiyaUsSalim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input tangan Abu
        System.out.println("Masukkan tangan Abu : ");
        String[] tanganAbu = scanner.nextLine().split(" ");

        // Meminta input tangan Bagas
        System.out.println("Masukkan tangan Bagas : ");
        String[] tanganBagas = scanner.nextLine().split(" ");

        // Inisialisasi variabel untuk menghitung poin
        int poinAbu = 0;
        int poinBagas = 0;

        // Validasi jumlah input yang harus 3
        if (tanganAbu.length != 3 || tanganBagas.length != 3) {
            System.out.println("Input harus terdiri dari 3 pilihan tangan untuk setiap pemain.");
            return;
        }

        // Loop untuk memproses 3 ronde
        for (int i = 0; i < 3; i++) {
            String abu = tanganAbu[i];
            String bagas = tanganBagas[i];

            // Logika permainan Batu-Gunting-Kertas
            if (abu.equals(bagas)) {
                // Seri
                continue;
            } else if (
                (abu.equals("B") && bagas.equals("G")) || // Batu kalahkan Gunting
                (abu.equals("G") && bagas.equals("K")) || // Gunting kalahkan Kertas
                (abu.equals("K") && bagas.equals("B"))    // Kertas kalahkan Batu
            ) {
                poinAbu++; // Abu menang di ronde ini
            } else {
                poinBagas++; // Bagas menang di ronde ini
            }
        }

        // Menentukan pemenang akhir
        if (poinAbu > poinBagas) {
            System.out.println("Pemenangnya adalah: Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Pemenangnya adalah: Bagas");
        } else {
            System.out.println("Hasil akhir: Seri");
        }

        scanner.close();
    }
}
