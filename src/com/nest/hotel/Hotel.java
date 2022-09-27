package com.nest.hotel;

import java.util.Scanner;

public class Hotel {
    static int total = 0;

    public static void main(String[] args) {
        int choice;

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Choose your needs");
            System.out.println("1.Tea 10$");
            System.out.println("2.Shakes 60$");
            System.out.println("3.Cake 250$");
            System.out.println("4.Freshjuice 25$");
            System.out.println("5.Icecream 45$");
            System.out.println("6.Bill");
            System.out.println("7.Exit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Quantity");
                    int a = s.nextInt();
                    total = (10 * a) + total;
                    break;
                case 2:
                    System.out.println("Quantity");
                    int b = s.nextInt();
                    total = (60 * b) + total;
                    break;
                case 3:
                    System.out.println("Quantity");
                    int c = s.nextInt();
                    total = (250 * c) + total;
                    break;
                case 4:
                    System.out.println("Quantity");
                    int d = s.nextInt();
                    total = (25 * d) + total;
                    break;
                case 5:
                    System.out.println("Quantity");
                    int e = s.nextInt();
                    total = (45 * e) + total;
                case 6:
                    System.out.println("Total Bill=" + total);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("***Invalid input***");
            }
        }
    }
}
