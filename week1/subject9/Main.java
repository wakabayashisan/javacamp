package subject9;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 333;
        int sayi2 = 33;
        int sayi3 = 34;
        int enBuyuk = sayi1;

        if (enBuyuk<sayi2) {
            enBuyuk = sayi2;
        }

        if (enBuyuk<sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük = "+enBuyuk);
    }
}
