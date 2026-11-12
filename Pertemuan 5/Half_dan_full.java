package P6;

public class Half_dan_full {
    public static void main(String[] args) {
        System.out.println("Half Triangle");
        // Half Triangle
        for (int i = 1; i <= 5; i++) {
            for (int spasi = 1; spasi <= 5 - i; spasi++) {
                System.out.print(" ");
            }
            for (int bintang = 1; bintang <= (2 * i) - 1; bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Full Triangle");
        // Full Triangle (Bagian Atas)
        for (int i = 1; i <= 5; i++) {
            for (int spasi = 1; spasi <= 5 - i; spasi++) {
                System.out.print(" ");
            }
            for (int bintang = 1; bintang <= (2 * i) - 1; bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Full Triangle (Bagian Bawah)
        for (int i = 4; i >= 1; i--) {
            for (int spasi = 1; spasi <= 5 - i; spasi++) {
                System.out.print(" ");
            }
            for (int bintang = 1; bintang <= (2 * i) - 1; bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
