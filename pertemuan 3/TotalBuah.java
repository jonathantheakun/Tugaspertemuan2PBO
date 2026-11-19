package TugasP3;
import java.io.*; 

public class TotalBuah { 
    public static void main(String[] args) { 
        try { 
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            
            // Menginput data 
            System.out.print("Jumlah mangga yang dibeli: "); 
            int mangga = Integer.parseInt(br.readLine()); 
            System.out.print("Jumlah jambu per tetangga: "); 
            int jambuPerTetangga = Integer.parseInt(br.readLine()); 
            System.out.print("Jumlah tetangga: "); 
            int tetangga = Integer.parseInt(br.readLine()); 
            System.out.print("Jumlah mangga busuk: "); 
            int manggaBusuk = Integer.parseInt(br.readLine()); 
            
            int totalJambu = jambuPerTetangga * tetangga; 
            int manggaBersih = mangga - manggaBusuk; 
            int totalBuah = manggaBersih + totalJambu; 
            
            // Output hasil 
            System.out.println("\n===== HASIL PERHITUNGAN BUAH ======"); 
            System.out.println("Mangga dibeli : " + mangga); 
            System.out.println("Mangga busuk : " + manggaBusuk); 
            System.out.println("Mangga bersih : " + manggaBersih); 
            System.out.println("Total jambu : " + totalJambu); 
            System.out.println("TOTAL BUAH : " + totalBuah); 
            System.out.println("==========================="); 
        } catch (IOException e) { 
            System.out.println("Terjadi kesalahan input/output: " + e.getMessage()); 
        } 
    }
}
