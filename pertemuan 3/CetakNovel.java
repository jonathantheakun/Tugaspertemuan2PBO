package TugasP3;
import java.util.Scanner; 

public class CetakNovel { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan banyak novel: "); 
        int jumlahNovel = input.nextInt(); 
        System.out.print("Masukkan jumlah lembar per novel: "); 
        int lembarPerNovel = input.nextInt(); 
        
        long totalDetik = (long) jumlahNovel * lembarPerNovel; 
        long hari = totalDetik / 86400; 
        totalDetik %= 86400; 
        long jam = totalDetik / 3600; 
        totalDetik %= 3600; 
        long menit = totalDetik / 60; 
        long detik = totalDetik % 60; 
        
        System.out.println("\nWaktu yang diperlukan:"); 
        System.out.println("Hari : " + hari); 
        System.out.println("Jam : " + jam); 
        System.out.println("Menit : " + menit); 
        System.out.println("Detik : " + detik); 
    } 
}
