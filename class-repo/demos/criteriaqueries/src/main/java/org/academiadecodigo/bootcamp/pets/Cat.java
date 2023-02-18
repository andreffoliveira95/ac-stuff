package org.academiadecodigo.bootcamp.pets;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cats")
public class Cat extends Pet {

    private int murderCount;

    public Cat() {}

    public Cat(String name, int age) {
        super(name, age);
        murderCount = 0;
    }

    public int getMurderCount() {
        return murderCount;
    }

    public void setMurderCount(int murderCount) {
        this.murderCount = murderCount;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "murderCount=" + murderCount +
                "} " + super.toString();
    }
}
