package TugasP4;
import java.util.Scanner;
public class Salesman {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String nama; 
        double totalJual, uangJasa, komisi, pendapatan; 
        
        System.out.print("Masukan nama salesman : "); 
        nama = i.nextLine(); 
        System.out.print("Masukan jumlah total jual : Rp."); 
        totalJual = i.nextDouble(); // <-- Hanya ini yang diubah dari nextLine ke nextDouble
        
        if(totalJual == 2000000){ 
            uangJasa = 100000; 
        } else if (totalJual > 2000000 && totalJual <= 5000000){ 
            uangJasa = 200000; 
        } else if (totalJual > 5000000) { 
            uangJasa = 300000; 
        } else { 
            System.out.println("Salesman tidak mendapatkan uang komisi dan uang jasa"); 
            System.out.println("Pendapatan salesman : " + 0); 
            return; 
        } 
        komisi = 0.10 * totalJual; 
        pendapatan = uangJasa + komisi; 
        
        System.out.println("Nama salesman : " + nama); 
        System.out.println("Jumlah total jual : " + totalJual); 
        System.out.println("Uang jasa : " + uangJasa); 
        System.out.println("Komisi : " + komisi);
        System.out.println("Pendapatan salesman : " + pendapatan); 
    }
}
