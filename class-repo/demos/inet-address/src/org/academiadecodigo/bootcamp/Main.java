package org.academiadecodigo.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hello! What host should we test?");
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String hostname = bReader.readLine();
            System.out.println("Ok, thanks - going to test " + hostname);

            InetAddress inetAddress = InetAddress.getByName(hostname);

            System.out.println("Is this reachable?");
            System.out.println(inetAddress.isReachable(3000));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
