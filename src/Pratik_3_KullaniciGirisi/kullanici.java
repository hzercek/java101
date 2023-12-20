package Pratik_3_KullaniciGirisi;
import java.util.Scanner;

//Güzel bir pratik olduğunu düşünmek ile birlikte işlevsel değil yani kullanım alanı yok :)
public class kullanici {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz hatalıdır ! \n Lütfen Tekrar Giriş Yapınız !");

            System.out.print("Kullanıcı Adınız : ");
            {userName = inp.nextLine();
                if (userName.equals("patika")) {
                    System.out.print("Önceden Girdiğiniz bir kullanıcı adı yazdınız \n Lütfen yeni bir kullanıcı adı yazınız ! \n Kullanıcı Adınız : ");
                    userName = inp.nextLine();
                    //loop lazım henüz öğrenilmedi.
                } else {
                        System.out.print("Yeni Kullanıcı Adınız : " + userName);


                }}
            System.out.print("Şifreniz : ");
            {password = inp.nextLine();
                if (password.equals("java123")) {
                        System.out.print("Önceden Girdiğiniz bir şifre yazdınız \n Lütfen yeni bir şifre yazınız ! \n Şifreniz : ");
                        password = inp.nextLine();
                } else {
                        System.out.print("Yeni Şifreniz : " + password);
                }}
            System.out.print("Kullanıcı Bilgileriniz Oluşturuldu!");
        }

    }
}
