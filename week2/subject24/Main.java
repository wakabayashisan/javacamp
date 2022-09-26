package subject24;

public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 3, 7, 9};
        int aranacak = 3;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("Sayı mevcuttur.: " + aranacak);
        } else {
            mesajVer("Sayı mevcut değildir." + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}