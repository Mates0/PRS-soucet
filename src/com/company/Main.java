package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int index = 1;
        while(sc.hasNext()) {
            int input = sc.nextInt();
            if (input % 3 == 0) {
                if (index % 2 == 0) {
                    sum += input;
                }
            }
            index++;
        }
        System.out.println("Součet je:" + " " + sum);
    }
}
