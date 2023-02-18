package org.academiadecodigo.bootcamp.lambdas;

public class Person {

    private final String name;
    private final String eyeColor;
    private final String characteristic;
    private final int age;

    public Person(String name, String eyeColor, String characteristic, int age) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.characteristic = characteristic;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public String getEyeColor() {
        return eyeColor;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", characteristic='" + characteristic + '\'' +
                ", age=" + age +
                '}';
    }
}
