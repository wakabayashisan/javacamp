package subject14;

public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Kaan";
        String ogrenci2 = "Ozgur";
        String ogrenci3 = "Yagiz";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Kaan";
        ogrenciler[1] = "Ozgur";
        ogrenciler[2] = "Yagiz";

        for (int i=0;i<ogrenciler.length;i++)
            System.out.println(ogrenciler[i]);
    }
}
