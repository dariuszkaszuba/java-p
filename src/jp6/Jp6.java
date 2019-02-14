package jp6;
import java.util.Random;

public class Jp6 {
    public static void main(String[] args) {
        int pierwsza=((int)(Math.random()*10));
//        int druga=(int)Math.random();
////        if(pierwsza>druga)
//        System.out.println(pierwsza);
        Random rnd = new Random();
        int var1=rnd.nextInt(10)+1;
        System.out.println("var1 = " + var1);
        int var2=rnd.nextInt(10)+1;
        System.out.println("var2 = " + var2);
//        System.out.println(pierwsza);

        System.out.println(var1>var2);
        System.out.println(var1*2>var2);
    }
}
