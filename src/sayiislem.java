import java.util.Scanner;
public class sayiislem {
    public static void sayiislem(int sayi) {
        // Sayı negatif veya 0 ise işlemi sonlandır ve 5 ekleyerek tekrar başlat
        if (sayi <= 0) {
            System.out.println("Sayı: " + sayi);
            sayiislem(sayi + 5);
        } else {
            // Sayı pozitif ise 5 çıkar ve sonucu yazdır
            System.out.println("Sayı: " + sayi);
            sayiislem(sayi - 5);
        }
    }
}