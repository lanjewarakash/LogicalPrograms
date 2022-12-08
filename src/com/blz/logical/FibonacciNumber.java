package com.blz.logical;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        FibonacciNumber obj = new FibonacciNumber();
        obj.logic(num);

    }

    public void logic(int num) {
        int temp = 0, firstNum = 0, secondNum = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(firstNum + " ");
            temp = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = temp;
        }
    }
}
