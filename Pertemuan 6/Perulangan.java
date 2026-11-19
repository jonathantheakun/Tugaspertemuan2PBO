package TugasP6;

public class Perulangan {
    public static void main(String[] args) {
        int[] age = {23, 4, 10, 2, 6};
        System.out.println("Menggunakan For Loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.println("Menggunakan For Each Loop:");
        for (int a : age) {
            System.out.print(a + " ");
        }
    }
}
