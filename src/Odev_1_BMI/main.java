package Odev_1_BMI;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double boy, kilo, bmi, boy2;

        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz (metre cinsinden) : ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu Giriniz : ");
        kilo = inp.nextDouble();

        boy2 = boy * boy;
        bmi = kilo / boy2;

        System.out.println("Vücut Kitle Endeksiniz : " + bmi);

    }
}
