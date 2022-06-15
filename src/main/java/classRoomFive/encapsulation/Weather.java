package classRoomFive.encapsulation;

public class Weather {

    boolean isRaining; //varam piekļūt klases un pakotnes līmenī
    public boolean isSunshining; //public - varm piekļūt visur
    private boolean isSnowing; //private - var piekļūt tikai klases ietvaros
    private double temperatureAtDay;
    public double temperatureAtNight;


    public void printWeather(){
        System.out.println("šī ir publiska metode");
        System.out.println("Ārā visu dienu līst lietus");
        metodeDivi();
    }
    private void metodeDivi(){
        System.out.println("šī ir privāta metode");
    }

    void metodeTris(){
        System.out.println("šī ir default metode");
    }
}
