package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.getPokaz();

        } catch (IOException e) {
            System.out.println("error error error");
        }


    }

    void getPokaz() throws IOException {

        int a = 7;
        if (a == 5) {
            System.out.println("5");

        } else throw new IOException();
    }
}