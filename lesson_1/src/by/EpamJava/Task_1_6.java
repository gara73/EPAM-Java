package by.EpamJava;

import java.util.Scanner;

public class Task_1_6 {
    public static void main(String[] args) {
        double x, y;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();
        if  (((y >= 0) && (y <= 4) && (x >= -2) && (x <=2)) || ((y <= 0) && (y >= -3) && (x >= -4) && (x <=4)))
            System.out.println("true");
        else System.out.println("false");
    }
}
