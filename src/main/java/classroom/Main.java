package classroom;

public class Main {

    public static void main(String[] args) {
        int vecumsSuns = 3; //vesels skaitlis
        String vardsSuns = "Reksis"; //teksts
        //(mainīgā tips) (mainīgā nosaukums) = (vērtība);
        double svarsSuns = 15.8; //daļskaitlis
        float augums = 60.2F; //daļskaitlis
        boolean irIzsalcis=true; //true=1 ; false=0
        boolean irSkirnesSuns = false;
        char dzimums = 'V';
        char dzimums2 = 'S';
        char vaditajaKategorija = 'B';




        System.out.println("Mans suns");
        System.out.println("Vecums");
        System.out.println(vecumsSuns+"\n");
        System.out.println("Vārds");
        System.out.println(vardsSuns);
        System.out.println("Mana suņa svars");
        System.out.println(svarsSuns+" kg");
        System.out.println();
        System.out.println("Mans suņa augstums"+ " " + augums + " cm");
        System.out.println("Vai mans suns ir izsalcis?");
        System.out.println(irIzsalcis);
        System.out.println("Vai mans suns ir skirnes suns");
        System.out.println(irSkirnesSuns);

        int vecumsKakis = 3;
        String vardsKakis = "Cika";

        System.out.println("Mans Kakis");
        System.out.println("Vecums");
        System.out.println(vecumsKakis);
        System.out.println("Vārds");
        System.out.println(vardsKakis);

        System.out.println("Kaķa un suņa kopējais vecums ir:");
        System.out.println(vecumsSuns+vecumsKakis);
        System.out.println(vardsKakis+" "+vardsSuns);

        System.out.println("Hello Agita");

        //(mainīgā tips) (mainīgā nosaukums) = (vērtība)
        int gadaApgrozijumsDolaros = 3326565;
        byte monthsInYear = 12;
        short autoPrice = 55;
        long netIncome = 2158963645L;
        System.out.println(gadaApgrozijumsDolaros+ "\n" + monthsInYear + "\n" + autoPrice);

        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;
        int atlikums;
        int x = 5;
        int y = 10;

        double z=5;
        double q=10;
        double w=12;

        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z / q;
        atlikums = 12%5;

        System.out.println("Dalīt" +x/z);

        int[] saraksts = {1,2,3,4,6,7,8,9};

        int skaitlis = 6;
        System.out.println("Ja atbilde ir 0, sis ir pāra skaitlis " + skaitlis%2);


        System.out.println("SUMMA " + summa);
        System.out.println("Starpiba " + starpiba);
        System.out.println("Reizinājums " + reizinajums);
        System.out.println("Dalījums" + dalijums);
        System.out.println("Atlikums " + atlikums);



        char vaditajaApliecibasKategorija = 'A';

    }


}
