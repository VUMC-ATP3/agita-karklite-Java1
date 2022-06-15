package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trissturis vertiba = new Trissturis();
        vertiba.mala1 = 2;
        vertiba.mala2 = 5;
        vertiba.mala3 = 6;
        System.out.println("Trīsstūra lukums ir " + vertiba.aprekinatTrissturaLaukumu());;
        System.out.println("Vienlādmaulu trīsstūris: " + vertiba.vienadmalu());
        System.out.println("Vienlādsānu trīsstūris: " + vertiba.vienadsanu());

        Trissturis jauns = new Trissturis(8,8,4);

        System.out.println("Trīsstūra lukums ir " + jauns.aprekinatTrissturaLaukumu());
        System.out.println("Vienlādmaulu trīsstūris: " + jauns.vienadmalu());
        System.out.println("Vienlādsānu trīsstūris: " + jauns.vienadsanu());


    }
}
