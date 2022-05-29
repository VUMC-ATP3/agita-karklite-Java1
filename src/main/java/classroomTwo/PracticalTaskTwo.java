package classroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi savu vārdu!");
//        String name = scanner.nextLine();
//        System.out.println("Ievadi savu vecumu");
//        int age = scanner.nextInt();
//        System.out.println("Esi sveicināta: " + name + "!");
//        System.out.println(String.format("Esi sveicināta: %s", name));
//        System.out.println("Jūsu vecums ir: " + age);

//        System.out.println("Ievadi pirmo skaitli!");
//        int a = scanner.nextInt();
//        System.out.println("Ievadi otro skaitli!");
//        int b = scanner.nextInt();
//        int summa = a + b;
//        System.out.println("Skaitļu summa ir= " + summa);

        int a = 5;
        int b = 10;
        int c = 5;
        int d = 11;
        //Lielāks >
        System.out.println(b > a); //true
        System.out.println(a > b); //false
        //Mazaķs
        System.out.println(a < b); //true
        System.out.println(b < a); //false
        //Vienāds
        System.out.println(a == c); //true
        System.out.println(a == b); //false
        //nav vienāds
        System.out.println(a != b); //true
        System.out.println(a != c); //false
        //mazāks vienāds
        System.out.println(a <= c); //true
        //lielāks vienāds >=
        System.out.println(b >= d); //false

        int vecums = 18;
        boolean vaiDrikstBalsot = (vecums >= 18);
        System.out.println("vai cilvēks drīkst balsot? " + vaiDrikstBalsot);

        String name = "Juris";
        String secondName = "Jānis";
        boolean vaiVardiSakrīt = (name.equals(secondName));
        System.out.println("vai vardi sakrit? " + vaiVardiSakrīt);

        System.out.println();

        int e = 4;

        boolean vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = ((e < 5) && (e < 10)); //un loģiskais nē
        System.out.println(vaiIrPatiess);

        vaiIrPatiess = ((e < 5) || (e < 10)); //vai
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = (!(e < 5));
        System.out.println(vaiIrPatiess);

        System.out.println(!(false==true));

        int vecumsDivi = 17;

        if (vecumsDivi >= 18)
        {
            System.out.println("Cilvēks drikst balsot");
            System.out.println("Cilvēks drikst balsot");
        }
        else
        {
            System.out.println("Cilvēks nedrikst balsot");
            System.out.println("Cilvēks nedrikst balsot");
            System.out.println("Cilvēks nedrikst balsot");
        }

        System.out.println("Koda turpinājums");
        System.out.println("Ievadi savu vecumu..");
        int vecumsTris = scanner.nextInt();
        if(vecumsTris>=18)
        {
            System.out.println("Cilvēks drīkst balsot");
        }else{
            System.out.println("Cilvēks nedrīkst balsot");
        }


        System.out.println("Koda turpinājums");

        System.out.println("Ievadi skaitli..");
        int skaitlisViens = scanner.nextInt();
        if(skaitlisViens==10){
            System.out.println("Printējam skaitli 10");
        }else if(skaitlisViens==15){
            System.out.println("Printējam skaitli 15");
        } else if(skaitlisViens==20){
            System.out.println("Printējam skaitli 20");
        } else {
            System.out.println("Skaitlis ir nezināms");
        }

        System.out.println("Koda turpinājums");

        //Jānodefinē cilvēks

        vecums = 66;
        char dzimums = 'V';

        if (dzimums == 'V' && vecums >= 65){
            System.out.println("Vīrieši drīkst doties pensijā no 65");
        }
        else if (dzimums == 'S' && vecums >= 60){
            System.out.println("Sievietes drīkst doties pensijā no 60");
        }
        else{
            System.out.println("Nedrīkst doties pensijā");

            System.out.println("Koda turpinājums");
        }

// ar boolean
        int cilvekaVecums = 65;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        }
        else if (cilvekaVecums >=60 && cilvekaDzimums == 'S'){
            drikstDotiesPensija = true;
        }

        if(drikstDotiesPensija){
            System.out.println("Cilveks drikst doties pensija!");
        }
        System.out.println("Koda turpinājums");

        int diena = 6;
        String dienasVards;

        switch(diena){
            case 1:
                dienasVards="Pirmdiena";
                break;
            case 2:
                dienasVards="Otrdiena";
                break;
            case 3:
                dienasVards="Trešdiena";
                break;
            case 4:
                dienasVards="Ceturtdiena";
                break;
            case 5:
                dienasVards="Piektdiena";
                break;
            case 6:
                dienasVards="Sestdiena";
                break;
            case 7:
                dienasVards="Svētdiena";
                break;
            default:
                dienasVards="Nezinama diena";
        }
        System.out.println(dienasVards);

//Uzdevumi
        System.out.println("Ievadi skaitli..");
        int veselsSkaitlis = scanner.nextInt();

        if (veselsSkaitlis > 0) {
            System.out.println("Lielāks par 0");
        }
        else {
            System.out.println("Mazāks par 0");
        }


        int skaitlisJauns = 5;
        if(skaitlisJauns%2==0){
            System.out.println("Skaitlis ir para skaitlis");
        }else{
            System.out.println("Skaitlis ir nepara skaitlis");
        }





    }


}
