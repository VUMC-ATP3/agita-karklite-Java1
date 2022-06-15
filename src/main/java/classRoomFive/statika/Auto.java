package classRoomFive.statika;

public class Auto {
    public String marka;
    public static String klasesNosaukums = "AutoKlase";
    public static int totalCarsCreated = 0;

    Auto(String marka){
        this.marka = marka;
        totalCarsCreated++;
    }

    public static void printText(){
        System.out.println("Printēju tekstu" + totalCarsCreated);
    }
    public static void increaseTotalCarsCreated(){
        totalCarsCreated++;
    }

}
