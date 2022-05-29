package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. uzdevums
        int x = 6;
        System.out.println(x > 2);
        System.out.println(x < 0);
        boolean vaiIrPatiess = ((x > 5) && (x <= 10));
        System.out.println(vaiIrPatiess);
        vaiIrPatiess = (!(x <= 5) && (x < 10));
        System.out.println(vaiIrPatiess);
        vaiIrPatiess = ((x == 0) && (x == 10));
        System.out.println(vaiIrPatiess);
        vaiIrPatiess = ((x * x) > 10);
        System.out.println(vaiIrPatiess);

        // 2.uzdevums

        System.out.println("Ievadi mēneša numuru: ");
        int menesisSkaitlis = scanner.nextInt();
        String menesaNosaukums;
        switch(menesisSkaitlis){
            case 1:
                menesaNosaukums="Janvāris";
                break;
            case 2:
                menesaNosaukums="Februāris";
                break;
            case 3:
                menesaNosaukums="Marts";
                break;
            case 4:
                menesaNosaukums="Aprīlis";
                break;
            case 5:
                menesaNosaukums="Maijs";
                break;
            case 6:
                menesaNosaukums="Jūnijs";
                break;
            case 7:
                menesaNosaukums="Jūlijs";
                break;
            case 8:
                menesaNosaukums="Augusts";
                break;
            case 9:
                menesaNosaukums="Septembris";
                break;
            case 10:
                menesaNosaukums="Oktobris";
                break;
            case 11:
                menesaNosaukums="Novembris";
                break;
            case 12:
                menesaNosaukums="Decembris";
                break;
            default:
                menesaNosaukums="nezināms mēnesis";
        }
        System.out.println(menesaNosaukums);

        // 3.uzdevums

        int a = 4;
        int b = 6;
        int c = 9;
        if (a >= b && a >= c) {
            System.out.println(a + " ir lielākais skaitlis");
        }
        else if (b >= a && b >= c) {

            System.out.println(b + " ir lielākais skaitlis");
        }else {
            System.out.println(c + " ir lielākais skaitlis");
        }

        // 4.uzdevums
        String krasa = "zaļa";
        if (krasa.equals("sarkana")){
            System.out.println("Jāstāv, nedrīkst iet pāri ceļam");
        }else if (krasa.equals("dzeltena")){
            System.out.println("Jāgaida, nedrīkst iet pāri ceļam");
        }else if (krasa.equals("zaļa")){
            System.out.println("Drīkst iet pāri ceļam");
        } else{
            System.out.println("Ja nebrauc mašīnas, drīkst iet pāri ceļam");
        }

        // 5.uzdevums
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        // 6.uzdevums
        printBusinessCardTwo("Aija", "Bērziņa", "+371 22445587", 1987);
        printBusinessCardTwo("Jānis", "Krūms", "+371 28780800", 1958);

        // 7.uzdeuvms
        int summa = sum(4,7);
        System.out.println(summa);

        // 8.uzdevums
        System.out.println(average(6,5,8));


    }
   //5. uzdevums
    static void printBusinessCard(){
        System.out.println("Vizītkarte");
        System.out.println("---------");
        System.out.println("Vārds: Agita");
        System.out.println("Uzvārds: Kārklīte");
        System.out.println("Telefona numurs: +371 29890633");
        System.out.println("Dzimšanas gads: 1992");
        System.out.println("---------");
    }
    // 6.uzdevums
    static void printBusinessCardTwo(String vards, String uzvards,String telefons, int dzimsanasGads ){
        System.out.println("Otrā vizītkarte");
        System.out.println("---------");
        System.out.println("Vārds: " + vards);
        System.out.println("Uzvārds: " + uzvards);
        System.out.println("Telefona numurs: " + telefons);
        System.out.println("Dzimšanas gads: " + dzimsanasGads);
        System.out.println("---------");
    }

    // 7.uzdevums
    static int sum (int a, int b){
        return a+b;
    }

    // 8.uzdevums
    static double average(double a, double b, double c){
        return (a+b+c)/3;
    }
}
