package classRoomFive.pirmaisUzdevums;

import classRoomFive.encapsulation.Weather;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Author JKRowling = new Author("JKRowling", "jk@gmail.comm", 'F');
        Author Rainis = new Author("Jānis Rainis","JR@gmail.com",'M');

        Cena cena = new Cena(9.99,'€');
        Book bookOne = new Book("Harry Potter", JKRowling, new Cena(15.99,'$'));
        Book bookTwo = new Book("Cits nosaukums", Rainis, cena);
        System.out.println(bookTwo.toString());
        bookTwo.price.discount(30);
        System.out.println(bookTwo.toString());

        System.out.println(bookOne.toString());






    }
}
