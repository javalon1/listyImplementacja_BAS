//pobieranie imion z klawiatury (wielu) do momentu
// podania "-" i wypisanie ich na ekranie

package com.sda.algorytmy;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class Zadanie {

    public static void zad1(){

        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {

            String linia = scanner.nextLine();

            if (linia.equals("-")) {
                break;
            }
            list.add(linia);
        }
                System.out.println("LISTA IMION");
        for (String el: list){

            System.out.println("IMIĘ:" + el);
       }
    }
}