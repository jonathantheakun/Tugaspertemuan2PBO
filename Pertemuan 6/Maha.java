package TugasP6;
import java.util.Scanner;

public class Maha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        
        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nama Mahasiswa ke-" + (i+1) + ": ");
            nama[i] = input.next();
            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();
            if (nilai[i] > 50) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }
        System.out.println("\n\tDaftar Nilai Mahasiswa");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-5s | %-15s | %-5s | %-10s\n", "No", "Nama", "Nilai", "Status");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d | %-15s | %-5d | %-10s\n", (i+1), nama[i], nilai[i], status[i]);
        }
    }
}
