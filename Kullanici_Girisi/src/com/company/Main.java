package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String userName, password;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız :");
        userName = sc.nextLine();

        System.out.println("Şifreniz :");
        password = sc.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        }else{
            int a;
            System.out.println("Bilgileriniz Yanlış ! Şifrenizi değiştirmek için 1 yazınız. Programdan çıkmak için 2 yazınız.");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    int b;
                    System.out.println("Yeni şifrenizi yazınız.");
                    b = sc.nextInt();
                    if(password.equals(b)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        break;
                    }else
                        System.out.println("Şifre oluşturuldu");
                        password.equals(b);
                    break;
                case 2:
                    System.out.println("Şifre oluşturulmadı.");
                    break;
            }

        }
    }
}
