package jp7;

public class Jp7 {
    public static void main(String[] args) {
        String name="Walenty";
        name.toUpperCase();

        System.out.println("Kim jestes");
        System.out.println(name.toUpperCase().charAt(name.length()-1)=='A' && !name.toUpperCase().equals("KUBA") ?  "kobieta" : "mezcyzna" );

        System.out.println(name.substring(name.length()-2).equals("BA") ? "zawiera BA na koncu" : "nie zawiera");
    }
}
