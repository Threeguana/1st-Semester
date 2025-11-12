public class ContohVariabel {
    public static void main(String[] args) {
        String hobby = "Bermain game";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umur = 19;
        double $ipk = 3.24, tinggi = 1.72;
        System.out.println(hobby);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Gender : " + jenisKelamin);
        System.out.println("Umur   : " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}
