package TugasP4; 
import java.util.Scanner; 
public class GanjilGenap { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan sebuah bilangan: "); 
        int angka = input.nextInt(); 
        if (angka % 2 == 0) { 
            System.out.println("Bilangan " + angka + " adalah Genap."); 
        } else { 
            System.out.println("Bilangan " + angka + " adalah Ganjil."); 
        } 
        input.close(); 
    } 
}
