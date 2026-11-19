package TugasP3; 
import java.io.*; 

public class MenghitungBelanja { 
    public static void main(String[] args) throws Exception { 
        DataInputStream dis = new DataInputStream(System.in); 
        
        System.out.print("Nama: "); 
        String nama = dis.readLine(); 
        System.out.print("Total Belanja: "); 
        double totalBelanja = Double.parseDouble(dis.readLine()); 
        System.out.print("Diskon (%): "); 
        double diskon = Double.parseDouble(dis.readLine()); 
        double total = totalBelanja - (totalBelanja * diskon / 100); 
        System.out.print("Bayar: "); 
        double bayar = Double.parseDouble(dis.readLine()); 
        double kembalian = bayar - total; 
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("belanja.txt")); 
        dos.writeUTF(nama); 
        dos.writeDouble(totalBelanja); 
        dos.writeDouble(diskon); 
        dos.writeDouble(total);
        dos.writeDouble(bayar);
        dos.writeDouble(kembalian);
        dos.close();
    } 
}