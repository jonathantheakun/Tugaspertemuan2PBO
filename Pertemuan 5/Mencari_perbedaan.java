package P6;

public class Mencari_perbedaan {
    public static void main(String[] args) {
        System.out.println("i++");
        int i = 0;
        while (i++ < 3) { 
            System.out.println("Nilai i: " + i); 
        }

        System.out.println("++i");
        int j = 0;
        while (++j < 3) {
            System.out.println("Nilai j: " + j);
        }
    }
}