package TugasP4;
import java.util.Scanner;
public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== MENU HITUNG LUAS BANGUN DATAR ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = input.nextInt();
        double luas = 0;
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                break;
            case 2: 
                System.out.print("Masukkan alas segitiga: "); 
                double alas = input.nextDouble(); 
                System.out.print("Masukkan tinggi segitiga: "); 
                double tinggi = input.nextDouble(); 
                luas = 0.5 * alas * tinggi; 
                break; 
            case 3: 
                System.out.print("Masukkan jari-jari lingkaran: "); 
                double r = input.nextDouble(); 
                luas = Math.PI * r * r; 
                break; 
            case 4: 
                System.out.print("Masukkan sisi sejajar 1: "); 
                double a = input.nextDouble(); 
                System.out.print("Masukkan sisi sejajar 2: "); 
                double b = input.nextDouble(); 
                System.out.print("Masukkan tinggi trapesium: "); 
                double t = input.nextDouble(); 
                luas = 0.5 * (a + b) * t; 
                break; 
            case 5: 
                System.out.print("Masukkan diagonal 1: "); 
                double d1 = input.nextDouble(); 
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble(); 
                luas = 0.5 * d1 * d2; 
                break; 
            default: 
                System.out.println("Pilihan tidak tersedia."); 
                input.close(); 
                return; 
        } 
        
        // Mencetak luas secara langsung tanpa pembulatan atau format apapun 
        System.out.println("Luas bangun datar adalah: " + luas); 
        input.close(); 
    } 
}
