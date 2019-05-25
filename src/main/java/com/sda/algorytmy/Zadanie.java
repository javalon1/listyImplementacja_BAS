//pobieranie imion z klawiatury (wielu) do momentu
// podania "-" i wypisanie ich na ekranie

package com.sda.algorytmy;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class Zadanie {

    public static void zad1(){

        List<String> listaImion = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String a;

        do {

            System.out.println("Podaj imię");

            a = scanner.nextLine();

            listaImion.add(a);

        }while (!a.equals("-"));

        listaImion.remove("-");

        for(String el:listaImion){

            System.out.println(el);
       }
    }
}