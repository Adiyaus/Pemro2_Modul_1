import java.util.Scanner;

public class PRAK102_2310817210022_MuhammadAdhDhiyaUsSalim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka Awal : ");
        int angkaAwal = input.nextInt();

        int jumlahBaris = 11;
        int barisSaatIni = 0;
        int angka = angkaAwal;

        while (barisSaatIni < jumlahBaris) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5) - 1 + ", ");
            } else {
                System.out.print(angka + ", ");
            }

            angka++;
            barisSaatIni++;
        }
    }
}
