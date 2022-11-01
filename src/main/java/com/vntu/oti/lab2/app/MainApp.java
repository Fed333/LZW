package com.vntu.oti.lab2.app;

import java.util.List;
import java.util.Scanner;

import static com.vntu.oti.lab2.app.LempelZivWelch.decode;
import static com.vntu.oti.lab2.app.LempelZivWelch.encode;


public class MainApp {

    private static Scanner in = new Scanner(System.in);

    /*
     * Video Reference: https://youtu.be/1KzUikIae6k
     */
    public static void main(String[] args) {

        System.out.print("Введіть рядок: ");
        String str = in.nextLine();

        List<Integer> compressed = encode(str);
        System.out.println("Закодоване: " + compressed);

        String decompressed = decode(compressed);
        System.out.println("Розкодоване: " + decompressed);

    }

}