package org.example;

public class Main {
    public static void main(String[] args) {

        int maxFloors = 163;
        int result_for = 0;
        for (int i = 0; i <= maxFloors; i += (5-1)) {
          result_for += 1;

        }
        System.out.println(result_for);
        int result_while = 0;
        int a = 0;
        while (a <= maxFloors){
            result_while += 1;
            a +=(5-1);
        }
        System.out.println(result_while);

        int result_do_wile = 0;
        int b = 0;
        do {
            result_do_wile += 1;
            b += (5-1);
        } while (b <= 163);
        System.out.println(result_do_wile);
    }

}