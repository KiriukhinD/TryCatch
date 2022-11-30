package org.example;


public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        try {
            main.getPokaz();
            System.out.println("vivod ne budet");
        } catch (Exception e) {
            System.out.println("error error");
        }
        System.out.println("hello");

    }

    void getPokaz() throws Exception {

        int a = 5;

        if (a == 7) {
            System.out.println("5");
        } else throw new Exception();

    }
}