package TugasP4;
import java.util.Scanner;
public class TahunKabinat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Tahun " + tahun + " adalah Tahun Kabisat.");
        } else {
            System.out.println("Tahun " + tahun + " BUKAN Tahun Kabisat.");
        }
        input.close();
    }
}

