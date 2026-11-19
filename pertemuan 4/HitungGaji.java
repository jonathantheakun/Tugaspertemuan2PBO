package TugasP4; // <-- Tambahan package
import java.util.Scanner;
public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIK: ");
        String nik = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int golongan = input.nextInt();
        System.out.print("Masukkan Status Pernikahan (menikah/belum/cerai): ");
        String status = input.next().toLowerCase();
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();
        double gajiPokok = 0;
        
        // Menentukan Gaji Pokok
        switch (golongan) {
            case 1: gajiPokok = 1200000; break;
            case 2: gajiPokok = 1500000; break;
            case 3: gajiPokok = 1750000; break;
            case 4: gajiPokok = 2000000; break; 
            default: System.out.println("Golongan tidak valid"); 
        } // <-- Kurung kurawal switch ditutup di sini
        
        // Menghitung Tunjangan 
        double tunjanganPasangan = 0; 
        if (status.equals("menikah")) { 
            tunjanganPasangan = 0.10 * gajiPokok; 
        } // <-- Karakter '丼' diganti jadi '}' di sini
        
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak; 
        
        // Menghitung Gaji Bersih 
        double gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak; 
        
        // Output tanpa format (menggunakan casting (long) agar tidak ada .0) 
        System.out.println("\n--- Rincian Gaji ---"); 
        System.out.println("Nama : " + nama); 
        System.out.println("Gaji Pokok : Rp " + (long) gajiPokok); 
        System.out.println("Tunj. Pasangan : Rp " + (long) tunjanganPasangan); 
        System.out.println("Tunj. Anak : Rp " + (long) tunjanganAnak); 
        System.out.println("Gaji Bersih : Rp " + (long) gajiBersih); 
        input.close();
    }
}
