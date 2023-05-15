package ucvedordetambolunensayibul;

import java.util.Scanner;

public class UceveDordeTamBolunenSayiBul {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Bu uygulama kullanıcı tarafından girilen\n" +
                           "Tam sayının 3'e ve 4'e tam bölünme durumunu kontrol eder.\n" +
                           "Bir tamsayı giriniz: ");
        int k=input.nextInt();
        System.out.println("-------------------------------------");
        int iterasyonAdet=0;
        int toplam=0;

        for (int i= 0; i<=k ; i++) {
            if (i %3 == 0 || i%4==0){
                toplam+=i;
                iterasyonAdet++;
                System.out.println("3'e ve 4'e Tam bölünebilen " + iterasyonAdet+ ".Sayı: "  + i);
            }

        }
        System.out.println("-------------------------------------");
        System.out.println("Rapor: Toplam: " + iterasyonAdet + " Sayı tam bölünebilmektedir.\n" +
                           "Sayıların Toplamı: " + toplam + "\n" +
                           "Aritmetik Ortalaması: " + toplam/iterasyonAdet+"\n" +
                           "=========by Mehmet Duran Kaya=========");

    }
    }

