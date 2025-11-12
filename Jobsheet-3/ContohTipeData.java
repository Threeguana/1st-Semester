public class ContohTipeData {
    public static void main(String[] args) {
        char golonganDarah = 'A';
        byte jarak = (byte) 130;
        short jmlPenduduk = 1025;
        float suhu = 60.5F;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah: " + (byte) golonganDarah);
        System.out.println("Jarak  : " + jarak);
        System.out.println("Jumlah : " + jmlPenduduk);
        System.out.println("Suhu   : " + suhu);
        System.out.println("Berat  : " + (float) berat);
        System.out.println("Saldo  : " + saldo);
        System.out.println("Angka desimal: " + angkaDesimal);
    }
}
