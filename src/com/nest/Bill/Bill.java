package com.nest.Bill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        int quantity, price, choice, total = 0;
        FoodItems fd = new FoodItems(20, 45, 60, 30, 35);
        FoodItems twfd = new FoodItems(25, 50, 65, 35, 40);
        HashMap<String, String> map = new HashMap<String, String>();
        ArrayList<String> tl = new ArrayList<>();

        int opt, c1, c2;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Choose your Wish");
            System.out.println("1.Dining");
            System.out.println("2.Takeaway");
            System.out.println("3.View Transcation");
            opt = s.nextInt();


            switch (opt) {
                case 1:
                    System.out.println("Choose your needs");
                    System.out.println("1.Tea price=" + fd.getTea());
                    System.out.println("2.Shakes price=" + fd.getShakes());
                    System.out.println("3.Cake price=" + fd.getCake());
                    System.out.println("4.Freshjuice price=" + fd.getFreshjuice());
                    System.out.println("5.Icecream price=" + fd.getIcecream());
                    System.out.println("6.Bill");
                    System.out.println("7.Exit");
                    c1 = s.nextInt();
                    switch (c1) {
                        case 1:
                            System.out.println("Quantity");
                            int a = s.nextInt();
                            total = (fd.getTea() * a) + total;
                            break;
                        case 2:
                            System.out.println("Quantity");
                            int b = s.nextInt();
                            total = (fd.getShakes() * b) + total;
                            break;
                        case 3:
                            System.out.println("Quantity");
                            int c = s.nextInt();
                            total = (fd.getCake() * c) + total;
                            break;
                        case 4:
                            System.out.println("Quantity");
                            int d = s.nextInt();
                            total = (fd.getFreshjuice() * d) + total;
                            break;
                        case 5:
                            System.out.println("Quantity");
                            int e = s.nextInt();
                            total = (fd.getIcecream() * e) + total;
                        case 6:
                            System.out.println("Enter the customer name");
                            String name = s.next();
                            map.put("customer Name", name);
                            map.put("mode","dinning");
                            map.put("Amount", String.valueOf(total));
                            tl.add(String.valueOf(map));
                            System.out.println("Total Bill=" + total);
                            total = 0;
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("***Invalid input***");
                    }


                    break;

                case 2:
                    System.out.println("Choose your needs");
                    System.out.println("1.Tea price=" + twfd.getTea());
                    System.out.println("2.Shakes price=" + twfd.getShakes());
                    System.out.println("3.Cake price=" + twfd.getCake());
                    System.out.println("4.Freshjuice price=" + twfd.getFreshjuice());
                    System.out.println("5.Icecream price=" + twfd.getIcecream());
                    System.out.println("6.Bill");
                    System.out.println("7.Exit");
                    c2 = s.nextInt();
                    switch (c2) {
                        case 1:
                            System.out.println("Quantity");
                            int a = s.nextInt();
                            total = (twfd.getTea() * a) + total;
                            break;
                        case 2:
                            System.out.println("Quantity");
                            int b = s.nextInt();
                            total = (twfd.getShakes() * b) + total;
                            break;
                        case 3:
                            System.out.println("Quantity");
                            int c = s.nextInt();
                            total = (twfd.getCake() * c) + total;
                            break;
                        case 4:
                            System.out.println("Quantity");
                            int d = s.nextInt();
                            total = (twfd.getFreshjuice() * d) + total;
                            break;
                        case 5:
                            System.out.println("Quantity");
                            int e = s.nextInt();
                            total = (twfd.getIcecream() * e) + total;
                        case 6:
                            System.out.println("Enter the customer name");
                            String name = s.next();
                            map.put("customer Name", name);
                            map.put("mode","takeaway");
                            map.put("Amount", String.valueOf(total));
                            tl.add(String.valueOf(map));
                            System.out.println("Total Bill=" + total);
                            total = 0;
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("***Invalid input***");

                    }
                case 3:
                    System.out.println(tl);

            }
        }
    }
}



