package TugasP3;  
import java.util.Scanner;  

public class GajiBersih {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        String no_induk,nama,alamat,jabatan; 
        double gapok = 2000000;  
        double tuja = 300000;  
        double tuis = 200000;  
        double tunak = 150000;  
        double totGaji = gapok + tuja + tuis + tunak;  
        double pajak = 0.10 * (2000000 + 300000 + 150000);  
        double gaber = totGaji - pajak; 
       
        System.out.print("Masukan Nomor Induk Karyawan : ");  
        no_induk = input.nextLine();  
        System.out.print("Masukan Nama Karyawan  : ");  
        nama = input.nextLine();  
        System.out.print("Masukan Alamat Karyawan  : ");  
        alamat = input.nextLine(); 
        System.out.print("Masukan Jabatan Karyawan  : "); 
        jabatan = input.nextLine(); 
        input.nextLine(); 
        
        System.out.println("Hasilnya :"); 
        System.out.println("Nomor Induk Karyawan : " + no_induk); 
        System.out.println("Nama Karyawan  : " + nama); 
        System.out.println("Alamat Karyawan  : " + alamat); 
        System.out.println("Jabatan Karyawan  : " + jabatan); 
        System.out.println("Gaji Pokok Karyawan : Rp." + gapok); 
        System.out.println("Tunjangan Jabatan : Rp." + tuja); 
        System.out.println("Tunjangan Istri  : Rp." + tuis); 
        System.out.println("Tunjangan Anak  : Rp." + tunak); 
        System.out.println("Total Gaji  : Rp." + totGaji); 
        System.out.println("Pajak penghasilan  : Rp." + pajak); 
        System.out.println("Gaji Bersih  : Rp." + gaber); 
    } 
}