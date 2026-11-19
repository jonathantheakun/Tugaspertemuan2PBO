package TugasP4;
import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = input.nextDouble();
        System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
        String punyaMember = input.next().toLowerCase();
        double diskon = 0;
        
        if (punyaMember.equals("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {    
                diskon = 10000;    
            } 
        } // <-- Kurung kurawal penutup else ditambahkan di sini
        
        double totalAkhir = totalBelanja - diskon; 
        
        // Mencetak langsung tanpa format 
        System.out.println("\nTotal Belanja : Rp " + (long) totalBelanja); 
        System.out.println("Diskon : Rp " + (long) diskon); 
        System.out.println("Total Bayar : Rp " + (long) totalAkhir); 
        
        System.out.print("\nMasukkan uang yang diberikan (Rp): ");
        double uangDiberikan = input.nextDouble();
        double kembalian = uangDiberikan - totalAkhir;
        
        if (kembalian >= 0) {
            System.out.println("Kembalian : Rp " + (long) kembalian);
        } else {
            // Math.abs() untuk membuat angka minus menjadi positif 
            System.out.println("Uang kurang : Rp " + (long) Math.abs(kembalian)); 
        } 
        input.close();
    }
}
