package OrtalamaHesaplama;

import java.util.Scanner;

public class Ortalama_Hesaplama {

    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, turkce, ingilizce;

        Scanner input = new Scanner(System.in);

        System.out.printf("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.printf("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.printf("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.printf("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.printf("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.printf("İngilizce notunuzu giriniz: ");
        ingilizce = input.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce + ingilizce);
        double sonuc = toplam / 6.0;
        String gectiMi = (sonuc > 60) ? "Tebrikler, geçtiniz!" : "Üzgünüz, kaldınız!";

        System.out.println("Not ortalamanız: " + sonuc);
        System.out.printf(gectiMi);
    }

}
