package TugasP6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();
        
        double[] arr = new double[n];
        double total = 0;
        
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Masukkan bilangan ke-" + (i+1) + ": ");
                arr[i] = input.nextDouble();
                total += arr[i];
            } catch (InputMismatchException e) {
                System.out.println("Error");
                input.next();
                i--;
            }
        }
        
        System.out.println("Rata-rata: " + (total / n));
    }
}
