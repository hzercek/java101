package Pratik_2_KDV;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Program 3 adımdan oluşacak; 1-Kullanıcıdan Kdv'siz tutar istenecek, 2-Kdv miktarı çıktı olarak gösterilecek(kdv sabit %18 alınacak), 3-kdv'li fiyat gösterilecek
        //Gelişmiş ver. fiyat 1000'den küçükse kdv %20 büyükse %8
        double tutar, kdvOran, kdv, wkdv;

        Scanner inp = new Scanner(System.in);
        System.out.print("KDV'siz Fiyatı Giriniz : ");
        tutar = inp.nextDouble();

        boolean sart1 = tutar <= 1000;
        kdvOran = sart1 ? 0.20 : 0.08;

        kdv = tutar * kdvOran;
        wkdv = tutar + kdv;

        System.out.println("Girilen tutar : " + tutar);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV tutarı : " + kdv);
        System.out.println("KDV'li Fiyat : " + wkdv);

    }
}
