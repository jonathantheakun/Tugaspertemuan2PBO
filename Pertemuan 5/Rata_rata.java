package P6;
import java.util.Scanner;

public class Rata_rata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Berapa banyak bilangan yang dimasukkan? ");
        int n = input.nextInt();
        
        double total = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            total += input.nextDouble(); 
        }
        
        double rataRata = (n > 0) ? total / n : 0;
        
        System.out.println("Total jumlah bilangan: " + total);
        System.out.println("Rata-rata: " + rataRata);
        input.close();
    }
}
