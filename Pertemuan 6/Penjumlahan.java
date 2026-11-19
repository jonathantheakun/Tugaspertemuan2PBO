package TugasP6;
import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();
        
        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        
        System.out.println("Masukkan elemen Matriks 1:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks1[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan elemen Matriks 2:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks2[i][j] = input.nextInt();
            }
        }
        System.out.println("Hasil Penjumlahan Matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
