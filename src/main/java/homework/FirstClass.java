package homework;

public class FirstClass {
    public static void main(String[] args) {
        //šis ir Agita Kārklīte mājas darbs

        int iedzSkaits = 1330068;
        String nosaukums = "Igaunija";
        int platiba = 45339;
        String galvaspilseta = "Tallina";
        String valoda = "Igauņu";
        boolean vaiIrEsDalibvalsts=true;
        char valuta = 'E';
        String teikums = String.format("Valsts nosaukums: %s \n Iedzīvotāju skaits %s \n Platība %s \n Vai ir ES dalībvalsts %s",nosaukums,iedzSkaits,platiba,vaiIrEsDalibvalsts);
        String otraisTeikums = String.format("Galvaspilsētā %s Iedzīvotāji runā %s un maksā ar %s",galvaspilseta,valoda,valuta);
        String tresaisTeikums = String.format("Galvaspilsētā %s cilvēkiem interesē vai %s ir ES dalībvalsts %s",galvaspilseta,nosaukums,vaiIrEsDalibvalsts);

        System.out.println(nosaukums);
        System.out.println(iedzSkaits);
        System.out.println(platiba+"km2");
        System.out.println(galvaspilseta);
        System.out.println(valoda);
        System.out.println(vaiIrEsDalibvalsts);
        System.out.println(valuta);
        System.out.println(teikums);
        System.out.println(otraisTeikums);
        System.out.println(tresaisTeikums);

        //Aritmētiskie operatori
        //Saskaitīšana
        int saskaitisana;
        int saskaitisana1;
        int saskaitisana2;
        //Atņemšana
        int atnemsana;
        int atnemsana1;
        int atnemsana2;
        //Reizināšana
        int reizinasana;
        int reizinasana1;
        int reizinasana2;
        //Dalīšana
        double dalisana;
        double dalisana1;
        double dalisana2;
        //Atlikums
        int atlikums;
        int atlikums1;
        int atlikums2;

        int a=4;
        int b=9;
        int c = 6;

        double d=2;
        double e=11;
        double f=5;

        saskaitisana1 = a + b;
        saskaitisana2 = b + c;
        saskaitisana = a + c + b;
        atnemsana1 = c - a;
        atnemsana2 = (b - c) + a;
        atnemsana = b - a;
        reizinasana = (a * b) + (b * c);
        reizinasana1 = a * c;
        reizinasana2 = b * c;
        dalisana1 = e / a - d;
        dalisana2 = f / d;
        dalisana = b / d;
        atlikums = 14%5;
        atlikums1 = 22%4;
        atlikums2 = 15%2;


        System.out.println("Summa1 " + saskaitisana1);
        System.out.println("Summa2 " + saskaitisana2);
        System.out.println("Summa " + saskaitisana);
        System.out.println("Starpiba1 " + atnemsana1);
        System.out.println("Starpiba2 " + atnemsana2);
        System.out.println("Starpiba " + atnemsana);
        System.out.println("Reizinājums1 " + reizinasana1);
        System.out.println("Reizinājums2 " + reizinasana2);
        System.out.println("Reizinājums " + reizinasana);
        System.out.println("Dalījums " + dalisana);
        System.out.println("Dalījums1 " + dalisana1);
        System.out.println("Dalījums2 " + dalisana2);
        System.out.println("Atlikums " + atlikums);
        System.out.println("Atlikums1 " + atlikums1);
        System.out.println("Atlikums2 " + atlikums2);





    }
}
