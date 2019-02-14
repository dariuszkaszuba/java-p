package start;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

// psvm public static void main
//ctrl + shift + f10 -run
//Ctrl +shoft + / komentarz calego
//ctr;+D duplikowanie

public class Hello {
    public static void main(String[] args) {
        System.out.println("JRE Version: "+System.getProperty("java.runtime.version"));
//        jaki JDK

        int lunchTime = 123456;
        int endTimer = -444444;
        System.out.println(lunchTime);
        System.out.println(endTimer);

        double salary = 2100.99;
        System.out.println(salary);
        char signA = 'A';
        char sign9 = '9';
        char signTab = '\'';
        char spacja = ' ';
        System.out.println(signA);
        System.out.println(sign9);
        System.out.println(signTab);
        System.out.println(spacja);
//        System.out.println("signTab = " + signTab);

        boolean flag=true;
        boolean isLunch=false;
        System.out.println(true);

        System.out.println("isLunchrowna = " + isLunch);
;    }
}
