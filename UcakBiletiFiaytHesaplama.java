import java.util.Scanner;

public class UcakBiletifiyatHesaplama {
    public static void main(String[] args) {
        int mesafe , yas , yolculukTipi ;
        double tutar ;
        Scanner input = new Scanner(System.in); // Scanner tipi değişken tanımlanıyor.
        // Kullanıcıdan bilgiler alınıyor.
        System.out.print("Mesafeyi (KM) girin: ");
        mesafe = input.nextInt();
        System.out.print("Yaşı girin: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini girin (1 - Tek Yön, 2 - Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();

        //Hesaplamalar yapılıyor.
        //Mesafe (KM) başı ücret : 0.10 tl
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        if ( mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2 ) ) {

            tutar = mesafe * 0.10 ;
            if ( yas < 12 ) tutar *= 0.50 ; // %50 indirim
            if ( yas > 65 ) tutar *= 0.70 ; // %30 indirim
            if ( yas > 11 && yas < 24 ) tutar *= 0.90 ; // %10 indirim
            if ( yolculukTipi == 2 ) tutar *=1.6; // %20 indirim * 2
            System.out.println("Toplam Tutar = " + tutar + " TL");

        } else System.out.println("Hatalı giriş yaptınız. ");
    }
}
