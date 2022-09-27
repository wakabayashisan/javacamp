package subject25;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava sıcaktı.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(33, 7);
        System.out.println(sayi);
    }

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void guncelle() {
        System.out.println("Güncellendi.");

    }

    public static int topla(int sayi1, int sayi2){
        return 7;
    }

    public static String sehirVer() {
        return "İstanbul";

    }
}
