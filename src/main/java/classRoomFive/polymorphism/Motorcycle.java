package classRoomFive.polymorphism;

public class Motorcycle extends Vehicle{
    @Override
    public void stop() {
        System.out.println("moto stops faster");
        super.stop();
    }
}
