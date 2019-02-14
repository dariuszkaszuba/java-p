package jp4;

public class Jp4 {
    public static void main(String[] args) {
        String wyraz ="Ala ma kota kot ma ale";
        String podzial [] =wyraz.split(" ");
//        System.out.println(podzial[0]);
//        System.out.println(podzial[1]);
//        System.out.println(podzial[2]);

//        for(String wyr: podzial){
//            System.out.println(wyr);
//        }

        for(int i=0; i<podzial.length; i++){
            System.out.println(podzial[i]);
        }
    }
}
