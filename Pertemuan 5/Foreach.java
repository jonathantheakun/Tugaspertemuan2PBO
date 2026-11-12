package P6;

public class Foreach {
    public static void main(String[] args) {
        int[] angkaArray = {10, 20, 30, 40, 50};
        String[] namaBuah = {"Apel", "Mangga", "Jeruk"};

        System.out.println("Nilai angka:");
        for (int nilai : angkaArray) {
            System.out.println(nilai);
        }

        System.out.println("Nilai namaBuah:");
        for (String buah : namaBuah) {
            System.out.println(buah);
        }
    }
}
