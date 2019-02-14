package jp3;

public class Jp3 {
    public static void main(String[] args) {
        String zmienna1;
        String zmienna2;
        String zmienna3;
        String zmienna4;

        zmienna1="tresc1";
        zmienna2="tresc2";
        zmienna3=zmienna1+zmienna2;
        zmienna4=zmienna3+"sdkikio";
        System.out.println(zmienna3);
        System.out.println(zmienna3.toUpperCase());
        System.out.println(zmienna4.toLowerCase());
        System.out.println(zmienna4.length());

        System.out.println("index 2:" + zmienna3.charAt(2));
        System.out.println("index 5:" + zmienna3.charAt(5));
        System.out.println(zmienna4.charAt(zmienna4.length()-3));
        System.out.println(zmienna4.substring(0,6));
        System.out.println(zmienna4.substring(6,12));
    }
}
