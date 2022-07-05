package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Tom", "Person");

        Programmer programmer = new Programmer("Me", "Backend", "Java");

        Dancer dancer = new Dancer("Tim", "Dance", "Zumba");

        Singer singer = new Singer("Dieter", "Singer", "Modern Talking");

        System.out.println(programmer);
        programmer.coding();

        System.out.println(dancer);
        dancer.dancing();

        System.out.println(singer);
        singer.singing();
        singer.eat();
        singer.playGuitar();

    }
}
