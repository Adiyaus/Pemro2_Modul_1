import java.util.Scanner;

public class PRAK105_2310817210022_MuhammadAdhDhiyaUsSalim {
    public static void main(String[] args) {
        final double PHI = 3.14159; // Konstanta nilai phi

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jari-jari: ");
            String jariJariInput = scanner.next();
            double jariJari = Double.parseDouble(jariJariInput.replace(',', '.'));

            if (jariJari <= 0) {
                System.out.println("Jari-jari harus bilangan positif.");
                continue;
            }

            System.out.print("Masukkan tinggi: ");
            String tinggiInput = scanner.next();
            double tinggi = Double.parseDouble(tinggiInput.replace(',', '.'));

            if (tinggi <= 0) {
                System.out.println("Tinggi harus bilangan positif.");
                continue;
            }

            double volume = PHI * jariJari * jariJari * tinggi;
            System.out.printf("Volume tabung dengan jari-jari %.2f cm dan tinggi %.2f cm adalah %.3f cm³\n", jariJari, tinggi, volume);

            System.out.println();
        }
    }
}
