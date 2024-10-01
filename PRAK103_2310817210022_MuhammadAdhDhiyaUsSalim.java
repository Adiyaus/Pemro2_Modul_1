import java.util.Scanner;

public class PRAK103_2310817210022_MuhammadAdhDhiyaUsSalim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan N dan bilangan awal: ");
        int N = scanner.nextInt();  
        int bilanganAwal = scanner.nextInt();  

        int count = 0;  
        int current = bilanganAwal;  


        System.out.print("Output: ");
        
        do {
            if (current % 2 != 0) {
                System.out.print(current);
                count++;
                if (count < N) {
                    System.out.print(", ");  
                }
            }
            current++;  
        } while (count < N);  

        System.out.println();  
    }
}