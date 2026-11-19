package TugasP3;
import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jam pertama: ");
        int jam1 = sc.nextInt();
        System.out.print("Masukkan menit pertama: ");
        int menit1 = sc.nextInt();
        
        System.out.print("Masukkan jam kedua: ");
        int jam2 = sc.nextInt();
        System.out.print("Masukkan menit kedua: ");
        int menit2 = sc.nextInt();
        
        // Ubah ke total menit 
        int totalMenit1 = jam1 * 60 + menit1; 
        int totalMenit2 = jam2 * 60 + menit2; 
        
        // Hitung selisih (pakai Math.abs biar tidak negatif) 
        int selisih = Math.abs(totalMenit2 - totalMenit1); 
        
        // Konversi kembali ke jam dan menit 
        int selisihJam = selisih / 60; 
        int selisihMenit = selisih % 60; 
        
        System.out.println("\n===== HASIL SELISIH WAKTU ====="); 
        System.out.println("Waktu pertama : " + jam1 + ":" + menit1); 
        System.out.println("Waktu kedua : " + jam2 + ":" + menit2); 
        System.out.println("Selisih : " + selisihJam + " jam " + selisihMenit + " menit"); 
        System.out.println("============================="); 
    } 
}
