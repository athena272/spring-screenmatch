package br.com.alura.spring_screenmatch.challenges.challenge01.models;

public record Person(String name, int age) {

    public void checkObject(Object object) {
        if (object instanceof Person p) {
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
        }
    }
}
