package com.okdokd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michał on 14.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>list = new ArrayList<>();


        String x = null;

        System.out.println("Podaj ilosc liczb.");

            x = scanner.next();

           int y = Integer.parseInt(x);

        for (int i =0; i < y ; i++) {
            System.out.println("Podaj liczbe");
            int wynik = scanner.nextInt();
            list.add(wynik);

        }

        for(int i = 0; i<y; i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        double result = 0;

        for(int i = 0; i<y; i++){
            result += list.get(i);

        }
        System.out.println(result);

        System.out.println(result / y);

    }
}
