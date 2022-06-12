package classroomFour;

import java.sql.Timestamp;

public class Rinkis {
    final double PI = 3.14;
    double radiuss;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;

    Rinkis(){
        System.out.println("Mēs veidojam riņķi..");
        Long datetime = System.currentTimeMillis();
        timestamp = new Timestamp(datetime);
    }

    Rinkis(double padotaisRadiuss){
        radiuss = padotaisRadiuss;
        laukums = aprekinatLaukumu();
        rinkaLinijasGarums = aprekinaRinkaLiniju();
    }


    public void printCreatedTime(){
        System.out.println(timestamp);
    }

    public double aprekinatLaukumu(){
        System.out.println("Aprēķinu laukumu");
        return Math.pow(radiuss, 2) * PI;
    }

    public double aprekinaRinkaLiniju(){
        System.out.println("Aprēķinu riņķa līnijas garumu");
        return 2 * Math.PI * radiuss;
    }

}
