package P6;
import java.util.Scanner;

public class Mencari_Bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 

        System.out.println("Masukkan 10 bilangan:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            int angka = input.nextInt();

            if (angka > max) {
                max = angka;
            }
            if (angka < min) {
                min = angka;
            }
        }
        System.out.println("Bilangan Terbesar: " + max);
        System.out.println("Bilangan Terkecil: " + min);
        input.close();
    }
}
