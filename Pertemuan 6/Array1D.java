package TugasP6;

import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen" + i + ": ");
            arr[i] = input.nextInt();
        }
        
        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) { max = arr[i]; idxMax = i; }
            if (arr[i] < min) { min = arr[i]; idxMin = i; }
        }
        System.out.println("Nilai Terbesar: " + max + " (Indeks: " + idxMax + ")");
        System.out.println("Nilai Terkecil: " + min + " (Indeks: " + idxMin + ")");
        
        double total = 0, rata = total / n;
        for (int val : arr) total += val;
        System.out.println("Total Keseluruhan: " + total);
        System.out.println("Rata-rata: " + rata);
        
        int Gan = 0, Gen = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) Gan += arr[i]; 
            if (i % 2 == 0) Gen += arr[i]; 
        }
        System.out.println("Jumlah elemen indeks ganjil: " + Gan);
        System.out.println("Jumlah elemen indeks genap: " + Gen);
        
        System.out.print("Hasil penjumlahan indeks genap bernilai: ");
        if (Gen % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
        
        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
        
    }
}
