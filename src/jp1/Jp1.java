package jp1;

public class Jp1 {

    public static void main(String[] args) {
        String imie1 = "Brayan";
        String imie2 = "Jessica";
        String imie3 = "Janusz";

//        System.out.println(imie1 + ";" + imie2 + ";" + imie3);

        String word = "Lorem ipsum Lorem ipsum";
//        System.out.println(word.indexOf("ł"));
//        System.out.println(word.charAt(8));
//        System.out.println(word.length());/*
/*

        String word2="Header";
        System.out.println(word.equals(word2));
        System.out.println(word2.equals("Header"));
        System.out.println(!word2.equals("Header"));
*/

//        System.out.println(word.contains("ipsum"));
//        System.out.println(word.substring(6,11));
//        System.out.println(word.substring(6).length());
//        int myStringLeng= word.substring(6,11).length();
//        System.out.println("myStringLeng = " + myStringLeng);
        System.out.println(word.split(" ").length);
        String words [] = word.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);


        /*int x = 0;
        System.out.println(x);*/
    }
}
