package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        //1.uzdevums

        int summma = 0;
        Scanner scanner = new Scanner(System.in);
        int skaitlis;
        while (summma <= 100){
            System.out.println("1. Ievadi skaitli ");
            skaitlis = scanner.nextInt();
            summma = summma + skaitlis;
        }
        System.out.println(summma);
        System.out.println("Gatavs!");

        //2.uzdevums

        int pirmskaitlis;
        int parbaude = 0;
        System.out.println("2. Ievadi skaitli ");
        pirmskaitlis = scanner.nextInt();

        for(int a = 1; a <= pirmskaitlis; a++) {
            if( pirmskaitlis % a == 0){
                parbaude++;
            }
        }
        if(parbaude == 2) {
            System.out.println("Šis ir pimskaitlis");
        }
        else {
            System.out.println("Šis nav pirmskaitlis");
        }

        //3,uzdevums
        String[] vardi = {"Aija", "Inga", "Elza", "Laine", "Inese"};
        int[] cipari4 = {1,2,3,4};
        char[] limeni = {'A', 'B', 'C', 'D', 'E'};

        //while
        System.out.println("while");
        int a = 0;
        while (a < vardi.length){
            System.out.println(vardi[a]);
            a++;
        }
        int b = 0;
        while (b < cipari4.length){
            System.out.println(cipari4[b]);
            b++;
        }

        int c = 0;
        while (c < limeni.length){
            System.out.println(limeni[c]);
            c++;
        }

        //do while
        System.out.println("do while");
        int d = 0;
        do {
            System.out.println(vardi[d]);
            d++;
        } while (d < (vardi.length));

        int e = 0;
        do {
            System.out.println(cipari4[e]);
            e++;
        } while (e < (cipari4.length));

        int f = 0;
        do {
            System.out.println(limeni[f]);
            f++;
        } while (f < (limeni.length));

        //for loop
        System.out.println("for loop");
        for (int g = 0; g < vardi.length; g++) {
            System.out.println(vardi[g]);
        }

        for (int h = 0; h < cipari4.length; h++) {
            System.out.println(cipari4[h]);
        }

        for (int i = 0; i < limeni.length; i++) {
            System.out.println(limeni[i]);
        }

        //for each
        System.out.println("for each");
        for (String aa: vardi){
            System.out.println(aa);
        }

        for (int ab: cipari4){
            System.out.println(ab);
        }

        for (char ac: limeni){
            System.out.println(ac);
        }

        //4.uzdevums
        int[] masivsSimts = new int[100];
        for(int i = 0; i < masivsSimts.length; i=i+2){
            masivsSimts[i] = i + 2;
            System.out.print(" " + masivsSimts[i]);
        }

        //5.uzdevums
        aprekinatFaktorialu(5);

        //6.uzdevums
        final int pin = 1234;
        int ievaditaParole;
        for(int meginajums = 1; meginajums <= 3; meginajums++){
            System.out.println("Ievadiet PIN kodu");
            ievaditaParole = scanner.nextInt();
            if(ievaditaParole == pin) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
                break;
            }
            else {
                if(meginajums == 3) {
                    System.out.println("Atvainojiet, bet jūs esat bloķēts.");
                }
                else {System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");}
            }
        }

    }


//Metodes
    static void aprekinatFaktorialu(int skaitlisViens) {
        int faktorials = 1;
        for (int i = 1; i <= skaitlisViens; i++) {
            faktorials = faktorials * i;
        }
        System.out.println();
        System.out.println(skaitlisViens + "! = " + faktorials);
}

}
