package com.blz.logical;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int number = sc.nextInt();

        ReverseNum obj = new ReverseNum();
        obj.rev(number);
    }
    public void rev(int number) {
        int Remainder = 0, reverse = 0;

        while (number != 0) {
            Remainder = number % 10;
            reverse = reverse * 10 + Remainder;
            number = number / 10;
        }
        System.out.print(reverse);
    }
}
