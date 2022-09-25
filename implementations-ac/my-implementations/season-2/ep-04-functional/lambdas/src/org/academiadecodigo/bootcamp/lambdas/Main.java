package org.academiadecodigo.bootcamp.lambdas;

public class Main {


    public static void main(String[] args) {

        Machine<Integer> numberMachine = new MachineImpl<>();
        Machine<String> stringMachine = new MachineImpl<>();
        Machine<Person> personMachine = new MachineImpl<>();

        /**
         * Testing our number machine!
         */

        MonoOperation<Integer> square = num -> num * num;
        BiOperation<Integer> subtract = (n1, n2) -> n1 - n2;

        int r1 = numberMachine.perform(100, square);
        int r2 = numberMachine.perform(100, 150, subtract);


        System.out.println("Result of square is: "+ r1);
        System.out.println("Result of subtract is: " + r2);

        /**
         * Testing our string machine!
         */

        MonoOperation<String> uppercase = word -> word.toUpperCase();
        BiOperation<String> concatWords = (w1, w2) -> w1.concat(w2);

        String r3 = stringMachine.perform("Marmite", uppercase);
        String r4 = stringMachine.perform("Marmite", "Jam", concatWords);

        System.out.println("Result of uppercase is: " + r3);
        System.out.println("Result of concatWords is: " + r4);

        /**
         * Testing our person machine!
         */

        Person christina = new Person("Christina", "Blue", "Freckly", 32);
        Person sena = new Person("João Sena", "Brown", "Funny", 33);

        MonoOperation<Person> ageUp = p ->
                new Person(p.getName(), p.getEyeColor(), p.getCharacteristic(), p.getAge() +1);

        BiOperation<Person> merge = (p1, p2) ->
                new Person((p1.getName() + p2.getName()), p1.getEyeColor(), p2.getCharacteristic(), 0);

        Person olderChristina = personMachine.perform(christina, ageUp);
        System.out.println(olderChristina);

        Person merged = personMachine.perform(christina, sena, merge);
        System.out.println(merged);

    }


}
