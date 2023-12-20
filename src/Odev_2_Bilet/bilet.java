package Odev_2_Bilet;
import java.util.Scanner;
public class bilet {
    public static void main(String[] args) {
        int mesafe, yas, yolcuTipi;
        double yasIndirimi, roundIndirimi, tutar, mesTutar, yasInTutar, roundInTutar;
        boolean isError = false;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();
        if ((mesafe <= 0) || (yas <= 0)) {
            isError = true;
        }
        System.out.print("Yolculuk tipini giriniz ( 1-> Tek Yön, 2-> Gidiş-Dönüş) : ");
        yolcuTipi = inp.nextInt();

        if (yas < 12) {
            yasIndirimi = 0.5;
        } else if ((yas >= 12) && (yas <= 24)) {
            yasIndirimi = 0.1;
        } else if (yas > 65) {
            yasIndirimi = 0.3;
        } else {
            yasIndirimi = 0;
        }

        if (yolcuTipi==2) {
            roundIndirimi = 0.2;
        } else {
            roundIndirimi = 0;
        }

        mesTutar = mesafe * 0.1;
        yasInTutar = mesTutar * yasIndirimi;
        if (yasInTutar <= 0){
            roundInTutar = mesTutar * roundIndirimi;
        } else {
            roundInTutar = (mesTutar - yasInTutar) * roundIndirimi;
        }
        tutar = 0;

        if (yolcuTipi==1) {
            tutar = mesTutar - yasInTutar;
        } else if (yolcuTipi==2) {
            tutar = (mesTutar - yasInTutar - roundInTutar) * 2;
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı veri girdiniz !");
        } else{
            System.out.println("Toplam Tutar = " + tutar + " TL");
        }
    }
}
