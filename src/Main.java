import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, toplam = 0, adet = 0 ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        k = inp.nextInt();
        // 3'e ve 4'e kalansız bölünenleri bulup aralarında toplayıp sonra bölüyoruz.
        for (int i=0; i<=k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                adet++;
            }
        }
        // Eğer girilen aralıkta 3'e ve 4'e tam bölünen sayı bulunursa ekrana yazdırıyor.
        if (adet != 0) {
            double ort = (double) toplam / adet ;
            System.out.println("Sonuç : " + ort);
        } else {
            System.out.println("Hatalı giriş sayı bulunamadı.");
        }
    }
}