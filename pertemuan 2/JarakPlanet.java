package TugasP2;

class JarakPlanet {
    public static void main(String[] args) {
        double Light = 300000;
        double Sun = 152100000;
        double Moon = 384400;
        double wt_moon = Moon / Light;
        double wt_sun = Sun / Light;

        System.out.println("Waktu tempuh bumi - bulan = " + wt_moon + " detik");
        System.out.println("Waktu tempuh bumi - matahari = " + wt_sun + " detik");
    }
}