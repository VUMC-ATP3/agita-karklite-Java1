package classRoomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWeather();
//        weather.metodeDivi // nevar, jo metode ir private
        weather.metodeTris();
        weather.isRaining = true;
        weather.temperatureAtNight = 13.4;
        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12, 154.2, "Pēteris");


        cilveks3.setAge(-3);
        System.out.println(cilveks3.toString());
        cilveks3.setAge(18);
        System.out.println(cilveks3.toString());

        Rinkis viens = new Rinkis();
        viens.setRadiuss(5);
        Rinkis divi = new Rinkis(3, "zila");
        divi.setKrasa("zaļa");


//        System.out.println(cilveks3.toString());
//        System.out.println(cilveks3.getAge());
//        System.out.println(cilveks3.getNane());


    }
}
