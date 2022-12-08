package com.blz.logical;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PerfectNumber obj = new PerfectNumber();
        obj.logic(num);
    }

    public void logic(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {

            System.out.println(+num + " " + "Is perfect number");

        } else {
            System.out.println(+num + " " + "Is not a perfect number");

        }

    }
}
