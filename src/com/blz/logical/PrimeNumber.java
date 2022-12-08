package com.blz.logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value");
        int num = sc.nextInt();
        checkPrime(num);

    }

    public static void checkPrime(int a) {
        int b = 0;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                b++;
            }
        }
        if (b == 0) {
            System.out.println("Number Is Prime");

        } else {
            System.out.println("NUmber is Not Prime");
        }
    }
}
