package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.pets.Cat;
import org.academiadecodigo.bootcamp.pets.Dog;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {


    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        PetService petService = new PetService();
        petService.setEmf(emf);

        petService.add(new Dog("Athena", 6 ,"Pomeranian"));
        petService.add(new Cat("Loki", 7));
        petService.add(new Cat("Garfield", 40));
        petService.add(new Dog("Spocky", 3, "Labrador mix"));
        petService.add(new Dog("Kyuubi", 15, "Mutt"));
        petService.add(new Cat("Ariel", 15));
        petService.add(new Cat("Athena", 1));
        petService.add(new Dog("Bobi", 17, "Cocker Spaniel"));


        System.out.println("\n All pets called Athena \n");
        petService.findByName("Athena").forEach(System.out::println);

        System.out.println("\n All pets older than 10 \n");
        petService.findByAgeGreaterThan(10).forEach(System.out::println);

        System.out.println("\n All pets who begin with A \n");
        petService.findAllBeginsWith("A").forEach(System.out::println);

        petService.close();

    }




}
