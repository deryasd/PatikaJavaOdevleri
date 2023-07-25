public class Main {
    public static void main(String[] args) {
        System.out.println("10 Elemanlı Fibonacci Serisi:");
        int birinciSayi = 0,ikinciSayi = 1;
        for(int i = 0; i < 5; i++){
            System.out.print(" " + birinciSayi  + " " + ikinciSayi);
            birinciSayi += ikinciSayi;
            ikinciSayi += birinciSayi;
        }
    }
}