package TugasP3;
import java.util.Scanner; 

public class GayaSentripetal {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);    
        double m;    
        double v;    
        double r;    
        System.out.println("========Program Menghitung Gaya Sentripetal========");    
        System.out.print("Masukan Massa Benda (m) : ");    
        m = input.nextDouble();    
        System.out.print("Masukan Kecepatan Linier (v) : ");    
        v = input.nextDouble();    
        System.out.print("Masukan jari-jari lintasan lingkaran (r) : ");    
        r = input.nextDouble();    
        double f = m * (v * v) / r;    
        System.out.println("\n========Hasil Menghitung Gaya Sentripetal========");    
        System.out.println("Massa Benda (m) : " + m);    
        System.out.println("Kecepatan Linier (v) : " + v);    
        System.out.println("Jari-jari Lintasan Lingkaran (r) : " + r);    
        System.out.println("Gaya Sentriprtal (f) : " + f); 
    }
}
