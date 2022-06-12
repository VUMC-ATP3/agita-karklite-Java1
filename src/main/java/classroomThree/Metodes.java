package classroomThree;

import java.util.Scanner;

public class Metodes {

    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);
        int b = 9;
        int a = kvadrataLaukums(3);
        float c = taisnsturaLaukums(3.4F,5.3F);
        printetTekstu(a,c);
        printetTekstu(a,c);
        System.out.println(prettyPrint("sssss"));

    }

    static String prettyPrint(String a){
        return "asdad" + a + "sksks";
    }

    static void printetTekstu(int lala, float bebe){
        System.out.println("Kvadrāta Laukums " + lala);
        System.out.println("taisnstūra laukums " + bebe);
    }

    static float taisnsturaLaukums(float a, float b){
        float s = a*b;
        return s;
    }


    //metode, kas aprēķina kvadrāta laukumu
    //int - tips,ko atgriž
    //kvadrataLaukums - metodes nosaukums
    //int mala - arguments/parametrs
    static int kvadrataLaukums(int mala){
        int laukums = mala * mala;
        return laukums;
    }
}
