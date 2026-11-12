package P6;
import java.util.Scanner;

public class Angka_ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = input.nextInt();
        
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int angkaGanjil = (2 * i) - 1;
            System.out.print(angkaGanjil + " ");
            total += angkaGanjil;
        }
        
        System.out.println("Total : " + total);
        input.close();
    }
}
