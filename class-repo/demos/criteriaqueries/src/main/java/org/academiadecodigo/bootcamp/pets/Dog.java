package org.academiadecodigo.bootcamp.pets;

import javax.persistence.*;

@Entity
@Table(name = "dogs")
public class Dog extends Pet {


    private String breed;


    public Dog() {
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void bark(){
        System.out.println("Woof woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
